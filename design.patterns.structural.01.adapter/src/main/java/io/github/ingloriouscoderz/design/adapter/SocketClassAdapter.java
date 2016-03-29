package io.github.ingloriouscoderz.design.adapter;

public class SocketClassAdapter extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return convertVolt(getVolt(), 1);
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(getVolt(), 20);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
