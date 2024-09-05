import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int Year = cin.nextInt();
        cin.nextLine();
        System.out.print("Enter the Genre: ");
        String Genre = cin.nextLine();
        System.out.print("Enter the Album: ");
        String Album = cin.nextLine();
        System.out.print("Enter the Song Title: ");
        String Title = cin.nextLine();
        System.out.print("Enter the Artist: ");
        String Artist = cin.nextLine();
    
        cin.close();

        System.out.println("--------------------");
        System.out.println("SONG DETAILS");
        System.out.println("--------------------");
        
        System.out.println("Year Released: " + Year);
        System.out.println("Genre: " + Genre);
        System.out.println("Album: " + Album);
        System.out.println("Title: " + Title);
        System.out.println("Artist: " + Artist);

        

          
    }

}
