package java3;

public class Person {
	public enum GENDER { MAN, WOMAN };
	public GENDER gender;
	
	public Person(GENDER gender){
		this.gender = gender;
	}
	
	public void speak() {
		System.out.println("I'm a " + this.gender);
	}

	public static void main(String[] args) {
		Person man = new Person(GENDER.MAN);
		Person woman = new Person(GENDER.WOMAN);
		man.speak();
		woman.speak();
	}

}
