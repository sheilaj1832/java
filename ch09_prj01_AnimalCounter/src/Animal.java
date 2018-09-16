

public abstract class Animal implements Countable {

	int counter;

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Override
	public String toString() {
		return "Animal [counter=" + counter + "]";
	}
	
		
		
	
}
