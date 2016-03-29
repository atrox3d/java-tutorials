package io.github.ingloriouscoderz.concrete;

import io.github.ingloriouscoderz.template.TemplateClass;

public class ShadowConcreteClass extends TemplateClass {

	@Override
	public void skeletonMethod1() {
		System.out.println("hellom, here skeletonMethod1 from ConcreteClass");
	}

	@Override
	public void skeletonMethod2() {
		System.out.println("hellom, here skeletonMethod2 from ConcreteClass");
	}

	public void mandatoryMethod() {
		System.out.println("is this thing turned on?");
	}
}
