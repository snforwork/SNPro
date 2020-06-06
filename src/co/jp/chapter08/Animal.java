package co.jp.chapter08;

public class Animal {
//PET トータル
	static int count =0;
	static int Catcount =0;
	static int Fishcount =0;
	static int Bridcount =0;

	//海陆空
	
	  //年齢
	  int age;
	  //性別
	  SEX sex;
	  //種類
	  String type;
	  //名前
	  String name;
	  
	  //重构
	  Animal(String type,int age,SEX sex,String name) {
		  this.age = age;
		  this.type = type;
		  sex= SEX.MAIL;
		  this.name = name;
//		  count(type);
		  
	  }
	  void count() {
		  count = Catcount+Fishcount+Bridcount;
//		  System.out.println("Animal数:"+count);
//		  //陆1,海2,空3
//		  if("1".equals(type)){
//			  Catcount++;
//		  }else if("2".equals(type)) {
//			  Fishcount++;
//		  }else if("3".equals(type)){
//			  Bridcount++;
//		  }
	  }
	  

	//函数化

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
//	public String getSex() {
//		return sex;
//	}
//	public void setSex(String sex) {
//		this.sex = sex;
//	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
