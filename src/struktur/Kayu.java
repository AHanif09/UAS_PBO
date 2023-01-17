package struktur;

public class Kayu extends Struktur{
	
	public Kayu(){
        super.setKetahanan(2);
        super.setWarna("coklat");
    }
    @Override
    public void display() {
        System.out.println(" KAYU ");
        super.display();
    }

}
