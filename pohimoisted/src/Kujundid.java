public class Kujundid {
    public static void main(String[] args) {
        Kujund ring = new Kujund("Ring");
       // Kujund ruut = new Kujund("Ruut");
        //Kujund kolmnurk = new Kujund("Kolmnurk");


       // ring.valjastaKirjeldus();
        /* Need read tööle ei lähe , kuna nimetus on privaatne omadus
        ring.valjastaKirjeldus();
        ring.nimetus ="Ruut";  */

        //ring.setNimetus("Ruut");
        //ring.valjastaKirjeldus();

       // ruut.valjastaKirjeldus();
       // kolmnurk.valjastaKirjeldus();

        Ristkulik ristkulik = new Ristkulik("Ristkülik", 10.0, 5.0);
        ristkulik.valjastaKirjeldus();
        ristkulik.arvutaPindala();
    }
}
