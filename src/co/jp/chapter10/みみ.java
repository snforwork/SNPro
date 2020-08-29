package co.jp.chapter10;

public class みみ extends Pet{


	    みみ(String name, int age, String type){
		//super
		super(1,name,age,type);
		count();
		System.out.println("-----------------");
		System.out.println("みみ��:" + みみcount);
		System.out.println("みみ��ǰ:" + name);
		System.out.println("みみ���h:" + age);
		System.out.println("みみ�Ԅe:" + type);
		System.out.println("-----------------");
		}

	    @Override
	    void count() {
	    	みみcount++;
	    	super.count();
	    	System.out.println("みみ��:" + count);
	    }










}
