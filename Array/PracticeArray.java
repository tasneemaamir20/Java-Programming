public class PracticeArray {
    public static void main(String[] args) {
        // int target=10;
        // int arr[]={2,7,3,4,6,8,9,11,0};
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //         if(arr[i]+arr[j]==target)
        //         {
        //             System.out.println("First index : "+ i +"Second index"+ j);
        //         }
        //     }
        // }


        String []arr={"a","b","b","c","c","c","d","d","d","d"};
        int count=1;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    count++;
                    System.out.println(arr[i]+" " +count);
                }
            }
        }
    }
}
