package com.cyl.pattern.command;

/**
 * 
 * @author CaiYL
 * 接收者角色类
 */
public class Receiver{
	
	/**
	 * 命令真正的执行者
	 */
    public void action(){
        System.out.println("exec command");
    }
}
