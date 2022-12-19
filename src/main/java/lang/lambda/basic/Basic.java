package lang.lambda.basic;

import java.util.List;

/**
 * https://learning.oreilly.com/videos/java-8-lambdas/9781771374743/9781771374743-video229801/
 */
public class Basic {
    private void testRunnable(Runnable runnable) {
        new Thread(runnable).start();
    }

    void tester() {
        testRunnable(new Runnable() {
            @Override
            public void run() {
                sendMail();
            }
        });

        testRunnable(() -> sendMail());
    }

    void sendMail() {
    }

    void testStream() {
        List<Integer> trades = null;
        trades.stream().filter(t -> t.intValue() > 1000)
                .filter(t -> t.getClass().toString() == "Int").count();
    }
}
