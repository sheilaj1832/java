
public class Alligator extends Animal {

	public Alligator() {
	}

	@Override
	public void incrementCount() {
		setCounter(getCount() + 1);

	}

	@Override
	public void resetCount() {
		setCounter(0);

	}

	@Override
	public String getCountString() {
		return getCount() + " alligator";
	}

	@Override
	public int getCount() {
		return super.getCounter();
	}

}
