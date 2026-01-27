/*
Kostnad för array-indexering
arry[5] = 42;
En array är en minnescell
Vad CPU:n gör när man letar efter ett visst index är att sätta M (ett "register") till minnesaddressen för arr och addera 5 till M
Lägg till 42 i minnesadressen M pekar på. Detta innebär att array access tar en konstant tid C istället för N tid.

int count = 0
for (int i = 0; i < N; i++)
    if (a[i] == 0)
        count++;

assignment statement : frequency 2
less than compare : frequency N +1 -> det blir sant N gånger & falskt 1 gång
equal to compare : frequency N
array access : frequency N
increment : frequency N to 2N -> man vet inte hur ofta count++ körs

Ta fram ett uttryck för T(N) med tidskonstanter för olika operationer


int count = 0;
for (int i= 0; i < N; i++)
    for int j= i+1; j < N; j++)
        if (a[i] + a[j] == 0)
            count++;

assignment statement : frequency N + 2
equal to compare : frequency (1/2)N(N-1)) eller N choose 2 -> j börjar 1 över i vilket gör att den itererar mindre för varje loop
less than compare : frequency 1/2(N+1)(N+2)
array access : frequency N(N-1)
increment : frequency 1/2N(N-1) to N(N-1)

Ta fram ett uttryck för T(N) med tidskonstanter för olika operationer
Blir komplicerat, vi vill ju förenkla och ge ett enkelt mått

Välj ut något som är en dominant operation, det är inte super noga egentligen men man bör välja något i innersta loopen
Vi väljer array access som konstnadsmodell ( en dominerande operation) för att den körs troligen mest, N^2 - N
T(N) = N(N-1) array accesses = N^2 - N array accesses

Förenklning : ignorera termer av lägre grad då de blir försumbara vid stora N, t.ex N-> oändligheten
Då använder man det ovanliga måttet tilde ~
Ex: N^2 - N ~ N^2

Förenkling : ignorera konstanta faktorer
t.ex 1/6N^3 sägs ha "order of growth N^3" = 0(N^3)
Detta är för att 1/6N^3 växer snabbare än 1000N^2 när N-> oändligheten
f(N) är f(0) om (lim N-> oändligheten) f(N)/f(0) = någon konstant

Förenkling : prata bara om övre gränser
är =O(N^3) = går mot *högst* proportionell mot N^3
f(N) är O(g(N)) betyder att:
Det finns konstanter N0 och k så att f(N) <= k*g(N) för alla N > N0
Om f(N) är 0(g(N)) så gäller förstås också f(N) är O(g(N)) men inte omvänt alltså => inte <=>


Ta exempelt O(N^2)
Är O(10N^2) sämre?
är O(0,5N^2) bättre?
Vid O(N) är konstanten försumbar vilket innebär att alla 3 är funktionellt matematiskt identiska


 */