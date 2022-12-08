import com.alibaba.fastjson.JSON;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.collections4.ListUtils;

/**
 * [-1,0,0,3,3,3,0,0,0]
 * 6
 * [1,2,2]
 * 3
 * Created by TOM
 * On 2022/7/14 12:58
 */

public class Solution88 {

  public static void main(String[] args) throws ParseException {
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String date = "2022-12-01 00:00:00";
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(simpleDateFormat.parse(date));
    calendar.add(Calendar.DAY_OF_MONTH, -1);

    System.out.println(JSON.toJSONString(calendar.getTime()));
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int num : nums2) {
       nums1[m++] = num;
    }
    Arrays.sort(nums1);
  }

  public static  void log(){
    List<StackTraceElement> stackTraceElements = Arrays.asList(Thread.currentThread().getStackTrace());
    List<Map<String, Object>> logMap = new ArrayList<>();
    for (StackTraceElement stackTraceElement : stackTraceElements) {
      if (logMap.size()>=5){
        break;
      }
      Map<String, Object> info = new HashMap<>();
      info.put(stackTraceElement.getFileName()+"+"+stackTraceElement.getMethodName(),stackTraceElement.getLineNumber());
      logMap.add(info);
    }
    System.out.println(JSON.toJSONString(logMap));
  }


  public static class stu {
    private Integer val;

    public Integer getVal() {
      return val;
    }

    public void setVal(Integer val) {
      this.val = val;
    }
  }
}
