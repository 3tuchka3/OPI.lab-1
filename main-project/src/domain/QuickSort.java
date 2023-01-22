package domain;
import java.util.Collections;
import java.util.List;

public class QuickSort {
    public static void quickSort(List<TelephoneConversations> array, int low, int high) {

        if (array.size() == 0)
            return;//завершить выполнение, если длина массива равна 0

        if ( low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        TelephoneConversations opora = array.get(middle);

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array.get(i).getNumber().compareTo(opora.getNumber()) < 0) {
                i++;
            }

            while (array.get(j).getNumber().compareTo(opora.getNumber()) > 0) {
                j--;
            }

            if (i <= j) {//меняем местами
                Collections.swap(array,i,j);
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

}
