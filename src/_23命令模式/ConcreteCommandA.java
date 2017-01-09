package _23命令模式;

/**
 * 具体的命令类，包含了一个具体的命令接收者，并定义该命令需要执行的逻辑
 * 
 * @author aloha
 * @date 2016年12月13日 下午8:02:57
 * @version v1.00
 * @description
 */
public class ConcreteCommandA implements Command {
	private Receiver receiver;

	public ConcreteCommandA(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void executeCommand() {
		receiver.doSomethingA();
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}
