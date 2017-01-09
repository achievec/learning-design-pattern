package _23命令模式;

/**
 * 命令接收者
 * 
 * @author aloha
 * @date 2016年12月13日 下午8:03:16
 * @version v1.00
 * @description
 */
public class Receiver {
	public void doSomethingA() {
		System.out.println(this.getClass() + ":doSomethingA()");
	}

	public void doSomethingB() {
		System.out.println(this.getClass() + ":doSomethingB()");
	}
}
