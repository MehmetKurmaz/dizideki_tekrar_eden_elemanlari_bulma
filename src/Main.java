import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int listElemani = 0,index=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Dizinin Boyutunu Giriniz :");
        int boyut=scanner.nextInt();
        int[]list=new int[boyut];
        System.out.println("Dizinin Elemanlarini Giriniz :");
        for (int i=0;i<list.length;i++){
            System.out.print(i+". Elemani :");
            list[i]=scanner.nextInt();
        }

        Map<Integer,Integer> tekrarSayilari=new HashMap<>(listElemani);
        for (int eleman:list){
            if (tekrarSayilari.containsKey(eleman)){
                tekrarSayilari.put(eleman,tekrarSayilari.get(eleman)+1);
            }else {
                tekrarSayilari.put(eleman,1);
            }
        }
        for (Map.Entry<Integer,Integer>entry:tekrarSayilari.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" elemani :"+entry.getValue()+" kez tekrar ediyor.");
            }
        }
        Arrays.sort(list);

        System.out.print("Sirali Dizi :" + Arrays.toString(list) + " ");

    }
}