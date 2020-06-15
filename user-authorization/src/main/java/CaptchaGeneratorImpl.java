import java.util.Random;

public class CaptchaGeneratorImpl {

    public static void main(String[] args) {
        CaptchaGenerator captchaGenerator = new CaptchaGenerator() {
            public void generateCaptcha() {
                Random random = new Random();
                System.out.println(random.nextInt(1000000));
            }
        };

        captchaGenerator.generateCaptcha();

    }

}

