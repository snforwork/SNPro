package co.jp.chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankApp {


	    //実戦
	    //以下ユースケース通り、ATMアプリを作成してください。
	    public static List<Account> list=new ArrayList<>();
        public static Scanner s=new Scanner(System.in);
	    public static void main(String[] args) {
			    while(true){
			    	int select=getInputInt("1. 新規口座作成 / 2. 預入 / 3. 引出 / 4.預入総額表示 / 5. 終了>");
				switch(select) {
        //case1:
	    Account acc=new Account(
                getInputInt("口座番号を入力して下さい >"),
	            getInputInt("暗証番号を入力して下さい >"),
	            getInputInt("初期預入金額を入力して下さい >")
	    );
	    list.add(acc);
	    break;

	    //case2:
	    displayAccount();
	            int index=getInputInt("口座を番号で選択して下さい >");
	            if(index < 0 || index >= list.size()){
	            	System.out.println("口座の番号の選択が誤っています。");
	            }else{
	            int money=getInputInt("預入金額を入力して下さい >");
	    list.get(index).deposit(money);
	            }
	    break;

	    //case3:
	    displayAccount();
	            index=getInputInt("口座を番号で選択して下さい >");
	            if(index < 0 || index >= list.size()){
	            	System.out.println("口座の番号の選択が誤っています。");
	            }else{
	            int pass=getInputInt("暗証番号を入力して下さい >") ;
	            if(list.get(index).checkPin(pass)){
	            int money=getInputInt("引出金額を入力して下さい >");
	    list.get(index).draw(money);
                }else{
                	System.out.println("暗証番号が誤っています。");
                	}
	            }
	    break;

	    //case4:
	    Account.displayTotalAmount();

	    //case5:
	    System.out.println("アプリケーションを終了しました。");
	    return;

				}
	    }

	    public static int getInputInt(String msg){
	    	System.out.print(msg);
	    	int input=s.nextInt();
	        return input;
	    }

	    public static void displayAccount(){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(i+"---"+list.get(i));
	        }

	    }









}
