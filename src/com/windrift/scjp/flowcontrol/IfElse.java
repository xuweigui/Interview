package com.windrift.scjp.flowcontrol;

public class IfElse
{
    // will print "It's too confusing to tell what is true and what is false"
    public static void main(String[] args)
    {
        boolean a = true;

        boolean b = false;

        boolean c = true;

        if (a == true)

            if (b == true)

                if (c == true) System.out.println("Some things are true in this world");

                else System.out.println("Nothing is true in this world!");

            else if (a && (b = c)) System.out.println("It's too confusing to tell what is true and what is false");

            else System.out.println("Hey this won't compile");
    }
}
