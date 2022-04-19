package cacttus.education.polymorphism;

import java.util.ArrayList;

//WRONG -> Stack is not arraylist, and should never extend arraylist
public class StackWrong extends ArrayList {
    public void push(Object data) {
        this.add(data);
    }

    public Object pop() {
        if (this.size() > 0) {
            Object data = this.get(this.size() - 1);
            this.remove(data);
            return data;
        }
        return null;
    }
}

