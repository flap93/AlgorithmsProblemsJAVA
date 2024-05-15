public class SumMultiple {

    public static int sumMultiple(int n, int m) {
      int sum = 0;

      for(int i = 1; i <= n ; i++) {
        if(i % m == 0) {
          sum+=i;
        }
      }

      return sum;
    }
    public static void main(String[] args) {
      System.out.println(sumMultiple(20, 3));
    }
}
