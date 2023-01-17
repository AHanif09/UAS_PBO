package babi;

public abstract class Babi {
	protected boolean topi;
    protected boolean bajuBesi;
    protected String ukuran;
    protected int hp;
    
    Babi(){
        this.topi = false;
        this.bajuBesi = false;
        this.ukuran = "kecil";
        this.hp = 0;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isTopi() {
        return topi;
    }

    public void setTopi(boolean topi) {
        this.topi = topi;
    }

    public boolean isBajuBesi() {
        return bajuBesi;
    }

    public void setBajuBesi(boolean bajuBesi) {
        this.bajuBesi = bajuBesi;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public void display(){
        System.out.println("Hp babi : "+this.getHp());
    }

}
