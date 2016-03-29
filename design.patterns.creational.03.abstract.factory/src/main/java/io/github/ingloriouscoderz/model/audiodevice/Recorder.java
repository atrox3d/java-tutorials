package io.github.ingloriouscoderz.model.audiodevice;

public interface Recorder {
	void accept(Media media);
	void record(String sound);
}
