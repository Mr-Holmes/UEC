package com.company;
public class Main {

    public static void main(String[] args) {
        Lutador[] lutador = new Lutador[6];

        // leves
        lutador[0] = new Lutador("Bob","E.U.A",32,186.2,73.9,21,34,3);

        lutador[1] = new Lutador("Ross", "Turca",25,183.0,71.3,12,3,10);

        //medios
        lutador[2] = new Lutador("Shallon","Egipcio",33,170.0,85.0,15,1,4);

        lutador[3] = new Lutador("Severino","Brasil",28,175,84,12,1,3);

        //pesados
        lutador[4] = new Lutador("Keep","Holanda",23,192,105,12,12,12);

        lutador[5] = new Lutador("José","Hungria",21,192,100,12,2,10);


        Luta eucleve = new Luta();
        eucleve.marcaLuta ( lutador[0],lutador[1] );
        eucleve.luta ();

        System.out.println ("p----------------------------");

        Luta eucMedia = new Luta();
        eucMedia.marcaLuta ( lutador[2],lutador[3] );
        eucMedia.luta();

        System.out.println ("p----------------------------");

        Luta eucPesado = new Luta();
        eucPesado.marcaLuta ( lutador[4],lutador[5] );
        eucPesado.luta ();
  }
}
