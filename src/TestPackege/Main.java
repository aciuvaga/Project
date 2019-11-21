package TestPackege;

import java.util.ArrayList;

class GenericsDemo<T> {
    T values;

    public void show() {
        System.out.println(values.getClass().getName());

    }

    public void setValue(T values) {
        this.values = values;
    }

    public T getValues(){
        return values;
    }
    public void demo(ArrayList <? super T> obj) {
        System.out.println(1);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        GenericsDemo<Integer> obj = new GenericsDemo<>();
        //obj.show();
        obj.demo(new ArrayList<Number>());
Class;

    }
}
