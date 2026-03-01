/*
## Symboltabell fördjupning (dynamisk uppslagstabell fördjupning) ##
Säg att di har ett stort rutnät med rutor 0 till B-1 och 0 till H-1 (B = bredd, H = höjd)
på ruta (2,3) sker en händelse kallad Viktig som ska sparas. Alltså:
händelse[2][3] = Viktig
Låt 2,3 vara en nyckel. händelse.put(2*B+3,"Viktig")
För att få reda på vad som ligger i ruten använder vi händelse.get(2*3B+3)
Detta är särskilt fördelsaktigt om bara ett fåtal rutor har händelser då vi kan spara nyckeln
för enbart rutorna som har händelser istället för att spara hela 2d arrayn.

# Kollision #
hash("it") = 3
hash("times") = 3
Här har vi kollision, två värde som ger samma nyckel.
# Lösningar #
Chaining: här låter vi dem dela plats men vi gör det genom att spara dem i en länkad lista
Linear probing: lägg in i nästa lediga position

## Hashfunktion ##
Detta är i princip en metod för att beräkna ett förutsägbart värde för något, exempelvis att hash("it") alltid = 3
Det finns olika objekt för att åstakomma detta
int hashCode()
boolean equals(Object that)
Ett absolut krav är att om x.equals(y) så MÅSTE x.hashCode() == y.hashCode()
Inget krav men är önskevärt att om !x.equals(y) så ska helst  x.hashCode() != y.hashCode()

(sidoförklaring för hur Double lagras)
Du lagrar värde siffror och exponent i vars en del av minnet
Exempelvis 3,9676 * 10^-12 vilket då såklart lagras som bitar.

## Fyllnadsgrad ##
Om vi har en hashtabell a med storlek M (a.length() = M) och vi stoppar in N element. a.put(N) då är fyllnadsgraden
alfa = N/M.
# Chaining #
?
# Linear probing #
låt alfa = 1/2









 */
