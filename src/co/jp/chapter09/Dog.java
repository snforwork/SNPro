package co.jp.chapter09;

public class Dog implements Eat,Say {

	@Override
	public void eat() {
		System.out.println("犬が骨を食べる");
	}
	public void say() {
		System.out.println("ワンワン");
	}

}
