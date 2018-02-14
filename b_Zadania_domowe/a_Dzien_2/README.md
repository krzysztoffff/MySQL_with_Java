<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

# MySQL - zadania domowe
> Wszystkie zadania rozwiązuj w przygotowanych do tego plikach. Zapytania do bazy powinny być przypisane do przygotowanych do tego zmiennych.

#### Zadanie 1
W pliku `Main1.java`:  
Do 2 tabel z dnia pierwszego dodaj odpowiednie relacje opisane poniżej. 
```SQL
* images (relacja 1 do wielu do tabeli offers [offer_id]):
  * offer_id: int unsigned -> foreign key
* users_companies (relacja 1 do 1 do tabeli users [user_id]):
  * user_id: int unsigned -> foreign key -> pamiętaj iż jest to relacja 1 do 1
```
#### Zadanie 2
W pliku `Main2.java`:  
Stwórz programy, przy pomocy których będzie można:

1. zobaczyć wszystkie filmy (powinien wyświetlić się opis, rating + listę kin, która go wyświetla),
2. zobaczyć wszystkie kina (wypisz wszystkie filmy + seanse w danym kinie),
3. kupić bilet na dany seans i zapłacić za bilet.

#### Zadanie 3
W pliku `Main3.java` program, który:

1. Program pobierze od użytkownika tytuł filmu do wyświetlenia.
2. Wybrany film zostanie wyświetlony.
3. Możliwe jest podanie pustej wartości - wyświetlone zostaną wtedy wszystkie filmy.
4. Jeżeli film nie zostanie odnaleziony w bazie danych - program ma wyświetlić komunikat "Nie odnaleziono filmu".


#### Zadanie 4
W pliku `Main4.java` program, który:

1. Program pobierze od użytkownika nazwę kina do wyświetlenia.
2. Wybrane kino zostanie wyświetlone razem z filmami w formacie:
```
Kino o id 12:
* Film o id 5
* Film o id 6
* Film o id 11
```

3. Możliwe jest podanie pustej wartości - wyświetlone zostaną wtedy wszystkie kina i wyświetlane w nich filmy.

#### Zadanie 5
W pliku `Main5.java`:

1. Utwórz tabelę `Seance`, która będzie zawierać następujące pola:
```SQL
* id: int
* cinema_id: int
* movie_id: int
* cinema_id: int
  
```
#### Zadanie 6
W pliku `Main6.java`:  

Kolumny `cinema_id` oraz `movie_id` -mają być kluczami obcymi odpowiednio dla tabel Cinema oraz Movie.
Napisz program który:  

1. Wyświetli wszystkie dostępne kina.
2. Pobierze z konsoli id kina, a następnie wyświetli wszystkie filmy w nim grane.
3. Pobierze z konsoli id fimu, a następnie wyświetli wszystkie dostępne seanse dla wybranego kina oraz filmu.



### Zadanie: poćwicz SQL (*)

W repozytorium z zadaniami domowymi znajdziesz zrzut bazy danych **football.sql**. Jest to baza danych z wynikami Ligi Okręgowej Warszawa II w sezonie 2016/17 (wyniki na dzień 14 listopada 2016 roku).

Utwórz na serwerze bazę danych i zaimportuj plik SQL. Jeśli nie wiesz, jak to zrobić, poszukaj w Google, używając słów kluczowych: *MySQL, import, dump*.

Przyjrzyj się strukturze i danym. Znajdują się tam dwie tabele: **Teams** i **Games**. Pierwsza z nich to lista klubów piłkarskich i punkty zdobyte do dnia eksportu bazy danych. Druga tabela to wyniki gier. Pola `team_home` i `team_away` to klucze obce do tabeli **Teams**

Napisz zapytania, które:

1. Wyciągną klub, który jest liderem tabeli,
2. Wyciągną tabelę, posortowaną według liczby zdobytych punktów,
3. Wyciągną wszystkie mecze, które Naprzód Brwinów grał u siebie,
4. Wyciągną wszystkie mecze, które Naprzód Brwinów grał na wyjeździe,
5. Wyciągną wszystkie mecze (u siebie i na wyjeździe) klubu Naprzód Brwinów. 
6. Zsumują wszystkie gole zdobyte przez klub Naprzód Brwinów u siebie i na wyjeździe (zrób dwa zapytania: osobno u siebie, osobno na wyjeździe).

W podpunktach 3 - 5 wynik ma zawierać kolejno: 

* nazwę klubu gospodarzy,
* nazwę klubu gości,
* liczbę goli strzelonych przez gospodarzy,
* liczbę goli strzelonych przez gości.  
