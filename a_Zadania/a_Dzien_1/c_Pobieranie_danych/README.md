
#  Pobieranie danych

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików **java** przygotowanych do każdego zadania.

#### Zadanie 1 - rozwiązywane z wykładowcą
W pliku `Main1.java`:

1. Napisz program, który wyświetli na konsoli wszystkie produkty znajdujące się w bazie danych o nazwie ```products_ex```.
2. Jeśli opis produktu jest dłuższy niż 20 znaków, program ma pokazywać pierwsze 20 znaków i na końcu ```...```.
3. Dodaj produkt z długim opisem do Twojej bazy aby przetestować działanie.

#### Zadanie 2 - rozwiązywane z wykładowcą
W pliku `Main2.java`:

1. Napisz program, który wyświetli na konsoli ranking filmów.
2. Ranking ma wyświetlać filmy, których rating jest większy, niż średni rating wszystkich filmów.
3. Oblicz najpierw średni rating filmów a następnie pobierz filmy z ratingiem większym niż średni.
4. Wykładowca pokaże, jak można obliczyć średni rating z pomocą zapytania SQL i funkcji `AVG()`.

-----------------------------------------------------------------------------

#### Zadanie 3
W pliku `Main3.java`  napisz zapytania SQL, (dla bazy danych `cinemas_ex`), które:

1. Wybiorą wszystkie filmy na literę W.  
2. Wybiorą wszystkie bilety, których cena jest większa niż **15.30**.  
3. Wybiorą wszystkie bilety, których ilość (liczba) jest większa niż **3**. 
4. Wybiorą wszystkie filmy, które mają rating większy niż **6.5**.  

Wywołaj zapytania w metodzie main, a następnie wyświetl ich wyniki.


#### Zadanie 4
W pliku `Main4.java`  napisz zapytania SQL, (dla bazy danych `cinemas_ex`), które:  

1. Zliczy liczbę wszystkich biletów.
2. Zliczy liczbę wszystkich płatności, grupując ich po kolumnie type.
3. Obliczy średną cenę biletu.
4. Pobierze 5 płatności zaczynąć od drugiej.
5. Pobierze listę wszystkich płatności grupując je po typie, których ilość będzie większa niż 2.
6. Zliczy liczbę wszystkich biletów, których ilosć jest większa niż 1.
