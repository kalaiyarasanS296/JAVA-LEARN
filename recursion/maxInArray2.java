public class maxInArray2 {
        public static void
        MaxArray(int[] arr, int idx, int max){

            if(idx == arr.length){
                return;
            }
            if(arr[idx] > max){
                max = arr[idx];
            }

            MaxArray(arr,idx+1, max);

        }
        public static void main(String[] args) {
            int[] arr = {1,2,4,30,5};
            int max = arr[0];
            MaxArray(arr,0, max);
            System.out.println(max);
        }
    }


