package co.jp.chapter10;

public class Pet {


	    //PET トータル数
	    static int count = 0;
	    static int みみcount = 0;
	    static int レオcount = 0;
	    static int マルcount = 0;


	    //名前
	    String name;
	    //年齢
	    int age;
	    //種類
	    String type;

	    Pet(String name, int age, String type){
		this.name = name;
		this.age = age;
		this.type = type;
		//count(type);
		}


	    public Pet(int i, String name2, int age2, String type2) {
			// TODO 自動生成されたコンストラクター・スタブ
		}


		void count(){
		count = みみcount + レオcount + マルcount;
		System.out.println("Pet数:" + count);

		  //みみ・レオ・マル
	      if("1".equals(type)) {
	    	  みみcount++;
	    	  }else if("0".equals(type)){
		      レオcount++;
		      }else if("0".equals(type)) {
		      マルcount++;
		      }
	    }





}