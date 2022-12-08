package dsa;

import cn.hutool.core.util.PinyinUtil;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by TOM
 * On 2022/3/16 16:15
 */
public class Excel extends AnalysisEventListener<Map<Integer, String>> {

  private final AtomicInteger atomicInteger = new AtomicInteger(1);

  private final BufferedWriter bufferedWriter = new BufferedWriter(
      new FileWriter("E:\\QIYEWWXB\\WXWork\\1688851966767773\\Cache\\File\\2022-03\\a.txt"));

  public Excel() throws IOException {
  }


  public static void main(String[] args) throws IOException {

    String fileName = "E:\\QIYEWWXB\\WXWork\\1688851966767773\\Cache\\File\\2022-03" + File.separator + "水中仙酒店协议单位.xls";
    // 这里 只要，然后读取第一个sheet 同步读取会自动finish
    EasyExcel.read(fileName, new Excel()).sheet().doRead();
  }


  @Override
  public void invoke(Map<Integer, String> data, AnalysisContext analysisContext) {
    //System.out.println("解析到一条数据:{}" + JSON.toJSONString(data));
    try {
      Integer at = atomicInteger.getAndIncrement();
      long id = Long.parseLong("11223100000000" + String.format("%03d", at));

      String s =
          "INSERT INTO public.arch_company_unpaid (id, code, name, pinyin, unpaid_sum, remaining_sum, contact_person, contact_tel,\n"
              + "                                        address, remark, is_enable, create_shop_id, creator_id, create_time,\n"
              + "                                        modifier_id, modify_time, delflg, upload_flg, download_flg, last_time, version,\n"
              + "                                        belong_shop_id, is_enable_unpaid, is_enable_advance_pay, contact_tel_advance,\n"
              + "                                        source_from)\n"
              + "VALUES (" + id + ", '" + data.get(0)
              + "', '" + data.get(1) + "', '" + PinyinUtil.getAllFirstLetter(data.get(1)).toUpperCase(Locale.ROOT)
              + "', " + new BigDecimal(data.get(3)).setScale(4, BigDecimal.ROUND_HALF_UP)
              + ", 0.0000, null, null, null, null, true, 112231,\n"
              + "        11223100000000001,now(), 11223100000000001, now(), 0, 0, 1,\n"
              + "        now(), 1, 112232, true, false, null, null);\r\n";

      String s1 =
          "INSERT INTO public.arch_company_unpaid_shop (company_id, shop_id, create_shop_id, creator_id, create_time, modifier_id,\n"
              + "                                             modify_time, delflg, upload_flg, download_flg, last_time)\n"
              + "VALUES (" + id + ", 112232, 112231, 11223100000000001, now(), 11223100000000001,\n"
              + "        now(), 0, 0, 1, now());\r\n";
      System.out.println(s);
      System.out.println(s1);
      bufferedWriter.write(s);
      bufferedWriter.write(s1);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public void doAfterAllAnalysed(AnalysisContext analysisContext) {
    try {
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static synchronized void test() throws InterruptedException {

    Thread.sleep(1000000L);
  }
}
