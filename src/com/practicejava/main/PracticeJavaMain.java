package com.practicejava.main;

import java.util.ArrayList;
import java.util.List;

import com.practicejava.main.learngenerics.PracticeGenerics;
import com.practicejava.main.learnlamda.PracticeLamda;
import com.practicejava.main.learnlamda.lamdainterface.FunctionInterface;
import com.practicejava.main.learnlamda.lamdainterface.FunctionalNoArgsInterface;

public class PracticeJavaMain {

	public static void main(String[] args) {
		
		// Classで実装したパターン
		PracticeGenerics<String> strPracGenerics = new PracticeGenerics<String>("Hello World");
		System.out.println(strPracGenerics.getValue());
		
		// Interfaceで実装したパターン【String】
		String str = strPracGenerics.print("これはString型のパターン");
		System.out.println(str);
		
		// Interfaceで実装したパターン【Integer】
		Integer smplInt = strPracGenerics.print(123);
		System.out.println(smplInt);
		
		
		
		// 改行用
		System.out.println("\n ────────── \n");
		
		
		
		/** 関数型プログラミング「ラムダ式」を使ってみる */
		// FunctionInterface fI = new FunctionInterface() {
		//			
		// 	@Override
		//  public String greet(String name) {
		// 		return "おはよう！" + name + "さん";
		// 	}
		// };
		//
		// ↓以下のように書き換えることが可能
		
		// ●引数あり
		FunctionInterface fI = (String name) -> {
			return "おはよう！" + name + "さん";
		};
		
		System.out.println("引数あり:");
		System.out.println("  " + fI.greet("Java"));
		
		// ●引数なし
		FunctionalNoArgsInterface fNI = () -> {
			int a = 2;
			int b = 2;
			return a * b;
		};
		
		System.out.println("引数なし:");
		System.out.println("  " + "計算結果：" + fNI.calc());
		
		// ●return省略
		// System.out.println("return省略:");
		// fI = name -> "おはよう！" + name + "さん";
		// int a = 3;
		// int b = 4;
		// fNI = () -> a * b;
		
		
		
		// 改行用
		System.out.println("\n ────────── \n");
		
		
		
		// StreamAPIの利用
		PracticeLamda pL = new PracticeLamda();
		List<String> listStr = new ArrayList<String>();
		listStr.add("あいうえお");
		listStr.add("あいうえおかきくけこ");
		listStr.add("あいうえおかきくけこさしすせそ");
		
		pL.printList(listStr);
		
		
	}
}
