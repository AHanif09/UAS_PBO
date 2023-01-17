package burung;

public abstract class Burung implements Skill{
	
	protected int hit=1;
    protected boolean doubleTap = false;
    
    Burung(int hit){
        this.hit = hit;
    }
    
    public Burung() {

    }
    
    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public void display(){
        System.out.println("kekuatan serangan : "+this.hit);
    }
 
    public boolean isDoubleTap() {
        return doubleTap;
    }

    public void setDoubleTap(boolean doubleTap) {
        this.doubleTap = doubleTap;
    }

}
