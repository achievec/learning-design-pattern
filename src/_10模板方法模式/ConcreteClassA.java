package _10模板方法模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午4:31:34 
* @version v1.00
* @description
*/
public class ConcreteClassA extends AbstractClass{

	@Override
	public void algorithem1() {
		System.out.println(this.getClass()+"的算法1");
	}

	@Override
	public void algorithem2() {
		System.out.println(this.getClass()+"的算法2");
	}

}
