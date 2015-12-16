import hsa.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorSample 
{
    static Console c;
    static ArrayList <String> al;
    static ListIterator li;
    static int pos = 0;
    
    public static void main(String[] args) 
    {
        c = new Console();
        
        al = new ArrayList();
        al.add("a");
        al.add("b");
        al.add("c");
        
        //make list iterator
        li = al.listIterator();
        
        showList();
        
        //move 1
        c.println("Move over item " + li.next());
        pos ++;
        showList();
        
        //move 2
        c.println("Move over item " + li.next());
        pos ++;
        showList();
        
        //move 3
        c.println("Remove object ");
        li.remove();
        pos --;
        showList();
        
        //move 4
        c.println("Adding b");
        li.add("b");
        pos ++;
        showList();
        
        //move 5
        c.println("Move over object " + li.next());
        pos ++;
        showList();
        
        //move 6
        c.println("Move back over " + li.previous());
        pos --;
        showList();
        
        //move 7
        c.println("Remove object ");
        li.remove();
        showList();
        
        //move 8
        c.println("Move back over " + li.previous());
        pos --;
        showList();
        
        //move 9
        c.println("Set last object seen to e");
        li.set("e");
        showList();
        
        //move 10
        c.println("Adding b");
        li.add("b");
        pos ++;
        showList();
        
        //move 11
        c.println("Adding c");
        li.add("c");
        pos ++;
        showList();
        
        //move 12
        //c.println("Remove object");
        //li.remove();
        
        //move 13
        c.println("Move over" + li.next());
        pos ++;
        showList();
        
        //move 14
        //c.println("Move over" + li.next());
        //pos ++;
        //showList();
        
        c.println("is there more? " + li.hasNext());
    }
    
    public static void showList()
    {
        for(int x = 0; x < al.size(); x ++)
        {
            if(x == pos) c.print("*");
            
            c.print(al.get(x));
        }
        
        if(pos == al.size()) c.print("*");
        c.println("");
    }
}
