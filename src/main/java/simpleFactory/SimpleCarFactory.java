package simpleFactory;

import bean.Car;
import bean.DaZhong;
import bean.TongYong;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/9 20:52
 **/
public class SimpleCarFactory implements Icar {

    private final static String NAME_DAZHONG="大众";
    private final static String NAME_TONGYONG="通用";


    public Car create(String carName) {
            if(NAME_DAZHONG.equals(carName)){
                return new DaZhong(NAME_DAZHONG);
            }else if(NAME_TONGYONG.equals(carName)){
                return new TongYong(NAME_TONGYONG);
            }else{
                throw new RuntimeException("未找到该类型");
            }
    }
}
