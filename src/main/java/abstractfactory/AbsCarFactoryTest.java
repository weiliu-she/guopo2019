package abstractfactory;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 15:41
 **/
public class AbsCarFactoryTest {

    public static void main(String[] args) {

        //抽象工厂
        /**
         * 和工厂方法相比：
         *          更复杂，可以增加默认的实现方式
         */
        AbsCar absCar=new DaZhongFactory();

        DaZhong car = (DaZhong)absCar.create("大众", "德国车", 150000d);
        absCar.desc();
        AbsCar absCar1=new TongYongFactory();

        TongYong car1 = (TongYong)absCar1.create("通用", "美国车", 150000d);
        absCar1.desc();


    }

}
