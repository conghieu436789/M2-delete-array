public class deleteelements {
//    public static void delArr(int[] arr, int nummber) {
//        int[] indexArr = new int[10];
//        int index = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == nummber) {
//                indexArr[index] = i;
//                index++;
//            }
//        }
//        for (int i = 0; i < index; i++) {
//            for (int j = 0; j < arr.length-1; j++) {
//                if (j >= indexArr[i]) {
//                    arr[j] = arr[j + 1];
//                }
//            }
//            indexArr[i+1] -=(i+1);
//        }
//        for (int i = 0; i< arr.length-index; i++) {
//            System.out.printf("%2d",arr[i]);
//        }
//    }
    static void delArr(int[] arr, int number){
        int count = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] != number) {
                arr[count] = arr[i];
                count++;
            }
        }
        for (int i =0; i<count; i++) {
            System.out.printf("%2d",arr[i]);
        }
    }

        public static void main (String[]args){
            int[] array ={1,5,1,1,9,2,1};
            int number = 1;
            delArr(array,number);
        }
}
