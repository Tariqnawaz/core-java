package practical.multiThreading.threadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPool_ProducerConsumerWithThreadPool_Coderevisited {

	private static AtomicInteger rnd = new AtomicInteger(0);
    private final BlockingQueue<Integer> queue;
 
    public ThreadPool_ProducerConsumerWithThreadPool_Coderevisited()
    {
        queue = new LinkedBlockingQueue<>(3);
    }
	public static void main(String[] args) {
		ThreadPool_ProducerConsumerWithThreadPool_Coderevisited pc = new ThreadPool_ProducerConsumerWithThreadPool_Coderevisited();
	        pc.init();

	}
	
	
	 private void init()
	    {
		 ThreadPool_Queue_N_ConsumerTask2_Coderevisited pool = new ThreadPool_Queue_N_ConsumerTask2_Coderevisited(2);
	        for (int i = 0; i < 100; i++) {
	            pool.addTask(new Producer2());
	            pool.addTask(new Producer2());
	            pool.addTask(new Producer2());
	 
	            pool.addTask(new Consumer2());
	            pool.addTask(new Consumer2());
	            pool.addTask(new Consumer2());
	        }
	        pool.shutdown();
	    }
	 
	    private class Producer2 implements Runnable
	    {
	        @Override
	        public void run()
	        {
	            Integer e = rnd.incrementAndGet();
	            System.out.println("Inserting Element " + e);
	            try {
	                queue.put(e);
	                Thread.sleep(1000);
	            } catch (InterruptedException e2) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }
	 
	    private class Consumer2 implements Runnable
	    {
	        @Override
	        public void run()
	        {
	            try {
	                System.out.println("Removing Element " + queue.take());
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                Thread.currentThread().interrupt();
	            }
	        }
	    }

}
