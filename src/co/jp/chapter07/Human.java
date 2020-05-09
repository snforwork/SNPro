package co.jp.chapter07;

public class Human {

//	Human(){
//
//	}
//	Human(String name, int sex) {
//	this.name = name;
//	this.sex = sex;
//}

	private static int count = 0;


	public static int total() {
		return count;
	}


	public Human(String name, int age, int sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		count++;

	}

	// 名前 *
	 private final String name;
	// 年齢
	 private final int age;
	// 性別 *  男：1 女：2
	 private final int sex;

	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getSex() {
		return sex;
	}
}
