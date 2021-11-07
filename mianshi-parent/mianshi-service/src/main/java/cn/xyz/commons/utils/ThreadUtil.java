package cn.xyz.commons.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import cn.xyz.commons.support.Callback;
import cn.xyz.mianshi.scheduleds.TimerTask;




public  class ThreadUtil{
	
	public static final ScheduledExecutorService mThreadPool = Executors.newScheduledThreadPool(Runtime.getRuntime().availableProcessors()*2);
	
	/**
	* @Description: TODO(立即执行 线程)
	* @param @param callback    参数
	 */
	public static void executeInThread(Callback callback){
		mThreadPool.execute(()->callback.execute(Thread.currentThread().getName()));
	}
	public static void executeInThread(Callback callback,Object obj){
		mThreadPool.execute(()->callback.execute(obj));
	}
	
	/**
	* @Description: TODO(延时执行线程)
	* @param @param callback 延时 秒钟
	 */
	public static void executeInThread(Callback callback,long delay){
		mThreadPool.schedule(()->callback.execute(Thread.currentThread().getName())
				, delay, TimeUnit.SECONDS);
		
	}
	public static void executeCallback(Callback callback,long initialDelay,long period){
		
		mThreadPool.scheduleAtFixedRate(()->callback.execute(Thread.currentThread().getName()), initialDelay, period, TimeUnit.SECONDS);
	}
    public static void executeRunnable(Runnable runnable,long initialDelay,long period){
		
		mThreadPool.scheduleAtFixedRate(runnable, initialDelay, period, TimeUnit.SECONDS);
	}
    public static void executeTimerTask(TimerTask runnable,long initialDelay,long period){
		
		mThreadPool.scheduleAtFixedRate(runnable, initialDelay, period, TimeUnit.SECONDS);
	}
	

}
