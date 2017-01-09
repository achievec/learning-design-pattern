package _10模板方法模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午4:29:30 
* @version v1.00
* @description 模板类定义模板的框架，具体算法在子类中实现
*/
public abstract class AbstractClass {
	public abstract void algorithem1();
	public abstract void algorithem2();
	
	public void doSomething(){
		algorithem1();
		algorithem2();
	}
}
