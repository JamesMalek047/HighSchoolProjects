import java.util.Scanner;
/**
 * 
 * Cette application est un petit jeu dans lequel l'utilisateur saisit des données sans fin (en raison de la boucle while), 
 * mais l'utilisateur finira par s'ennuyer. Ainsi, pour mettre fin à cet ennui, il suffit d'entrer le mot de sortie qui est -99.
 * @author James Malek
 * @version 19 avril 2022
 */

public class While
{
    public static void main( String[] args ) 
    {
        Scanner keyboard = new Scanner( System.in );
        String currentAnswer = "";
        String exitWord="out";
        String collector = "";

        System.out.println("Inscrit ici ce que vous voulez (si vous voulez arrêter, pitoner '" + exitWord + "') ");  
        currentAnswer=keyboard.nextLine(); 
        collector += currentAnswer;

        while (!currentAnswer.equalsIgnoreCase(exitWord))
        { 
            System.out.print("Quelque chose d'autre: ");
            currentAnswer=keyboard.nextLine();
            if (!currentAnswer.equalsIgnoreCase(exitWord))
            {
                collector += currentAnswer + " ";
            }
        }

        System.out.println("\nVoici l'intégalité de vos réponses: " + collector);
        System.out.println("\nBonne journée!");
        

    }   
}
