package com.tnsif.oopsconcept;
class Chan{
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	int a,b,c;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Chan"+"\nA:"+a+"\nB:"+b+"\nC:"+c+"\nname:"+name;
	}
	String name;
}

public class oopsconcept{
	public static void main(String[]args) {
		Chan ed=new Chan();
		ed.setA(23);
		ed.setB(24);
		ed.setC(355);
		ed.setName("Chan");
		System.out.println(ed);
		
		
	}
	
}
	




	
