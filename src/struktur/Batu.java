package struktur;

public class Batu extends Struktur{
	public Batu(){
        super.setKetahanan(3);
        super.setWarna("abu - abu");
    }
    public void display() {
        System.out.println(" BATU ");
        super.display();
    }

}
