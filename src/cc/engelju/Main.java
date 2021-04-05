package cc.engelju;

public class Main {
  public static void main(String[] args){

    System.out.println("***** Test the List ***********************************");

    SinglyLinkedList<Integer> s1 = new SinglyLinkedList<Integer>();

    s1.insertFirst(1);
    s1.insertFirst(2);
    s1.insertFirst(3);
    s1.insertFirst(4);
    System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");

    s1.insertAfter(9, 0);
    System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");

    System.out.println(s1.getAt(3));
    System.out.println(s1.getAt(1));

    System.out.println(s1.getAt(0));
    System.out.println(s1.getFirst());

    //s1.remove(2);
    //System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");

    //s1.removeAll();
    //System.out.println("S1: " + s1 + "(" + s1.size() + " Elemente)");

    //SinglyLinkedList<Integer> s2 = new SinglyLinkedList<Integer>(s1);
    //System.out.println("S2: " + s2 + "(" + s2.size() + " Elemente)");

    //s2.removeFirst();
    //System.out.println("S2: " + s2 + "(" + s2.size() + " Elemente)");
  }

}
