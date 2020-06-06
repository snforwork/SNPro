package co.jp.chapter09;

public abstract class BasePet {
	//abstract只可继承不可实例化
	
	abstract void eat();
	
	abstract void say();
	
	abstract void fly();

	void jump() {
		System.out.print("Pet die");
	}
}
