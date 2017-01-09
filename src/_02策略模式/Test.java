package _02策略模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午3:16:07
 * @version v1.00
 * @description
 */
public class Test {
	/**
	 * 把特殊算法分离为具体的实现类，使用组合的方式注入算法
	 * @param args
	 */
	public static void main(String[] args) {
		// 选择并创建需要使用的策略对象
		召唤师技能 我的治疗术 = new 治疗术();
		// 创建环境
		英雄 我的盖伦 = new 盖伦();
		// 使用策略
		我的盖伦.召唤师技能(我的治疗术);
	}
}
