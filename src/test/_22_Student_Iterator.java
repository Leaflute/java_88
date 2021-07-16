package test;

import java.util.HashMap;
import java.util.Iterator;		// 미호출

public class _22_Student_Iterator {
		
//		public static void main(String[] args) {	// 누락필요
			
		// HashMap호출	
		private HashMap<Integer, _22_Student> map;
	
		// 생성자
		public _22_Student_Iterator () {
			map = new HashMap<Integer, _22_Student>();
		}

		// addStudent()
		public void addStudent(_22_Student student){
			map.put(student.getStudentId(), student);
		}

		// removeStudent()
		public boolean removeStudent(int studentId) {	
			if (map.containsKey(studentId)) {					// )누락
				map.remove(studentId);
				return true;
			}
			System.out.println(studentId + " 존재하지 않습니다.");	// 오타 ;누락
			return false;
		}

		// 출력
		public void showAllStudent() {
			Iterator itr = map.keySet().iterator();
			while (itr.hasNext()){
				int key = (int) itr.next();				// 다운캐스팅 누락시 오류발생
				_22_Student student = map.get(key);
				System.out.println(student);
			}
		}
		
	
}