package org.example;

import java.util.Scanner;
import java.lang.*;

class credit implements Cloneable
{
    String name;
    Long cardno;
    String expdate;
    credit(String name,Long cardno,String expdate)
    {
        this.name=name;
        this.cardno=cardno;
        this.expdate=expdate;
    }
    boolean equals(Long validcardno)
    {
        return cardno.equals(validcardno);
    }
    credit cd()
    {
        try
        {
          return (credit) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            System.out.println("cloned");
            return this;
        }
    }
}

class creditcard
{
    public static void main(String[]args)
    {

        Scanner i = new Scanner(System.in);


        System.out.println("enter name");
        String name = i.next();
        System.out.println("enter card no");
        Long cardno = i.nextLong();
        System.out.println("enter exp date ");
        String expdate = i.next();

        Long validcardno=1234567890L;

        credit ob1 = new credit(name,cardno,expdate);
        credit ob2 = ob1.cd();

        System.out.println(ob2.equals(validcardno));
        i.close();


    }
}
