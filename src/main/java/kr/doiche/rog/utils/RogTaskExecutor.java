package kr.doiche.rog.utils;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class RogTaskExecutor implements Executor {
    private static final List<Callable<String>> executors = new ArrayList<>();
    private static final ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void registerTask(Callable<String> task){
        executors.add(task);
    }

    public void invokeAll(){
        try {
            executorService.invokeAll(executors);
        } catch(InterruptedException e) {
            executorService.shutdown();
            e.printStackTrace();
        } finally {
            executorService.shutdownNow();
        }
    }

    @Override
    public void execute(@NotNull Runnable command) {
        executorService.execute(command);
    }

}
