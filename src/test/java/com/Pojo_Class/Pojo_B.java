package com.Pojo_Class;

public class Pojo_B {

	public static void main(String[] args) {
		
		Pojo_A pojo= new Pojo_A();
		
		int a = pojo.getA();
		
		System.out.println(a);
		
		System.out.println("After Setters");
		
		pojo.setA(1710);
		
		int afterset_A = pojo.getA();
		
		System.out.println(afterset_A);
	}
}
  