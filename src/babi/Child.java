package babi;

public class Child extends Babi{
	
	@Override
	public void display() {
		System.out.println(" Anak Babi ");
		super.display();
	}
	
	public Child(){
        super.setBajuBesi(false);
        super.setTopi(false);
        super.setHp(2);
        super.setUkuran("Sedang");
    }
}
