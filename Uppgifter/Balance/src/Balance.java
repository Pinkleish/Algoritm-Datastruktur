import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();          // Sätt s till strängen med parenteser.
        // Första tecknet är s[0], s[s.Length-1] det sista.
        char[] arr = s.toCharArray();
        boolean error = false;




        Stack<Character> stack = new Stack<Character>();
        // Skapa en stack.
        // Det är inte säkert att man vill ha just en stack
        // av Character, det beror på hur algorimen
        // implementeras, men en stack behövs.
        // Gör push med stack.push(…), pop med stack.pop()
        // Kolla om stacken är tom med ”stack.isEmpty()”.
        // Fyll i själva algoritmen för att kolla s här.

        // Loopa genom listan
        for (int i = 0; i < s.length();i++){
            if (arr[i] == '(' || arr[i] == '['){
                stack.push(arr[i]);
            }

            // Försöker stänga rund parantes
            else if(arr[i] == ')'){
               if (stack.isEmpty()){
                   error = true;
                }
               else {
                   if (stack.pop() != '('){
                       error = true;
                   }
               }
            }

            // Försöker stänga hakparantes
            else if(arr[i] == ']'){
                if (stack.isEmpty()){
                    error = true;
                }
                else {
                    if (stack.pop() != '['){
                        error = true;
                    }
                }
            }

            // Annan karaktär har angets
            else{
                error = true;
            }
        }

        // Om inget fel och listan är tom
        if (!error && stack.isEmpty()){
            System.out.println(1);
        }
        // Ovan stämmer ej
        else{
            System.out.println(0);
        }

        // Använd System.out.println(…) för att skriva ut antingen 0 eller 1 som slutresultat.
    }
}