/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algosou;

import java.util.Scanner;

/**
 *
 * @author EREN
 */
public class Algosou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner klavye=new Scanner(System.in);
            
      
    
        Burç koc = new Burç();
        koc.gezegeni=" Mars";
        koc.element="Ateş";
        koc.nitelik="Öncü";
        koc.günü="Salı";
        koc.olumlu=" Öncülük ve macera ruhu. Girişkenlik. Adam yönlendirme. Hedef belirleme özelliği. Yüksek Enerji. Engelleri aşabilme yetişi. Sınırlamalardan nefret. Liderlik. Dürüstlük. Hazır cevaplık. Canlılık.";
        koc.olumsuz="Egoizm. Kararları yıkmak. Kendini öne sürmek, ileri-ye çıkartmak. Alaycı, isyankar. Sabırsız. Saldırgan. Hiddetli. Ani çıkışlar";
        System.out.println("Burcun adı Koç");
        System.out.println("Burcun Gezegeni"+koc.gezegeni);
        System.out.println("Burcun Elementi"+koc.element);
        System.out.println("Burcun Niteliği"+koc.nitelik);
        System.out.println("Burcun Günü"+koc.günü);
        System.out.println("Burcun Olumlu yanları"+koc.olumlu);
        System.out.println("Burcun olumsuz yanları"+koc.olumsuz);
        System.out.println("");
                System.out.println("");

          Burç terazi = new Burç();
           terazi.gezegeni=" Venüs";
        terazi.element="Hava";
        terazi.nitelik="Öncü";
        terazi.günü="Çarşamba";
        terazi.olumlu=" Güzellik, güzel sanatlara yetenekli. Sevimlilik. Uyumluluk. Zarafet. Romantik. Diplomatik. İncelik. Çekicilik. İdealist. Tarafsız. İyi niyetli. İyi ortak. İyi siyasetçi. Kreatif ve alımlı. Akıllı.";
        terazi.olumsuz="Kararsız. Alıngan. Hafiflik. Değişkenlik. Flörtçü. Dengesizlik. Aldatabilir oluşu. Tembellik. Çabuk fikir değiştirme. Tesir altında kalmak.";
        System.out.println("Burcun adı terazi");
        System.out.println("Burcun Gezegeni"+terazi.gezegeni);
        System.out.println("Burcun Elementi"+terazi.element);
        System.out.println("Burcun Niteliği"+terazi.nitelik);
        System.out.println("Burcun Günü"+terazi.günü);
        System.out.println("Burcun Olumlu yanları"+terazi.olumlu);
        System.out.println("Burcun olumsuz yanları"+terazi.olumsuz);
                System.out.println("");

          
        Burç boga = new Burç();
        boga.gezegeni=" Venüs";
        boga.element="Toprak";
        boga.nitelik="Sabit";
        boga.günü="Cuma";
        boga.olumlu=" Pratik, güvenilir. Uyumlu, tahammüllü, güçlü değer yargıları var. Kararlı. Sanata ve güzelliğe düşkün. Güçlü istekleri var. Sıcak kanlı. Para sahibi olur. Duygulara önem verir.";
        boga.olumsuz="Tembel. Kendine düşkün. Statik. Sıkıcı. Yeterince esnek değil. Orijinalite eksikliği, înat-çı. Alıngan.";
        System.out.println("Burcun adı boga");
        System.out.println("Burcun Gezegeni"+boga.gezegeni);
        System.out.println("Burcun Elementi"+boga.element);
        System.out.println("Burcun Niteliği"+boga.nitelik);
        System.out.println("Burcun Günü"+boga.günü);
        System.out.println("Burcun Olumlu yanları"+boga.olumlu);
        System.out.println("Burcun olumsuz yanları"+boga.olumsuz);
        System.out.println("");
                System.out.println("");

         Burç ikizler = new Burç();
        ikizler.gezegeni=" Merkür";
        ikizler.element="Hava";
        ikizler.nitelik="Değişken";
        ikizler.günü="Çarşamba";
        ikizler.olumlu=" Uyumlu, entelektüel, çabuk kavrayan, mantıklı, konuşkan, canlı, sempatik, yeniliklere açık. Aynı anda bir kaç işi birden yapabilen.";
        ikizler.olumsuz="Değişken, güvenilmez, iki yüzlü, kararsız, yüzeysel, dedikoducu, huzursuz, havai";
        System.out.println("Burcun adı ikizler");
        System.out.println("Burcun Gezegeni"+ikizler.gezegeni);
        System.out.println("Burcun Elementi"+ikizler.element);
        System.out.println("Burcun Niteliği"+ikizler.nitelik);
        System.out.println("Burcun Günü"+ikizler.günü);
        System.out.println("Burcun Olumlu yanları"+ikizler.olumlu);
        System.out.println("Burcun olumsuz yanları"+ikizler.olumsuz);
        System.out.println("");
        System.out.println("");

         Burç yengec = new Burç();
        yengec.gezegeni=" Ay";
        yengec.element="Su";
        yengec.nitelik="Öncü";
        yengec.günü="Pazartesi";
        yengec.olumlu=" Nazik,Hassas,Sempatik,Merhametli Düş gücü yüksek. Analık ve babalık duygulan güçlü. Vatansever. Yuva sevgisi. Israrlı. Becerikli. İyi eş. Tutumlu.";
        yengec.olumsuz="Aşırı duygusal. Züppe. Dağınık. Kuşkucu. Değişken. Kıskanç. Zayıf karakterli. Kendine acıma meyilli. Sabit olamamak. Değişken duygular.";
        System.out.println("Burcun adı ikizler");
        System.out.println("Burcun Gezegeni"+yengec.gezegeni);
        System.out.println("Burcun Elementi"+yengec.element);
        System.out.println("Burcun Niteliği"+yengec.nitelik);
        System.out.println("Burcun Günü"+yengec.günü);
        System.out.println("Burcun Olumlu yanları"+yengec.olumlu);
        System.out.println("Burcun olumsuz yanları"+yengec.olumsuz);
        System.out.println("");
        System.out.println("");

         Burç aslan = new Burç();
        aslan.gezegeni=" Güneş";
        aslan.element="Ateş";
        aslan.nitelik="Sabit";
        aslan.günü="Pazar";
        aslan.olumlu=" Yüce gönüllülük. Cömertlik. Yaratıcılık. Babalık. Fedakarlık. Üstünlük. Yaratıcılık. Neşe. İyi organizasyon. Açık zihin.";
        aslan.olumsuz="Otorite. Diktatörlük. Zorbalık. Tantana. Züppelik. Tolerans göstermemek. Sabit fikirlilik. Kuvvet deliliği. Kendini beğenmişlik.";
        System.out.println("Burcun adı Aslan");
        System.out.println("Burcun Gezegeni"+aslan.gezegeni);
        System.out.println("Burcun Elementi"+aslan.element);
        System.out.println("Burcun Niteliği"+aslan.nitelik);
        System.out.println("Burcun Günü"+aslan.günü);
        System.out.println("Burcun Olumlu yanları"+aslan.olumlu);
        System.out.println("Burcun olumsuz yanları"+aslan.olumsuz);
        System.out.println("");
                System.out.println("");

        Burç akrep = new Burç();
        akrep.gezegeni=" Pluto-Mars";
        akrep.element="Su";
        akrep.nitelik="sabit";
        akrep.günü="Çarşamba";
        akrep.olumlu=" Sırdaş. Duygularım belli etmez. Gerçek dost. Cazibeli. Güçlü. Seks sembolü. Çalışkan. Kararlı. Unutmaz. Güçlü sezgiler. Güçlü duygular. Yüksek imajinasyon. Anlayışlı. Dikkatli. Yüksek analiz gücüne sahip. Sevgi. Pişmanlık.";
        akrep.olumsuz=" Kindar. Kuşkucu. Kıskanç. alıngan. Dik kafalı. Suskun. Akrep gibi, zehirleyici. Alaycı. Ben merkezci. İhtiraslı";
        System.out.println("Burcun adı Akrep");
        System.out.println("Burcun Gezegeni"+akrep.gezegeni);
        System.out.println("Burcun Elementi"+akrep.element);
        System.out.println("Burcun Niteliği"+akrep.nitelik);
        System.out.println("Burcun Günü"+akrep.günü);
        System.out.println("Burcun Olumlu yanları"+akrep.olumlu);
        System.out.println("Burcun olumsuz yanları"+akrep.olumsuz);
        System.out.println("");
                System.out.println("");

 Burç kova = new Burç();
        kova.gezegeni=" Uranüs";
        kova.element="Hava";
        kova.nitelik="sabit";
        kova.günü="Çarşamba";
        kova.olumlu=" Hümanist. Bağımsız. Dost. Mucit. Orijinalist. Reformist. Sadık. Vefalı. İdealist. Entelektüel. Yeniliğe meraklı. Değişikliği sever. Geçmişe bağlı.";
        kova.olumsuz=" Umulmadık gariplikler. isyankarlık. Muhalif. Sabit fikirli. Gelenekleri zorlayıcı. Çılgın, tartışmaya meraklı. Dikkati çekmek ister. Çılgın. Kendini beğenmiş. Olmayacak hayaller";
        System.out.println("Burcun adı kova");
        System.out.println("Burcun Gezegeni"+kova.gezegeni);
        System.out.println("Burcun Elementi"+kova.element);
        System.out.println("Burcun Niteliği"+kova.nitelik);
        System.out.println("Burcun Günü"+kova.günü);
        System.out.println("Burcun Olumlu yanları"+kova.olumlu);
        System.out.println("Burcun olumsuz yanları"+kova.olumsuz);
        System.out.println("");
                System.out.println("");

         Burç balik = new Burç();
        balik.gezegeni=" Neptün";
        balik.element="Su";
        balik.nitelik="Değişken";
        balik.günü="Cuma";
        balik.olumlu=" Alçak gönüllü. Şefkatli. Sempatik. Hassas. Adapte olabilir. Etkili. Anlayışlı. Nazik. Sezgili. Renkli hayaller. Derin duygular. Sevgiye düşkünlük. Merhametli. Güzel sanatlarda başarılı. İyi niyetli. Yardımsever.";
        balik.olumsuz="Belirsizlik. İhmalcilik. Gizlilik. Kolay dağılmak. Zayıf arzular. Kararsızlık. Mücadeleci değil. Karamsar. Çekingen. Alıngan";
        System.out.println("Burcun adı balik");
        System.out.println("Burcun Gezegeni"+balik.gezegeni);
        System.out.println("Burcun Elementi"+balik.element);
        System.out.println("Burcun Niteliği"+balik.nitelik);
        System.out.println("Burcun Günü"+balik.günü);
        System.out.println("Burcun Olumlu yanları"+balik.olumlu);
        System.out.println("Burcun olumsuz yanları"+balik.olumsuz);
        System.out.println("");
                System.out.println("");

               }
    }
    
