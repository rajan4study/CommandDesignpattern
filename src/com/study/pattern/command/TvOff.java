package com.study.pattern.command;

public class TvOff implements Command {
	
	ElectronicDevice device;
	
	TvOff(ElectronicDevice newDevice){
		device=newDevice;
	}

	@Override
	public void execute() {
		device.off();

	}

	@Override
	public void undo() {
		device.off();
		
	}

}