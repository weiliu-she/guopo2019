package abstractfactory;


/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 15:10
 **/
public class DaZhongFactory extends AbsCar {

    public Car create(String name, String type, Double price) {

        // TODO: 2019/3/10 实现逻辑
        return new DaZhong(name,type,price);
    }
}
