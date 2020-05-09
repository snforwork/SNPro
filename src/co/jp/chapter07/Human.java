package co.jp.chapter07;

public class Human {

//	Human(){
//
//	}

	public static int count = 0;

	public static int total() {
		return count;
	}



	public Human(String name, int age, int sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		count++;
	}

//	public Human(String name, int sex) {
//		this.name = name;
//		this.sex = sex;
//	}



	//名前 *
	private final String name ;


	//年齢
	private final int age;


	//性別 * 男:1、女:2
	private final int sex;


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




}
