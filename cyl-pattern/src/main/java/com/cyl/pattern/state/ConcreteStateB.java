package com.cyl.pattern.state;
/**
* @author CaiYL
* @version 创建时间：2016年7月2日 下午7:38:00
* 类说明
*/
public class ConcreteStateB implements State {

    @Override
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }

}
