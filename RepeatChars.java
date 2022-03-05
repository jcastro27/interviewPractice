import java.util.Arrays;

public class RepeatChars
{
    public static void main(String [] args)
    {
        int[] freq = {3, 1, 5, 2};
        char[] text = {'m', 's', 'k', 'p'};

        char[] problem2 = repeatChars(freq, text);
        System.out.print("Problem 2 " + Arrays.toString(problem2));


    }

    public static char [] repeatChars(int [] freq, char [] text)
    {
        int sum = 0;

        for(int i = 0; i < freq.length; i++)
        {
            sum = sum + freq[i];

        }
        char [] newarr = new char[sum];
        int x =0;

        for(int i = 0; i < text.length; i++)
        {

            for(int j = 0; j < freq[i]; j++)
            {
                newarr[x] = text[i];
                x++;
            }


        }


        return newarr;

    }



}