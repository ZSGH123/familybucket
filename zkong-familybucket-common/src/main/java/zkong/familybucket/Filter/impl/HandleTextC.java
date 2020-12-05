package zkong.familybucket.Filter.impl;

import org.springframework.util.StringUtils;
import zkong.familybucket.Filter.AbstractHandlerText;

public class HandleTextC extends AbstractHandlerText {
    @Override
    public String handle(String text) {
        if( StringUtils.hasText(text)){
            text= text.replace("Ckkk","");
        }
        System.out.println("过滤C:"+text);
        return text;
    }
}
