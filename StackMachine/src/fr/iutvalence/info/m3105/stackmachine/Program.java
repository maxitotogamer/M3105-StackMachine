package fr.iutvalence.info.m3105.stackmachine;

public class Program
{
	private int[] instructions;

	public Program(int[] instruction){
		this.instructions = instruction;
	}
	
	public int getInstructionCount(){
		return this.instructions.length;
	}
	
	public int getInstructionAt(int instructionNumber){
		return this.instructions[instructionNumber]; 
	}
}
