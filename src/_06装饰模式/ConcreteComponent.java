package _06装饰模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午3:41:57 
* @version v1.00
* @description
*/
public class ConcreteComponent extends Component{

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}

}
