package zkong.familybucket.Filter;

import zkong.familybucket.Filter.impl.HandleTextA;
import zkong.familybucket.Filter.impl.HandleTextB;
import zkong.familybucket.Filter.impl.HandleTextC;

import javax.sound.midi.Soundbank;

/**
 * 处理文本链
 */
public class HandlerTextChain {

    /**
     * 头指针
     */
    private AbstractHandlerText headHandler=null;

    /**
     * 尾指针
     */
    private AbstractHandlerText endHandler=null;

    /**
     * 添加处理器
     * @param handlerText
     */
    public void addHandler(AbstractHandlerText handlerText){
        handlerText.setNextHandlerText(null);
        if(this.headHandler==null){
            headHandler=handlerText;
            endHandler=handlerText;
            return;
        }

        endHandler.setNextHandlerText(handlerText);
        endHandler=handlerText;
    }

    public String handle(String text){
        if(this.headHandler!=null){
         text=this.headHandler.doHandle(text);
        }
        return text;
    }

    public static void main(String[] args) {
        HandlerTextChain handlerTextChain=new HandlerTextChain();
        handlerTextChain.addHandler(new HandleTextA());
        handlerTextChain.addHandler(new HandleTextB());
        handlerTextChain.addHandler(new HandleTextC());
        String text="ABCDDDDD";
       String str= handlerTextChain.handle(text);
        System.out.println("过滤后的文本："+str);
    }
}
