
public class bubbleSort {
        public static void bubbleSort(int arr[])
        {
            int len = arr.length;
            for (int i = 0; i < len-1; i++)
                for (int j = 0; j < len-i-1; j++)
                    if (arr[j] > arr[j+1])
                    {
                        // swapping arr[j+1] and arr[i]
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }

        public static void printArray(int arr[])
        {
            int len = arr.length;
            for (int i = 0; i < len; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        public static void main(String args[])
        {
            int arr[] = {64, 34, 25, 12, 22, 11, 90};
            bubbleSort(arr);
            System.out.println("Sorted array");
            printArray(arr);
        }
    }
