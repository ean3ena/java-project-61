package hexlet.code;

public class Engine {

    public static int getAttemptCount() {
        final int attemptCount = 3; // количество попыток в игре
        return attemptCount;
    }

    public static int getRandomNumber() {
        // Диапазон генерации случайных чисел по умолчанию
        int min = 0;
        final int max = 100;

        return getRandomNumber(min, max);
    }

    public static int getRandomNumber(int min, int max) {
        return (int) (min + Math.random() * max);
    }

    public static void requestPlayerAnswer(String expression) {
        System.out.println("Question: " + expression);
        System.out.print("Your answer: ");
    }

    public static void requestPlayerAnswer(int expression) {
        requestPlayerAnswer(Integer.toString(expression));
    }

    public static boolean checkPlayerAnswer(String userName, String answer, String expectedAnswer) {
        if (answer.equals(expectedAnswer)) {
            notifyCorrectAnswer();
            return true;
        } else {
            notifyWrongAnswer(answer, expectedAnswer, userName);
            return false;
        }
    }

    public static boolean checkPlayerAnswer(String userName, int answer, int expectedAnswer) {
        return checkPlayerAnswer(userName, Integer.toString(answer), Integer.toString(expectedAnswer));
    }

    public static void notifyCorrectAnswer() {
        System.out.println("Correct!");
    }

    public static void notifyWrongAnswer(String answer, String expectedAnswer, String userName) {
        String wrongAnswer = "'" + answer
                + "' is wrong answer ;(. Correct answer was '"
                + expectedAnswer + "'.\n"
                + "Let's try again, " + userName + "!";
        System.out.println(wrongAnswer);
    }

    public static void showCongratulation(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }
}
