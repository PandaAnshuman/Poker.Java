import java.util.Scanner;
public class Pokerito {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lets Play Pokerito Game using java. Type Anything When You Are Ready !!");
        sc.nextLine();
        System.out.println("Its Like Poker Buta lot Simpler \n");
        System.out.println ("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!");
        System.out.println("Ready ? type Anything if you Are . \n");
        sc.nextLine();


        String yourcard = randomCard();
        String compcard = randomCard();


        System.out.println("Here Is Your Card :");
        System.out.println(yourcard);
        System.out.println("\n");
        System.out.println("Here Is Computer's Card : ");
        System.out.println(compcard);


        int yourMatch = 0;
        int compMatch = 0;

        System.out.println("Now The Dealer will Draw Five Cards .Press Enter To Continue ");
        sc.nextLine();
        for(int i = 1 ; i<6 ; i++){
            sc.nextLine();
            String draw = randomCard();
            System.out.println("Card " + i);
            System.out.println(draw); 
        
             if(yourcard.equals(draw)){
              yourMatch++;
        }if(compcard.equals(draw)){
            compMatch++;
        }
    }
    System.out.println("Your Matches : " + yourMatch );
    System.out.println("Computer's Match : " + compMatch);

sc.close();



    if(yourMatch > compMatch ){
        System.out.println("Wow! You Win .");
    }else if ( compMatch>yourMatch ){
        System.out.println(" Sorry !! Computer Wins ");
    }else{
        System.out.println("Everyone Wins !!");

    }
    }

    public static String randomCard(){
        double random = Math.random()*13;
        random+=1;
        int randomNum = (int)random;

        switch(randomNum){

            case 1 : return     "   _____\n"+
                                "  |A _  |\n"+ 
                                "  | ( ) |\n"+
                                "  |(_'_)|\n"+
                                "  |  |  |\n"+
                                "  |____V|\n";
   
             
            case 2 : return    "   _____\n"+              
                                "  |2    |\n"+ 
                                "  |  o  |\n"+
                                "  |     |\n"+
                                "  |  o  |\n"+
                                "  |____Z|\n";
           
            case 3 : return    "   _____\n" +
                                "  |3    |\n"+
                                "  | o o |\n"+
                                "  |     |\n"+
                                "  |  o  |\n"+
                                "  |____E|\n";
            
            case 4 : return     "   _____\n" +
                                "  |4    |\n"+
                                "  | o o |\n"+
                                "  |     |\n"+
                                "  | o o |\n"+
                                "  |____h|\n";
            case 5 : return     "   _____ \n" +
                                "  |5    |\n" +
                                "  | o o |\n" +
                                "  |  o  |\n" +
                                "  | o o |\n" +
                                "  |____S|\n";
            case 6 : return     "   _____ \n" +
                                "  |6    |\n" +
                                "  | o o |\n" +
                                "  | o o |\n" +
                                "  | o o |\n" +
                                "  |____6|\n";

            case 7 : return     "   _____ \n" +
                                "  |7    |\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |____7|\n";
                    
            case 8 : return     "   _____ \n" +
                                "  |8    |\n" +
                                "  |o o o|\n" +
                                "  | o o |\n" +
                                "  |o o o|\n" +
                                "  |____8|\n";
     
            case 9 : return     "   _____ \n" +
                                "  |9    |\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |____9|\n";

            case 10 : return    "   _____ \n" +
                                "  |10  o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |o o o|\n" +
                                "  |___10|\n";
            case 11 : return  
                                "   _____\n" +
                                "  |J  ww|\n"+ 
                                "  | o {)|\n"+ 
                                "  |o o% |\n"+ 
                                "  | | % |\n"+ 
                                "  |__%%[|\n";
            
            case 12 : return    "   _____\n" +
                                "  |Q  ww|\n"+ 
                                "  | o {(|\n"+ 
                                "  |o o%%|\n"+ 
                                "  | |%%%|\n"+ 
                                "  |_%%%O|\n";
      
            case 13 : return    "   _____\n" +
                                "  |K  WW|\n"+ 
                                "  | o {)|\n"+ 
                                "  |o o%%|\n"+ 
                                "  | |%%%|\n"+ 
                                "  |_%%%>|\n";
            default : return     "This Should Never Get called" ;




        }
        
    }











}
