import java.util.Scanner;
/**
 * 
 * Il s'agit de la même application que While.java, avec une différence dans l'exécution de la boucle while. 
 * Nous utilisons true pour remplacer !...equalsIgnoreCase(""). 
 * C'est une méthode beaucoup plus simple pour manipuler la boucle while. 
 * @author James Malek
 * @version 19 avril 2022
 */

public class Break
{
    public static void main( String[] args ) 
    {
        Scanner keyboard = new Scanner( System.in );
        String currentAnswer = "";
        String exitWord="out";
        String collector = "";

        System.out.println("Inscrit ici ce que vous voulez (si vous voulez arrêter, pitoner '" + exitWord + "'') ");  
        currentAnswer=keyboard.nextLine(); 
        collector += currentAnswer;

        while (true)
        { 
            System.out.print("Quelque chose d'autre: ");
            currentAnswer=keyboard.nextLine();
            collector += currentAnswer + " ";
            if (currentAnswer.equalsIgnoreCase(exitWord))
            break;
        }
        
        System.out.println("\nVoici l'intégalité de vos réponses: " + collector);
        System.out.println("\nBonne journée!");

    }   
} 
