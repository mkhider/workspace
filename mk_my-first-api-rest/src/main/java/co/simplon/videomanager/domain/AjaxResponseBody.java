package co.simplon.videomanager.domain;

import java.util.List;

public class AjaxResponseBody {

    String msg;
    List<Category> result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Category> getResult() {
        return result;
    }

    public void setResult(List<Category> result) {
        this.result = result;
    }

}
