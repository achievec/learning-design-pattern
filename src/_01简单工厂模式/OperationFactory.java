package _01简单工厂模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午2:42:14
 * @version v1.00
 * @description
 */
public class OperationFactory {
	public static Operation<Integer> getOperation(OPERATOR operation) {
		switch (operation) {
		case ADD:
			return new OperationAdd<Integer>();
		case MULT:
			return new OperationMult<Integer>();
		default:
			return new OperationAdd<Integer>();
		}
	}
}

enum OPERATOR {
	ADD, MULT
}
