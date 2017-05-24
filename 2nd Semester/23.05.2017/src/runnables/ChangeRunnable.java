package runnables;

import interfaces.ChangeInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ChangeRunnable implements ChangeInterface{

    private Runnable originalRunnable;

    private Map<Integer, String> changeableMap;

    public ChangeRunnable(){

        this.changeableMap = new HashMap<>();

    }

    private final int NUMBER_OF_THREADS = 5;
    private final int TIMEOUT = 1;
    private final String STRING_TO_WRITE = "test";
    private final int LIMIT = 15;

    public int getNumberOfThreads(){

        return this.NUMBER_OF_THREADS;

    }

    public Map<Integer, String> getChangeableMap(){

        return this.changeableMap;

    }

    @Override
    public Runnable getChangeRunnable(){

         ReadWriteLock lock = new ReentrantReadWriteLock();
         Random r = new Random();

         Semaphore semaphore = new Semaphore(this.NUMBER_OF_THREADS);

         this.originalRunnable = () -> {

             lock.writeLock().lock();

             boolean permit = false;

             int index = 0;

             String data = "";

             try{

                  permit = semaphore.tryAcquire(this.TIMEOUT, TimeUnit.SECONDS);

                  if(permit){

                      Thread.sleep(this.TIMEOUT);

                      index = r.nextInt(this.LIMIT);

                      data = this.STRING_TO_WRITE + r.nextInt(this.LIMIT);

                      this.changeableMap.put(index, data);

                      System.out.println("Записано: {ключ = " + index + ", строка = " + data + "}");

                  }

             }catch(InterruptedException e){

                 throw new IllegalStateException(e);

             }finally{

                 if(permit){

                     lock.writeLock().unlock();
                     semaphore.release();

                 }

             }

         };

         return this.originalRunnable;

    }

}
