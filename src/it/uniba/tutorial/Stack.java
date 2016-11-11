package it.uniba.tutorial;

import java.util.LinkedList;

public class Stack {
	
	LinkedList<Integer> stack;
	
	public Stack(){
		stack = new LinkedList<>();
	}
	
	//add a new element on the top
	public void push(int x) throws NumeroNegativoException {
		
		if(x < 0) throw new NumeroNegativoException("Inserito numero negativo");
		
		stack.addLast(x);
	}
	
	//remove the item at the top
	public void pop() throws CollezioneVuotaException{
		
		if(stack.isEmpty()) throw new CollezioneVuotaException("Collezione vuota");
		
		stack.removeFirst();
	}
	
	//return the item at the top (without removing it)
	public int peek() throws CollezioneVuotaException{ 
		
		if(stack.isEmpty()) throw new CollezioneVuotaException("Collezione vuota");
		return stack.peekFirst();
	}
	
	//return the number of items on the stack
	public int size() {
		
		if(stack.size() == 0){
			//return isEmpty();
		}
		return stack.size();
	}
	
	//return whether the stack has not items 
	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
