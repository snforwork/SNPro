package co.jp.chapter07;

public class JavaChapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
       //インスタンス化オブジェクト 实体化对象
		//クラスタイプ+ オブジェクト名称+  =new コンストラクタ(构造方法)
		String strname = new String("ABC");
		Human objname = new Human();
		objname.setName("Obama");
		objname.setAge(50);
		objname.setSex(1);

	   System.out.println(objname.getName());
	   System.out.println(objname.getAge());
	   if(objname.getSex() ==1) {
		   System.out.println("男");
	   }else if(objname.getSex() ==2){
		   System.out.println("女");
	   }else {
		   System.out.println(objname.getSex());
	   }




	   Human obj2 = new Human("Trump",70,1);
        //set 無し
	   System.out.println("Trump count:"+Human.count);
	   System.out.println(obj2.getName());
	   System.out.println(obj2.getAge());
	   if(obj2.getSex() ==1) {
		   System.out.println("男");
	   }else if(obj2.getSex() ==2){
		   System.out.println("女");
	   }else {
		   System.out.println(obj2.getSex());
	   }



	   Human xiaoMing = new Human("xiaoMing",10,1);
       //set 無し
	   System.out.println("xiaoMing count:"+Human.count);
	   System.out.println(xiaoMing.getName());
	   System.out.println(xiaoMing.getAge());
	   if(xiaoMing.getSex() ==1) {
		   System.out.println("男");
	   }else if(xiaoMing.getSex() ==2){
		   System.out.println("女");
	   }else {
		   System.out.println(xiaoMing.getSex());
	   }










           Human obj3 = new Human("希拉里克林顿",2);
           System.out.println(obj3.getName());
           if(obj3.getSex() ==1) {
    		   System.out.println("男");
    	   }else if(obj3.getSex() ==2){
    		   System.out.println("女");
    	   }else {
    		   System.out.println(obj3.getSex());
	}


           Animal obj4 = new Animal();
            obj4.setName("Tiger");
            obj4.setAge(10);
    		obj4.setSex(1);
    		obj4.setLegs(4);
           System.out.println(obj4.getName());
           System.out.println(obj4.getAge());
           if(obj4.getSex() ==1) {
    		   System.out.println("雄");
    	   }else if(obj4.getSex() ==2){
    		   System.out.println("雌");
    	   }else {
    		   System.out.println(obj4.getSex());
	}
           System.out.println(obj4.getLegs());















}

	}
