package fr.iutvalence.info.m3105.stackmachine;

public interface CPU
{
	public abstract void run();

	public abstract void wireToProgramMemory(Memory programMemory);

	public abstract void wireToExpStack(Stack expStack);

	public abstract void wireToCallStack(Stack callStack);

	public abstract void wireToIoSubsystem(IO ioSystem);

	public abstract void clearStacks();

	/**
	 * Program Counter
	 * @param address
	 */
	public abstract void setPC(int address);

}