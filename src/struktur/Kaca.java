package struktur;

public class Kaca extends Struktur{
	public Kaca(){
        super.setKetahanan(1);
        super.setWarna(" biru ");
    }
    @Override
    public void display() {
        System.out.println(" KAYU ");
        super.display();
    }

}
