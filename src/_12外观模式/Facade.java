package _12外观模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午6:48:45
 * @version v1.00
 * @description
 */
public class Facade {
	private SubSystemOne one = new SubSystemOne();
	private SubSystemTwo two = new SubSystemTwo();
	private SubSystemThree three = new SubSystemThree();

	public void methodOne() {
		one.methodOne();
	}

	public void methodTwo() {
		two.methodTwo();
	}

	public void methodThree() {
		three.methodThree();
	}
}
