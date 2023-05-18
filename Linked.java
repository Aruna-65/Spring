import java.util.*;
class Linked{
    public static void main(String args[]){

        List<String> al=new ArrayList<String>();//creating arraylist
        al.add("Aru");//adding object in arraylist
        al.add("Angel");
        al.add("Juliet");
        al.add("Raji");

        List<String> al2=new LinkedList<String>();//creating linkedlist
        al2.add("Adada");//adding object in linkedlist
        al2.add("asa");
        al2.add("Tuji");
        al2.add("Brina");

        System.out.println("arraylist: "+al);
        System.out.println("linkedlist: "+al2);
    }
}
