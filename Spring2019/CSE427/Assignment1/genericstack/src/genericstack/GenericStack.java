package genericstack;



public class GenericStack<T> {
	
	GenericStackElement<T> top;
	int size;
	


	public GenericStack(){
		size=0;
		top=null;
	
	}

	public void push(T newValue) {

		GenericStackElement<T> newElement=new GenericStackElement<T>(newValue,top);
		
		top=newElement;
		size++;
		
	}


	public T pop() {
		GenericStackElement<T> oldTop=top;
		if(size==0)
			{return null;}
		top=top.getNext();
		size--;
		return oldTop.getValue();
		
	}
	

	public T peek() {
		
		if (size==0) {
			
			return null;
			
		}
		return top.getValue();
		
	}
	
	public boolean isEmpty() {


		return false;

	}

}

