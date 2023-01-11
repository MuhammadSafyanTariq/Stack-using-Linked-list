class Node{
  int data;
  Node link;
}
class Stack{
  Node top =null;
  public boolean isEmpty() {
    if ( top==null){
      return true;
    }else{
      return false;
    }
  }

public void push(int data) {
  Node temp=new Node();
  temp. data=data;
  temp. link=top;
  top=temp;
}
  public void display() {
    Node temp=new Node() ;
    temp=top;
    while(temp!=null)
      {
        System. out. println(temp.data);
        temp=temp.link;
      }
  }
  public int pop() {
    int c=top.data;
    top=top.link;
    return c;
  }
  public int peek() {
    return top. data;
  }
}




class Main {
  public static void main(String[] args) {
    Stack st=new Stack() ;
    st. push (1);
    st. push (2);
    st. push (3);
    st. push (4);

System. out. println(st.pop());
    st. display () ;
    
  }
}