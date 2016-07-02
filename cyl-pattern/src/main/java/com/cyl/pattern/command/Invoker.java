package com.cyl.pattern.command;
/**
* @author CaiYL
* @version 创建时间：2016年7月2日 下午12:56:22
* 类说明
*/
public class Invoker {
    /**
     * 持有命令对象
     */
    private Command command = null;
    /**
     * 构造方法
     */
    public Invoker(Command command){
        this.command = command;
    }
    /**
     * 行动方法
     */
    public void action(){
        command.execute();
    }
}
