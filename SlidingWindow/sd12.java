public class sd12 {
    public static void main(String[] args) {
        int arr[] = {2,5,1,1,5,8,10,4,3,5,6,7,8};
        int k = 3;

        int i = 0;
        int j = 0;
        int n = arr.length;
        int store = Integer.MIN_VALUE;
        int count = 0;

        while (j < n) {

            if (arr[j] > store) {
                store = arr[j];

            } else {
                store = arr[j];
                i++;

            }

            if (j - i + 1 == k) {
                boolean flag = false;
                //STRICTLY INCREASING CHECK KRNA HAI
                for (int start = i; start < j; start++) {
                    if (arr[start] >= arr[start + 1]) {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) {
                    count++;
                }
                i++;
            }

            j++;
        }
        System.out.println(count);
    }
}
