public class displayArr {
        public static void disArr(int[] arr, int idx){
            if(idx == arr.length - 1){
                if(arr[idx] % 2 == 0){
                    System.out.println(arr[idx]);
                }
                return;
            }
            if(arr[idx] % 2 == 0){
                System.out.println(arr[idx]);
            }
            disArr(arr,idx+1);
            return;
        }
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 3, 10, 30, 5};
            disArr(arr, 0);
        }
    }

