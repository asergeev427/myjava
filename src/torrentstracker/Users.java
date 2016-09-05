
package torrentstracker;

import java.util.ArrayList;

public class Users {

    public static String addUser(String name) {
        ArrayList<String> al = new ArrayList<String>();
        al.add(name);
        System.out.println(al);
        return name;
    }

    /*public static String removeUser(String name){

        al.remove(name);
        return name;
    }

    */
}