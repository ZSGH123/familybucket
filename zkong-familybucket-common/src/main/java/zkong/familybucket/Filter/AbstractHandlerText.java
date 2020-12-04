package zkong.familybucket.Filter;

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
    private IHandlerText nextHandlerText;

    public IHandlerText getNextHandlerText() {
        return nextHandlerText;
    }

    public void setNextHandlerText(IHandlerText nextHandlerText) {
        this.nextHandlerText = nextHandlerText;
    }
}
