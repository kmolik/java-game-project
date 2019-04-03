
package gra;
import java.util.Scanner;
import java.util.Random;

class Postac
{
    String imie;
    String przydomek;
    int poziom;
    String gatunek;
    
    Postac(String imie, String przydomek) 
    {
        this.imie=imie;
        this.przydomek=przydomek;
    }
    Postac(String imie, String przydomek, int poziom, String gatunek)
    {
        this.imie=imie;
        this.przydomek=przydomek;
        this.poziom=poziom;
        this.gatunek=gatunek;
    }
    void Witaj()
    {
        System.out.println("Witaj Wędrowcze, nazywam się "+ imie +"."+"Czego Ci potrzeba?");
    }
    void odejdz()
    {
       System.out.println("Odejdź stąd! "+imie+" "+przydomek+" nie ma teraz czasu dla Ciebie.");
    }
    void nieznajomy()
    {
        System.out.println("Podchodzi do Ciebie "+imie+" "+przydomek+" "+gatunek+" poziom "+poziom+".");
        System.out.println("Zadaje Ci pytanie: ");
        System.out.println("Podróżniku, wszystko w porządku?");
    }
    void informacja()
    {
        System.out.println("W naszej wsi mamy płatnerza. To "+gatunek+" "+imie);
    }
    
}
class Miejsce
{
    String wioska;
    String miasto;
    String kopalnie;

Miejsce(String wioska, String miasto, String kopalnie)
{
    this.wioska=wioska;
    this.miasto=miasto;
    this.kopalnie=kopalnie;
}

    void odchodzisz()
    {
        System.out.println("Zaczekaj przyjacielu, obszar poza wioską jest niebezpieczny. Chyba nie chcesz opuścić "+wioska+"?");
    }
    void wiesci()
    {
        System.out.println("Wieści mówią, że wojka Króla Ragnara stacjonują w pobliżu miasta "+miasto+".");
        System.out.println("Oblegają kopalnię "+kopalnie+" zajętą przez krasnoludy.");
    }
}
public class Gra {
    public static void main(String[] args){
       Postac obiekt1 = new Postac("Bardok", "Plugawy",12,"Ork");
       Postac obiekt2 = new Postac("Kaleb", "Mocarny",18,"Elf");
       Postac obiekt3 = new Postac("Grimi", "Silny");
       Miejsce lokacje1= new Miejsce("Purchaw","Mościce","Gundabadu");
       
       int x;
       do{
       System.out.println("Stoisz przed wejsciem do karczmy.");
       System.out.println("1. Wchodzisz do karczmy.");
       System.out.println("2. Idziesz w lewo do płatnerza.");
       System.out.println("3. Wychodzisz z wioski");
       Scanner decyzja1= new Scanner(System.in);
       x = decyzja1.nextInt();
       
       switch(x)
       {
           case 1: obiekt3.Witaj();
           break;
           case 2: obiekt1.odejdz();
           break;
           case 3: lokacje1.odchodzisz();
           break;
           default: obiekt2.nieznajomy();
           break;
       }
       }while(x!=1);
       
       int y;
       
       do{
       System.out.println("Podchodzisz do karczmarza i zaczynasz rozmowę: ");
       System.out.println("1. Witaj! Jakie wieści ze świata?");
       System.out.println("2. Chcę się napić");
       System.out.println("3. Gdzie mogę naprawić zbroję lub oręż?");
       System.out.println("4. Gdzie można póść spac?");
       System.out.println("5. Wychodzisz z karczmy.");
       Scanner decyzja2= new Scanner(System.in);
       y = decyzja2.nextInt();
       
       switch(y){
           case 1: lokacje1.wiesci() ;
           break;
           case 2: System.out.println("Barman nalewa Ci krasnoludzkie piwo");
           break;
           case 3: obiekt1.informacja() ;
           break;
           case 4: System.out.println("Spróbuj  szczęścia w innej wsi.") ;
           break;
           case 5: System.out.println("Żegnaj.");
           break;
           default: System.out.println("Karczmarz przygląda się Tobie badawczo.");
       }
       }while(y!=5);
       System.out.println("Żegnaj Wędrowcze");
    }
    
}
