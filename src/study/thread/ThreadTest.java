package study.thread;

public class ThreadTest  {

	public static void main(String[] args) throws InterruptedException {
		Object monitor = new Object();
		StateThread stateThread = new StateThread(monitor);
		StateThread stateThread2 = new StateThread(monitor);

		stateThread.start();
		stateThread2.start();

		System.out.println("Thread state " + stateThread.getState());
		synchronized (monitor) {
			monitor.notifyAll();
		}

		stateThread.join();
		stateThread2.join();
		System.out.println("Main Thread end");
	}

	private static void threadStudy2() throws InterruptedException {
		Calculator calculator = new Calculator();
		Calculator calculator2 = new Calculator();

		Thread calcThread1 = new Thread(new CalcThread(calculator));
		Thread calcThread2 = new Thread(new CalcThread(calculator2));

		calcThread1.start();
		calcThread2.start();

		calcThread1.join();
		calcThread2.join();
		System.out.println(calculator.getAmount());
	}

	static class CalcThread implements Runnable {

		private final Calculator calculator;

		public CalcThread(Calculator calculator) {
			this.calculator = calculator;
		}

		@Override
		public void run() {
			for (int i = 0; i < 10000; i++) {
				calculator.plus(1);
			}
		}
	}


	private static void threadStudy1() {
		SleepThread thread1 = new SleepThread(2000);
		SleepThread thread2 = new SleepThread(1000);

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Main Thread end");
	}

}
