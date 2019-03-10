package abstractfactory;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 15:13
 **/
public class TongYongFactory extends AbsCar {
    public Car create(String name, String type, Double price) {
        // TODO: 2019/3/10 实现逻辑
        return new TongYong(name,type,price);
    }
}
