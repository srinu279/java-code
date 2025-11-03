package com.pack1;

public class A {
	static int a=m1();
	static int m1()
	{
		System.out.println("super class static m1 method");
		return 111;
	}
	static 
	{
		System.out.println("super class static block");
		System.out.println("------------------------------");
	}
	int b=m2();
	int m2()
	{
		System.out.println("super class non-static m2 method");
		System.out.println("------------------------------");
		return 222;
	}
	A()
	{
		System.out.println("super class constructor");
		System.out.println("-------------------------------");
	}
	public static void main(String[] args) {
		A obj=new A();
		System.out.println("super class Main method");
	}

}
