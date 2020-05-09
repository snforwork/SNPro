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
		Human objname = new Human();
		objname.setName("Obama");
		objname.setAge(50);
		objname.setSex(1);
		
		System.out.println(objname.getName());
		System.out.println(objname.getAge());
		
		if(objname.getSex()==1) {
			System.out.println("男");
		}else if(objname.getSex()==2){
			System.out.println("女");
		}else {
			System.out.println(objname.getSex());
		}
/*
 * 		
 */
//		Human obj2 = new Human();
//		//要素
//		obj2.name="Trump";
//		obj2.age=70;
//		obj2.sex=1;
//		if(obj2.sex==1) {
//			System.out.println("男");
//		}else if(obj2.sex==2){
//			System.out.println("女");
//		}else {
//			System.out.println(objname.sex);
//		}
	}
}