public class MyFirstGame {
    public static void main(String[] args) {
        int target = 50;        // число которое надо угадать
        int tmp_num = 48;       // число с которого начинаем угадывать (аналог Math.random)

        int startInterval = 0;
        int endInterval = 100;

        while (tmp_num != target) {
            if (tmp_num < target) {
                System.out.println("Число " + tmp_num + " больше того, что загадал компьютер");
                startInterval = tmp_num + 1;
            } else if (tmp_num > target) {
                System.out.println("Число " + tmp_num + " меньше того, что загадал компьютер");
                endInterval = tmp_num - 1;
            }

            tmp_num = (startInterval + endInterval) / 2;
        } 

        System.out.println("Вы победили!");
    }
}