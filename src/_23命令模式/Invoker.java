package _23命令模式;

/**
 * 命令的执行者，内部保存了需要执行的命令
 * 
 * @author aloha
 * @date 2016年12月13日 下午8:01:02
 * @version v1.00
 * @description
 */
public class Invoker {

	private Command command;

	public Invoker(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	public void invoke() {
		command.executeCommand();
	}

}
