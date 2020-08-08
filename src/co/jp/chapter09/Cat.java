package co.jp.chapter09;

public class Cat {

	public static final String get = null;

	String name;
	int age;
	String sex;

	Cat(String name,int age,String sex){

		this.age =age;
		this.sex =sex;
		this.name =name;
	}
	public Cat(String a, int i, int j) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public void eat() {
		System.out.println("魚を食べる");
	}
	public void say() {
		System.out.println("hello");
	}

}