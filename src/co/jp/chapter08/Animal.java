package co.jp.chapter08;

public class Animal {

	static int count = 0;
	static int catCount = 0;
	static int fishCount = 0;
	static int bridCount = 0;



	String type;
	String name;
	int age;
	String sex;

	Animal(String type,String name,int age,String sex){
		this.type =type;
		this.age =age;
		this.sex =sex;
//		count(type);
	}

	void count() {
		count = catCount + fishCount + bridCount;
//		System.out.println("Catクラスのcountメソッド PETのトータル数："+count);

//		if("1".equals(type)) {
//			catCount++;
//		}else if("2".equals(type)) {
//			fishCount++;
//		}else if("3".equals(type)) {
//			bridCount++;
//		}
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



}
