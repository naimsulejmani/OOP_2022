package cacttus.education.polymorphism;

import java.util.ArrayList;

public class StackCorrect {
    private ArrayList elements = new ArrayList();

    public void push(Object data) {
        elements.add(data);
    }

    public Object pop() {
        if (elements.size() > 0) {
            Object data = elements.get(elements.size() - 1);
            elements.remove(data);
            return data;
        }
        return null;
    }
}










