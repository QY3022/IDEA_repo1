package com.gyf.TestJson;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.util.StringUtils;

public class json {
    private String[] mediaJsonStringArr;

    public static void main(String[] args) {
        String jsonString = "{\"name\":\"BeJson\",\"url\":\"http://www.bejson.com\",\"page\":88,\"isNonProfit\":true,\"mediaJson\":[{\"id\":\"123\",\"url\":\"http:img/img.png\"},{\"id\":\"456\",\"url\":\"http:img/img.png\"},{\"id\":\"789\",\"url\":\"http:img/img.png\"}]}";
        if(!StringUtils.isEmpty(jsonString)){
            JSONObject jsonObject = JSONObject.fromObject(jsonString);
//            获取第二层的数组，将其转换成jsonArray
            JSONArray mediaJsonArray = jsonObject.getJSONArray("mediaJson");
//            遍历这个数组
            for(int i =0;i<mediaJsonArray.size();i++){
                JSONObject object = mediaJsonArray.getJSONObject(i);
                System.out.println(object.getString("id"));
                System.out.println(object.getString("url"));
            }

        }else {
            System.out.println("null json");
        }
    }
}

