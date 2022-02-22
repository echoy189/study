package java_base.test23._4;

public class A {
    public static void main(String[] args) {

        Pair<Double> cell = new Pair<>();
        cell.setValue(4.5);
        Pair<String>[] arr1 = new Pair[10];
        Object[] arr2 = arr1;
        arr2[0] = cell;
        String s = arr1[0].getValue();


    }
}

class Pair<T> {
    private T value;
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
}