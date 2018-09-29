package test;

public class Stack {
	  static int head = -1;
	  static String data[] = new String[1000];
	  public static String pop(){
	    if(head == -1){
	      return "Stack is empty";
	    }else{
	      head = head-1;
	      return "Top value removed";
	    }
	  }
	  public static void push(String value){
	    head=head+1;
	    data[head] = value;
	  }
	  public static String top(){
	     return data[head];
	  }
	  public static int count(){
	    return head+1;
	}
}
