package ch;

public class test2CreateClass {
	String nameString;
	String numString;
	int age;
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public String getNumString() {
		return numString;
	}
	public void setNumString(String numString) {
		this.numString = numString;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public test2CreateClass(String nameString, String numString, int age) {
		super();
		this.nameString = nameString;
		this.numString = numString;
		this.age = age;
	}

}
