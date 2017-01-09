package _08工厂方法模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午4:17:54
 * @version v1.00
 * @description
 */
public class MultFactory implements Factory {

	@Override
	public Operation createOperation() {
		return new OperationMult();
	}

}
