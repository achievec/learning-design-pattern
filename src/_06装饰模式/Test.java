package _06装饰模式;
/** 
* @author aloha_world_ 
* @date 2016年9月15日 下午3:48:06 
* @version v1.00
* @description
*/
public class Test {
	public static void main(String[] args) {
		Component c=new ConcreteComponent();
		Decorator a=new ConcreteDecoratorA();
		a.setComponent(c);
		a.operation();
		
		Decorator d=new ConcreteDecoratorB();
		d.setComponent(a);
		d.operation();
	}
}
