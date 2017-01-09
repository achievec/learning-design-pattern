package _06装饰模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午3:43:26
 * @version v1.00
 * @description
 */
public abstract class Decorator extends Component {
	protected Component component;

	public Component getComponent() {
		return component;
	}

	public void setComponent(Component component) {
		this.component = component;
	}

	/**
	 * 包装具体的被包装对象
	 */
	@Override
	public void operation() {
		if (component != null) {
			component.operation();
		}
	}

}
