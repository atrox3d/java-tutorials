package io.github.ingloriouscoderz.design.adapter;

public class SocketObjectAdapter implements SocketAdapter{
	
	private Socket sock = new Socket();

	@Override
	public Volt get120Volt() {
		return convertVolt(sock.getVolt(), 1);
	}

	@Override
	public Volt get12Volt() {
		return convertVolt(sock.getVolt(), 10);
	}

	@Override
	public Volt get3Volt() {
		return convertVolt(sock.getVolt(), 20);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
