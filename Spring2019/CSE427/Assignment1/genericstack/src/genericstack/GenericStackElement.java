package genericstack;



public class GenericStackElement<T> {

	T value;
	GenericStackElement<T> next;
	
	
	public GenericStackElement(T value,GenericStackElement<T> next) {
		
		this.value=value;
		this.next=next;
		
	}
	
	public GenericStackElement<T> getNext(){
		
		return next;
		
	}

	public T getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
