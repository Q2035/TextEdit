package top.hellooooo.textedit.mode;

/**
 * @Author Q
 * @Date 19/10/2020 14:38
 * @Description 文本操作
 *      insert
 *      delete
 *
 */
public enum EditOperationEnum {

    INSERT(0), DELETE(1), INSERT_MODE(2);

    private Integer operation;

    EditOperationEnum(Integer operation) {
        this.operation = operation;
    }

    public Integer getOperation() {
        return operation;
    }
}
