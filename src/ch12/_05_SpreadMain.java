package ch12;

public class _05_SpreadMain {
	public static void main(String[] args) {
		_05_SpreadArgs values =new _05_SpreadArgs();
		values.callArgs("스테이크", "요거트", "샐러드", "와인", "타피오카");
		System.out.println();
		values.callArgs2("김복희", 84,64,90,100,46);
	}
}
