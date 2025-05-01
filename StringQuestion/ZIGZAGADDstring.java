public class ZIGZAGADDstring {
    public static String addZigZag(String str1,String str2){
        String result="";
        int i=0;
        for(; i<str1.length() && i<str2.length(); i++){
            result=result+str1.charAt(i)+str2.charAt(i);
        }
        if(i<str1.length()){
            result=result+str1.substring(i);
        }
        if(i<str2.length()){
            result=result+str2.substring(i);
        }
        return result;
    }
    public static void main(String arg[]){
    String a = "hackerrank" ,b = "mountain";
    String str=addZigZag(a,b);
    System.out.println(str);
    }
}
