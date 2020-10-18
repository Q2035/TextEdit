package top.hellooooo.textedit.file;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.InputStream;
import java.util.Date;

/**
 * @Author Q
 * @Date 18/10/2020 22:05
 * @Description
 */
@Component
public class FileInfo {

    private File file;

    private Date openTime;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
