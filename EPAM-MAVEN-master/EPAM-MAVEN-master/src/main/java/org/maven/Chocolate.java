package org.maven;

public class Chocolate extends Sweet {
    int no_of_choco[];
    Chocolate(int w,int n, int no[], String name[])
    {
        weight = w;
        totalChildren = n;
        int i;
        no_of_choco = new int[n];
        ChildrenName = new String[n];
        for(i=0;i<n;i++)
        {
            ChildrenName[i] = name[i];
            no_of_choco[i] = no[i];
        }
    }

    int totalChocolates()
    {
        int i,sum=0;
        for(i=0;i<no_of_choco.length;i++)
        {
            sum=sum+no_of_choco[i];
        }
        return sum;
    }

    int totalWeight()
    {
        int total=totalChocolates();
        return weight*total;
    }
    int get_max_choco()
    {
        int i,max=no_of_choco[0];
        for(i=1;i<no_of_choco.length;i++)
        {
            if(no_of_choco[i]>max)
            {
                max=no_of_choco[i];
            }
        }
        return max;
    }

    String getName()
    {
        int i,max=no_of_choco[0];
        String name=ChildrenName[0];
        for(i=1;i<no_of_choco.length;i++)
        {
            if(no_of_choco[i]>max)
            {
                max=no_of_choco[i];
                name=ChildrenName[i];
            }
        }
        return name;
    }

    void sort_on_choco()
    {
        int i,j;
        int n=no_of_choco.length;
        for(i=1;i<n;i++)
        {
            for(j=0;j<n-i;j++)
            {
                if(no_of_choco[j]<no_of_choco[j+1])
                {
                    int temp=no_of_choco[j];
                    no_of_choco[j]=no_of_choco[j+1];
                    no_of_choco[j+1]=temp;
                    String str=ChildrenName[j];
                    ChildrenName[j]=ChildrenName[j+1];
                    ChildrenName[j+1]=str;
                }
            }
        }
        System.out.println("After sorting acc to number of chocolates: ");
        for(i=0;i<n;i++)
        {
            System.out.println(ChildrenName[i]+" got "+no_of_choco[i]+" chocolates");
        }
    }
    void display()
    {
        int i;
        for(i=0;i<totalChildren;i++)
        {
            System.out.println(ChildrenName[i]+" got "+no_of_choco[i]+" chocolates");
        }
        System.out.println("Total chocolates: "+ totalChocolates());
        System.out.println("Total weight of chocolates: "+totalWeight());
        System.out.println(getName()+" got maximum number of chocolates , i.e, "+get_max_choco());
        sort_on_choco();
    }
}
