package co.jp.chapter08;

public class Fish extends Animal{
	String name;

	Fish(String name,int age,String sex){

		super("2",name,age,sex);

		count();
		System.out.println("Fish名前 :"+name);
		System.out.println("Fish年齢 :"+age);
		System.out.println("Fish数性別 :"+sex);
		System.out.println("------------");

	}

	void count() {
		fishCount++;
		super.count();
		System.out.println("Catクラスのcountメソッド PETのトータル数："+count);

	}

}
