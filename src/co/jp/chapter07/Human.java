package co.jp.chapter07;

public class Human {

     Human(){

     }
      public static int count = 0;

       static int total() {
       return count;
       }


	public Human(String name, int age, int sex) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		 count++;

	}

	public Human(String name,  int sex) {
		this.name = name;
		this.sex = sex;
	}
	//名称

	public static final char[] getName = null;

	private String name = "";
    //fianl 只允许设一次值
	//年龄

	private int age;



	//性别 1男 2女

	private int sex;



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSex() {
		return sex;
	}



	public void setSex(int sex) {
		this.sex = sex;
	}







	}










