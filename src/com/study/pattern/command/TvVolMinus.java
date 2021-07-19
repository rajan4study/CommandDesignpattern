package com.study.pattern.command;

public class TvVolMinus implements Command {
	
	ElectronicDevice device;
	
	TvVolMinus(ElectronicDevice newDevice){
		device=newDevice;
	}

	@Override
	public void execute() {
		device.volDown();

	}

	@Override
	public void undo() {
		device.volUp();
		
	}

}