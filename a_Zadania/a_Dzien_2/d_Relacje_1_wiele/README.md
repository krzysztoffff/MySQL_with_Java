
#  Relacje jeden do wielu



#### Zadanie 1 
W pliku `Main1.java`:

W bazie danych o nazwie ```products_ex``` stwórz następującą tabele:
```SQL
* Opinions:
  * description: string
```

1. Tabela ```Opinions``` ma być połączona z tabelą ```Products``` relacją jeden do wielu (produkt ma wiele opinii, opinia jest przypisana do jednego produktu).
2. Napisz po `5` zapytań, które dodadzą opinie do `3` istniejących produktów.  


#### Zadanie 2
W pliku `Main2.java`:

W bazie danych o nazwie ```products_ex``` stwórz następującą tabele:
```SQL
* Categories:
  * id: int
  * name: string
* Categories_sub:
  * id: int
  * main_id: int -- relacja z id głównej kategorii
  * name: string
```
Połącz tabele `Categories` i `Categories_sub` za pomocą relacji wiele do jednego (jedna kategoria może mieć wiele podkategorii, jedna podkategoria ma jedną kategorię nadrzędną).

#### Zadanie 3
W pliku `Main3.java`:

Dodaj zapytania do pliku a następnie wypisz w konsoli:

1. Wszystkie produkty które mają opinie oraz dostępne dla nich opinie. (nie powinny występować wartości null)
2. Pobierz wszystkie produkty razem z opiniami niezależnie od tego czy mają opinie. (mogą występować wartości null)
3. Pobierz wszystkie opinie dla produktu o id 1, wynik ma zawierać również wszystkie dane dotyczące produktu.

#### Zadanie 4
W pliku `Main4.java`:

Dodaj zapytania do pliku a następnie wypisz w konsoli:

1. Za pomocą odpowiedniego złączenia pobierz wszystkie podkategorie kategorii o id 1.
2. Pobierz id oraz nazwę kategorii - tylko tych które mają podkategorie. (skorzystaj z `DISTINCT`).

