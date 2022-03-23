package com.edu.generic;

// ArrayList<Integer> 할때 <> 가 제너릭임
//parameter 매개변수
//<T> type parameter
public class Box<T> { //<T>은 어떤 타입인지 모르지만 선언하는 시점에 타입을 정함 
	T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}

}
