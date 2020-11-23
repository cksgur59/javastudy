package com.naver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandList {

	List<Command> cmdl = new ArrayList<Command>();
	
	public List<Command> cmdl() {
		cmdl.add(new CommandInsert());
		cmdl.add(new CommandSelect());
		cmdl.add(new CommandUpdate());
		cmdl.add(new CommandDelete());
		return cmdl;
	}
	
}
