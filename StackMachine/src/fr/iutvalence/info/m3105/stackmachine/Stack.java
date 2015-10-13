package fr.iutvalence.info.m3105.stackmachine;

public interface Stack
{

	public abstract void clearStack();

	public abstract void push(int word) throws InvalidParametersException;
	
	public abstract void pop();
}