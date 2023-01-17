package babi;

public class Young extends Babi {

	@Override
	public void display() {
		System.out.println(" Babi Muda ");
		System.out.println("Armor : Topi");
		super.display();
	}

	public Young() {
		super.setBajuBesi(false);
		super.setTopi(true);
		super.setHp(3);
		super.setUkuran("Sedang");
	}

}
