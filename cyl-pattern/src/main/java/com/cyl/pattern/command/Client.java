package com.cyl.pattern.command;
/**
* @author CaiYL
* @version 创建时间：2016年7月2日 下午12:57:21
* 命令模式
*/
public class Client {

    /**
     * @param args 参数
     */
    public static void main(String[] args) {
        //创建接收者
        Receiver receiver = new Receiver();
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }

}