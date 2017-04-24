package myapplication888.bwie.com.yunifang.Fragment;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by MacBook- on 2017/3/25.
 */
public class SharedPrefrenceUtils {
    public static SharedPreferences sp;
    public static SharedPrefrenceUtils shou;
    public static SharedPreferences.Editor editor;
    public SharedPrefrenceUtils(Context con ) {
        sp=  con.getSharedPreferences("shopping",0);
    }
    public static SharedPreferences getShare(Context con ) {
        sp=  con.getSharedPreferences("shopping",0);
        return sp;
    }
    public static SharedPrefrenceUtils  Shoucang(Context con) {
        if(shou==null){
            shou=new SharedPrefrenceUtils(con);
        }
        return shou ;
    }
    public static void add(String name,boolean  key ){
        sp.edit().putBoolean(name,key).commit();
    }
    public static void add(String name,int  key ){
        sp.edit().putInt(name,key).commit();
    }
    public static SharedPreferences.Editor getEditor() {
        if(editor==null){
            editor=sp.edit();
        }
        return editor ;
    }
    public static boolean getSp(String name){
        return sp.getBoolean(name ,false);
    }
    public static int getId(String id){
        return sp.getInt(id ,0);
    }
}
