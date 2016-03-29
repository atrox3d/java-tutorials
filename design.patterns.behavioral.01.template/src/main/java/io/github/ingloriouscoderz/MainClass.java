package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.concrete.ConcreteClass;
import io.github.ingloriouscoderz.concrete.ShadowConcreteClass;
import io.github.ingloriouscoderz.template.TemplateClass;

public class MainClass {

	public static void main(String[] args) {
		TemplateClass tc = new ConcreteClass();
		tc.templateMethod();

		TemplateClass sc = new ShadowConcreteClass();
		sc.templateMethod();
		
		ShadowConcreteClass scc = new ShadowConcreteClass();
		scc.templateMethod();
	}

}
