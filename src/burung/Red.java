package burung;

public class Red extends Burung {
	public Red(){
    	super.setHit(1);
    }

    @Override
    public void display() {
        System.out.println(" RED ");
        super.display();
    }

    @Override
    public void birdSkill() {
        System.out.println("Red");
        System.out.println("Tidak ada kekuatan spesial");
        System.out.println("Hit Power : "+getHit());
    }
}
