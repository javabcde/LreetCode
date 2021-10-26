import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

/**
 * Created by TOM
 * On 2019/10/16 18:44
 */
public class Solution1116 {

  private int n;

  private Semaphore z = new Semaphore(1);
  private Semaphore e = new Semaphore(0);
  private Semaphore o = new Semaphore(0);

  public void zero(IntConsumer printNumber) throws InterruptedException {
    for (int i = 0; i < n; i++) {
      z.acquire();
      printNumber.accept(0);
      if (i % 2 == 0) {
        o.release();
      } else {
        e.release();
      }
    }
  }

  public void even(IntConsumer printNumber) throws InterruptedException {
    for (int i = 2; i <= n; i += 2) {
      e.acquire();
      printNumber.accept(i);
      z.release();
    }
  }

  public void odd(IntConsumer printNumber) throws InterruptedException {

    for (int i = 1; i <= n; i += 2) {
      o.acquire();
      printNumber.accept(i);
      z.release();
    }
  }
}
