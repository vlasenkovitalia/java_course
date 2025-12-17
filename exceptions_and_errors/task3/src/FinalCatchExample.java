public class FinalCatchExample {
    static void main(String[] args) {
        try {
            String str = null;
            str.length(); // NullPointerException
        }
        // Ключевое слово final делает ссылку на исключение неизменяемой
        catch (final NullPointerException e) {
            System.out.println("Исключение поймано: " + e.getMessage());

            // Это НЕЛЬЗЯ сделать с final:
            // e = new NullPointerException("Новое исключение"); // Ошибка компиляции!

            // Но можно вызывать методы у исключения:
            System.out.println("Тип исключения: " + e.getClass().getName());
            e.printStackTrace();

            // И даже изменять содержимое, если это объект с mutable полями
            // (хотя у стандартных исключений обычно immutable поля)
        }

        System.out.println("\n=== Без final ===");
        try {
            int[] arr = new int[5];
            arr[10] = 1; // ArrayIndexOutOfBoundsException
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // Без final можно переприсвоить ссылку
            e = new ArrayIndexOutOfBoundsException("Новое сообщение");
            System.out.println("Переопределенное исключение: " + e.getMessage());
        }
    }


}