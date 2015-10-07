package fr.iutvalence.info.m3105.stackmachine;

public class Program
{
	private int instructionCount;
	private int[] instruction;

	public Program(int[] instruction){
		this.instruction = instruction;
		this.instructionCount = instruction.length;
	}
	
	public int getInstructionCount(){
		return this.instructionCount;
	}
	
	public int getInstructionAt(int instructionNumber){
		return this.instruction[instructionNumber]; 
	}
}
