
public class Main {

    public static void main(String[] args) {
        int sum =0;
        int n = 0;
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 0 && arr[i]!=0) {
                sum+=arr[i];
                n++;
            }
        }
        if (n>0) {
            double avg = Double.valueOf(sum);
            avg /= Double.valueOf(n);
            System.out.println(avg);
        }
    }
}