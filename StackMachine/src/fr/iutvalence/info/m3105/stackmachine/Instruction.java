package fr.iutvalence.info.m3105.stackmachine;

public class Instruction
{
	private int opCode;
	private int[] params;
	
	public Instruction(int opCode, int[] params){
		this.opCode = opCode;
		this.params = params;
	}

	public int getOpCode(){
		return this.opCode;
	}
	
	public int[] getParams(){
		return this.params;
	}
}
