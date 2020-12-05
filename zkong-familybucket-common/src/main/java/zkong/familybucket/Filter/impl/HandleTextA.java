package zkong.familybucket.Filter.impl;

import org.springframework.util.StringUtils;
import zkong.familybucket.Filter.AbstractHandlerText;


public class HandleTextA extends AbstractHandlerText {
    @Override
    public String handle(String text) {
        if( StringUtils.hasText(text)){
            text= text.replace("A","");
        }
        System.out.println("过滤A:"+text);
        return text;
    }
}
