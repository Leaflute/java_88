package ch09;

import java.util.HashMap;
import java.util.Scanner;

public class _07_LoginHashMap {
		
		/*
		 * [시험]
		 * 
		 * 1. id, pwd 5건을 hashtable에 저장(hashMap에 생성후 저장)
		 * 	  id      pwd
		 * 	 hong   hong1234
		 *   park   park1234
		 *   lee    lee1234
		 *   kim    kim1234
		 *   son    son1234
		 *   
		 * 2. 콘솔로부터 id, pwd를 입력받는다(로그인할 때)
		 * 
		 * 3. 1과 2를 비교해서 아이디가 없으면 "입력한 아이디가 존재하지 않습니다." 출력
		 * 	  1과 2를 비교해서 아이디가 있으면 비밀번호와 비교해서 
		 * 	    일치시 "로그인 성공" 불일치시 "비밀번호가 일치하지 않습니다." 출력 	
		 * 
		 * 4. Q나 q이면 종료
		 * 
		 */
	
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("hong", "hong1234");
		map.put("kim", "kim1234");
		map.put("park", "park1234");
		map.put("lee", "lee1234");
		map.put("son", "sons1234");
		
		// 로그인 정보
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("아이디를 입력하세요. :");
			String id = sc.next();
			System.out.print("비밀번호를 입력하세요. :");
			String pwd = sc.next();
			
			if(id.equals("q")||id.equals("Q")) {
				System.out.println("종료합니다.");
					break;
			} else {
				if (map.containsKey(id)) {
					if (map.get(id).equals(pwd)) {
						System.out.println("로그인 성공");
							break;
					} else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				} else {
					System.out.println("아이디가 없습니다. 아이디를 확인해 주세요.");
				}
			}
		} while(true);
	}
	
}
