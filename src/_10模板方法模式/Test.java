package _10模板方法模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午4:33:22
 * @version v1.00
 * @description
 */
public class Test {
	public static void main(String[] args) {
		AbstractClass c = new ConcreteClassA();
		c.doSomething();
		c = new ConcreteClassB();
		c.doSomething();
	}
}
