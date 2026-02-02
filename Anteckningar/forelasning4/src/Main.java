/*
## Länkade listor & arrays ##

Vid länkade listor tar "instoppning" av ny node en konstant tid, men att hitta platsen är linjärt i N då du
behöver iterera genom den från början.
Vid en array kan du be direkt efter ett visst index vilket tar en konstant tid. Däremot om du vill lägga till
något i mitten av en array, t.ex index 5 (säg att arrayn är full från index 0 till 8 men 9-12 är tomma) så
måste du flytta fram allt från 5 upp ett steg för att göra plats. Detta tar också tid linjärt i N.
Om listan är full från första början måste du skapa en ny array och flytta över allt till den nya.


## Stackar ##
push - lägg till ett element högst i listan
pop - ta bort ett element & returnera det.
Internt är en Stack med nodes en länkad lista eller alt. en array.
När du poppar ett element i en stack så försvinner det från den abstrakta datatypen stacken,
 men pekaren till elementet ligger kvar i arrayen.
  ~~ OBS: Notera skillnaden av användingen av indexen [N++] & [--N] vid pop & push. s[N++] = item kommer
 att assigna s[N] = item först & sen öka N medan s[--N] kommer att sänka N först & sen assigna s[N] = item ~~

 ## Stack som dynamisk array ##
 När stacken blir full, dubbla den istället för att utöka med 1.
 N push-operationer: 2+4+8+...+N ~2N array accesser
När arrayn är halvfull vill man inte halvera storleken eftersom du kan behöva pusha direkt igen &
då dubbla storleken igen. Istället vill du halvera när den är kvartsfull.
När du pushar kostar det 9 (1 direkt & 8 sparade) Alltså du gör 1 arrayaccess direkt
när du poppar kostar det 6 (2 direkt & 4 sparade) Alltså du gör 2 arrayaccesser direkt
när du sedan behöver resize:a så ska det sparade täcka "kostnaden"
Antalet arrayaccesser i resize(N) = 4N
Vi ska bevisa att vi har 4N arrayaccesser sparade
Efter resize : N använda & n tomma.
När vi ska resize:a måste vi ha gjort minst N push operationer,

## Amorterad kostnad ##
-- Skillnad mellan förväntat & armorterat --
Förväntat värde - viktat medel över alla möjliga värden. Kan vara noll eller K
Armortat - genomsnittlig kostnad per operation över en värsta-falls-sekvens av operationer, utan sannolikheter.

## Kö som länkad lista ##
En kö som länkad lista består av noder där varje nod innehåller ett värde och en pekare till nästa nod.
För att kunna lägga till och ta bort element effektivt behöver vi två pekare: en som pekar på första
elementet i kön (front) och en som pekar på sista elementet (rear).

När vi enqueue lägger vi till ett nytt element längst bak genom att låta den nuvarande sista noden peka på
den nya noden och uppdatera slut-pekaren. När vi dequeue tar vi bort det första elementet genom att flytta
start-pekaren till nästa nod i listan.

Det finns inget fast max-antal element och inget ”tomrum” som i en array – kön växer och krymper dynamiskt i
minnet. Alla operationer (enqueue och dequeue) kan göras i O(1) tid så länge vi har både start- och slutpekare.


## Kö implementerad som array ##
Tänk dig en cirkel med början & slut bredvid varandra. En Kö som array kan starta & sluta vart som helst i
denna cirkel. Den behöver alltså två markörer, en för att indikera start och en för slut. Har du en array
från index 0-8 så kan dit första värde ligga på plats 3 och sista på plats 7. Alltså har vi tomrum innan och efter.
men lika väl kan det ligga från 7 till 3, då loopar vi tillbaka & tanken av en cirkel blir mer klar.




 */