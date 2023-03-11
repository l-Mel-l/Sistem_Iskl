import java.util.Scanner;

public class СортировкаУл_Лаб6 {
    public static void main(String[] args) {

        // Задаётся массив

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = sc.nextInt();
        int[] mass = new int[n];
        System.out.println("Введите значения массива");
        for (int i = 0; i < n; i++) {
            mass[i] = sc.nextInt();
        }
        combsort(mass);
        for(int i = 0;i<n;i++){
            System.out.println(mass[i]);}
    }
        //Сортировочка

    public static void combsort(int[]values){
            double factor = 1.247;
            int step = values.length-1;
            while (step>=1){
                for (int i =0;i+step<values.length;i++){
                    if (values[i]>values[i+step]){
                        swap(values,i,i+step);
                    }
                }
                step/=factor;
            }

        }

    static void swap(int[]mass,int i,int j){
        int temp = mass[i];
        mass[i] = mass[j];
        mass[j]=temp;

    }
}