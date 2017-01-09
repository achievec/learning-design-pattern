package _08工厂方法模式;

/**
 * @author aloha_world_
 * @date 2016年9月15日 下午2:42:47
 * @version v1.00
 * @description
 */
public abstract class Operation{
	protected int numbera;
	protected int numberb;

	public abstract void calculate();

	public int getNumbera() {
		return numbera;
	}

	public void setNumbera(int numbera) {
		this.numbera = numbera;
	}

	public int getNumberb() {
		return numberb;
	}

	public void setNumberb(int numberb) {
		this.numberb = numberb;
	}
}
