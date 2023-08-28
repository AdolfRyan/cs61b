public class arraysum {
  public static void possum(int[] a, int n) {
    for (int i = 0;i < a.length; i++) {
      for (int j = 0; j <= n; j++)  {
        if(i + j<a.length)  {
          a[i] += a[i + j];
        }
      }
    }
  }
  public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int n = 3;
    possum(a, n);
    for (int i : a) {
      System.out.print(i + " ");
    }
  }
}