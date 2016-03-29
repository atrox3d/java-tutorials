package io.github.ingloriouscoderz.component;

public interface Component {
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
	void describe();
}
