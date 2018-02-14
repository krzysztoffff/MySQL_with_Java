<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Relacje wiele do wielu

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ```java``` przygotowanych do każdego zadania.

**Część zadań w swoim poleceniu ma utworzenie relacji między tabelami, w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele.**

#### Zadanie 1 - rozwiązywane z wykładowcą

Praca na bazie `products_ex`  
W pliku `Main1.java`:
Połącz tabele ```Products``` i ```Orders``` relacją wiele do wielu.  
Nową tabelę nazwij `Products_Orders`.  
Napisz 4 zapytania, które połączą istniejące już produkty z zamówieniami.

Napisz w metodzie `main`, program, który wyświetli:
* wszystkie zamówienia,
* wszystkie produkty należące do zamówienia (pod odpowiednim zamówieniem), np:
```
Zamówienie o id 6:
* Produkt o id 1
* Produkt o id 3
* Produkt o id 7
```

#### Zadanie 2 - rozwiązywane z wykładowcą

Praca na bazie `products_ex`  
W pliku `Main2.java`:

Napisz program, który wyświetli:
* wszystkie produkty,
* zamówienia, w których ten produkt się pojawił (pod odpowiednim produktem), np:
```
Produkt o id 12:
* Zamówienie o id 5
* Zamówienie o id 6
* Zamówienie o id 11
```

---

#### Zadanie 3

Praca na bazie `cinemas_ex`  
W pliku `Main3.java`:

1. Połącz tabele `Cinemas` i `Movies` poprzez relację wiele do wielu (film może być wyświetlany w wielu kinach, kino może mieć wiele filmów). 
Dodatkowo stworzoną tabelę nazwij `Screenings`.
2. Uzupełnij tabelę kilkoma wpisami.


#### Zadanie 4

Praca na bazie `cinemas_ex`
W pliku `Main4.java`:

1. Napisz program, który wyświetli wszystkie kina w których wyświetlany jest dany film.
```
Film o id 12:
* Kino o id 5
* Kino o id 6
* Kino o id 11
```
#### Zadanie 5
Praca na bazie `cinemas_ex`
W pliku `Main5.java`:

1. Napisz program, który wyświetli wszystkie filmy które można obejrzeć w danym kinie.
```
Kino o id 12:
* Film o id 5
* Film o id 6
* Film o id 11
```


