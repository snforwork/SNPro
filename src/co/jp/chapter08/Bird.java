package co.jp.chapter08;

public class Bird extends Animal{
	Bird(String name,int age,String sex){

	   	 super("3",name,age,sex);
	   	count();
   	 System.out.println("---------------");
   	 System.out.println("Bird数："+birdCount);
   	 System.out.println("Bird名前："+name);
   	 System.out.println("Bird年齢:"+age);
   	 System.out.println("Bird性別:"+sex);
   	 System.out.println("---------------");
	}
	  void count() {
     	 birdCount++;
     	 super.count();
     	 System.out.println("Birdクラスのメソッド PETトータル数："+count);
      }

}
