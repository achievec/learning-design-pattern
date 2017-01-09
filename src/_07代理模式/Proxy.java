package _07代理模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午4:08:10
 * @version v1.00
 * @description
 */
public class Proxy implements Subject {
	/**
	 * 包含一个具体的被代理实例
	 */
	private Subject subject;

	@Override
	public void request() {
		if (subject == null) {
			subject = new RealSubject();
		}
		System.out.println(this.getClass() + "代理");
		subject.request();
	}

}
