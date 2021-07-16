package ch11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_DataStreamTest {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		DataOutputStream dos = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream("D:\\Dev88\\file_test\\8_Data.txt");	// 자동생성 기반스트림
			dos = new DataOutputStream(fos);	//보조스트림
			
			//각 자료형에 맞게 data를 작성
			dos.writeByte(10);
			dos.writeChar('B');
			dos.writeInt(30);
			dos.writeFloat(3.14f);
			dos.writeUTF("Hi!");
			
			fis = new FileInputStream("D:\\Dev88\\file_test\\8_Data.txt");	// 파일명이 동일해야 함
			dis = new DataInputStream(fis);		// 보조스트림	
			
			// 각 자료형에 맞게 data를 읽어서 콘솔에 출력
			// 파일에 쓴 순서와 같은 순서, 같은 메서드로 읽어야함
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			fos.close();
			dos.close();
			fis.close();
			dis.close();
		}
		
		

	}
}
