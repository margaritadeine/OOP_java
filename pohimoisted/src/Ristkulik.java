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



    public void arvutaPindala(Boolean tapsus) {
        System.out.println("Ristkülik klassi arvutaPindala() meetod");
        this.setPindala(this.pikkus * this.laius);
        Double pindala = this.getPindala();
        if (tapsus){
            System.out.println("Pindala = " + pindala);
        } else {
            System.out.println("Pindala = " + Math.round(pindala));
        }
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
        System.out.println("Nurgad = " + this.nurk +" kraadi.");
        System.out.println("Pndala = " + this.getPindala());
    }
}
