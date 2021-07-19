package com.study.pattern.command;

public class TvVolPlus implements Command {
	
	ElectronicDevice device;
	
	TvVolPlus(ElectronicDevice newDevice){
		device=newDevice;
	}

	@Override
	public void execute() {
		device.volUp();

	}

	@Override
	public void undo() {
		device.volDown();
		
	}

}