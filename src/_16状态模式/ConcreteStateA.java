package _16状态模式;

/**
 * 开灯状态
 * 
 * @author aloha
 * @date 2016年12月13日 下午7:38:08
 * @version v1.00
 * @description
 */
public class ConcreteStateA implements State {

	@Override
	public void handleRequest(Context context) {
		System.out.println("当前为开灯状态，关灯，并将状态转换为关灯状态");
		context.setState(new ConcreteStateB());
	}

}
