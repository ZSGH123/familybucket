package zkong.familybucket.Filter.impl;

import org.springframework.util.StringUtils;
import zkong.familybucket.Filter.AbstractHandlerText;

public class HandleTextB extends AbstractHandlerText {
    @Override
    public String handle(String text) {
        if( StringUtils.hasText(text)){
            text=text.replace("B","");
        }
        System.out.println("过滤B:"+text);
        return text;
    }
}
