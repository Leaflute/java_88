package test;

public class _13_Main {
	public static void main(String[] args){
	
	// 생성자
	_13_Main main = new _13_Main();

	// 메서드 호출
	main.aniMove(new _13_Human());  
	main.aniMove(new _13_Eagle());
	main.aniMove(new _13_Tiger());
	}

// 매개변수에 다형성 적용
public void aniMove(_13_Animal animal) {
	animal.move();
	if (animal instanceof _13_Human) {
		_13_Human human = (_13_Human)animal;    
		human.thinking();	
	}

}

}