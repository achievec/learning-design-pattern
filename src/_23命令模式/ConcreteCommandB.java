package _23命令模式;

public class ConcreteCommandB implements Command {
	private Receiver receiver;

	public ConcreteCommandB(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void executeCommand() {
		receiver.doSomethingB();
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}
