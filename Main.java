import java.util.Arrays;
import java.util.Scanner;
public class Main {
    //Metode binary search
    private static int binarySearch(int[] data, int target){
        int low = 0;
        int high = data.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;

            if (data[mid] == target){
                return mid; //Mengembalikan indeks data ditemukan
            } else if (data[mid]< target){
                low = mid + 1;
            }   else {
                high = mid - 1;
            }
        }
        return -1; // mengembalikan -1 jika data tidak ditemukan
    }
    public static void main (String[] args){
        //Inialisasi data diurutkan menggunakan binary search
        int[] data = {25, 50, 75, 100, 125, 150, 175, 200};
        //Input angka yang akan dicari
        Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dicari : ");
        int target = scanner.nextInt();

        //Panggil metode binary search
        int index = binarySearch(data, target);
        //Output hasil pencaharian
        if (index != -1){
            System.out.println("Angka " + target +" ditemukan di indeks " + index);
        } else {
            System.out.println("Angka" + target +" tidak ditemukan dalam data");
        }
    }
}
