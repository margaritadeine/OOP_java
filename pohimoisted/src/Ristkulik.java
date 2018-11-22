public class Ristkulik extends Kujund {
    // objekti omadused - kalssi muutujad
    private Double pikkus;
    private Double laius;
    private  Integer nurk;


    public Ristkulik(String  nimi, Double p, Double l) {
        super(nimi);
        this.pikkus = p;
        this.laius = l;
        this.setNurkadeOlemasolus(true);
        this.setNurkadeArv(4);
        this.nurk = 90;
        System.out.println("Ristkuliku klassi konstruktor");
    }

    @Override
    public void valjastaKirjeldus() {
      //  super.valjastaKirjeldus();

        System.out.println("Ristkuli klassi valjastaKirjeldus()");
        System.out.println("Pikkus = " + this.pikkus);
        System.out.println("Laius = " + this.laius);
       if (this.getNurkadeOlemasolus()){
           System.out.println("Kokku on " + this.getNurkadeArv() + " nurka.");
       }
        System.out.println("Nurgad =" + this.nurk +"kraadi.");
    }
}
