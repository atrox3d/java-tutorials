package io.github.ingloriouscoderz.concrete;

import io.github.ingloriouscoderz.template.TemplateClass;

public class ConcreteClass extends TemplateClass {

	@Override
	public void skeletonMethod1() {
		System.out.println("hello, here skeletonMethod1 from ConcreteClass");
	}

	@Override
	public void skeletonMethod2() {
		System.out.println("hello, here skeletonMethod2 from ConcreteClass");
	}

}
