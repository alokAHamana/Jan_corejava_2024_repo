package com.aa.Oops.polymorphism;

public class ResolutionClient {

	public static void main(String[] args) {

		ResolutionDemo resolutionDemo = new ResolutionDemo();

		resolutionDemo.m1(new Object());

		resolutionDemo.m1("Amit");

		resolutionDemo.m1(null);// method resolution child argument will get more priority

	}

}
