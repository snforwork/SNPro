package co.jp.chapter07;


public class Human {

//	Human(){
//	//当一个类里没有任何构造函数的时候，无参构造函数是默认的
//	//当构造函数重构了默然的构造函数之后，默然构造函数失效
//		//默然→无参构造函数
//		
//	}
	
	public static int count= 0;
	
	public static int total() {
//		this.name=0;
		return count;
	}

	
 Human(String name, int age, int sex) {

		this.name = name;
		this.age = age;
		this.sex = sex;
		count++;
	}
 
public Human(String name, int sex) {
//	super();
	this.name = name;
	this.sex = sex;
}

/*
 * 全局变量 实体属性描述
 */
	
	
	//名前*
	private String name ;
	//年齢
	private int age ;
	//性別* 男：1 女：0
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
