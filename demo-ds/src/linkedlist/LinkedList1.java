package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
  String str;
  LinkedList1 node;

  public LinkedList1() {

  }

  public LinkedList1(String str) {
    this.str = str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public void setNode(LinkedList1 node) {
    this.node = node;
  }

  public LinkedList1 getNode() {
    return this.node;
  }

  public String getStr() {
    return this.str;
  }


  public static void main(String[] args) {
    LinkedList1 ll = new LinkedList1();
    ll.setStr("head");
    ll.setNode(new LinkedList1("body"));

    ll.getNode().setNode(new LinkedList1("tail"));


    LinkedList1 head = ll;
    String string = "";
    while (head.getNode() != null) { // bug
      string += head.getStr();
      head = head.getNode(); // object reference

    }

    //LinkedList

    List<String> l1 = new LinkedList<>();
    l1.add("abc");
    l1.add("abc");
    l1.add("abc");

    List<String> String = new ArrayList<>(); // poly, Interface 


  }
}
