package com.javalab.generic.pkg03;

/**
 * 제네릭 클래스 Product
 *  - 두 개의 타입 파라미터를 객체 생성 시점에 전달 받는다.
 *
 * @param <K> 첫번째 타입 파라미터 : 제품의 종류
 * @param <M> 두번째 타입 파라미터 : 제품의 모델명
 */
public class Product<K, M> {
	// 필드
	private K kind;
	private M model;

	// 메소드
	public K getKind() {
		return this.kind;
	}

	public M getModel() {
		return this.model;
	}

	public void setKind(K kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Product [kind=" + kind + ", model=" + model + "]";
	}
	
	
}