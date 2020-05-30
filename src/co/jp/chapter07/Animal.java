package co.jp.chapter07;

public class Animal {


	private	String name;
	private	int age;
	private	int sex;
	private	int legs;

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

		public int getLegs() {
			return legs;
		}

		public void setLegs(int legs) {
			this.legs = legs;
		}

		Animal(){

		}

		public Animal(String name, int age, int sex,int legs) {

			this.name = name;
			this.age = age;
			this.sex = sex;
			this.legs = legs;

		}





}
