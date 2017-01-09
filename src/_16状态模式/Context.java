package _16状态模式;

/**
 * 上下文类保存了上下文的具体状态
 * 
 * @author aloha
 * @date 2016年12月13日 下午7:40:34
 * @version v1.00
 * @description
 */
public class Context {
	/*
	 * 上下文的当前状态
	 */
	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	/**
	 * 处理context的请求
	 */
	public void handleRequest() {
		state.handleRequest(this);
	}

	/*
	 * 模拟开关灯状态的改变
	 */
	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());
		context.handleRequest();
		context.handleRequest();
		context.handleRequest();
	}
}
