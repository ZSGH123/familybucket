package zkong.familybucket.Filter.impluselist;

import org.springframework.util.StringUtils;
import zkong.familybucket.Filter.IHandlerText;


public class HandleB implements IHandlerText {

    @Override
    public String doHandle(String text) {
        if (StringUtils.hasText(text)) {
            text = text.replace("B", "");
        }
        System.out.println("过滤B:" + text);
        return text;
    }
}
