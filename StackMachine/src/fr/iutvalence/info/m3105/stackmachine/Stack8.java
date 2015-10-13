package fr.iutvalence.info.m3105.stackmachine;

public class Stack8 implements Stack
{
	private int[] tableau;
	
	public Stack8(int taille){
		this.tableau = new int[taille];
	}
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.Stack#clearStack()
	 */
	@Override
	public void clearStack(){
	
	}
	
	public void push(int word) throws InvalidParametersException{
		if(word > 255 && word < 0){
			throw new InvalidParametersException();
		}
	}
	
	public void pop(){
		
	}
}
