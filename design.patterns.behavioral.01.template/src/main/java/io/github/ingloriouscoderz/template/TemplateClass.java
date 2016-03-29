package io.github.ingloriouscoderz.template;

public abstract class TemplateClass {

	public final void templateMethod() {
		mandatoryMethod();
		skeletonMethod1();
		skeletonMethod2();
	}
	
	private void mandatoryMethod() {
		System.out.println("Hello you cannot get rid of me.");
	}
	
	public abstract void skeletonMethod1();
	public abstract void skeletonMethod2();
}
