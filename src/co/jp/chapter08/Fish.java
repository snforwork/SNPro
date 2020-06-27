package co.jp.chapter08;

import co.jp.chapter08.Animal;

public class Fish extends Animal{

	
	Fish(String name, int age, String sex){
		//super
		super("2", name, age, sex);
		count();
		System.out.println("-----------------");
		System.out.println("Fish数:" + fishcount);
		System.out.println("Fish名前:" + name);
		System.out.println("Fish年齢:" + age);
		System.out.println("Fish性別:" + sex);
		System.out.println("-----------------");
		
	}
	
	@Override
	void count() {
		fishcount++;
		super.count();
		System.out.println("Fish数:" + count);
	}
	
	
	
}
