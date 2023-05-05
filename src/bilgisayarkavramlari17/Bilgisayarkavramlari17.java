/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilgisayarkavramlari17;

import java.util.ArrayList;

/** * * @author maytemur Design Pattern - Tasarım Kalıbı 1 - Abstract - Occurence Kalıbı 
 * serinin 26 ncı videosu */

class abstraction{
    ArrayList <occurence> occurences = new ArrayList<>();
    
}

class occurence {
    abstraction abst = new abstraction(); //1 occurence'ın 1 tane abstraction'ı var anlamına geliyor
    //
}

//örnek uygulama tv dizisi-bölümler yaptık ama kütüphanaede kitaplar içinde 
//title (name,author,isbn,publicdate ) abstraction vs libraryitem (barcode number) occurence'da yapılabilir
//resme bakılabilir

class tvdizisi{
    //Abstraction yerine geçiyor sürekli tekrarlanan özellikler bunun içine alınarak gereksiz tekrarın
    //ve daha kolayca sınıflamanın yolu açılmış oldu
    
    String isim;
    String yapimci;
    ArrayList <bolum> bolumler = new ArrayList<>();
    
    void bolumEkle(bolum b){
        bolumler.add(b);
    }
}

class bolum{
    //bu occurence yerine geçiyor sürekli tekrarlanıyor ortak özelliklere sahip ama her bir 
    //bölüm diğerimden yinede farklı
    
    String bolumIsmi;
    int bolumNo;
    public bolum(String bolumIsmi, int bolumNo){
        this.bolumIsmi = bolumIsmi;
        this.bolumNo = bolumNo;
    }
}

public class Bilgisayarkavramlari17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tvdizisi guldurguldur = new tvdizisi();
        guldurguldur.isim = "Güldür Güldür";
        guldurguldur.bolumEkle(new bolum("esofmanli sevket hoca",1));
        guldurguldur.bolumEkle(new bolum("nasip hocam",2));
    }    
}
