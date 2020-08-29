package co.jp.chapter10;

public class レオ extends Pet{


	    レオ(String name, int age, String type){
		//super
		super(0,name,age,type);
		count();
		System.out.println("-----------------");
		System.out.println("レオ��:" + レオcount);
		System.out.println("レオ��ǰ:" + name);
		System.out.println("レオ���h:" + age);
		System.out.println("レオ�Ԅe:" + type);
		System.out.println("-----------------");
		}

	    @Override
	    void count() {
	    	レオcount++;
	    	super.count();
	    	System.out.println("レオ��:" + count);
	    }









}
