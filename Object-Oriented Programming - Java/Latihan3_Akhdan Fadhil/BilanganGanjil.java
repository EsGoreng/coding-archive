public class BilanganGanjil {
    public static void main(String[] args) {
        System.out.println("Perulangan dengan for :");
        for(int i = 0 ; i <= 15 ; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("Perulangan dengan do while");
        int j = 0;
        do {
            if(j % 2 != 0){
                System.out.println(j);
            }
            j++;
        } while (j <= 15);
        System.out.println("Perulangan dengan while");
        int k = 0;
        while (k <= 15) {
            if (k % 2 != 0) {
                System.out.println(k);
            }
            k++;
        }
    }
}
