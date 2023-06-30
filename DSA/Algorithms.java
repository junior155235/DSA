public class Algorithms {
    public static void main(String[] args) {
        // -----Binary Search-----
        int arr[] = new int[100];
        for(int i = 0;i<arr.length;i++)
        {
            arr[i] = i;
        }
        int target = 37;
        int left = 0;
        int right = arr.length-1;
        while(left <= right)
        {
            int mid = left+(right-left)/2;
            int value = arr[mid];
            if(value == target)
            {
                System.out.println("target find");
                break;
            }
            else if(value < target)
            {
                left = mid+1;
            }
            else
            {
                right = mid-1;
            }
        }
        if(left > right)
        {
            System.out.println("target not find");
        }

        // -----Selection Sort-----
        int sel_array[] = {2,3,1,5,6,4,8,9,7};
        System.out.print("Unordered: ");
        for(int i : sel_array)
        {
            System.out.print(i + " ");
        }

        for(int i = 0;i<sel_array.length-1;i++)
        {
            int min = i;
            for(int j = i+1;j<sel_array.length;j++)
            {
                if(sel_array[min] > sel_array[j])
                {
                    min = j;
                }
            }
            int tmp = sel_array[i];
            sel_array[i] = sel_array[min];
            sel_array[min] = tmp;
        }
        System.out.print("\nOrdered: ");
        for(int i : sel_array)
        {
            System.out.print(i + " ");
        }

        // -----Insertion Sort-----
        int ins_array[] = {2,3,1,5,6,4,8,9,7};
        System.out.print("\nUnordered: ");
        for(int i : ins_array)
        {
            System.out.print(i + " ");
        }

        for(int i = 1;i<ins_array.length;i++)
        {
            int tmp = ins_array[i];
            int j = i-1;
            while(j >= 0 && ins_array[j] >= tmp)
            {
                ins_array[j+1] = ins_array[j];
                j--;
            }
            ins_array[j+1] = tmp;
        }
        System.out.print("\nOrdered: ");
        for(int i : ins_array)
        {
            System.out.print(i + " ");
        }

        // -----Merge Sort-----
        int mer_array[] = {2,3,1,5,6,4,8,9,7};

        System.out.print("\nUnordered: ");
        for(int i : mer_array)
        {
            System.out.print(i + " ");
        }

        mergeSort(mer_array);

        System.out.print("\nOrdered: ");
        for(int i : mer_array)
        {
            System.out.print(i + " ");
        }

        // -----QuickSort-----
        int qui_array[] = {2,3,1,5,6,4,8,9,7};
        System.out.print("\nUnordered: ");
        for(int i : qui_array)
        {
            System.out.print(i + " ");
        }

        quickSort(qui_array , 0 , qui_array.length-1);

        System.out.print("\nOrdered: ");
        for(int i : qui_array)
        {
            System.out.print(i + " ");
        }
    }
    static void mergeSort(int arr[])
    {
        int length = arr.length;
        if(length <= 1)return;

        int mid = length /2 ;
        int[] left = new int[mid];
        int[] right = new int[length-mid];

        int i = 0;//left
        int j = 0;//right

        for(int k = 0;k<length;k++)
        {
            if(k < mid)
            {
                left[i] = arr[k];
                i++;
            }
            else
            {
                right[j] = arr[k];
                j++;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
    }
    static void merge(int[] left, int[] right , int[] arr)
    {
        int leftsize = arr.length/2;
        int rightsize = arr.length - leftsize;
        int i = 0, l = 0 , r = 0;
        while(l < leftsize && r < rightsize)
        {
            if(left[l] < right[r])
            {
                arr[i] = left[l];
                l++;
                i++;
            }
            else
            {
                arr[i] = right[r];
                r++;
                i++;
            }
        }
        while(l < leftsize)
        {
                arr[i] = left[l];
                l++;
                i++;
        }
        while(r < rightsize)
        {
                arr[i] = right[r];
                r++;
                i++;
        }
    }
    static void quickSort(int[] arr , int start , int end)
    {
        if(end <= start)return;//base case
        int pivot = partition(arr , start , end);
        quickSort(arr, start, pivot-1);
        quickSort(arr, pivot+1, end);
    }
    static int partition(int[] arr , int start , int end)
    {
        int pivot = arr[end];
        int i = start-1;
        for(int j = start ; j <= end-1 ;j++)
        {
            if(arr[j] < pivot)
            {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        i++;
        int tmp = arr[i];
        arr[i] = arr[end];
        arr[end] = tmp;
        return i;
    }
}
