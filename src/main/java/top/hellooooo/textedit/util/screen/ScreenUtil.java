package top.hellooooo.textedit.util.screen;

import org.springframework.stereotype.Component;

/**
 * @Author Q
 * @Date 21/10/2020 19:47
 * @Description
 */
@Component
public class ScreenUtil {

    private int lines = 100;

    public void clearScreen(){
        for (int i = 0; i < lines; i++) {
            System.out.println("\r");
        }
    }


}
