## Opis projektu
Ten projekt dotyczy implementacji klasy Wall. Projekt jest stworzony do pierwszego etapu rekrutacyjnego w firmie **Horus**.

### Interfejs Structure
Interfejs Structure zawiera trzy metody:

- `findBlockByColor(String color)` - zwraca element o podanym kolorze. Jeśli taki element nie istnieje, zwraca pusty Optional.
- `findBlocksByMaterial(String material)` - zwraca listę wszystkich elementów o podanym materiale.
- `count()` - zwraca liczbę wszystkich elementów tworzących strukturę.

### Klasa Wall
Klasa Wall jest implementacją interfejsu Structure i zawiera listę bloków (klasa Block). Wszystkie metody interfejsu Structure są implementowane w tej klasie.

### Interfejsy Block i CompositeBlock
Interfejs Block zawiera dwa gettery:

- `getColor()` - zwraca kolor bloku.
- `getMaterial()` - zwraca materiał bloku.

Interfejs CompositeBlock rozszerza interfejs Block i zawiera dodatkowo metodę:

- `getBlocks()` - zwraca listę bloków tworzących ten blok.
Klasa SimpleBlock
Klasa SimpleBlock jest prostą implementacją interfejsu Block i zawiera informacje o kolorze i materiale danego bloku.

### Uruchomienie
Aby uruchomić projekt, należy przeprowadzić testy jednostkowe `SimpleTest` sprawdzające poprawność implementacji interfejsu Structure i powiązanych interfejsów. W tej chwili nie ma możliwości uruchomienia tego projektu jako aplikacji.
