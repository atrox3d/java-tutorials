package io.github.ingloriouscoderz.abstractfactory.audiodevice;

import io.github.ingloriouscoderz.model.audiodevice.Media;
import io.github.ingloriouscoderz.model.audiodevice.Player;
import io.github.ingloriouscoderz.model.audiodevice.Recorder;

public interface DevicesFactory {
	Player createPlayer();
	Recorder createRecorder();
	Media createMedia();
}
