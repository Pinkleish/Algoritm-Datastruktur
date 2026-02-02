import java.util.Scanner;
import java.util.Stack;

public class Balance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();          // Sätt s till strängen med parenteser.
        // Första tecknet är s[0], s[s.Length-1] det sista.
        char[] arr = s.toCharArray();
        int results = -1;




        Stack<Character> stack = new Stack<Character>();             // Skapa en stack.
        // Det är inte säkert att man vill ha just en stack
        // av Character, det beror på hur algorimen
        // implementeras, men en stack behövs.
        // Gör push med stack.push(…), pop med stack.pop()
        // Kolla om stacken är tom med ”stack.isEmpty()”.

        // Fyll i själva algoritmen för att kolla s här.
        if (arr[0] == ')' || arr[0] == ']'){
            results = 0;
        }
        else {
            stack.push(arr[0]);
            for (int i = 1; i < s.length(); i++) {
                if (arr[i] == '(' || arr[i] == '['){
                    stack.push(arr[i]);
                }
                else{
                    stack.pop();
                }
            }
            System.out.println(stack.isEmpty());

        }
        // Använd System.out.println(…) för att skriva ut antingen 0 eller 1 som slutresultat.
    }
}