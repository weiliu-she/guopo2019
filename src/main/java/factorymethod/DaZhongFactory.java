package factorymethod;

import bean.DaZhong;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 14:54
 **/
public class DaZhongFactory implements Icar {
    public DaZhong create() {
        return new DaZhong("大众");
    }
}
