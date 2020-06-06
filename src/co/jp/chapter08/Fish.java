package co.jp.chapter08;

public class Fish extends Animal{
	Fish(int age,SEX sex,String name){
		 super("2",age,sex,name);
		 count();
		 System.out.println("---------------");
		 System.out.println("Fish数:"+Fishcount);
		 System.out.println("Fish名前:"+name);
		 System.out.println("Fish年齢:"+age);
		 System.out.println("Fish性別:"+sex);
		 System.out.println("---------------");
}
	@Override
	 void count() {
		Fishcount++;
		super.count();
		 System.out.println("Fishクラスのcountメソッド　PETトータル数："+count);
	 }
	
	}
