package co.jp.chapter07;

public class JavaChapter07 {

	public JavaChapter07() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String strname = new String("ABC");
		System.out.println(strname);
		//インスタンス化オブジェクト（実体化対象）
		// クラスタイプ＋オブジェクト名称 = コンストラクタ
		// 引数なし
//		Human  objname = new Human();
//		objname.setName("Obama");
//		objname.setAge(50);
//		objname.setSex(1);

//		System.out.println(objname.getName());
//		System.out.println(objname.getAge());
//		if(objname.getSex() == 1) {
//			System.out.println("男");
//		}else if(objname.getSex() == 2){
//			System.out.println("女");
//		}else {
//			System.out.println(objname.getSex());
//		}
		// 3 引数
		System.out.println("0 count:" + Human.total());

		Human  trump = new Human("Trump",70,1);
		System.out.println("Trump count:"+trump.count);

//		set なし

//		obj2.setName("HELLO KITTY");
		System.out.println(trump.getName());
		System.out.println(trump.getAge());
		if(trump.getSex() == 1) {
			System.out.println("男");
		}else if(trump.getSex() == 2){
			System.out.println("女");
		}else {
			System.out.println(trump.getSex());
		}

		// 3 引数
		Human  xiaoming = new Human("xiaoming",10,1);
		System.out.println("xiaoming count:"+xiaoming.count);

//		set なし

//		obj2.setName("HELLO KITTY");
		System.out.println(xiaoming.getName());
		System.out.println(xiaoming.getAge());
		if(xiaoming.getSex() == 1) {
			System.out.println("男");
		}else if(xiaoming.getSex() == 2){
			System.out.println("女");
		}else {
			System.out.println(xiaoming.getSex());
		}

		//要素
//		obj2.name = "Trump";
//		obj2.age = 50;
//		obj2.sex = 1;


		//		System.out.println(obj2.name);
		//		System.out.println(obj2.age);
		//		if (obj2.sex == 1) {
		//			System.out.println("男");
		//		} else if (obj2.sex == 2){
		//			System.out.println("女");
		//		} else {
		//			System.out.println(obj2.sex);
		//		}

		// ２ 引数
//		Human  obj3 = new Human("xilali kelindun",2);
//
//		System.out.println(obj3.getName());
//		if(obj3.getSex() == 1) {
//			System.out.println("男");
//		}else if(obj3.getSex() == 2){
//			System.out.println("女");
//		}else {
//			System.out.println(obj3.getSex());
//		}

		Animal monkey = new Animal("monkey",2,1,4);


		System.out.println(monkey.getName());
		System.out.println(monkey.getAge());
		if(monkey.getSex() == 1) {
			System.out.println("雄");
		}else if(monkey.getSex() == 2){
			System.out.println("雌");
		}else {
			System.out.println(monkey.getSex());
		}



		 /**質問１*/
   		//定義されないメソッドsetAge(1234)をアクセスする。
//   		public class Pet {
//   			public String name;
//   			public void setName(String value) {
//   			this.name = value;
//   			}
//   			}
//   			// Kicker.java
//   			public class Kicker {
//   			public static void main(String...args) {
//   			Pet cat = new Pet();
//   			cat.setAge(1234);
   //
//   			}
//   			}

//   	/**質問２*/
   	int[] arr = new int[] {1,5,8,6,2};
   		System.out.println(Math.max(arr));
   		System.out.println(Math.min(arr));
   		System.out.println(Math.ave(arr));






	}

}
