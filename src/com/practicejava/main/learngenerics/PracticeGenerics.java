package com.practicejava.main.learngenerics;

import com.practicejava.main.learngenerics.genericsinterface.GenericsInterface;

public class PracticeGenerics<T> implements GenericsInterface {
	
	/** フィールド変数 */
	private T value;
	
	/** コンストラクタ */
	public PracticeGenerics(T value) {
		this.value = value;
	}
	
	/** Getter */
	public T getValue() {
		return value;
	}
	
	/** Setter */
	public void setValue(T value) {
		this.value = value;
	}

	@Override
	public <U> U print(U value) {
		return value;
	}
}
