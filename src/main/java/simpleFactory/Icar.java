package simpleFactory;

import bean.Car;

/**
 * @version 1.0
 * @Author MSIK
 * @Date 2019/3/9 20:21
 **/
public interface Icar {

    Car create(String carName);
}
