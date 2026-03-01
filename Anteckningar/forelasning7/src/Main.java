/*
## Ett problems tidskomplexitet ##
* Ävre gräns: Ges ofta av en algoritm. "Kolla! En alrogirtm som löser problemet på T(N)"
Exempelvis, problemet: hitta ett värde i en osorterad array på längden N. Det går inte att lösa på annan än
N tid, alltså är det dess övregräns.

Undre gräns: Måste bevisas för **alla möjliga algoritmer**
Snabbaste sättet att lösa problemet på

Optimal gräns: Algoritmens övregräns = algoritmens undregräns

## Tidskomplexitet för sortering med parvis jämförelser
Beslutsträd med jämförelser för att hitta vilken av ordningarna för 3 element som är rätt -
- Detta visar att för N element finns det N! sätt att ordna dem på. Alltså N! löv i trädet varav höjden på
trädet är antalet jämförelser man behöver göra för att hitta rätt löv.
Största möjliga antalet noder på ett träd med djup = d är 2^d
Största möjliga antalet null-noder på höjden h = 2^h.
h >= lg(N!) ~ N* lg(N) enlits Stirlings formel.
Slutsats: varje algoritm gör minst N*log(N)
*Övregräns N lg(N) (ges av mergesort)
*undre gräns ~N*lg(N)
*optimal algoritm: mergesort.


## Prioritetskö ##
Bygg för N element, sätt in ett i taget, ta ut största
void insert(Key v) -> insert a key into priority queue
Key max() -> return the largest key
Key delMax() -> return and remove the largest key

Minsta istället för största  är lätt att fixa, kan negera nycklarna när man sätter in dem
alternativt vända på alla jämförelser, "<" -->  ">"
Använder vi istället **binär heap** så kan vi utföra våra metoder snabbare eftersom det erbjuder en
förutsägbar model.


## heap (heap-ordnat träd) ##
För ett komplett binärt träd gäller:
Största möjliga antal noder i ett träd med höjd h är 2^(h+1) -1
h = lg(N)
Största nyckeln ligger i roten
barnen är alltid mindre än än föräldern.
Detta gör det värdelöst för sökning med väldigt bra för en prioritetskö.
För att hitta barnet till en nod e N letar du efter nod 2N och nod 2N+1
Uppåt förälder från nod N = N/2 avrundat nedåt.
Om en nod bryter heap-ordningen, alltså har större nyckel än föräldern så byter vi plats på dem. - Kallas "Swim"
Detta används vid tillägg av element
Detta kan upprepas flera gången vid varje insert om behöves och kan ta högst O(Lg(N))
Om en nod är mindre än dess barn byter vi plats på föräldern och det största barnet. . Kallas "sink"
Detta används när vi tar bort element.
Detta kan upprepas flera gången vid varje insert om behöves och kan ta högst O(lg(N))

När man tar bort det största elementet tar vi bort roten och flyttar vårt sista element till nya roten.
Däremot kan det betyda att roten är mindre än sina barn, då tvingas vi använda sink för att ordna trädet.
Detta tar O(lg(N)) tid

## Heapbyggtid ##
På djup h -> N/"^[k+1) noder kan kräva 2k jämförelser
Totalt (SUMMA TECKEN) 2k/2^[k+1] jämförelser = 2 alltså 2N linjär tid.



 */
