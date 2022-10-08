public class maximum {
   static int arr[] = {10, 324, 45, 90, 98,78};
     
    static int number()
    {
        int i;
         
        int max = arr[0];
         
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    } 

    public static void main(String[] args)
    {
        System.out.println("Maximum number in given array is " + number());
        }
}
