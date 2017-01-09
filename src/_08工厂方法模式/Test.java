package _08工厂方法模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午3:09:04
 * @version v1.00
 * @description
 */
public class Test {
	/**
	 * 简单工程中有具体的工程创建逻辑，工厂方法模式把这种逻辑分离出来，具体的实例化在工厂类的子类中实现
	 * @param args
	 */
	public static void main(String[] args) {
		Factory factory = new AddFactory();
		Operation oper = factory.createOperation();
		oper.setNumbera(1);
		oper.setNumberb(2);
		oper.calculate();
	}
}
