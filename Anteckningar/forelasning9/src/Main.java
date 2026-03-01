/*

##Varför använda BST om hastabell tar konstant tid? ##
*Kunna upprätthålla ordning mellan element effektivt -
Operationerna min, max, floor, ceiling, select, rank + operationer på intervall av nycklar

*... genom att använda parvis jämförelse -
Kanske måste man hantera nyckelobjekt där man inte kommer åt något värde som kan vara input till hash

## Ordnad-symboltabell-operationer ##
Eftersom de är ordnade på keys så kan man använda operationer som t.ex min() för att hitta den med lägst värde för key
Så om key är t.ex tid så kan du hitta det som händer vid första tillfället.
I ett BST kan du åstakomma detta genom att gå så långt till vänster som möjligt.
Floor & ceiling hittar i exemplet ovan närmsta tid över angiven tid / under.
I BST är det lite svårare, där är ceiling ett steg åt höger följt av det mest åt vänster vice versa för floor.
För att implementera rank() & select() så måste varje delträds rot innehålla ett värde för antalet noder i delträdet
Så att alla löv innehåller 1 och roten innehåller mängded noder.

Vid borttagning av en nod i BST är det simpelt om noden som tas bort bara har 1 barn, ta bara bort noden och sätt
koppling från nodens förälder till nodens barn. Om den däremot har 2 barn så gör man ceiling()
(alltså 1 steg höger följt av maximalt steg till vänster) på noden och ersätter noden med det man finner.

## 2-3 träd ##
Varje nod är antingen 2-node eller 3-node. 2-node följer BST princip men 3-nod innehåller 2 värde (a,e) var
vänster innebär <a, vänster innebär >e och mitten innebär mellan a & e.

## Left-leaning red-black BSTs ##
Red links "glue" nodes within a 3 node. Black links connect 2-nodes & 3-nodes.
2 röda länkar kan inte gränsa varandra eftersom röd länk innebär att de kopplade värdena ligger i en "3-node"
    a   ==    b    (där == är röd länk)
   /    |      \
  x<a  a<x<b    x>b
Alla väger från rot till null-länk har lika många svarta länkar som ett 2-3 träd
Vid sökning i röd-svart träd gör man likadant som i ett BST, men insättningarna är olika.










 */