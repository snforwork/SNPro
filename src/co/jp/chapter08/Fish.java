package co.jp.chapter08;

import co.jp.chapter08.Animal;

public class Fish extends Animal{

	
	Fish(String name, int age, String sex){
		//super
		super("2", name, age, sex);
		count();
		System.out.println("-----------------");
		System.out.println("Fish��:" + fishcount);
		System.out.println("Fish��ǰ:" + name);
		System.out.println("Fish���h:" + age);
		System.out.println("Fish�Ԅe:" + sex);
		System.out.println("-----------------");
		
	}
	
	@Override
	void count() {
		fishcount++;
		super.count();
		System.out.println("Fish��:" + count);
	}
	
	
	
}
