package com.ldq.imooc.spring.ioc.interfaces;

public class Main {

	public static void main(String[] args) {

		OneInterface oneInterface = new OneInterfaceImpl();
		System.out.println(oneInterface.hello("ldq"));
	}

}
