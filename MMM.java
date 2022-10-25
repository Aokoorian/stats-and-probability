import java.util.*;

class MMM
{
    public static double findMean(int numbers[], int numbersLength)
    {
        int sum = 0;
        for(int i = 0; i < numbersLength; i++)
        {
            sum += numbers[i];
        }
        return sum / numbersLength;
    }
    public static double findMedian(int numbers[], int numbersLength)
    {
        Arrays.sort(numbers);
        if (numbersLength % 2 !=0)
        {
            return numbers[numbersLength / 2];
        }
        return (numbers[(numbersLength - 1) / 2] + numbers[numbersLength / 2]) / 2;
        
    }
    public static double findMode(int numbers[], int numbersLength)
    {
        int max = 0;
        for(int i = 0; i < numbersLength; i++)
        {
            int count = 0;
            for(int j = 0; j < numbersLength; j++)
            {
                if (numbers[j] == numbers[i])
                {
                    count++;
                }
                if (count > max)
                {
                    max = count;
                    max = numbers[i];
                }
            }
        }
        return max;
    }
    public static void main(String args[])
    {
        int numbers[] = { 2, 6, 4, 10, 8, 12, 14, 2};
        int numbersLength = numbers.length;
        System.out.println("The Mean is:" + findMean(numbers, numbersLength));
        System.out.println("The Median is:" + findMedian(numbers, numbersLength));
        System.out.println("The Mode is:" + findMode(numbers, numbersLength));
    }
}