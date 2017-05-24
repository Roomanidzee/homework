package launcher;

import runnables.ChangeRunnable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SemaphoreExampleLauncher {

    public static void main(String[] args){

        ChangeRunnable changeRun = new ChangeRunnable();

        ExecutorService executor = Executors.newFixedThreadPool(changeRun.getNumberOfThreads());

        IntStream.range(0, changeRun.getNumberOfThreads())
                .forEach(i -> executor.submit(changeRun.getChangeRunnable()));

        executor.shutdown();

    }

}
