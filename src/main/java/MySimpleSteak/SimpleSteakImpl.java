package MySimpleSteak;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * Created by VGTO on 24/10/2k19
 *
 *  pouet pouet #3
 *  mdr c'est des barres
 */

public class SimpleSteakImpl implements SimpleSteak{

    Stack<Object> wrappedStack = new Stack<Object>();


    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    public int getSize() {
        return wrappedStack.size();
    }

    public void push(Item item) {
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
