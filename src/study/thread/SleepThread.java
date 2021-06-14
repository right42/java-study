package study.thread;

public class SleepThread extends Thread {

	private final int sleepMill;

	public SleepThread(int sleepMill) {
		this.sleepMill = sleepMill;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(sleepMill);
			System.out.println(Thread.currentThread().getName() + " run!!");

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
