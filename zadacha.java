import java.util.Scanner;

public class zadacha {

    public static void main(String[] args) {
        // Задаем первоначальный массив строк (можно ввести с клавиатуры)
        String[] initialArray = {"Hello", "2", "world", ":-)"};
        

        // Определяем максимальную длину массива
        int maxLength = initialArray.length;
        // Создаем массив для хранения коротких строк
        String[] shortStrings = new String[maxLength];
        // Индекс текущей короткой строки
        int shortStringsIndex = 0;

        // Проходим по каждому элементу первоначального массива
        for (String str : initialArray) {
            // Если длина строки меньше или равна 3 символам
            if (str.length() <= 3) {
                // Добавляем строку в массив коротких строк
                shortStrings[shortStringsIndex] = str;
                shortStringsIndex++;
            }
        }

        // Создаем новый массив с точным размером для коротких строк
        String[] resultArray = new String[shortStringsIndex];
        // Копируем короткие строки в новый массив
        for (int i = 0; i < shortStringsIndex; i++) {
            resultArray[i] = shortStrings[i];
        }

        // Выводим результат
        System.out.print("[");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Метод для ввода массива строк с клавиатуры (не используется в примере)
    @SuppressWarnings({ "resource", "unused" })
    private static String[] inputArrayFromKeyboard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите элементы массива, разделенные пробелами: ");
        String input = scanner.nextLine();
        return input.split(" ");
    }
}