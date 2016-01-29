package com.kozak;

import java.util.Collection;

public class Audi implements Car {

	public Audi() {
	}

	private Collection<Do> voices;

	public void drive() {
		for (Do instrument : voices) {
			instrument.doVoice();
		}
	}

	public void setVoices(Collection<Do> voices) {
		this.voices = voices;
	}

}
