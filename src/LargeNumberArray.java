public class LargeNumberArray {
    public static void main(String[] args)
    {
        int i,j;
        int arr[]={6,10,677,5,50,3,4,9,1,20,69,0,500};
        int LargestNumber=arr[0],SmallestNumber=arr[0];
        for (i=0;i<arr.length;i++)
        {
            //Find Largest Number in array without sorting
            for(j=i+1;j<arr.length;j++) {
                if (arr[i] > arr[j])
                    if (LargestNumber < arr[i])
                        LargestNumber = arr[i];
                    else if (LargestNumber < arr[j])
                        LargestNumber = arr[j];
                //Find Smallest Number in array without sorting
                if (arr[i] < arr[j])
                    if (SmallestNumber > arr[i])
                        SmallestNumber = arr[i];
                    else if (SmallestNumber > arr[j])
                        SmallestNumber = arr[j];
            }

        }
        System.out.println("The Largest Number in the array: "+LargestNumber);
        System.out.println("The Smallest Number in the array: "+SmallestNumber);
    }

}
