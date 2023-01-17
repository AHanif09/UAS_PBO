package burung;

public class Chuck extends Burung{
	public Chuck(){
        super.setHit(2);

    }

    @Override
    public void display() {
        System.out.println(" Chuck ");
        super.display();
    }

    @Override
    public void birdSkill() {
        super.setHit(getHit()*2);
        System.out.println("Skill chuck diaktifkan, hit power menjadi 2 kali lipat ");
    }

}
