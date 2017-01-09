package _23命令模式;

/**
 * 客户端调用代码
 * 
 * @author aloha
 * @date 2016年12月13日 下午8:07:17
 * @version v1.00
 * @description
 */
public class Client {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command commandA = new ConcreteCommandA(receiver);
		Invoker invoker = new Invoker(commandA);
		invoker.invoke();
		invoker.setCommand(new ConcreteCommandB(receiver));
		invoker.invoke();
	}

}
