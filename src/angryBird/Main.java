package angryBird;

import java.util.ArrayList;
import burung.Burung;
import burung.Bomb;
import burung.Chuck;
import burung.Matilda;
import burung.Red;
import burung.TheBlues;
import gameplay.Playing;
import babi.Babi;
import babi.Child;
import babi.Young;
import babi.Adult;
import struktur.Batu;
import struktur.Kaca;
import struktur.Kayu;
import struktur.Struktur;

public class Main {

	public static void main(String[] args) {
		ArrayList<Burung> angryBird = new ArrayList<>();
        ArrayList<Struktur> struktur = new ArrayList<>();
        ArrayList<Babi> pigs = new ArrayList<>();

        Burung red = new Red();
        Burung theBlues = new TheBlues();
        Burung chuck = new Chuck();
        Burung bomb = new Bomb();
        Burung matilda = new Matilda();

        angryBird.add(chuck);
        angryBird.add(bomb);
        angryBird.add(matilda);
        
        System.out.println("Pasukan Angry Birds : ");
        for(Burung burung:angryBird) {
        	burung.display();     	  
        }
        System.out.println("==========================================");
              

        Struktur kayu = new Kayu();
        Struktur batu = new Batu();
        Struktur kaca = new Kaca();

        struktur.add(kayu);
        struktur.add(batu);
        
        System.out.println("Struktur yang tersedia : ");
        for(Struktur objek:struktur) {
        	objek.display();
        }
        System.out.println("==========================================");

        Child child = new Child();
        Young young = new Young();
        Adult adult = new Adult();
        
        pigs.add(young);
        pigs.add(adult);
        
        System.out.println("Pasukan Babi : ");
        for(Babi babi:pigs) {
        	babi.display();
        }
        System.out.println("==========================================");

        Playing newGame = new Playing();
        newGame.attack(angryBird,struktur,pigs);

        if (pigs.size() >0){
            System.out.println(" !!!! Masih ada babi tersisa !!!! ");
            System.out.println(" ======= ANDA KALAH ===== ");
        }
        else{
            System.out.println(" !!!! CONGRATULATIONS !!!! ");
            System.out.println(" ======= ANDA MENANG ===== ");
        }


    }

	}

