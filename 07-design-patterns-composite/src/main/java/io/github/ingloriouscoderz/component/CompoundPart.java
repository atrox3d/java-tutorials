package io.github.ingloriouscoderz.component;

import java.util.Iterator;
import java.util.Vector;

public class CompoundPart implements Component {
	String name;
	protected Vector<Component> children;
	public CompoundPart(String name) {
		this.name = name;
		children = new Vector<Component>();
	}

	@Override
	public void add(Component c) {
		children.addElement(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public Component getChild(int index) {
		return children.elementAt(index);
	}

	@Override
	public void describe() {
		System.out.println("Component name: " + name);
		if(children.size()>0) {
			System.out.println("composed by: {");
			for (Iterator<Component> iterator = children.iterator(); iterator.hasNext();) {
				Component c = iterator.next();
				c.describe();
			}
			System.out.println("}");
		}
	}
}
