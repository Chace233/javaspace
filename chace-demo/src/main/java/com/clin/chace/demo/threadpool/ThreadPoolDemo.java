package com.clin.chace.demo.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    static class Task implements Runnable {

        private int taskNum;

        public Task(int taskNum) {
            this.taskNum = taskNum;
        }

        @Override
        public void run() {
            System.out.println("正在执行任务-" + taskNum);
            try {
                Thread.currentThread().sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务-" + taskNum + "执行完毕");
        }
    }

    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 1000,
                TimeUnit.MICROSECONDS, new ArrayBlockingQueue<>(5));

        for (int i = 0; i < 20; i++) {
            Task task = new Task(i);
            executor.execute(task);
            System.out.println("任务-" + i + " 线程池中的线程数量: " + executor.getPoolSize() + ", " +
                    "等待队列中待执行的任务数量: " + executor.getQueue().size() + ", " +
                    "已经执行完毕的任务数量: " + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}
