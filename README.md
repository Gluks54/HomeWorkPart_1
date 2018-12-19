# sda_javawwa13_prog1
exercises done during Java classes

Uzywamy gita,
Jezeli ktos czuje sie na silach piszemy testy jednostkowe (bardzo zachecam)

1. Napisz program ktory obliczy sume dwoch liczb
    1. liczb podanych przez uzytkownika w konsoli
    2. podanych jako argumenty wejsciowe programu
2. Napisz program ktory dla liczby N obliczy sume wszystkich wielokrotnosci 3 i 5 ktore sa <= N (mniejsze lub rowne)
```
N=10 
1 2 3 4 5 6 7 8 9 10
3 + 5 + 6 + 9 + 10 = 33
```
3. Napisz program ktory obliczy silnie liczy N.
Silnia to iloczyn liczb naturalnych <=N (mniejsze rowne), silnie oznaczamy znakiem !, np: 3! = 3x2x1 = 6
    1. Napisz program iteracyjny
    2. Napisz program rekurencyjny
4. Napisz program ktory wypisze od tylu tekst podany na wejsciu konsoli.
    czyli "programuje w javie" -> "eivaj w ejumargorp"
5. Napisz program ktory obliczy srednia liczb podanych na wejsciu konsoli.
6. Napisz program ktory sprawdzi czy osoba jest pelnoletnia.
    Program powinien wczytac z konsoli date urodzenia w formacie dd.MM.yyyy i powiedziec czy osoba jest pelnoletnia czy nie.
	Jak zamienic String na Date?
```
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    Date date = format.parse("2010-10-10");
```
7. Napisz program ktory wczyta tekst i wypisze go uzywajac wylacznie wielkich liter.
    1. Zmodyfikuj program tak by po wypisaniu wejsciu pozwolil wprowadzic kolejne slowa dopoki uzytkownik nie poda "q!"
8. Napisz program ktory jako argument wejsciowy (String[] args) przyjmie liczby oddzielone spacjami i nastepnie:
    1. wypisze wszystkie liczby w kolejnosci w jakiej zostaly podane
    2. wypisze wszystkie liczby od tylu
    3. wypisze wszystkie na nieparzystych pozycjach
    4. wypisze wszystkie podzielne przez 3
    5. wypisze sume wszystkich
    6. wypisze sume pierwszych 4
    7. wypisze sume ostatnich 5 liczb ktore sa wieksze niz 2
    8. wypisze sume liczb od poczatku tablicy ktora przekracza 10 (in: "1 2 3 5 6 7 10 100 123" out: "11")
    9. (zadanie domowe) wybierz liczby z tablicy tak by ich suma byla jak najblizsza 10, wypisz te liczby
    10. (zadanie domowe) wybierz liczby z tablicy tak by ich suma byla jak najblizsza N, wypisz te liczby
        wejscie bedzie podane w formie: "N 1 2 13 100 4 10..."
9. Napisz program ktory wyswietli kwadrat z znakow * o boku 3
```
   ***
   * *
   ***
```

    1. Zmodyfikuj program tak by dlugosc boku byla wczytywana z wejscia

10. Napisz program ktory sprawdzi czy slowo jest palindromem
11. Napisz program ktory wyswietli N elementow ciagu fibonacciego
    1. Do kazdego wypisanego elementu wypisz jego stosunek do poprzedniego elementu
    2. Ile elementow ciagu jestes w stanie obliczyc uzywajac zmiennych typu int? long? BigInteger?
12. Napisz program ktory podana liczbe wejsciowa wyswietli w postaci binarnej (system dwojkowy)
13. Do programu wypisujacego ciag liczb fibonacciego dodaj wypisywanie liczb ciagu w postaci binarnej
14. Napisz program ktory zapisze w pliku .png kwadrat wypelniony na niebiesko, kolo wypelnione na czerwono.
    Podpowiedz - kawalek kodu ktory tworzy plik png
```
        // Constructs a BufferedImage of one of the predefined image types.
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);

        // Create a graphics which can be used to draw into the buffered image
        Graphics2D g2d = bufferedImage.createGraphics();

        // fill all the image with white
        g2d.setColor(Color.white);
        g2d.fillRect(0, 0, 100, 100);

        // this is how we set a color
        g2d.setColor(Color.yellow);
        // this is how we fill a rectangle
        g2d.fillRect(12, 24, 50, 50);
        // this is how we set one pixel
        g2d.fillRect(5, 10, 1, 1);

        // Disposes of this graphics context and releases any system resources that it is using.
        g2d.dispose();

        // Save as PNG
        File file = new File("myimage.png");
        ImageIO.write(bufferedImage, "png", file);
```
15. Wrocmy do programu fibonacci. Wykorzystajmy zapisywanie liczb w postaci binarnej i zapisywanie plikow .png.
    Stworz obrazek w ktorym kazdy wiersz bedzie reprezentowal jeden element ciagu w postaci binarnej.
    Zamiast 0 zapisz bialy piksel, zamiast 1 zapisz czarny piksel.
    Czyli obrazek powinien zaczynac sie tak:
```
       1            ¦
      10           ¦ 
      11           ¦¦
     101          ¦ ¦
    1000         ¦   
    1101  ->     ¦¦ ¦
   10101        ¦ ¦ ¦
  100010       ¦   ¦ 
  110111       ¦¦ ¦¦¦
 1011001      ¦ ¦¦  ¦
10010000     ¦  ¦    
```
16. Napisz kalkulator stringow. Kalkulator operuje tylko na malych literach. Operacje ktore musi obslugiwac kalkulator:

    1. add
        
            "ala" + "mak" = "alamak"
            
    2. sub
        
            "ala" - "a" = "al"
            "ala" - "bba" = "al"
            "ala" - "xxx" = "ala"
            "ala" - "alaala" = ""
            
    3. sub_m
        
            "ala" -m "a" = ""
            "ala" -m "bba" = "bb"
            "ala" -m "xxx" = "xxx"
            
    4. uniq
        
            "ala" u = "al"
            "xxx" u = "x"
            "majtek" u = "majtek"
            
    5. inter
        
            "ala" u "aaa" = "aa"
            "kota" u "ole" = "o"
            "abcdefg" u "cdefghij" = "cdefg"
            
    6. dim_d
        
            "ala" o "aaa" = "la"
            "ala" o "xxx" = "alaxxx"
            "abcdefg" o "defghijkl" = "abcijkl"
            
17. Napisz program ktory sprawdzi czy dwa podane wyrazy sa anagramami.
    1. Zmodyfikuj program tak by slowa do sprawdzenia wczytal z pliku. Nadal beda to tylko 2 slowa oddzielone znakiem nowej lini
    2. Zmodyfikuj program tak by znalazl wszystkie anagramy dla slow z pliku oddzielonych znakiem nowej lini. Do ostatecznego przetestowania programu uzyj listy slow: http://codekata.com/data/wordlist.txt (do znalezienia jest 20683 anagramow)
