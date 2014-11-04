package util;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.List;

/**
 * Author: qianzhong.fu @ DataYes
 * Date: 2014/9/22
 * Time: 13:31
 */
public class JsonUtil {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static String toJson(Object obj) throws IOException {
        return mapper.writeValueAsString(obj);
    }
    public static <T> T toObject(String json, Class<T> t) throws IOException {
        return mapper.readValue(json, t);
    }
    public static <T> List<T> toList(String json) throws IOException {
        return toObject(json,List.class);
    }
}
