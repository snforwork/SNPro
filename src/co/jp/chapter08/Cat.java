package co.jp.chapter08;

import co.jp.chapter08.Animal;

public class Cat extends Animal{
	

	Cat(String name, int age, String sex){
		//super
		super("1", name, age, sex);
		count();
		System.out.println("-----------------");
		System.out.println("Cat��:" + catcount);
		System.out.println("Cat��ǰ:" + name);
		System.out.println("Cat���h:" + age);
		System.out.println("Cat�Ԅe:" + sex);
		System.out.println("-----------------");
		
	}
	
	@Override
	void count() {
		catcount++;
		super.count();
		System.out.println("Cat��:" + count);
	}

	
	
	
}
