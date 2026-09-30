public class Sorter {
    public static void sort(Sortable[] items) {
        int n = items.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // Calls compareTo on whatever object is in the array
                int cmp = items[j].compareTo(items[j + 1]);

                if (cmp > 0) {
                    Sortable temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}