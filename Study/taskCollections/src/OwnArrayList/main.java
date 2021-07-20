package OwnArrayList;

import java.util.List;

public class main {

    public static void main(String[] args) {
        ArrayListOwn<String> arrayListOwn = new ArrayListOwn<>();
        arrayListOwn.add("One");
        arrayListOwn.add("Two");
        arrayListOwn.add("Three");

        arrayListOwn.remove("One");
        arrayListOwn.remove(0);
        arrayListOwn.clear();
        arrayListOwn.removeAll(arrayListOwn);

        for (Object s:arrayListOwn){
            System.out.println(s);
        }

    }

}
