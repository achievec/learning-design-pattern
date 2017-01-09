package _16状态模式;

/**
 * 具体状态类，关灯状态
 * 
 * @author aloha
 * @date 2016年12月13日 下午7:36:24
 * @version v1.00
 * @description
 */
public class ConcreteStateB implements State {

	@Override
	public void handleRequest(Context context) {
		System.out.println("当前为关灯状态，开灯，并将状态转换为开灯状态");
		context.setState(new ConcreteStateA());
	}

}
