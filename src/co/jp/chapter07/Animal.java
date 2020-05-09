package co.jp.chapter07;

public class Animal {




	//名前 *
	private  final String name;


	//年齢
	private  final int age;


	//性別 * 雄:1、雌:2
	private final int sex;

	//脚
	private final int legs;

	public Animal(String name, int age, int sex,int legs) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.legs = legs;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public int getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	public int getSex() {
		return sex;
	}

//	public void setSex(int sex) {
//		this.sex = sex;
//	}

	public int getLegs() {
		return legs;
	}

//	public void setLegs(int legs) {
//		this.legs = legs;
//	}





}
