package zkong.familybucket.Filter.impluselist;

import org.springframework.util.StringUtils;
import zkong.familybucket.Filter.IHandlerText;


public class HandleA implements IHandlerText {

    @Override
    public String doHandle(String text) {
        if (StringUtils.hasText(text)) {
            text = text.replace("A", "");
        }
        System.out.println("过滤A:" + text);
        return text;
    }
}
