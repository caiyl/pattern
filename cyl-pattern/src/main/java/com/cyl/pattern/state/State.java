package com.cyl.pattern.state;
/**
* @author CaiYL
* @version 创建时间：2016年7月2日 下午7:32:49
* 类说明
*/
public interface State {
    
    /**
     * @param sampleParameter 参数
     */
    void handle(String sampleParameter);
}
