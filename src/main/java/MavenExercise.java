import docrob.util.Input;
import org.apache.commons.lang3.StringUtils;

public class MavenExercise {
    public static void main(String[] args) {
//        StringUtils.
        Input input = new Input();
        String userStuff = input.getString("Enter something so we can get outta here: ");

        System.out.println("What you entered is a number: " + StringUtils.isNumeric(userStuff));
        System.out.println("Flipped case: " + StringUtils.swapCase(userStuff));
        System.out.println("Reversed: " + StringUtils.reverse(userStuff));
    }
}
