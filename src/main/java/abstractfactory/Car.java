package abstractfactory;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 15:45
 **/
public class Car {

    private String name;

    private String type;

    private Double price;

    public Car(String name, String type, Double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
}
