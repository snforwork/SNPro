package co.jp.chapter07;

import java.util.Arrays;

import co.jp.chapter07.Human;

public class JavaChapter07{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ


		//2020.05.09(07)
		//1.OOP
		//青色――全局変量　赤色――内部変量
		String strname = new String("ABC");
		System.out.println(strname);

		//インスタンス化オブジェクト（実体化対象）
		//クラスタイプ　+ オブジェクト名称　= new コンストラクタ（構造方法）
		Human objname = new Human();
		objname.setName("Obama");
		objname.setAge(50);
		objname.setSex(1);

		System.out.println(objname.getName());
		System.out.println(objname.getAge());
		System.out.println(objname.getSex());
		if(objname.setSex( ) == 1) {
			System.out.println("男性");
		}else if(objname.setSex() == 0) {
			System.out.println("女性");
		}else {
			System.out.println(objname.setSex());
		}


		//2.引数
		//Human trump = new Human("Trump",70,1);
		//setなし
		//System.out.println(trump.name);
		//System.out.println(trump.age);
		//if(trump.sex == 1) {
			//System.out.println("男性");
		//}else if(trump.sex == 0) {
			//System.out.println("女性");
		//}else {
			//System.out.println(trump.sex);
		//}


		//練習1
		//Human xiaoMing = new Human("xiaoMing",10,1);
	    //set 無し
		//System.out.println("xiaoMing count:"+Human.count);
		//System.out.println(xiaoMing.getName());
		//System.out.println(xiaoMing.getAge());
		//if(xiaoMing.getSex() ==1) {
		//	System.out.println("男");
		//}else if(xiaoMing.getSex() ==2){
		//	System.out.println("女");
		//}else {
		//	System.out.println(xiaoMing.getSex());
		//}

		//練習2
		//Human obj2 = new Human("希拉里克林顿",2);
        //System.out.println(obj2.getName());
        //if(obj2.getSex() ==1) {
  		//   System.out.println("男");
  	    //}else if(obj2.getSex() ==2){
  		//   System.out.println("女");
  	    //}else {
  		//   System.out.println(obj2.getSex());
	    //}

		//練習3
		//Animal obj3 = new Animal();
		//obj3.setName("Cat");
	    //obj3.setAge(2);
	    //obj3.setSex(1);
	    //obj3.setLegs(3);

		//System.out.println(obj3.getName());
		//System.out.println(obj3.getAge());
		//System.out.println(obj3.getSex());
		//if(obj3.getSex() == 1) {
			//System.out.println("雄");
			//}else if(obj3.getSex() == 0) {
				//System.out.println("雌");
			//}else {
				//System.out.println(obj3.getSex());
			//}

		//07OOP-その1――質問集
        //質問1
	    //public class Pet {
	    //public String name;
		//this.name = value;
		//}
		// Kicker.java
		//Pet cat = new Pet();
		//cat.setAge(1234);
		//}
		//}

		//質問2
	    //int[] arr = new int[] {1,5,8,6,2};
		//System.out.println(Math.max(arr));
		//System.out.println(Math.min(arr));
		//System.out.println(Math.ave(arr));
		
		int[] arr = new int[] {100,0,5,8,6,-200};
	    System.out.println("sort 前" + Arrays.toString(arr));
	    System.out.println(Math.max(arr));
	    System.out.println(Math.min(arr));
	    System.out.println(arr[0]);
        System.out.println("sort 後" + Arrays.toString(arr));
	}
        
	    public static int max1(int[] arr) {
        	int rtn;
        	int[] arrtemp = new int[arr.length];
        	for(int i = 0; i < arr.length; i++) {
        		arrtemp[i] = arr[i];
        	}
        	Arrays.sort(arrtemp);
            return arrtemp[arrtemp.length-1];
        }
        

	
}