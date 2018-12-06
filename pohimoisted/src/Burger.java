public class Burger {
    private String nimetus;
    private String liha;
    private String sai;
    private Double hind;
    private  String lisand1;
    private Double lisand1Hind;
    private String lisand2;
    private Double lisand2Hind;
    private String lisand3;
    private Double lisand3Hind;
    private String lisand4;
    private Double lisand4Hind;

    public String getNimetus() {
        return nimetus;
    }

    public String getLiha() {
        return liha;
    }

    public String getSai() {
        return sai;
    }

    public Double getHind() {
        return hind;
    }

    public void setLisand1(String lisand1) {
        this.lisand1 = lisand1;
    }

    public void setLisand1Hind(Double lisand1Hind) {
        this.lisand1Hind = lisand1Hind;
    }

    public void setLisand2(String lisand2) {
        this.lisand2 = lisand2;
    }

    public void setLisand2Hind(Double lisand2Hind) {
        this.lisand2Hind = lisand2Hind;
    }

    public void setLisand3(String lisand3) {
        this.lisand3 = lisand3;
    }

    public void setLisand3Hind(Double lisand3Hind) {
        this.lisand3Hind = lisand3Hind;
    }

    public void setLisand4(String lisand4) {
        this.lisand4 = lisand4;
    }

    public void setLisand4Hind(Double lisand4Hind) {
        this.lisand4Hind = lisand4Hind;
    }

    public Burger(String nimetus, String liha, String sai, Double hind) {
        this.nimetus = nimetus;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;

    }
    public void valiLisand1() {
        if (lisand1 == "tomat") {
            lisand1Hind = 1.20;

        }
    }
    public void valiLisand2() {
        if (lisand2 == "kurk") {
            lisand2Hind = 1.10;
        }
    }
    public void valiLisand3() {
        if (lisand3 == "sibul") {
            lisand3Hind = 1.10;
        }
    }
    public void valiLisand4() {
        if (lisand4 == "salatilehed") {
            lisand4Hind = 0.90;
        }
    }

    public void koostaBurger () {
        System.out.println();
    }
}
