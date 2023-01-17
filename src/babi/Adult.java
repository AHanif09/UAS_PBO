package babi;

public class Adult extends Babi{
	
	@Override
	public void display() {
		System.out.println(" Babi Dewasa ");
		System.out.println("Armor : Topi, Baju Besi");
		super.display();
	}
	
	public Adult(){
        super.setBajuBesi(true);
        super.setTopi(true);
        super.setHp(4);
        super.setUkuran("Besar");
    }

}
