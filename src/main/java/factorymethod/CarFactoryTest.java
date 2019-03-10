package factorymethod;

import bean.Car;
import bean.DaZhong;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 14:57
 **/
public class CarFactoryTest {
    public static void main(String[] args) {

        //工厂方法
        /**
         * 与简单工厂相比：
         *          定义一个接口，实现的逻辑在工厂子类。增加工厂的话只需要继承接口，新增加工厂类就可以了原先的代码不需要改动
         */
        Icar icar=new DaZhongFactory();
        DaZhong car = (DaZhong)icar.create();

        Icar icar2=new ToYongFactory();
        icar2.create();

    }
}
