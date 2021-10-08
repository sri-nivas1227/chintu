import java.util.*;
public class LargestEvenFromString {
    // method to sort array in descending order
    static int[] desc_sort(int[] arr,int n)
    {
        for(int i=1; i<n; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]<key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }

    //Main Method
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        char[] arr = input.toCharArray();
        //create a string builder to store only the integers from the input string
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++)
        {
            if(Character.isDigit(arr[i]))  
            {
                if(!sb.toString().contains(String.valueOf(arr[i]))) //to remove duplicates
                {  
                sb.append(arr[i]);
                }
            }
        }
        System.out.println("the digit string: "+sb.toString());

        //converting the string builder to an integer array
        int n = sb.length();
        int[] digitArr = new int[n];
        for(int i=0; i<n; i++)
        {
            
            digitArr[i] = Integer.parseInt(String.valueOf(sb.charAt(i)));
            
        }

        //sort the array in the descending order.
        digitArr = desc_sort(digitArr, digitArr.length);

        //find the least even number from the digitArray
        int min = 0;
        for(int i=0; i<n; i++)
        {
            if(digitArr[i]<digitArr[min] && digitArr[i]%2==0)
            {
                min = i;
            }
        }
        //swap the min even value to last element and rearrange the array.
        for(int i=min,temp; i<n-1; i++)
        {
            temp = digitArr[i];
            digitArr[i] = digitArr[i+1];
            digitArr[i+1] = temp;
        }

        //converting it to a string instead of making it a number.
        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++)
        {
            res.append(String.valueOf(digitArr[i]));
        }
        System.out.println(res.toString());        


    }
    
}
