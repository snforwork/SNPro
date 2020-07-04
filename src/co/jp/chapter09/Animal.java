package co.jp.chapter09;

public class Animal {
	private int age;
	private  int classifi;
	private  String name;
	
	Animal(String name, int age, int classifi) {
		this.setClassifi(classifi);
		this.setAge(age);
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getClassifi() {
		return classifi;
	}

	public void setClassifi(int classifi) {
		this.classifi = classifi;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
