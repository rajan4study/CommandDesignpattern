package com.study.pattern.command;

public class RemoteApplication {
	
	public static void main(String[] args) {
		ElectronicDevice device= TvRemote.getDevice();
		TvOn tvOnCommand=new TvOn(device);
		DeviceButton button= new DeviceButton(tvOnCommand);
		button.press();
		
		TvOff tvOffCommand=new TvOff(device);
		button= new DeviceButton(tvOffCommand);
		button.press();
		
		TvVolPlus plus=new TvVolPlus(device);
		button= new DeviceButton(plus);
		button.press();
		button.press();
		button.press();
		button.press();
		button.press();
		button.back();
		button.back();
		
		TvVolMinus minus=new TvVolMinus(device);
		button= new DeviceButton(minus);
		button.press();
		button.press();
		button.press();
		button.press();
		button.press();
	}

}
