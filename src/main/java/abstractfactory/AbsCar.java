package abstractfactory;


/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/10 15:05
 **/
public abstract class AbsCar {

    private String name;

    private String type;

    private Double price;

    public abstract Car create(String name, String type, Double price);

    /**
     * 描述
     * @return
     */
    public void desc(){
        System.out.println(String.format("车辆的价格品牌%s,车辆的类型%s,车辆的价格%s",name,type,price));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
