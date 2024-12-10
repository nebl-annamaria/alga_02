## Algoritmusok és adatszerkezetek gyakorlat beadandó feladat

### Nébl Annamária, Neptun: K04POD

### Rekurzióval megoldható feladat

Link a feladathoz:
[Digit Queries](https://cses.fi/problemset/task/2431/)

CSES tesztfileok a projektbe csatolva unit tesztekként

## Feladat:

Végtelen db természetes számot fűzünk össze egy stringben növekvő sorrendben.
A feladat megmondani, hogy k indexű helyen milyen számjegy áll.

## Input:

- Az első sor tartalmaz egy q egész számot, amely a lekérdezések számát jelenti.
- Ezután q db sor következik, mindegyikben egy k egész szám, amely a keresett karakter pozícióját jelöli a sztringben

## Algoritmus:

rekurzív keresés

## Kivitelezés:

1. létrehozunk egy rekurzív függvényt, amely meghatározza, hogy a k-adik számjegy melyik számcsoportban található
2. kiszámoljuk, hogy az adott számcsoportban hány számjegy van, figyelembe véve a számjegyek hosszát és az adott csoport
   kezdő számát
3. ellenőrizzük, hogy a k-adik számjegy beleesik-e az aktuális csoportba
4. ha beleesik, meghatározzuk a pontos számot, amely tartalmazza a k-adik számjegyet, és annak helyét a számjegyei
   között
5. ha nem esik bele, újrahívjuk a függvényt a következő csoport paramétereivel, miközben csökkentjük a k értékét az
   aktuális csoport számjegyeinek számával
6. visszaadjuk az eredményt az aktuális számjegyet tartalmazó szám karakterláncából  

