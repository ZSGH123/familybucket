package zkong.familybucket.Filter;


import org.springframework.util.StringUtils;

/***
 * program: familybucket
 * description: 
 * author: zhongqiang@raycloud.com
 * create: 2020-12-04 17:59
 **/
public abstract class AbstractHandlerText implements IHandlerText {

    /**
     * 下一个处理器
     */
    private AbstractHandlerText nextHandlerText;

    public AbstractHandlerText getNextHandlerText() {
        return nextHandlerText;
    }

    public void setNextHandlerText(AbstractHandlerText nextHandlerText) {
        this.nextHandlerText = nextHandlerText;
    }

    @Override
    public String doHandle(String text) {
        //本次处理器处理逻辑
       String str= this.handle(text);
        //交给下一个处理器处理
        if(this.nextHandlerText!=null&&StringUtils.hasText(str)){
            str= this.nextHandlerText.doHandle(str);
        }
        return str;
    }

    /**
     * 处理文本抽象方法
     * @param text text
     */
    protected abstract String handle(String text);
}
