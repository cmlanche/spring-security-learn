package io.bloogle.demo.exceptions;

/**
 * Created by cmlanche on 2018/8/12.
 */
public class MyExecption extends Exception {

    private String id;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public MyExecption(String id) {
        super("custom exception");
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
