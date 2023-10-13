import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by TOM
 * On 2022/12/12 21:09
 */
public class Solution1827 {
  public int minOperations(int[] nums) {
    if (nums.length == 1){
      return 0;
    }
    int num=nums[0],step=0;
    for (int i = 1; i <nums.length ; i++) {
      if(nums[i]<=num){
        step+=num+1-nums[i];
        nums[i]=num+1;
      }
      num=nums[i];
    }
    return step;
  }

  public static void main(String[] args) {
    System.out.println(changeToOnlineId(30231580358213716L));
  }

  public static int changeToOnlineId(Long oldId) {
    if (oldId == null) {
      return 0;
    }

    int newId = -1;
    String oldId_string = String.valueOf(oldId);
    if (oldId_string.length() <= 11) {
      return Integer.parseInt(oldId_string);
    }
    String oldId_string_fix = oldId_string.substring(oldId_string.length() - 11);
    newId = Integer.parseInt(oldId_string_fix);
    return newId;
  }
}
