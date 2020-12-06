package zkong.familybucket.Filter;

import org.springframework.util.CollectionUtils;
import zkong.familybucket.Filter.impluselist.HandleA;
import zkong.familybucket.Filter.impluselist.HandleB;
import zkong.familybucket.Filter.impluselist.HandleC;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理文本链:使用数组结构实现
 * 如果处理器链上的某个处理器能够处理这个请求，那就不会继续往下传递请求。
 * 实际上，职责链模式还有一种变体，那就是请求会被所有的处理器都处理一遍，
 * 不存在中途终止的情况。这种变体也有两种实现方式：用链表存储处理器和用数组存储处理器，
 * 跟上面的两种实现方式类似
 */
public class HandleChainUseList {

    /**
     * 保存处理器
     */
    private List<IHandlerText> handlerTextList;

    public synchronized void addHandle(IHandlerText handlerText) {
        if (handlerTextList == null) {
            handlerTextList = new ArrayList<>();
        }
        handlerTextList.add(handlerText);
    }

    public String doHandle(String text) {
        String res = text;
        if (!CollectionUtils.isEmpty(this.handlerTextList)) {
            for (IHandlerText handlerText : handlerTextList) {
                res = handlerText.doHandle(res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        HandleChainUseList handleChainUseList = new HandleChainUseList();

        handleChainUseList.addHandle(new HandleA());
        handleChainUseList.addHandle(new HandleB());
        handleChainUseList.addHandle(new HandleC());

        String text = "ABCDDDDD";
        String str = handleChainUseList.doHandle(text);

        System.out.println("过滤后的文本：" + str);

    }

}
