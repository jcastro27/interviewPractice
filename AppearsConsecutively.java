public class AppearsConsecutively
{
    public static void main(String[] args)
    {

        int[] arr1 = {55, 33, 22};
        int[] arr2 = {7, 6, 55, 33, 22, 1};

        int[] arr3 = {5, 3, 2};
        int[] arr4 = {5, 66, 44, 3, 2, 1};

        int[] arr5 = {88, 17, 9, 50};
        int[] arr6 = {77, 88, 17, 9, 50, 11, 4, -3};

        int[] arr7 = {5, 3, 2};
        int[] arr8 = {5, 3, 3, 3, 2};

        int[] arr9 = {50, 49, 48, 60, 53};
        int[] arr10 = {50, 49, 48, 60};


        boolean problem5 = appearsConsecutively(arr1, arr2);

        System.out.println("Problem 5 " + problem5);


    }

    public static boolean appearsConsecutively(int [] A, int [] B)
    {
        int startIndex = 0;
        int endIndex = 0;
        int count  = 0 ;

        for(int i = 0; i < B.length; i++)
        {

            for(int j = 0; j < A.length; j++)
            {
                if(B[i] == A[j])
                    count++;


            }
            if(count == 1)
                startIndex = i;

            if(count == A.length )
            {
                count++;
                endIndex = i;
            }


        }

        System.out.println(endIndex + " " + startIndex + " " );




        return endIndex - startIndex == A.length -1 ;
    }

}