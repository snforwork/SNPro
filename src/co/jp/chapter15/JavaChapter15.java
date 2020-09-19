package co.jp.chapter15;

import java.util.Scanner;

public class JavaChapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//ユーザーが入力された内容取得
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		//ユーザーの口座番号、パスワード、名義人と金額を声明する
		String[]cardNub  ={"111","1111","111"};
		String[] pwdNum= {"112","223","343"};
		String[] user= {"木村拓哉","石原さとみ","小栗旬"};
		double[] money= {10000000.0,20000000.0,50000000.0};
		//password入力された回数
		int time = 3;
		//カード番号存在するか判断、２０の場合存在していない
		int index1=2;
//		int index2=2;
		//loop終了判断、３の場合loop終了
		int out = 3;
		do {
			System.out.println("口座番号を入力してください");
			String cardNumber = scanner.nextLine();
			for(int i=0;i<cardNub.length+1;i++) {
				if(cardNumber.equals(cardNub[i])) {
					index1=i;
					break;
				}
			}
			if(index1!=2) {
				System.out.println("パスワードを入力してください");
				String passWord = scanner.nextLine();
				if(passWord.equals(pwdNum[index1])) {
					System.out.println("Successful!");
					while(out==3) {
						System.out.println("1.引き出し　2.預かり　3.残高照会");
						int num = scanner.nextInt();
						switch(num) {

						case 1:System.out.println("引き出す金額を入力してください：");
							int getMoney = scanner.nextInt();
							if(getMoney>money[index1]) {
								System.out.println("NoPossible!");
							}else {
								money[index1] = getMoney;
								}
						case 2:System.out.println("預かる金額を入力してください：");
							int saveMoney=scanner.nextInt();
							money[index1]+=saveMoney;
							System.out.println(money[index1] + saveMoney);

						case 3:System.out.println(money[index1]);
							break;
						}
					};
				}
			}else {
				System.out.println("入力された口座番号、又はパスワードが誤っています。");
			}
		}while (time>0);//ss
	}

}