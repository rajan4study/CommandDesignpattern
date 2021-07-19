package com.study.pattern.command;

public class DeviceButton {
	
	Command command;
	
	DeviceButton(Command newCommand){
		command=newCommand;
	}
	
	public void press() {
		command.execute();
	}
	
	public void back() {
		command.undo();
	}


}
