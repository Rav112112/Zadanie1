import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram{

     public static void main(String []args){
        
        System.out.println("Program sprawdzajacy czy slowa sa anagramami.");
        
        // wprowadzanie slow z reki
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Wprowadz pierwsze slowo: ");
        String str1 = sc1.nextLine(); 
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Wprowadz drugie slowo: ");
        String str2 = sc2.nextLine();
        
        // wprowadzanie slow odgornie
        // String str3 = "pasterka"; // pierwsze slowo
        // String str4 = "skarpeta"; // drugie slowo
        
        if (str1.length() == str2.length() ){
            
            char charArray1[] = str1.toCharArray();
            Arrays.sort(charArray1);
            
            char charArray2[] = str2.toCharArray();
            Arrays.sort(charArray2);

            int i = 0; // warunek stopu
            int j = 0; // ilosc podobnych znakow
            while (i < charArray1.length) {
                if (charArray1[i] == charArray2[i]){
                    j++;
                }
                i++;
            }
            
            // spradzanie czy ilosc znakow zgadza sie z iloscia podobnych znakow
            if (i == j){
                System.out.println(str1 + " i " + str2 + " sa anagramami");
            }else {
                System.out.println(str1 + " i " + str2 + " nie sa anagramami");
            }
            
        }else{
            System.out.println(str1 + " i " + str2 + " nie sa anagramami");
        }
        
        
     }
}