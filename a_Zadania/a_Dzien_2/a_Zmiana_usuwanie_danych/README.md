x`<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">

#  Zmiana i usuwanie danych

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ``java`` przygotowanych do każdego zadania.

#### Zadanie 1 - rozwiązywane z wykładowcą

Praca na bazie `cinemas_ex`

W pliku `Main1.java`:  

1. Pobierz z bazy `id` i `tytuł` filmu, a następnie wyświetl na konsoli listę filmów.
2. Pobierz od użytkownika identyfikator filmu z konsoli.
3. Usuń wiersz na podstawie pobranego identyfikatora.

-----------------------------------------------------------------------------

#### Zadanie 2

Praca na bazie `cinemas_ex`  

W pliku `Main2.java`:  

1. Pobierz z bazy listę biletów i wyświetl na konsoli.
2. Pobierz od użytkownika identyfikator biletu z konsoli.
3. Pobierz z konsloli ilość sprzedanych biletów.
4. Zmodyfikuj odpowiedni wiersz w bazie danych.

#### Zadanie 3

W pliku `Main3.java`  napisz zapytania SQL, (dla bazy danych `cinemas_ex`), które:  

1. Usunie wiersz z tabeli o id =4.
2. Usunie wiersze z tabeli o nazwie `helios`.
3. Ustawi dla wszystkich biletów ilość na 10.
4. Usunie wszystkie płatności któych data jest mniejsza niż 2017-01-01.

#### Zadanie 4
Praca na bazie `cinemas_ex`  
W pliku `Main4.java`:

Napisz następujące zapytania do bazy:

1. Zmieniające adres na `Stadion Narodowy` dla kin których nazwa kończy się na `Z`. 
2. Usuwające płatności, których data jest starsza niż `4` dni od aktualnego czasu z dokładnością do sekundy.
3. Zmieniające rating filmu na `5.4` dla filmów gdzie opis jest dłuższy niż `40` znaków - poszukaj funkcji `MySQL`, która sprawdza ilość znaków.
4. Zmieniające cenę biletu o `50%` jeśli ilość jest większa niż `10`, jako pojedyncze zapytanie `SQL`.

#### Zadanie 5

Praca na bazie `cinemas_ex`  
W pliku `Main5.java`:  

1. Pobierz z bazy wszystkie kina.
2. Dla każdego pobranego wiersza, wyświetl id, nazwę i adres kina na konsoli.
3. Pobierz z konsoli od użytkownika czy chce dokonać edycji, lub usunięcia, (ma wpisać e jeżeli edycja, u - jeżeli usunięcie, x- jeżeli wyjście z programu).
(odpytanie powinno odbywać się w pętli).
4. Jeżeli wybrał e lub u, odpytujemy o id wiersza do edycji/usunięcia.
5. W przypadku edycji, pobieramy nową nazwę oraz adres i modyfikujemy dane. Wyświetlamy wszystkie wiersze ponownie.
6. W przypadku usunięcia, prosimy o potwierdzenie przez wpisanie `T` lub `n`, po wybraniu `T`, usuwamy wiersz i wyświetlamy wszystkie wiersze ponownie.
