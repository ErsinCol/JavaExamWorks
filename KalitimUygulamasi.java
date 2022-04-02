public class KalitimUygulamasi {

    public static void main(String[] args) {

        Yonetici yonetici=new Yonetici("Ali",2500,"IT");
        yonetici.bilgileriGoster();
        yonetici.zamYap(500);
        yonetici.maasHesapla(20);
        KadroluCalisanlar kadroluCalisanlar=new KadroluCalisanlar("Ayse",2000,"muhasebe");
        kadroluCalisanlar.bilgileriGoster();
        kadroluCalisanlar.maasHesapla(20);


    }
}
