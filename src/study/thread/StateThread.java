package study.thread;

public class StateThread extends Thread {

	private Object monitor;

	public StateThread(Object monitor) {
		this.monitor = monitor;
	}

	@Override
	public void run() {
		try {

			synchronized (monitor) {
				monitor.wait();
			}

			System.out.println("monitor is notified.");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
