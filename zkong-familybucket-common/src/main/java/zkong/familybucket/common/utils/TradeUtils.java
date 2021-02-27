package zkong.familybucket.common.utils;

import com.alibaba.fastjson.JSON;
import zkong.familybucket.common.trade.Trade;

import java.util.*;

/***
 * program: familybucket
 * description: 测试jvm的gc，内存溢出
 * author: zhongqiang@raycloud.com
 * create: 2021-02-26 17:25
 **/
public class TradeUtils {

    public static Map<Integer, List<Trade>> getTradeMap(Integer num) {

        Map<Integer, List<Trade>> res = new HashMap<>();

        for (int i = 0; i < num; i++) {
            List<Trade> tradeList = new ArrayList<>();
            for (int j = 0; j < num; j++) {
                Trade trade = new Trade();
                trade.setTid("1111111113dddd");
                trade.setReceiverAddress("湖南省邵阳市洞口县石江镇");
                trade.setReceiverTel("0000000000");
                trade.setCreated(new Date());
                trade.setCreated(new Date());
                trade.setRecipient("zqqqqqqqq");
                trade.setId(Long.valueOf(j));
                trade.setDiscount("31414324");
                tradeList.add(trade);
            }
            res.put(i, tradeList);
        }
        return res;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Map<Integer, List<Trade>> res = getTradeMap(1000);
            System.out.println(JSON.toJSONString(res));
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
