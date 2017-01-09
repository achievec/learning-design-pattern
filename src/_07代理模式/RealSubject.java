package _07代理模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午4:07:03 
* @version v1.00
* @description
*/
public class RealSubject implements Subject{

	@Override
	public void request() {
		System.out.println("真实的请求");
	}

}
