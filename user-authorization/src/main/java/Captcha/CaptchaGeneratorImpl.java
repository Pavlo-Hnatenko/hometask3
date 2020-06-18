package Captcha;

import java.util.Random;

public class CaptchaGeneratorImpl {

    public static String createCaptcha() {
        CaptchaGenerator captchaGenerator = new CaptchaGenerator() {
            public String generateCaptcha() {
                Random random = new Random();
                return String.valueOf(random.nextInt(1000000));
            }
        };

        return captchaGenerator.generateCaptcha();

    }


}

