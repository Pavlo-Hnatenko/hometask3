import java.util.Random;

public class CaptchaGenerator  {

    public static void main(String[] args) {
        CaptchaGenerator captchaGenerator = new CaptchaGenerator(){
            void generateCaptcha() {
                Random random = new Random();
                int captcha = random.nextInt();
                System.out.println(captcha);
            }

        };

    }
    private class Some{
        CaptchaGenerator captchaGenerator = new CaptchaGenerator(){
            void generateCaptcha() {
                Random random = new Random();
                int captcha = random.nextInt();
                System.out.println(captcha);
            }

        };
    }

}
