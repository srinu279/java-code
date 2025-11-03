package com.pack1;

public class B extends A{
	static int c=m3();
	static int m3()
	{
		System.out.println("subclass static m3 method");
		return 333;
	}
	static {
		System.out.println("sub class static block");
		System.out.println("-------------------------");
	}
	int d=m4();
	int m4()
	{
		System.out.println("sub class non static m4 method");
		return 444;

	}
	{
		System.out.println("sub class non static block");
		System.out.println("----------------------------");
	}
	B()
	{
		System.out.println("sub class constructor");
		System.out.println("----------------------------------");
	}
	public static void main(String[] args) {
		System.out.println("sub class Main method");
	}

}
