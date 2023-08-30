package ClassX;

import java.io.*;
class GG
{
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    int target = 0;
    String name = new String();
    public void BatF()throws IOException
    {
        int over = 0;
        int ball = 1;
        int ipt;
        int com;
        
        System.out.println("You chose to Bat!");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        while(true)
        {
            System.out.println("Over: " + over + "  Ball(s): " + ball);
            System.out.print("Enter Run: ");
            ipt = Integer.parseInt(br.readLine());
            if(ipt < 1 || ipt > 10)
             {
                 System.out.print("\fSorry! You have tried to cheat");
                 System.exit(0);
             }
            com = (int)Math.random()*10 + 1;
            System.out.println("Computer scored: " + com);
            target += ipt;
            ball++;
            System.out.println("Your total runs: " + target);
            if(com == ipt)
            {
                System.out.println("You're OUUUUUTTT!!!");
                break;
            }
            if(ball > 6)
            {
                ball = 1;
                over++;
            }
            if(over == 5)
            {  
               System.out.println("========================================================================");
               System.out.println("========================================================================");
               System.out.print("Balls over!!");
               break;
            }
            System.out.println("========================================================================");
        }
    }
    
    public void BatS(int t)throws IOException
    {
        int over = 0;
        int ball = 1;
        int ipt;
        int com;
        target = 0;
        System.out.println("Target: " + t);  
        System.out.println("Your turn to Bat!");
        System.out.println("========================================================================");
        System.out.println("========================================================================");
        while(true)
        {
            System.out.println("Over: " + over + "  Ball(s): " + ball);
            System.out.print("Enter Run: ");
            ipt = Integer.parseInt(br.readLine());
            if(ipt < 1 || ipt > 10)
             {
                 System.out.print("\fSorry! You have tried to cheat");
                 break;
             }
            com = (int)Math.random()*10 + 1;
            System.out.println("Computer scored: " + com);
            target += com;
            ball++;
            System.out.println("Computer's runs: " + target);
            if(com == ipt)
            {
                System.out.println("========================================================================");
                System.out.println("Howzatt! Computer is OUUUUUTTT!!!");
                System.out.println("Congratulutions! " + name + ", you have defeated the Almighty Computer!! ;)"); 
                break;
            }
            if(ball > 6)
            {
                ball = 1;
                over++;
            }
            if(over == 5)
            {  
               System.out.println("========================================================================");
               System.out.println("========================================================================");
               System.out.print("Balls over!!");
               System.out.println("Sorry, " + name + ", you have been defeated by Almighty Computer!! :("); 
               break;
            }
            if(target > t)
            System.out.println("========================================================================");
        }
    }
}