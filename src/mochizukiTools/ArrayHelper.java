package mochizukiTools;

import java.util.Arrays;

public class ArrayHelper {
    /* USAGE
        String[] items = new String[]{"a", "b", "c"};
        items = ArrayHelper.push(items, "d");
        items = ArrayHelper.push(items, "e");
        items = ArrayHelper.pop(items);
       RESULTS
        Original: a,b,c
        Array after push calls: a,b,c,d,e
        Array after pop call: a,b,c,d
    */

    public static <T> T[] push(T[] arr, T item) {
        T[] tmp = Arrays.copyOf(arr, arr.length + 1);
        tmp[tmp.length - 1] = item;
        return tmp;
    }

    public static <T> T[] pop(T[] arr) {
        T[] tmp = Arrays.copyOf(arr, arr.length - 1);
        return tmp;
    }

    public static int[] pushInt(int[] i_array, int i_value) {
        int[] tmp = Arrays.copyOf(i_array, i_array.length + 1);
        tmp[i_array.length] = i_value;
        return tmp;
    }


}
