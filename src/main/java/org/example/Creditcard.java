package org.example;

import java.util.Scanner;


class Creditcard
{
    Logger l = Logger.getLogger("kawin");
    public static void main(String[]args)
    {

        Scanner i = new Scanner(System.in);


        l.info("enter name");
        String name = i.next();
        l.info("enter card no");
        Long cardno = i.nextLong();
        l.info("enter exp date ");
        String expdate = i.next();

        Long validcardno=1234567890L;

        credit ob1 = new credit(name,cardno,expdate);
        credit ob2 = ob1.cd();

        l.info(ob2.equals(validcardno));
        i.close();


    }
}
