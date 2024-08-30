public class Aug30Question2 {
    static void mostFrequentElement(int arr[], int k) {
        int output[] = new int[arr.length];
        int visited[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            boolean isVisited = false;
            for (int j = 0; j < visited.length; j++) {
                if (arr[i] == visited[j]) {
                    isVisited = true;
                }
            }
            if (isVisited) {

            } else {
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
               
                if(count>=2){
                    output[i] = arr[i];
                }
                // System.out.println(arr[i] + " " + count +"  "+ "times");
                visited[i] = arr[i];
            }
        }
        for (int n = 0; n < output.length; n++) {
            System.out.print(output[n] + ",");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        mostFrequentElement(arr, k);
    }
}
