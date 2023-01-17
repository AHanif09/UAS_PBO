package burung;

public class TheBlues extends Burung{
	public TheBlues(){
        super.setHit(2);
    }

    @Override
    public void display() {
        System.out.println(" The Blues ");
        super.display();
    }

    @Override
    public void birdSkill() {
        super.setHit(3);
        System.out.println("Skill The blues diaktifkan, hit power = 3");
    }

}
