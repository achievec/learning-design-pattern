package _01简单工厂模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午3:09:04
 * @version v1.00
 * @description
 */
public class Test {
	public static void main(String[] args) {

		Operation<Integer> op = OperationFactory.getOperation(OPERATOR.ADD);
		op.setNumbera(1);
		op.setNumberb(2);
		op.calculate();
	}
}
