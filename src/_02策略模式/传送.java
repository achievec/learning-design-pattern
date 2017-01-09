package _02策略模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午3:19:00 
* @version v1.00
* @description
*/
public class 传送   implements 召唤师技能 {

	@Override
	public void 技能() {
		System.out.println("传送至友方小兵或防御塔");
	}
	
}
