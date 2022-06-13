package sec05.exam05;

public class Person {
	//필드 선언
	final String nation = "Korea";
	final String ssn;
	String name;
	
	// ssn 필드는 한 번 값이 저장되면 변경할 수 없도록 final 필드로 선언했습니다. 
	// 하지만 ssn은 Person 객체가 생성될 때 부여되므로 
	// Person 클래스 설계 시 초기값을 미리 줄 수 없습니다. 
	
	
	//생성자 
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
