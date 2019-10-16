import java.util.concurrent.Semaphore;

/**
 * Created by TOM
 * On 2019/10/16 18:56
 */
public class Solution1117 {

  private Semaphore semaphore = new Semaphore(2);
  private Semaphore semaphore1 = new Semaphore(0);

  public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
    semaphore.acquire();
    // releaseHydrogen.run() outputs "H". Do not change or remove this line.
    releaseHydrogen.run();
    semaphore1.release();
  }

  public void oxygen(Runnable releaseOxygen) throws InterruptedException {
    semaphore1.acquire(2);
    // releaseOxygen.run() outputs "O". Do not change or remove this line.
    releaseOxygen.run();
    semaphore.release(2);
  }
}
