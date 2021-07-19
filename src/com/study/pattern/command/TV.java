package com.study.pattern.command;

public class TV implements ElectronicDevice {
	
	private int volume=0;

	@Override
	public void on() {
		System.out.println("TV on");

	}

	@Override
	public void off() {
		System.out.println("TV off");

	}

	@Override
	public void volUp() {
		volume++;
		System.out.println("TV volume +++ :"+ volume);

	}

	@Override
	public void volDown() {
		volume--;
		System.out.println("TV volume --- :"+ volume);

	}

}
