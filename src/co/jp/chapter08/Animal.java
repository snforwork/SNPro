package co.jp.chapter08;

public class Animal {

	//種類　　1陸　2海　3空
	//名前
	//年齢
	//性別

	static int count = 0;  //PETトータル数
	static int catCount = 0;
	static int fishCount = 0;
	static int birdCount = 0;
		String type;
		String name;
	     int age;
		String sex;

		Animal(String type,String name, int age ,String sex ){
			this.type = type;
			this.name = name;
			this.age = age;
			this.sex = sex;
			//count(type);
		}
         void count() {
        	 count = catCount+fishCount+birdCount;
        // System.out.println("Animalクラスのメソッド PETトータル数："+count);


//         if("1".equals(type)) {
//        	 catCount++;
//         }else if("2".equals(type)) {
//        	 fishCount++;
//         }else if("3".equals(type)) {
//        	 birdCount++;
//         }
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


		public Animal(String type, String sex) {
			this.type = type;
			this.sex = sex;
		}























}
