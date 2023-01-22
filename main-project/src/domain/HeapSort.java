package domain;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HeapSort {


//    public static void heapSort(List<TelephoneConversations> array) {
//        int n = array.size();
//
//        for (int i = n / 2 - 1; i >= 0; i--) {
//            heapify(array, i, n);
//        }
//
//        for (int i = n - 1; i >= 0; i--) {
//            Collections.swap(array,i,0);
//            heapify(array, 0, n);
//        }
//    }
//
//    private static void heapify(List<TelephoneConversations> array, int i, int n) {
//        int l = i * 2 + 1;
//        int r = i * 2 + 2;
//        int largest = i;
//
//        if (l < n && array.get(l).getDuration().compareTo(array.get(largest).getDuration()) > 0)
//            largest = l;
//        if (r < n && array.get(r).getDuration().compareTo(array.get(largest).getDuration()) > 0)
//            largest = r;
//        if (i != largest) {
//
//            TelephoneConversations temp = array.get(i);
//            Collections.swap(array, i, largest);
//            Collections.swap(array, largest, array.indexOf(temp));
//
//            heapify(array, largest, n);
//        }
//
//    }

    public static void heapSort(List<TelephoneConversations> array)
    {
        int n = array.size();

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(array, n, i);

        // Один за другим извлекаем элементы из кучи
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец

            Collections.swap(array,0,i);


            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    static void heapify(List<TelephoneConversations> array, int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n &&  array.get(l).getDuration().compareTo(array.get(largest).getDuration()) > 0 )
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && array.get(r).getDuration().compareTo(array.get(largest).getDuration()) > 0 )
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {

            Collections.swap(array,i,largest);


            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, n, largest);
        }
    }
}

//package domain;
//
//public class HeapSort {
//
//
//    public static void heapSort(int[] arr) {
//        int n = arr.length;
//        for (int i = n / 2 - 1; i >= 0; i--) {
//            heapify(arr, i, n);
//        }
//
//        for (int i = n - 1; i >= 0; i++) {
//            int temp = arr[i];
//            arr[i] = arr[0];
//            arr[0] = temp;
//
//            heapify(arr, 0, n);
//        }
//    }
//
//    private static void heapify(int[] arr, int i, int n) {
//        int l = i * 2 + 1;
//        int r = i * 2 + 2;
//        int largest = i;
//
//        if (l < n && arr[l] > arr[largest])
//            largest = l;
//        if (r < n && arr[r] > arr[largest])
//            largest = r;
//        if (i != largest) {
//            int temp = arr[i];
//            arr[i] = arr[largest];
//            arr[largest] = temp;
//
//            heapify(arr, largest, n);
//        }
//
//    }
//}

