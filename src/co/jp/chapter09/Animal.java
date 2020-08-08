package co.jp.chapter09;

public class Animal {

	public static final String get = null;
	String type;
	String name;
	int age;
	String sex;

	Animal(String type,String name,int age,String sex){
		this.type =type;
		this.age =age;
		this.sex =sex;
		this.name =name;
	}

	public Animal(String a, int i, int j) {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}


}
