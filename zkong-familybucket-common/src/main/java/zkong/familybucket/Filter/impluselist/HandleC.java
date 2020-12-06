package zkong.familybucket.Filter.impluselist;

import org.springframework.util.StringUtils;
import zkong.familybucket.Filter.IHandlerText;


public class HandleC implements IHandlerText {

    @Override
    public String doHandle(String text) {
        if (StringUtils.hasText(text)) {
            text = text.replace("C", "");
        }
        System.out.println("过滤C:" + text);
        return text;
    }
}
