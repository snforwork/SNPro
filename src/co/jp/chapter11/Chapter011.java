package co.jp.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Chapter011 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str;
		
		int[] arr = new int[10];
		
//		arr[0]="132";
		System.out.println("Array:"+arr.length);
		System.out.println(arr[0]);
		
		List<Integer> list = new ArrayList();
		
//		list.add("1234");
		System.out.println("List:" + list.size());
		
		list.add(1234657890);
		System.out.println("List:" + list.size());
		
		System.out.println("List:" + list.get(0));
		
		/*
		 *	３ 配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。
		 */

		List<Integer> list1 = new ArrayList();
		list1.add(1);
		list1.add(2);
		list1.add(6);
		list1.add(7);
		list1.add(9);
		list1.add(6);
		list1.add(2);
		list1.add(1);

				int max = 0;
				int min = 0;
				for (int i = 0; i < list1.size(); i++) {
					if (list.get(i) > max) {
						max = list.get(i);
					}
					if (list.get(i) < min) {
						min = list.get(i);
					}
				}
				System.out.println(" MAX : " + max);
				System.out.println(" MIN : " + min);
	}

//	private static int list1(int i) {
//		// TODO 自動生成されたメソッド・スタブ
//		return 0;
	}

//}
