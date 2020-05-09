package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String strname = new String("ABC");
		System.out.println(strname);
		// インスタンス化オブジェクト（実体化対象）
		//   クラスタイプ　＋　オブジェクト名称　＝　new コンストラクタ

		// 引数なし
		//		Human objname = new Human();
		//
		//
		//		objname.setName("Obama");
		//		objname.setAge(50);
		//		objname.setSex(1);
		//		System.out.println(objname.getName());
		//		System.out.println(objname.getAge());
		//		if (objname.getSex() == 1) {
		//			System.out.println("男");
		//		} else if (objname.getSex() == 2) {
		//			System.out.println("女");
		//		} else {
		//			System.out.println(objname.getSex());
		//		}

		System.out.println("0 count:" + Human.total());

		// 3 引数
		Human trump = new Human("Trump", 70, 1);
		System.out.println("Trump count:" + Human.total());
		// set なし
		//		obj2.setName("HELLO KITTY");
		System.out.println(trump.getName());
		System.out.println(trump.getAge());
		if (trump.getSex() == 1) {
			System.out.println("男");
		} else if (trump.getSex() == 2) {
			System.out.println("女");
		} else {
			System.out.println(trump.getSex());
		}

		// 3 引数
		Human xiaoMing = new Human("xiaoMing", 10, 1);
		System.out.println("xiaoMing count:" + Human.total());
		// set なし
		//		obj2.setName("HELLO KITTY");
		System.out.println(xiaoMing.getName());
		System.out.println(xiaoMing.getAge());
		if (xiaoMing.getSex() == 1) {
			System.out.println("男");
		} else if (xiaoMing.getSex() == 2) {
			System.out.println("女");
		} else {
			System.out.println(xiaoMing.getSex());
		}

		//		// ２ 引数
		//		Human obj3 = new Human("xilali kelindun", 2);
		//
		//		System.out.println(obj3.getName());
		//		if (obj3.getSex() == 1) {
		//			System.out.println("男");
		//		} else if (obj3.getSex() == 2) {
		//			System.out.println("女");
		//		} else {
		//			System.out.println(obj3.getSex());
		//		}

		//		// 要素
		//		obj2.name = "Trump";
		//		obj2.age = 70;
		//		obj2.sex = 1;
		//
		//		System.out.println(obj2.name);
		//		System.out.println(obj2.age);
		//		if (obj2.sex == 1) {
		//			System.out.println("男");
		//		} else if (obj2.sex == 2){
		//			System.out.println("女");
		//		} else {
		//			System.out.println(obj2.sex);
		//		}

	}

}
