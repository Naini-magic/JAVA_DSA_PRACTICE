public class s30REcursively {
    public static void main(String[] args) {
        String s = "aabb";
System.out.println(Remove(s));
    }





    // without recursion
    public static String Remove(String s){

        if(s.length() == 0){
            return "";
        }
        String result = Character.toString(s.charAt(0));
    
        
       for(int i = 1; i < s.length() ; i++){
        if(s.charAt(i) != s.charAt(i-1)){
           result = result.concat(Character.toString(s.charAt(i)));
        }
       }
       return result;
}}
