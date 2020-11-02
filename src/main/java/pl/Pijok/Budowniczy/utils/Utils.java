package pl.Pijok.Budowniczy.utils;

public class Utils {

    public static boolean isInteger(String a){
        try{
            Integer.parseInt(a);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}
