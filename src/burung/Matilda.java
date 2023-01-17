package burung;

public class Matilda extends Burung{
	 public Matilda() {
	        super.setHit(2);
	    }

	    @Override
	    public void display() {
	        System.out.println(" Matilda ");
	        super.display();
	    }

	    @Override
	    public void birdSkill() {
	        super.setHit(4);
	        System.out.println(" Skill Matilda diaktifkan, hit power = 4 ");
	    }

}
