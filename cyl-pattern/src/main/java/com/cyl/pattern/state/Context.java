package com.cyl.pattern.state;
/**
* @author CaiYL
* @version 创建时间：2016年7月2日 下午7:32:08
* 类说明
*/
/**
 * @author CaiYL
 *
 */
public class Context {
    
    /**
     * 持有一个State类型的对象实例
     */
    private State state ;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    
    /**
     * 用户感兴趣的接口方法
     * @param sampleParameter s
     */
    public void request(String sampleParameter) {
        //转调state来处理
        state.handle(sampleParameter);
    }
    
}
