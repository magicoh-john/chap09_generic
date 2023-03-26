package com.javalab.generic.pkg04;
/**
 * 제네릭 인터페이스
 *
 * @param <P> 타입 파라미터로 상품을 전달 받는다. 
 */
public interface Rentable<P> {
	P rent();
}