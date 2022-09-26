package org.techtown.user;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class HospitalPlanRequest extends StringRequest{
    // 서버 URL 설정 ( PHP 파일 연동 )
    final static private String URL = "http://192.168.56.1/plan.php";
    private Map<String, String> map;


    public HospitalPlanRequest(String text, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("text",text);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}