package com.practicejava.main;

import com.practicejava.main.learngenerics.PracticeGenerics;

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
	}
}
