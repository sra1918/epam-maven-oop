package org.maven;
import java.util.*;
public class App 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int no_of_children = sc.nextInt();
        int choco_weight=sc.nextInt();
        int candy_weight = sc.nextInt();

        String name[]=new String[no_of_children];
        int chocolates[]=new int[no_of_children];
        int candies[]=new int[no_of_children];
        int i;
        for(i=0;i<no_of_children;i++)
        {
            name[i] = sc.next();
            chocolates[i] = sc.nextInt();
            candies[i] = sc.nextInt();
        }

        Chocolate ch = new Chocolate(choco_weight, no_of_children, chocolates, name);
        Candy can = new Candy(candy_weight, no_of_children, candies, name);
        NewYearGift gift = new NewYearGift(choco_weight, candy_weight, no_of_children, chocolates, candies, name);

        ch.display();
        can.display();
        gift.display();
    }
}
