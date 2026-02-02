/*
## Mergesort ##
Dela arrayen till två halvor
Rekursivt sortera varje halva - alltså halvera halvan tills det bara finns 1 element
"Merge":a dem två halvorna - kolla på dina första "1 index arrays". Merge:a dem och lägg lägst åt höger.
Sedan stängds den rekursiven och du har nu 2 arrayer med 2 index. Merge:a dem och lägg lägst åt höger.
Återupprepa tills hela listen är sorterad & då stängs sista rekursiva metoden.
Tidskomplexitet N*log2(N) Alltså väldigt snabb, nackdelen är att den extra arrayen "aux" den behöver tar N extra
minne.
Den är också "stabil" - ändrar inte ordning mellan lika element

## Merge-delen ##
Merge-steget används för att slå ihop två redan sorterade delar till en enda sorterad helhet. Man håller två pekare,
en för varje del, som initialt pekar på det första elementet i respektive del. Vid varje steg jämförs elementen som
pekarna pekar på, och det minsta av dem placeras i en temporär resultatstruktur. Därefter flyttas pekaren fram i den
del där elementet togs ifrån.
Processen fortsätter tills alla element i minst en av delarna har behandlats. När detta sker kopieras de återstående elementen från den andra delen direkt till resultatet, eftersom de redan ligger i sorterad ordning. När alla element har slagits ihop ersätter resultatet de ursprungliga delarna.

Merge körs i linjär tid, O(n), där n är det totala antalet element som slås ihop, och kräver O(n) extra minne för
den temporära strukturen.

## Quicksort ##
Pick a partitioning item at random
Put smaller items left, larger items right
Do it all again recursively for left & right part
Tidskomplexitet
Bästa fall samma som mergesort N*log2(N)
Medelfall ungefär 1.39N*log2(N)
Fördelen är att den inte tar extrautrymme samt att i praktiken är den ofta snabbare för att jämförelserna är snabba
Den är inte "stabil"







 */