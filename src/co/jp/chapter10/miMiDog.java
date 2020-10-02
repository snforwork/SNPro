package co.jp.chapter10;

public class miMiDog extends Pet {
	miMiDog(String name, int age, String type){
		//super
		super(1,name,age,type);
		count();
		System.out.println("みみ:" + miMicount);
		System.out.println("みみ:" + name);
		System.out.println("みみ:" + age);
		System.out.println("みみは:" + type);
		}

	@Override
	    void count() {
	    	miMicount++;
	    	super.count();
	    	System.out.println("みみ��:" + count);
	    }
}
