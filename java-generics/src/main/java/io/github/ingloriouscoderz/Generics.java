package io.github.ingloriouscoderz;

public class Generics {

	public static void main(String[] args) {
		printVar(5);
		printVar("cinque");
		//////////////////////////////////////////////////////////////////////////////////
		int i = declareVar(int.class, 6);
		printVar(i);
		//////////////////////////////////////////////////////////////////////////////////
		String s = declareVar(String.class, "sei");
		printVar(s);
		//////////////////////////////////////////////////////////////////////////////////
		GenericBox<Integer> gbi = new GenericBox<Integer>(7);
		System.out.println(gbi);

		GenericBox<String> gbs = new GenericBox<String>("sette");
		System.out.println(gbs);
		
		System.out.println("test Class<E>clazz==E value.class: " + testClass(Integer.class, 5));
	}

	public static <E> void printVar(E var) {
		System.out.println("printVar:" + var);
	}
	
	public static <E> E declareVar(Class<E> clazz, E value) {
		E var = value;
		System.out.println("returning [" + clazz.getName() + "] with value : " + value);
		return var;
	}
	
	public static <E> boolean testClass(Class<E> clazz, E value) {
		return value.getClass() == clazz;
		
	}
	
	
}
