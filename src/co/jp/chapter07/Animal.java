package co.jp.chapter07;

public class Animal{


    //String name;
	//int age;
	//int sex;
	//int legs;

	private String name;
	private final int age;
	private int sex;
	private int legs;

	public Animal(String name, int age, int sex, int legs) {
		this.legs = 0;
		this.name = "";
		this.sex = 0;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.legs = legs;
	}


	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return sex
	 */
	public int getSex() {
		return sex;
	}
	/**
	 * @return legs
	 */
	public int getLegs() {
		return legs;
	}

	public void setName(String string) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void setAge(int i) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void setSex(int i) {
		// TODO 自動生成されたメソッド・スタブ

	}

	public void setLegs(int i) {
		// TODO 自動生成されたメソッド・スタブ

	}


}
