package study.thread;

public class Calculator {

	private int amount;

	private final Object lock = new Object();

	public void plusSync(int num) {
		synchronized (lock) {
			amount += num;
		}
	}

	public void plus(int num) {
		amount += num;
	}

	public void minus(int num) {
		amount -= num;
	}

	public int getAmount(){
		return amount;
	}

}
