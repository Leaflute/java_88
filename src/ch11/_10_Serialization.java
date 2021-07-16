package ch11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class _10_Serialization {

	/*
	 * p550
	 * 직렬화
	 * - 인스턴스의 정보를 그대로 저장하거나 네트워크를 통해 전송
	 * - 인스턴스의 내용(인스턴스 변수값)을 연속 스트림으로 만드는 것이다.
	 * - 스트림으로 만들어야 파일에 쓸 수 있고, 네트워크로 전송 가능하다.
	 * - implements Serializable : 직렬화 구현
	 * - transient : 해당 인스턴스 변수는 직렬화나 복원과정에서 제외
	 * 
	 * 역직렬화 - 저장된 내용이나 전송받은 내용을 다시 복원하는 것.
	 */
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// 매개변수 포함 인스턴스 
		_10_Person personJobs = new _10_Person("Steve Jobs", "CEO");
		_10_Person personMusk = new _10_Person("Elon Musk", "TechnoKing");
		
		// 스트림 클래스 정의
		FileOutputStream fos;
		ObjectOutputStream oos;
		FileInputStream fis;
		ObjectInputStream ois;
		
		try {
			fos = new FileOutputStream("D:\\Dev88\\file_test\\serial.out");	// serial.out 파일 생성, 메인스트림
			oos = new ObjectOutputStream(fos);	// 보조스트림
			
			oos.writeObject(personJobs);	// personJobs의 주소값을 참조하여 serial.out에 정보전송
			oos.writeObject(personMusk);	// personMusk의 주소값을 참조하여 serial.out에 정보전송
			
			fis = new FileInputStream("D:\\Dev88\\file_test\\serial.out");	// serial.out 파일 읽어들임, 메인스트림
			ois = new ObjectInputStream(fis);	// 보조스트림
			
			_10_Person p1 = (_10_Person)ois.readObject();	// Object로 읽어들이기 때문에 다운캐스팅 필요
			_10_Person p2 = (_10_Person)ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
