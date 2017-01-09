package _01简单工厂模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午2:42:47
 * @version v1.00
 * @description
 */
public abstract class Operation<E> {
	protected E numbera;
	protected E numberb;

	public abstract void calculate();

	public E getNumbera() {
		return numbera;
	}

	public void setNumbera(E numbera) {
		this.numbera = numbera;
	}

	public E getNumberb() {
		return numberb;
	}

	public void setNumberb(E numberb) {
		this.numberb = numberb;
	}
}
