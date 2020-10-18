package top.hellooooo.textedit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StringUtils;
import top.hellooooo.textedit.config.TextEditConfig;

/**
 * @Author Q
 * @Date 18/10/2020 20:57
 * @Description 入口类
 *
 * 比如 用户输入: textedit a.txt
 */
public class TextEditApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextEditConfig.class);
        Logger logger = LoggerFactory.getLogger(TextEditApplication.class);
//        没有指定参数
        if (args.length == 0) {
            logger.debug("Lack of file name");
        } else {
            logger.debug("Provide the file {}", args[0]);
            
        }
    }
}
