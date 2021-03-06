package com.courese.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForPost1 {
    private  String  url;
    private ResourceBundle bundle;
    // 用来存储cookie 信息
    private CookieStore store;

    @BeforeTest
    public void  beforeTest(){
        bundle=ResourceBundle.getBundle("application", Locale.CHINA);
        url=bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        String result;
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url + uri;
        HttpGet get = new HttpGet(testUrl);
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(result);

        //获取cookies信息
        this.store = ((DefaultHttpClient) client).getCookieStore();
        List<Cookie> cookieList=store.getCookies();
        for(Cookie cookie:cookieList){
            String name=cookie.getName();
            String  value=cookie.getValue();
            System.out.println("name:"+name +" value:"+value);
        }
    }


    @Test(dependsOnMethods = {"testGetCookies"})
    public void  testPostMethod() throws IOException {
        String uri = bundle.getString("test.post.with.cookies");
        //拼接测试地址
        String  testUrl=this.url+uri;

        //声明一个client 对象，用来进行方法的执行
        DefaultHttpClient client=new DefaultHttpClient();
        //声明一个方法，post方法
        HttpPost post=new HttpPost(testUrl);

        //添加参数
        JSONObject param=new JSONObject();
        param.put("name","zhangsan");
        param.put("age","18");

        // 设置请求头信息,设置header
        post.setHeader("content-type","application/json");

        //将参数信息添加到方法
        StringEntity entity=new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);
        // 声明一个对象来进行响应结果的存储
        String result;
        //设置cookies信息
        client.setCookieStore(this.store);
        //执行post结果
        HttpResponse response= client.execute(post);
        //获取响应结果
        result=  EntityUtils.toString( response.getEntity(),"utf-8");
        System.out.println(result);
        //c处理结果，判断结果是否符合响应预期




    }
}
