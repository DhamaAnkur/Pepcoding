
// Linked List To Stack Adapter
// Link of Question ( https://www.pepcoding.com/resources/online-java-foundation/linked-lists/linkedlist-to-stack-adapter-official/ojquestion )

import java.io.*;
import java.util.*;

public class Main {

  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      return list.size();
    }

    void push(int val) {
      list.addFirst(val);
    }

    int pop() {
          if(list.size() == 0){
           System.out.println("Queue underflow");
           return -1;
        }
        
        else{
      return list.removeFirst();
    }
    
    }

    int top() {
          if(list.size() == 0){
           System.out.println("Queue underflow");
           return -1;
        }
        
        else{
      return list.getFirst();
    }
        
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}