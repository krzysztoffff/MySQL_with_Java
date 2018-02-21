
#  Relacje jeden do jednego

Wszystkie zapytania do bazy wykonuj w **konsoli**, dodatkowo zapisz treść zapytań do plików ``java`` przygotowanych do każdego zadania.

**Część zadań w swoim poleceniu ma utworzenie relacji między tabelami, w takiej sytuacji należy zmodyfikować strukturę tabel i dodać nowe kolumny lub nowe tabele**

#### Zadanie 1 
W pliku `Main1.java`:
W bazie danych o nazwie ```products_ex``` stwórz następującą tabele:
```SQL
* ClientAddress:
  * client_id: int
  * city: string
  * street: string
  * house_nr: string
```

Tabela ```ClientAddress``` ma być połączona relacją jeden do jednego z tabelą ```Clients```.  
Napisz 5 zapytań SQL, które wprowadzą adresy dla istniejących już użytkowników.


#### Zadanie 2 - import bazy danych

Jeżeli nie masz bazy danych `cinemas_ex` albo masz ją niekompletną, to usuń ją i stwórz nową bazę danych o nazwie ```cinemas_ex```.  
Następnie zaimportuj do niej dane z pliku **cinema.sql**. Są to tabele powypełniane dużą ilością danych. Takie jak wczoraj, brakuje tylko tabeli płatności.

#### Zadanie 3
W pliku `Main3.java`:
Praca na bazie `cinemas_ex`  

Stwórz tabelę do płatności.  
Ma mieć takie same dane jak w zadaniach z poprzedniego dnia.  
```SQL
 * Payments:
   * id: int
   * type: string
   * date: date
 ```

Dodatkowo z tabelą `Tickets` ma być powiązana relacją jeden do jednego.  
Relacja między biletem a płatnością jest następująca:  
* bilet ma `1` lub `0` płatności (jest wtedy nieopłacony)
* płatność musi być przypisana do biletu **(dodaj odpowiednią kolumnę do tabeli `Payments` podczas jej tworzenia)**

Uzupełnij tabelę `Payments` kilkoma wpisami. Przyjmowane typy płatności (`cash`, `transfer`, `card`).

#### Zadanie 4
W pliku `Main4.java`:
Dodaj zapytania do pliku a następnie wypisz w konsoli:

1. Wszystkie bilety które zostały opłacone gotówką (czyli `type` = `cash` ).
2. Wszystkie bilety które zostały opłacone przelewem (czyli `type` = `transfer` ).
3. Wszystkie bilety które zostały opłacone kartą (czyli `type` = `card` ).
4. Wszystkie bilety które nie zostały jeszcze opłacone.
