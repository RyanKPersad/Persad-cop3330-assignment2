package Assignment2.Ex33;

public class Magic8Ball {
    public static String[] get8BallAnswers() {
        return new String[] {"Yes", "No", "Maybe", "Ask again later"};
    }

    public static String get8BallAnswers(int num) {
        return get8BallAnswers()[num];
    }
}
