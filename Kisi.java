public class Kisi { // base class
    private String isim;
    private int maas;
    private String bolum;

    public Kisi(String isim,int maas,String bolum){
        this.isim=isim;
        this.maas=maas;
        this.bolum=bolum;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void calıs(){
        System.out.println("Çalışan sınıfı çalışıyor");
    }
    public void  bilgileriGoster(){
        System.out.println("İsim: "+isim);
        System.out.println("Maas: "+maas);
        System.out.println("Bolum: "+bolum);
    }
}
