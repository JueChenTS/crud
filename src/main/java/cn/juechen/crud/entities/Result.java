package cn.juechen.crud.entities;

import java.util.HashMap;

public class Result extends HashMap<String, Object> {
    public Result() {
        put("code", 200);
        put("msg", "success");
    }

    public static Result ok() {
        return new Result();
    }

    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
