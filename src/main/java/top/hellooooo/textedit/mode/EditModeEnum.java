package top.hellooooo.textedit.mode;

/**
 * @Author Q
 * @Date 19/10/2020 13:59
 * @Description
 */
public enum EditModeEnum {

    DEFAULT_MODE(0),VISUAL_MODE(1), INSERT_MODE(2);

    private Integer mode;

    EditModeEnum(Integer mode) {
        this.mode = mode;
    }

    public Integer getMode() {
        return mode;
    }
}
