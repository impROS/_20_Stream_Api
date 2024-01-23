import java.util.Arrays;
import java.util.List;
/*

Java Stream API, Java 8 ve sonraki sürümlerde eklenen bir özelliktir ve koleksiyonlar üzerinde fonksiyonel ve
 deklaratif bir şekilde işlemler gerçekleştirmemizi sağlar. Stream API, verilerle çalışma ve işlemleri paralel olarak
  gerçekleştirme konusunda güçlü bir araçtır. İşte Stream API'nin temel kavramları ve bir örnek kod:
Temel Kavramlar:

    Stream: Veri koleksiyonlarını temsil eden bir ara yüzdür. Stream API, koleksiyonlardan (List, Set, Map, vb.) veya
     diğer veri kaynaklarından Stream nesneleri oluşturabilir.

    Intermediate Operations (Ara İşlemler): Stream üzerinde gerçekleştirilen işlemlerdir. Bu işlemler, Stream'in
     elemanlarını filtreleme, sıralama, dönüştürme gibi ara işlemlerdir.

    Terminal Operations (Terminal İşlemler): Stream üzerindeki işlemleri başlatan ve sonlandıran işlemlerdir.
    Terminal işlemleri, Stream üzerindeki verileri kullanarak bir sonuç üretir.

*reduce fonksiyonu, Stream API içinde kullanılan bir terminal işlemidir ve bir koleksiyondaki elemanları birleştirerek
*  (accumulate) tek bir sonuç üretir.
*/
public class Main {
    public static void main(String[] args) {

        //Example 1 : A ile başlayan isimleri sırala
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva", "Frank");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .forEach(System.out::println);


        //Example 2 : Liste içindeki sayıların karelerinin toplamı
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sumOfSquares = numbers.stream()
                .map(number -> number * number)
                .reduce(0, Integer::sum);

        System.out.println("Liste içindeki sayıların karelerinin toplamı: " + sumOfSquares);


        //Example 3 : Toplamı hesapla
        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers3.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Toplam: " + sum);
    }
}