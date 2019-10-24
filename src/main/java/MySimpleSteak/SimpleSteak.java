package MySimpleSteak;

//import sun.invoke.empty.Empty;

import java.util.EmptyStackException;

public interface SimpleSteak {

    public boolean isEmpty();

    public int getSize();

    public void push(Item item);

    public Item peek() throws EmptyStackException;

    public Item pop() throws EmptyStackException;

}
