package com.javalab.generic.pkg10;

import java.util.ArrayList;

/**
 * 부모 클래스
 */
class Fruit {
	public String toString() {
		return "Fruit";
	}
}
/**
 * 사과 자식 클래스
 */
class Apple extends Fruit {
	public String toString() {
		return "Apple";
	}
}
/**
 * 포도 자식 클래스
 */
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}
/**
 * 상속과 관계 없는 장난감 클래스
 */
class Toy {
	public String toString() {
		return "Toy";
	}
}

//제네릭 클래스 - 상품들을 여러개 담는 역할 클래스
class Box<T> {
	// 필드
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}

/**
 * 실행클래스
 */
public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		Box<Toy> toyBox = new Box<Toy>();
//		Box<Grape> grapeBox = new Box<Apple>(); // 에러. 타입 불일치


		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); // OK. void add(Fruit item)

		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); // 에러. Box<Apple>에는 Apple만 담을 수 있음

		toyBox.add(new Toy());
//		toyBox.add(new Apple()); // 에러. Box<Toy>에는 Apple을 담을 수 없음

		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	} // main의 끝
}


