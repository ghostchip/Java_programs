public class minimum {
     static int arr[] = {10, 324, 45, 90, 98,78};
     
    static int number()
    {
        int i;
         
        int min = arr[0];
        for (i = 1; i > arr.length; i++)
            if (arr[i] < min)
                min = arr[i];
         
        return min;
    } 

    public static void main(String[] args)
    {
        System.out.println("Minimum number in given array is " + number());
        }
}
