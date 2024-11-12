package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1P2 
{
    public static void main(String[] args) 
    {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bruce");
        names.add("Carol");
        names.add("David");
        names.add("Ellen");

        ArrayList<String> switchedNames = new ArrayList<>();

        for (String name : names) 
        {
            if (name.length() > 1) 
            {
                String newName = name.charAt(name.length() - 1) + name.substring(1, name.length() - 1) + name.charAt(0);
                switchedNames.add(newName);
            }
            else 
            {
                switchedNames.add(name);
            }
        }

        System.out.println("Names = " + names);
        System.out.println("Names (switched) = " + switchedNames);
    }
}
