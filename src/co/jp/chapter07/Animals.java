package co.jp.chapter07;

public class Animals {
	
private  int legs;
private int age;
private  int sex;
private  String name;

 Animals(String name, int age, int sex, int legs) {
	this.legs = legs;
	this.sex = sex;
	this.age = age;
	this.name = name;
}

// Animals(String name, int age, int sex) {
//	
//}

 Animals(int legs, int sex, String name) {

	//	super();
	this.legs = legs;
	this.sex = sex;
	this.name = name;
}

public int getLegs() {
	return legs;
}

public void setLegs(int legs) {
	this.legs = legs;
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

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}
