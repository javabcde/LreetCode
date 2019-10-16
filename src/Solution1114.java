import java.util.concurrent.Semaphore;

/**
 * Created by TOM
 * On 2019/10/16 18:24
 */
public class Solution1114 {

  private Semaphore semaphore = new Semaphore(0);
  private Semaphore semaphore1 = new Semaphore(0);

  public void first(Runnable printFirst) throws InterruptedException {
    // printFirst.run() outputs "first". Do not change or remove this line.
    printFirst.run();
    semaphore.release();
  }

  public void second(Runnable printSecond) throws InterruptedException {
    semaphore.acquire();
    // printSecond.run() outputs "second". Do not change or remove this line.
    printSecond.run();
    semaphore1.release();
  }

  public void third(Runnable printThird) throws InterruptedException {
    semaphore1.acquire();
    // printThird.run() outputs "third". Do not change or remove this line.
    printThird.run();
  }
}
