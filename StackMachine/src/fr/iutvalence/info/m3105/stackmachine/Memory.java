package fr.iutvalence.info.m3105.stackmachine;

public class Memory
{
	private int startedAddress;
	private int endAdress;
	private int[] tMemory;
	
	public Memory(int startAddress, int endAdress) {
		this.startedAddress = startAddress;
		this.endAdress = endAdress;
	}
	
	public int getStartAddress(){
		return startedAddress;
	}
	
	public void write(int currentAddress, int opCode) {
		this.tMemory[currentAddress] = opCode;
	}
	
	public int read(int address){
		return this.tMemory[address];
	}
}
