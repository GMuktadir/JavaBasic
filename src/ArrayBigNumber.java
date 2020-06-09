public class ArrayBigNumber {
    public static void main(String[] args)
    {
        int size=10;
        int i,j,z=0,sum=0,UniqueItem=0;
        int arr[]={6,4,10,5,3,5,4,9,1,20};

//        int Flag[]={0,0,0,0,0,0,0,0,0,0};
        int Flag[]={1,1,1,1,1,1,1,1,1,1};


        for (i=0;i<arr.length;i++)
        {
            for(j=i+1;j<arr.length;j++)
                if(arr[i]==arr[j])
                    Flag[i]=0;
        }

        for(z=0;z<arr.length;z++)
        {
            if(Flag[z]==1)
            {
                System.out.println(arr[z]);
                UniqueItem++;
            }
        }
        System.out.println("Total Unique item in array: "+UniqueItem);

    }
}
