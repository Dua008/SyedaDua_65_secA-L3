// 65 Syeda Dua Zehra EB26210006130_5679340
import java.util.HashMap;

public class practice {

    public static void main(String[] args) {

        // Original data
        String[][] salesData = {
            {"Product D", "110"},
            {"Product D", "120"},
            {"Product C", "72"},
            {"Product C", "48"},
            {"Product D", "35"},
            {"Product D", "75"},
            {"Product B", "285"},
            {"Product A", "230"},
            {"Product A", "100"},
            {"Product A", "130"},
            {"Product B", "330"},
            {"Product B", "180"}
        };

        // HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        // Loop through all rows
        for (int i = 0; i < salesData.length; i++) {

            // Product name
            String product = salesData[i][0];

            // Amount
            int amount = Integer.parseInt(salesData[i][1]);

            // If product already exists
            if (hm.containsKey(product)) {

                int oldAmount = hm.get(product);

                hm.put(product, oldAmount + amount);

            } else {

                // First time product
                hm.put(product, amount);
            }
        }

        // Print totals
        System.out.println("Product Totals:");

        for (String product : hm.keySet()) {

            System.out.println(product + " = " + hm.get(product));
        }
    }
}