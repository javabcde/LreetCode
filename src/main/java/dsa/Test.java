package dsa;

import com.alibaba.fastjson.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.commons.collections4.CollectionUtils;

/**
 * Created by TOM
 * On 2020/9/6 14:23
 */
public class Test {

  private Executor executor = Executors.newFixedThreadPool(3);

  public static void main(String[] args) throws InterruptedException, IOException {
    ArrayList<String> a1 = new ArrayList<String>() {
      {
        add("a");
        add("b");
        add("c");
      }
    };

    ArrayList<String> a2 = new ArrayList<String>() {
      {
        add("1");
        add("2");
        add("3");
      }
    };

    ArrayList<String> a3 = new ArrayList<String>() {
      {
        add("A");
        add("B");
        add("C");
      }
    };
    List<List<String>> input = new ArrayList<>();
    input.add(a1);
    input.add(a2);
    input.add(a3);

test(input);
    
  }


  private static void test(List<List<String>> params) {
    if (CollectionUtils.isEmpty(params)) {
      return;
    }
    List<String> firstList = params.get(0);
    for (int i = 1; i < params.size(); i++) {
      List<String> innerResult = new ArrayList<>();
      for (String s : firstList) {
        for (String m : params.get(i)) {
          String a = s + m;
          innerResult.add(a);
        }
      }
      firstList = innerResult;
    }
    System.out.println(JSON.toJSONString(firstList));
  }


}
