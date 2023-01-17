package struktur;

public abstract class Struktur {
	 protected int Hp;
	 protected String warna;
	 
	 Struktur(){
		 this.Hp = 0;
	     this.warna = "putih";
	    }
	    
	 Struktur(int ketahanan,String warna){
	     this.Hp = ketahanan;
	     this.warna = warna;
	    }
	 
	 public int getKetahanan() {
	     return Hp;
	    }

	 public void setKetahanan(int ketahanan) {
	     this.Hp = ketahanan;
	    }

	 public String getWarna() {
	     return warna;
	    }

	 public void setWarna(String warna) {
	     this.warna = warna;
	    }

	 public void display(){
	     System.out.println("Hp : "+this.Hp);
	     System.out.println("Warna : "+this.warna);
	    }

}
