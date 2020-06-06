package co.jp.chapter08;

public class Cat extends Animal {
//黙然的
//	String name;
	Cat(int age,SEX sex,String name){
		 super("1",age,sex,name);
		 
//		 super.count(this.type);
		 count();
		 System.out.println("---------------");
		 System.out.println("Cat数:"+Catcount);
		 System.out.println("Cat名前:"+name);
		 System.out.println("Cat年齢:"+age);
		 System.out.println("Cat性別:"+sex);
		 System.out.println("---------------");
//	name="HELLOKITTY";
		
	}
	@Override
	 void count() {
		//①最初
		
		Catcount++;
		
		//②処理中
		
		super.count();
		
		 System.out.println("CATクラスのcountメソッド　PETトータル数："+count);
	 }
	
	
}
