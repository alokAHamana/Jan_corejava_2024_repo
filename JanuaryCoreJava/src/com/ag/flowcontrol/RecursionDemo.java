package com.ag.flowcontrol;

public class RecursionDemo {

	public static  void p() {
		System.out.println("Hiii!!");
		p();
		
	}

	public static void main(String[] args) {
		
		p();
	}


}
