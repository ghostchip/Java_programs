 class fibonnaci{
    public static void main(String[] args) {

        int n = 6, firstterm = 0, secondterm = 10;
        System.out.println("FIbonnaci series till " + n +"terms:");

        for( int i = 1; i<=n; ++i){
            System.out.print(firstterm +",");

            int nextterm  = firstterm + secondterm;
            firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}