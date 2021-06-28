package study;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AtomicTest {
	public static void main(String[] args) throws InterruptedException {

		Counter counter = new Counter();
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				counter.increment();
			}
		});

		thread1.start();
		thread2.start();

		thread1.join();
		thread2.join();

		System.out.println(counter.getCount());
	}

	static class Counter {
		// private int count;

		// private Lock lock;

		private AtomicInteger count = new AtomicInteger();

		public void increment() {
			// lock.lock();
			count.incrementAndGet();
			// lock.unlock();
		}

		public int getCount() {
			return count.intValue();
		}
	}
}
