package gameplay;

import java.util.ArrayList;
import java.util.Random;
import burung.Burung;
import babi.Babi;
import struktur.Struktur;

public class Playing {
	
	 public void attack (ArrayList<Burung> birds, ArrayList<Struktur> Struktur, ArrayList<Babi> pigs){
	        ArrayList<Struktur> tempStructure = new ArrayList<>(Struktur);
	        ArrayList<Babi> tempPigs = new ArrayList<>(pigs);
	        Struktur tempRemove = null;
	        Babi tempBabi = null;

	        // selama masih ada burung yang tersedia, program belum selesai
	        
	        System.out.println();
	        System.out.println("=============== GAME START ===============");
	        
	        for(Burung burung:birds){
	            System.out.println(" Jenis Burung yang menyerang : ");
	            burung.display();
	            burung.setDoubleTap(new Random().nextBoolean());
	            if (burung.isDoubleTap()) burung.birdSkill();
	            // mengulang semua struktur yang tersedia

	            for (Struktur struktur : tempStructure) {

	                    System.out.println(" ======== Struktur telah diserang  ======== ");

	                    struktur.display();
	                    struktur.setKetahanan(struktur.getKetahanan() - burung.getHit());
	                    if (struktur.getKetahanan()<0){
	                        struktur.setKetahanan(0);
	                    }
	                    

	                    System.out.println(" Struktur diserang dengan power : " + burung.getHit() + " sisa Hp : " + struktur.getKetahanan());
	                    // jika struktur telah dihancurkan
	                    if (struktur.getKetahanan() < 1) {
	                        struktur.setKetahanan(0);
	                        tempRemove = struktur;
	                        struktur.display();
	                        System.out.println("struktur telah dihancurkan");
	                    } else {
	                        struktur.display();
	                    }
	                    Struktur.remove(tempRemove);
	                    
	                    

	                break;
	            }
	            
	            tempStructure= Struktur;

	            	for (Babi babi:tempPigs) {
	                System.out.println(" ======= Menyerang Babi ======= ");
	                babi.display();
	                babi.setHp(babi.getHp() - burung.getHit());
	                if (babi.getHp()<1){
	                    babi.setHp(0);
	                }
	                System.out.println(" Babi diserang dengan power : " + burung.getHit() + " sisa Hp : " + babi.getHp());

	                if (babi.getHp() < 1) {
	                    babi.setHp(0);
	                    tempBabi = babi;
//	                        tempBabi = tempPigs;
	                    System.out.println("Babi telah mati");
	                    babi.display();
	                    if(babi.getHp() == 0) {
	                    	pigs.remove(tempBabi);
	                    	tempPigs = pigs;
	                    }
	                    
	                }
	            }
	            
	            if(pigs.size()<1)
	                break;

	            System.out.println();
	            System.out.println("==============================");
	            
	     }
	            

	    }

}
