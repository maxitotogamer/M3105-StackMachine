package fr.iutvalence.info.m3105.stackmachine;

public class Program
{
	private Instruction[] instructions;

	public Program(Instruction[] instruction){
		this.instructions = instruction;
	}
	
	public int getInstructionCount(){
		return this.instructions.length;
	}
	
	public Instruction getInstructionAt(int instructionNumber){
		return this.instructions[instructionNumber]; 
	}
}
