package co.jp.chapter08;

import co.jp.chapter08.Animal;

public class Bird extends Animal{
	
	
	Bird(String name, int age, String sex){
		//super
		super("3", name, age, sex);
		count();
		System.out.println("-----------------");
		System.out.println("Bird��:" + birdcount);
		System.out.println("Bird��ǰ:" + name);
		System.out.println("Bird���h:" + age);
		System.out.println("Bird�Ԅe:" + sex);
		System.out.println("-----------------");
		
	}
	
	@Override
	void count() {
		birdcount++;
		super.count();
		System.out.println("Bird��:" + count);
	}
	
	
	
}
