package org.maven;

public class NewYearGift extends Sweet {
    int choco[];
    int candy[];
    int choco_weight, candy_weight;
    NewYearGift(int wch,int wcn ,int n, int ch[], int can[], String name[])
    {
        choco_weight = wch;
        candy_weight = wcn;
        totalChildren = n;
        int i;
        choco = new int[n];
        candy = new int[n];
        ChildrenName = new String[n];
        for(i=0;i<n;i++)
        {
            ChildrenName[i] = name[i];
            choco[i] = ch[i];
            candy[i]=can[i];
        }
    }

    void display()
    {
        int i;
        int n=totalChildren;
        for(i=0;i<n;i++)
        {
            int weight=(choco[i]*choco_weight)+(candy[i]*candy_weight);
            System.out.println(ChildrenName[i]+"'s gift's total weight is "+weight);
        }
    }
}
