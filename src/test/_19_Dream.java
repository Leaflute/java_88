package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _19_Dream {
	public static void main(String[] args) {
		
		List<String> dream = new ArrayList<String>();
		
		dream.add("우주비행사");
		dream.add("미국 대통령");
		dream.add("축구선수");
		
		Iterator iterator = dream.iterator();
		
		while(iterator.hasNext()) {
			String str = (String)iterator.next();
			System.out.println(str + " ");
		}
	}
}
