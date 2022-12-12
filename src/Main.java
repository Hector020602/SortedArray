public class Main {
    public static void main(String[] args) {

        SortedArray array = new SortedArray(10);
        array.put(2);
        array.put(7);
        array.put(3);
        array.put(5);
        array.put(1);

        System.out.println(array);
        System.out.println(array.existsElementRecursive(4));
        array.removeElementAt(4);
        System.out.println(array);






    }
}
