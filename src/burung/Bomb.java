package burung;

public class Bomb extends Burung{
	public Bomb() {
        super.setHit(2);
    }

    @Override
    public void display() {
        System.out.println(" Bomb ");
        super.display();
    }

    @Override
    public void birdSkill() {
        super.setHit(getHit()*3);
        System.out.println("Skill bomb diaktifkan, hit power menjadi 3 kali lipat ");

    }

}
