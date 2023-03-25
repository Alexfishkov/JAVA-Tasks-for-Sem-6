import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Task_sem_6_1 {
    public static void main(String[] args) {

        notebook note1 = new notebook();
        note1.model = "HonorMagicBookX15  ";
        note1.diagonal = 15.6;
        note1.width = 1920;
        note1.height = 1080;
        note1.ram = 8;
        note1.ssd = 256;
        note1.frequency = 2.1;
        note1.capacity = 13;
        note1.price = 47000;

        notebook note2 = new notebook();
        note2.model = "HuaweiMagicBookX15 ";
        note2.diagonal = 15.6;
        note2.width = 1920;
        note2.height = 1080;
        note2.ram = 8;
        note2.ssd = 512;
        note2.frequency = 2.4;
        note2.capacity = 13;
        note2.price = 52100;

        notebook note3 = new notebook();
        note3.model = "BY FN 5105         ";
        note3.diagonal = 16.0;
        note3.width = 1920;
        note3.height = 1080;
        note3.ram = 12;
        note3.ssd = 2048;
        note3.frequency = 2.1;
        note3.capacity = 5;
        note3.price = 29980;

        notebook note4 = new notebook();
        note4.model = "APPLE MACBOOKAIR M2";
        note4.diagonal = 13.6;
        note4.width = 2560;
        note4.height = 1600;
        note4.ram = 8;
        note4.ssd = 256;
        note4.frequency = 2.4;
        note4.capacity = 10;
        note4.price = 105000;

        notebook note5 = new notebook();
        note5.model = "REDMI BOOK PRO15   ";
        note5.diagonal = 14.0;
        note5.width = 2560;
        note5.height = 1600;
        note5.ram = 16;
        note5.ssd = 512;
        note5.frequency = 3.3;
        note5.capacity = 10;
        note5.price = 73300;

        notebook note6 = new notebook();
        note6.model = "ASUS ROGSTRIXG713R";
        note6.diagonal = 17.3;
        note6.width = 1920;
        note6.height = 1080;
        note6.ram = 16;
        note6.ssd = 1024;
        note6.frequency = 3.2;
        note6.capacity = 8;
        note6.price = 114900;

        var notes = new HashSet<notebook>(Arrays.asList(note1, note2, note3, note4, note5, note6));
        System.out.print("\033[H\033[J");
        System.out.println("Из общего списка выбираем подходящий ноутбук по заданным вами параметрам");
        System.out.println("Если запрашиваемый параметр для вас не важен, введите 0");
        
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите мин. размер диагонали экрана в формата=> ");
        Double diag = iScanner.nextDouble();
        System.out.print("Введите мин. разрешение экрана по ширине в пикселях=> ");
        int wid = iScanner.nextInt();
        System.out.print("Введите мин. разрешение экрана по высоте в пикселях=> ");
        int hgh = iScanner.nextInt();
        System.out.print("Введите мин. размер ОЗУ(RAM)=> ");
        int ram = iScanner.nextInt();
        System.out.print("Введите мин. размер жёсткого диска(SSD)=> ");
        int ssd = iScanner.nextInt();
        System.out.print("Введите мин. частоту процессора (ГГц)=> ");
        Double freq = iScanner.nextDouble();
        System.out.print("Введите мин. время работы аккумулятора (часы)=> ");
        int cap = iScanner.nextInt();
        System.out.print("Введите макс. приемлемую стоимость ноутбука (руб)=> ");
        int price = iScanner.nextInt();
        if (price == 0) price = 1000000;
        iScanner.close();

        System.out.println("Модель             Диаг  шир  выс RAM   SSD част емк стоимость");
        int count = 0;
        for (var item : notes) {
            if (checkDiag(diag, wid, hgh, ram, ssd, freq, cap, price, item)) {
                System.out.println(item);
                count++;
            }

        }
        if (count==0) System.out.println("Извините, но ноутбука с такими параметрами нет в нашем списке :(");

    }

    public static boolean checkDiag(Double minDiag, Integer minWidth, Integer minHeight, Integer minRam, Integer minSsd,
            Double minFreq, Integer minCap, Integer maxPrice, notebook note) {
        return (note.diagonal >= minDiag && note.width >= minWidth && note.height >= minHeight && note.ram >= minRam
                && note.ssd >= minSsd && note.frequency >= minFreq && note.capacity >= minCap
                && note.price <= maxPrice);
    }

}
