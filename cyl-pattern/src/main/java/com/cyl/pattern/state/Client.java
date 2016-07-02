package com.cyl.pattern.state;
/**
* @author CaiYL
* @version 创建时间：2016年7月2日 下午7:38:53
* 类说明
*/
public class Client {
    
    /**
     * @param args 
     */
    public static void main(String[] args){
        //创建状态
        State state = new ConcreteStateB();
        //创建环境
        Context context = new Context();
        //将状态设置到环境中
        context.setState(state);
        //请求
        context.request("test");
    }
}
