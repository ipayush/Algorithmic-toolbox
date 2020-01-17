import java.util.*;
import java.io.*;
public class maxpair {
static long getMaxPairwiseProductFast(int[] numbers) {
        int n = numbers.length;
        int index1 = -1;
        for (int i = 0; i < n; i++)
        {
            if ((index1 == -1) || (numbers[i] > numbers[index1]))
                index1 = i;
        }
        int index2 = -1;
        for (int j = 0; j < n; j++) 
        {
            if ((j != index1) && ((index2 == -1) || (numbers[j] > numbers[index2])))
                index2 = j;
        }
        return (long)numbers[index1] * numbers[index2];
}
public static void main(String[] args) 
    {
        
       FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        System.out.println(getMaxPairwiseProductFast(numbers));
    } 
static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}