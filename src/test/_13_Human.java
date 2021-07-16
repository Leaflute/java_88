package test;

public class _13_Human extends _13_Animal {

	// 멤버메서드 (재정의됨)
	@Override	//@Override 누락
	public void move(){
		System.out.println("사람이 두 다리로 걷는다.");
	}

	// 멤버메서드
	public void thinking(){
		System.out.println("생각하는 사람.");
	}


}