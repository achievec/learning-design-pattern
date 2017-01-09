package _01简单工厂模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午2:44:32 
* @version v1.00
 * @param <E>
* @description
*/
public class OperationMult<E> extends Operation<E> {

	@Override
	public void calculate() {
		System.out.println(numbera+"*"+numberb);
	}
}
