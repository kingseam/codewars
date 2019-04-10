package angmagun;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Slf4j
public class ThreadPool {
    static public void main(String[] args) {
        ExecutorService cachedThread = Executors.newCachedThreadPool();
        ExecutorService fixedThread = Executors.newFixedThreadPool(2);
        ExecutorService singleThread = Executors.newSingleThreadExecutor();

        for (int i = 0; i < 5; i++) {
            cachedThread.execute(() -> {
                for (int j = 0; j < 5; j++) {
                    log.info("cachedThread={}", j);
                }
            });
        }

        cachedThread.shutdown();

        for (int i = 0; i < 5; i++) {
            fixedThread.execute(() -> {
                for (int j = 0; j < 5; j++) {
                    log.info("fixedThread={}", j);
                }
            });
        }

        fixedThread.shutdown();

        for (int i = 0; i < 5; i++) {
            singleThread.execute(() -> {
                for (int j = 0; j < 5; j++) {
                    log.info("singleThread={}", j);
                }
            });
        }

        singleThread.shutdown();

        log.info("end");
    }
}
