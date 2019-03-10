package factorymethod;

import bean.TongYong;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 14:55
 **/
public class ToYongFactory implements Icar {
    public TongYong create() {
        return new TongYong("通用");
    }
}
