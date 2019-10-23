package MySimpleSteak;

import java.util.EmptyStackException;

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
        return (Item) wrappedStack.push(item);
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
