package com.study.pattern.command;

public class TvOn implements Command {
	
	ElectronicDevice device;
	
	TvOn(ElectronicDevice newDevice){
		device=newDevice;
	}

	@Override
	public void execute() {
		device.on();

	}

	@Override
	public void undo() {
		device.off();
		
	}

}
