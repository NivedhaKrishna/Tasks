package Java_Interview_Question;

public class DistinctString {

        // Returns k-th distinct element in arr.
        static String printKDistinct(String[] arr,int n,int k)
        {
            int dist_count = 0;
            for (int i = 0; i < n; i++)
            {
                int j;
                for (j = 0; j < n; j++)
                    if (i != j && arr[j] == arr[i])
                        break;

                if (j == n)
                    dist_count++;

                if (dist_count == k)
                    return arr[i];
            }

            return null;
        }

        public static void main (String[] args)
        {
            String ar1[] = {"aaa","aa","a"};
            String ar[] ={ "d","b","c","b","c","a"};
            String ar3[] ={"a","b","a"};
            System.out.print(printKDistinct(ar, ar.length, 2)+" ");
            System.out.print(printKDistinct(ar1, ar1.length, 1)+" ");
            System.out.print(printKDistinct(ar3, ar3.length, 3));
        }
    }