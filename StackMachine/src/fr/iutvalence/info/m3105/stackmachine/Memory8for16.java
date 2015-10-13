package fr.iutvalence.info.m3105.stackmachine;

public class Memory8for16 implements Memory
{
	private int startedAddress;
	private int endAddress;
	private int[] tMemory;
	
	public Memory8for16(int startAddress, int endAddress) throws InvalidParametersException{
		
		if (endAddress < startAddress && startAddress < 0 || endAddress > 65535){
			throw new InvalidParametersException();
		}
		this.startedAddress = startAddress;
		this.endAddress = endAddress;
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#getStartAddress()
	 */
	@Override
	public int getStartAddress(){
		return startedAddress;
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#write(int, int)
	 */
	@Override
	public void write(int currentAddress, int opCode) throws InvalidParametersException{
		if(opCode > 255 && opCode < 0){
			throw new InvalidParametersException();
		}
		this.tMemory[currentAddress] = opCode;
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Memory#read(int)
	 */
	@Override
	public int read(int address){
		return this.tMemory[address];
	}
}
