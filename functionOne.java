import java.util.ArrayList;
import java.util.Scanner;
public class functionOne {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        ArrayList<String> l1 = new ArrayList<String>();
        System.out.print("Enter a list of numbers \n" + "divide each number by space " +
                "and input a letter or # to end the input:");
        while (!n.hasNext("#") && n.hasNextDouble()) {
            l1.add(n.next());
        }
        System.out.println("l1 is " + l1 + "\n");
        Scanner m = new Scanner(System.in);
        ArrayList<String> l2 = new ArrayList<String>();
        System.out.print("Enter a list of letters \n" + "divide each letter by space " +
                "and input # to end the input:");
        while (!m.hasNext("#") ) {
            l2.add(m.next());
        }
        System.out.println("l2 is " + l2 + "\n");

        l1.size();
        l2.size();

        combine(l1,l2);
    }
    public static ArrayList<String> combine(ArrayList<String> l1, ArrayList<String> l2){
        int length;
        ArrayList<String> shorter = new ArrayList<>();
        ArrayList<String> longer = new ArrayList<>();
        if (l1.size() < l2.size()) {
            length = l1.size();
            shorter = l1;
            longer = l2;
        } else {
            length = l2.size();
            shorter = l2;
            longer = l1;
        }
        ArrayList<String> res = new ArrayList<String>();
        int i = 0;
        for (i = 0; i < length; i++) {
            res.add(shorter.get(i));
            res.add(longer.get(i));
        }
        while (i < longer.size()) {
            res.add(longer.get(i));
            i++;
        }
        System.out.println("res is " + res);
        return res;
    }

}