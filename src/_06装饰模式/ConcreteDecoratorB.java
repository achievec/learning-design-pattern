package _06装饰模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午3:47:25
 * @version v1.00
 * @description
 */
public class ConcreteDecoratorB extends Decorator {
	@Override
	public void operation() {
		super.operation();
		System.out.println(this.getClass().getName() + "装饰器");
	}
}
