package Core_Java_Projects;
import java.util.Scanner;

public class E_Voting_System {
    // Political Parties in india
    float bharatiya_janata_Party;
    float Nationalist_Congress_Party;
    float Bahujan_Samaj_Party;
    float Communist_Party_of_India;

    //function to calculate result
    static void parties(int Total_Voters,int [] array){
        E_Voting_System EVS_obj = new E_Voting_System();
        float Voting_percent = 100/Total_Voters;

        // object calling here
        EVS_obj.bharatiya_janata_Party = EVS_obj.Nationalist_Congress_Party = EVS_obj.Bahujan_Samaj_Party = EVS_obj.Communist_Party_of_India = 0;

        // While loop using here
        int i = 0;
        while(i < Total_Voters){
            switch(array[i]){
                case 1:
                    (EVS_obj.bharatiya_janata_Party)++;
                    break;
                case 2:
                    (EVS_obj.Nationalist_Congress_Party)++;
                    break;
                case 3:
                    (EVS_obj.Bahujan_Samaj_Party)++;
                    break;
                case 4:
                    (EVS_obj.Communist_Party_of_India)++;
                    break;
                default:
                    System.out.println("Please Enter Correct Format");
                    break;
            }
            i++;
        }
        System.out.println(" ");
        System.out.println("Total Number of voting rank");
        System.out.println("bharatiya_janata_Party \t"+(EVS_obj.bharatiya_janata_Party)*Voting_percent+"%");
        System.out.println("Nationalist_Congress_Party \t"+(EVS_obj.Nationalist_Congress_Party)*Voting_percent+"%");
        System.out.println("Bahujan_Samaj_Party \t"+(EVS_obj.Bahujan_Samaj_Party)+Voting_percent+"%");
        System.out.println("Communist_Party_of_India \t"+(EVS_obj.Communist_Party_of_India)+Voting_percent+"%");
    }
        // main body
    public static void main(String[] args) {
        System.out.println("Digital Voting System");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total number of Voter :");
        int Total_Voter = sc.nextInt();
        int array[] = new int[Total_Voter];
        System.out.println("--------------------------");
        System.out.println("Choose your party for voting");
        int i = 0;
        while(i < Total_Voter){
            System.out.println("Press the button");
            System.out.println("bharatiya_janata_Party ( BJP)           : Press 1");
            System.out.println("Nationalist_Congress_Party (NCP)        : Press 2");
            System.out.println("Bahujan_Samaj_Party (BSP)               : Press 3");
            System.out.println("Communist_Party_of_India (CPI)          : Press 4");
            System.out.println("------------------------");
            array[i] =sc.nextInt();
            i++;
        }

        //Main function
        parties(Total_Voter,array);

    }
}
