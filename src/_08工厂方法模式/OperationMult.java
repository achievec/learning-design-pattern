package _08工厂方法模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午2:44:32 
* @version v1.00
 * @param <E>
* @description
*/
public class OperationMult extends Operation {

	@Override
	public void calculate() {
		System.out.println(numbera+"*"+numberb);
	}
}
