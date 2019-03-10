package simpleFactory;

import bean.Car;
import bean.DaZhong;
import bean.TongYong;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 14:40
 **/
public class SimpleCarFactoryTest {

    public static void main(String[] args) {
        //简单工厂
        /**
         * 实例化的的逻辑写在工厂类里面
         * 缺点：增加实现，只能修改工厂类,耦合性高
         */
        Icar icar=new SimpleCarFactory();

        DaZhong dazhong = (DaZhong)icar.create("大众");

        TongYong tongYong = (TongYong)icar.create("通用");


    }
}
