/*
## Sorterad array ##
Givet att den är sorterad kan vi söka ett element på O(log N) tid
Samt kan vi konstruera en sorterad array på O(N*Log N) tid

## dynamisk uppslagstabell ## (symboltabell : dictionary)
| Application | Key   |  value   |
=================================
| phone book  | name  | phonenbr |
| DNS         | URL   | IP adress|
| compiler    | variablename | type & value|

Python ~ Javascript
tbl = {}
tbl[7] = 'hello!'
tbl['seven'] = 'hello again!'

# Java #
I java får man bygga sin egna klass / algoritm för att uppnå samma resultat
För en osorterad array-implementation gäller linjär tid:
get : O(N)
put : O(N)
delete : O(N)

För en sorterad array-implementation gäller logaritmisk samt linjär tid
get : binärsök O(log N)
put : O(N)
delete : O(N)

Om vi iställer implementerar en länkad lista som tillåter binärsökning
så hamnar vi troligtvis vid ett binärt träd

## Binärt träd ##
Idén är att du gör ett träd sorterat på storleken av nyckeln med roten uppåt och löven nedåt
vänster trädet innehåller mindre nycklar & höger trädet större nycklar
# Terminologi #
* Noder.länkar = bågar (verticies)
* Rot
* Barn, föräldrar, syskon
* Löv = nod utan barn (två null-länkar)
* Deltråd (subträd)
* Höjd (från nedersta lövet), djup (från roten)
* Väg (path)
* Binäraträd, har högst 2 barn
* Inorder (vänster-höger-ordning) BDHCEAFG
* Efterföljare successor, föregångare predecessor
* Binärt sökträd (BTS): nycklar i vänster-höger-ordning har inorder ABCDEFG

Sökning i binärttröd, om mindre följ left, om större följ right, om lika = klart!
Worst case för ett binärt träd är om vi får en rak linje, i det fallet är trädet
inte bättre än en länkad lista

bästa är om det är fullständigt symmetriskt

BST |  Guarantee      |   average case      |
=============================================
    | search | insert |search hit | instert |
    |   N    |   N    | 1.39lg N  | 1.39lg N|



## Hashkodning ##
Grundidé: Använd nycekln som index i array, hitta värdet direkt.
* put(key, value) : a[key] = value

Problem: nyckeln inte lagom stort tal
* Använd hashfunktion
*put(key,value): a[hash(key)] = value
*get(key(: return a[hash(key)]

Problem: Kollision, olika strängar kan ge samma hashvärde
Lösningar:
*Chaining: låt a innehålla länkade listor
*Linear probing: lägg in i nästa position i a

Hashfunktion
Ex: Födelsedatum
* Dåligt : första tre siffrorna
* Bättre : sista tre siffrorna
* Bäst : ta hela födelsedatumet & summera alt XOR

Ex 2: Namn av något slag
* Bra? Värde baserat på hela strängen




 */