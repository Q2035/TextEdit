package top.hellooooo.textedit.mode;

/**
 * @Author Q
 * @Date 19/10/2020 14:38
 * @Description
 */
public enum TextOperation {

    DEFAULT_MODE(0),VISUAL_MODE(1), INSERT_MODE(2);

    private Integer operation;

    TextOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getOperation() {
        return operation;
    }
}
