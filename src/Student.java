import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int size;
        int []arr;
        do {
            System.out.println("nhap kich thuoc");
            size=scanner.nextInt();

            if (size>30){
                System.out.println("vui long nhap lai");
            }
        }while (size>30);


        arr=new int[size];
        int i=0;
        while ( i < arr.length){
            System.out.println("thu"+(i+1)+":");
            arr[i]=scanner.nextInt();
            i++;
        }
        int count=0;
        for (int j=0;j<arr.length;j++){
            System.out.print(arr[j]);
            if (arr[j]>=5 && arr[j]<10){
                count++;
            }
        }
        System.out.println("sv do"+count);
    }
}
