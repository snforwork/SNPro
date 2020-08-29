package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String strname = new String("ABC");
		System.out.println(strname);
		//インスタンス化オブジェクト（实体化对象）
		//クラスタイプ　＋　オブジェクト名称　＝　new コンストラクタ
/*
 * 
 */
//		Human objname = new Human();
//		objname.setName("Obama");
//		objname.setAge(50);
//		objname.setSex(1);
//		
//		System.out.println(objname.getName());
//		System.out.println(objname.getAge());
//		
//		if(objname.getSex()==1) {
//			System.out.println("男");
//		}else if(objname.getSex()==2){
//			System.out.println("女");
//		}else {
//			System.out.println(objname.getSex());
//		}
///*
// * 		
// */
		System.out.println("0 count:"+Human.total());
		
		Human Trump = new Human("Trump",50,2);
		System.out.println("Trump count:"+Human.total());
		//セットなし
		//要素
//		obj2.setName("Hello Kitty");
//		obj2.age=70;
//		obj2.sex=1;
		System.out.println(Trump.getName());
		System.out.println(Trump.getAge());
		if(Trump.getSex()==1) {
			System.out.println("男");
		}else if(Trump.getSex()==2){
			System.out.println("女");
		}else {
			System.out.println(Trump.getSex());
		}
		
		Human xiaoMing = new Human("xiaoMing",10,1);
		System.out.println("xiaoMing count:"+Human.total());
		//セットなし
		//要素
//		obj2.setName("Hello Kitty");
//		obj2.age=70;
//		obj2.sex=1;
		System.out.println(xiaoMing.getName());
		System.out.println(xiaoMing.getAge());
		if(xiaoMing.getSex()==1) {
			System.out.println("男");
		}else if(xiaoMing.getSex()==2){
			System.out.println("女");
		}else {
			System.out.println(xiaoMing.getSex());
		}
		
		Human obj3 = new Human("xilali kelindun",2);
		System.out.println(obj3.getName());
		
		if(obj3.getSex()==1) {
			System.out.println("男");
		}else if(obj3.getSex()==2){
			System.out.println("女");
		}else {
			System.out.println(obj3.getSex());
		}
		
		Animals dog = new Animals(2,1,"Dog");

		System.out.println(dog.getName());
		System.out.println(dog.getAge());
		if(dog.getSex()==1) {
			System.out.println("公");
		}else if(dog.getSex()==2){
			System.out.println("母");
		}else {
			System.out.println(dog.getSex());
		}
		
		
	}
}