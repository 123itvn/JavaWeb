package jindo.hello;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by toannq on 4/21/15.
 */
public class Counter extends ActionSupport {
    private String text, message;
    private int count;

    @Override
    public String execute() throws Exception {
        if (text.trim().isEmpty()) {
            return ERROR;
        }
        count = text.trim().split(" ").length;
        return SUCCESS;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public int getCount() {
        return count;
    }

    public String getMessage() {
        return message;
    }
}
