package io.github.ingloriouscoderz.abstractfactory.audiodevice;

import io.github.ingloriouscoderz.model.audiodevice.CD;
import io.github.ingloriouscoderz.model.audiodevice.CDPlayer;
import io.github.ingloriouscoderz.model.audiodevice.CDRecorder;
import io.github.ingloriouscoderz.model.audiodevice.Media;
import io.github.ingloriouscoderz.model.audiodevice.Player;
import io.github.ingloriouscoderz.model.audiodevice.Recorder;

public class CDDevicesFactory implements DevicesFactory {

	@Override
	public Player createPlayer() {
		return new CDPlayer();
	}

	@Override
	public Recorder createRecorder() {
		return new CDRecorder();
	}

	@Override
	public Media createMedia() {
		return new CD();
	}

}
