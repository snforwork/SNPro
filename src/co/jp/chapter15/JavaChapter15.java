package co.jp.chapter15;

public class JavaChapter15 {


	    //実戦
	    //以下ユースケース通り、ATMアプリを作成してください。
		private int num;
        private int pin;
	    private int amount1;
	    private static int totalAmount;

		public JavaChapter15(int num,int pin,int amount){
	            this.num=num;
	            this.pin=pin;
	            this.amount1=amount;
	            totalAmount+=amount;
		        int p;
				return;
        }

		private int amount;
		public void deposit(int money){
		        this.amount1+=money;
	            int totalAmount = money;
		        System.out.println(money+"円預入しました。");

		}

		public void draw(int money){
			if(this.amount1 < money){
		        System.out.println("残高が不足しています。");

		    }else{
		        this.amount1-=money;
		        int totalAmount = money;
	            System.out.println(money+"円引き出しました。");
		    }
		}

		public static void displayTotalAmount(){
		        String totalAmount = null;
				System.out.println("全口座の残高の合計は"+totalAmount+"円です。");
		}









}




