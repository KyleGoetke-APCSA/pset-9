import java.util.ArrayList;

public class Exercises {

    /*
    HOW TO RUN THIS
    1) cd ~/???/pset-9/tests
    2) ./grademe.sh [exercise]
    */

    public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
        //input verification
        if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
            return false;
        }

        if ((a.get(0) == b.get(0)) || ( a.get(a.size()-1) == b.get(b.size()-1)) ) {
            return true;
        }

        return false;    // default return value to ensure compilation
    }

    public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
        // input verification
        ArrayList<String> emptyArrayList = new ArrayList();
        if (values == null || values.isEmpty() || n < 0 || values.size() < n) {
            return emptyArrayList;
        }

        // write your code here
        ArrayList<String> combinedArrayList = new ArrayList();
        int valueOfN = n;

        // go from first index until nth index
        for (int i = 0; i < n; i++) {
            combinedArrayList.add(values.get(i));
        }

        // go from length - nth index until last index
        for (int i = n; i < n * 2; i++) {
            combinedArrayList.add(values.get(values.size() - valueOfN));
            valueOfN--;
        }

        return combinedArrayList;

        // return null; default return value to ensure compilation
    }

    public int difference(ArrayList<Integer> numbers) {
        // write your code here

        return -1;        // default return value to ensure compilation
    }

    public double biggest(ArrayList<Double> numbers) {
        // write your code here

        return -1;        // default return value to ensure compilation
    }

    public ArrayList<String> middle(ArrayList<String> values) {
        // write your code here

        return null;    // default return value to ensure compilation
    }

    public boolean increasing(ArrayList<Integer> numbers) {
        // write your code here

        return false;    // default return value to ensure compilation
    }

    public boolean everywhere(ArrayList<Integer> numbers, int x) {
        // write your code here

        return false;    // default return value to ensure compilation
    }

    public boolean consecutive(ArrayList<Integer> numbers) {
        // write your code here

        return false;    // default return value to ensure compilation
    }

    public boolean balance(ArrayList<Integer> numbers) {
        // write your code here

        return false;    // default return value to ensure compilation
    }

    public int clumps(ArrayList<String> values) {
        // write your code here

        return -1;        // default return value to ensure compilation
    }
}
