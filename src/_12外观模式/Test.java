package _12外观模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午6:50:45
 * @version v1.00
 * @description
 */
public class Test {
	/**
	 * 外观模式通过组合的方式对外提供服务
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Facade f = new Facade();
		f.methodOne();
		f.methodTwo();
		f.methodThree();
	}
}
