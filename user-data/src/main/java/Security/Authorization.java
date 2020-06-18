package Security;

import Captcha.CaptchaGeneratorImpl;
import Data.User;

public final class Authorization {


    public static final void signIn(User user) {

        System.out.println("It's a sign in of the user " + user.getName() + " with id " + user.getId() + " , generated captcha is " + CaptchaGeneratorImpl.createCaptcha());

    }

    public final void signOut(User user) {

        System.out.println("It's a sign out of the user " + user.getName() + " with id " + user.getId());


    }

}
