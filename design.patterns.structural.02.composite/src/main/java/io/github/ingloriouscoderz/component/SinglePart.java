package io.github.ingloriouscoderz.component;

public class SinglePart extends CompoundPart {

	public SinglePart(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
	}

	@Override
	public void remove(Component c) {
	}

	@Override
	public Component getChild(int index) {
		return this;
	}

	@Override
	public void describe() {
		// TODO Auto-generated method stub
		super.describe();
	}

}
