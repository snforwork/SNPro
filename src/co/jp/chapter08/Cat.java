package co.jp.chapter08;

public class Cat extends Animal {



	Cat(String name,int age,String sex){

        	 super("1",name,age,sex);
        	 //super.count(this.type);
        	 count();
        	 System.out.println("---------------");
        	 System.out.println("CAT数："+catCount);
        	 System.out.println("CAT名前："+name);
        	 System.out.println("CAT年齢:"+age);
        	 System.out.println("CAT性別:"+sex);
        	 System.out.println("---------------");

	}
	//@override
	         void count() {
	        	 catCount++;
	        	 super.count();
	        	 System.out.println("Catクラスのメソッド PETトータル数："+count);
	         }



}
