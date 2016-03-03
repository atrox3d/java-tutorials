package io.github.ingloriouscoderz;

public class Generics {

	public static void main(String[] args) {
		printVar(5);
		printVar("cinque");
		
		int i = declareVar(int.class, 6);
		printVar(i);

		String s = declareVar(String.class, "sei");
		printVar(s);
}

	public static <E> void printVar(E var) {
		System.out.println("printVar:" + var);
	}
	
	public static <E> E declareVar(Class<E> clazz, E value) {
		E var = value;
		System.out.println("returning [" + clazz.getName() + "] with value : " + value);
		return var;
	}
}
