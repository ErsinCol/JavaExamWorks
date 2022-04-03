import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Kitap kitap1=new Kitap("SAVAŞ VE BARIŞ",50);
        Kitap kitap2=new Kitap("SEFİLLER",80);
        Kitap kitap3=new Kitap("NUTUK",70);

        System.out.println("*****************STATİK DİZİ KULLANIMI*****************");
        // DERLEME YAPILIRKEN ELEMAN SAYISI BELİRLENMELİDİR SONRADAN BOYUTU DEĞİŞTİRİLEMEZ
        Kitap[] kitaplarSL=new Kitap[3];
        kitaplarSL[0]=kitap1;
        kitaplarSL[1]=kitap2;
        kitaplarSL[2]=new Kitap("SİL BAŞTAN",30);
        // for ile erişim
        for(int i=0;i<kitaplarSL.length;i++){
            System.out.println(kitaplarSL[i].getKitapAdi());
        }
        // foreach ile erişim
        for(Kitap gezici: kitaplarSL){
            System.out.println(gezici.getKitapAdi());
        }

        System.out.println("**************ARRAY LİST KULLANIMI**************");

        List<Kitap> kitaplarAL=new ArrayList<Kitap>();// type safe
        kitaplarAL.add(kitap1);
        kitaplarAL.add(kitap2);
        kitaplarAL.add(2,new Kitap("YENİLMEZLER",60));

        System.out.println(kitaplarAL); // toString methodu çağrılıyor

        for(int i=0;i<kitaplarAL.size();i++){
            System.out.println(kitaplarAL.get(i).getKitapAdi());
        }
        // foreach
        for(Kitap gezici: kitaplarAL){
            System.out.println(gezici.getKitapAdi());
        }

        double toplam=0;
        for(int i=0;i<kitaplarAL.size();i++){
            toplam+=kitaplarAL.get(i).getBirimFiyatı();
        }
        System.out.println("Kitapların fiyatları toplamı: "+toplam);




    }
}
