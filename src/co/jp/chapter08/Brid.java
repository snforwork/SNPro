package co.jp.chapter08;

public class Brid extends Animal{
	Brid(int age,SEX sex,String name){
		 super("3",age,sex,name);
		 count();
		 System.out.println("---------------");
		 System.out.println("Brid数:"+Bridcount);
		 System.out.println("Brid名前:"+name);
		 System.out.println("Brid年齢:"+age);
		 System.out.println("Brid性別:"+sex);
		 System.out.println("---------------");
	}
	@Override
	 void count() {
		Bridcount++;
		super.count();
		 System.out.println("Bridクラスのcountメソッド　PETトータル数："+count);
	 }
	
	}
