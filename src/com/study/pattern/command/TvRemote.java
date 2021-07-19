package com.study.pattern.command;

public class TvRemote {
	
	public static ElectronicDevice getDevice() {
		return new TV();
	}

}
