package com.practicejava.main.learnlamda;

import java.util.List;

public class PracticeLamda {

	// List<String>の場合
	// リストの文字数をコンソールに出力
	public void printList(List<String> list) {
		list.stream()
			.map(t -> t.length())
			.forEach(System.out::println);
	}
}
