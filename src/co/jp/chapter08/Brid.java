package co.jp.chapter08;

public class Brid extends Animal{
	String name;

	Brid(String name,int age,String sex){

		super("3",name,age,sex);
		count();
		System.out.println("------------");
		System.out.println("Brid数 :"+bridCount);
		System.out.println("Brid名前 :"+name);
		System.out.println("Brid年齢 :"+age);
		System.out.println("Brid数性別 :"+sex);
		System.out.println("------------");

	}

	void count() {
		bridCount++;
		super.count();
		System.out.println("Catクラスのcountメソッド PETのトータル数："+count);

	}



}
