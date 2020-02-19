public class BaseConvert {

  public static String valueToString(int value){
    String back = "ABCDEF";
    
    return value > 9 ? back.charAt(value-10) + "" : "" + value;
    
  }
  
  public static String decToBase(int value, int base){
    
    if(value < base){
     return valueToString(value); 
    }
    
    return valueToString(value/base) + decToBase(value % base, base);
    
  }
  
  
  
  public static int valueOfChar(char in){
    String hex = "ABCDEF";
   
    int in = hex.indexOf(in);
    
    return in == -1 ? Integer.parseInt(in + "") : in + 10;
    
  }
  
  public static int baseToDec(String value, int base){
   
    int out = 0;
    
    for(int i = 0; i < value.length; i++){
       out += Math.pow(base, i) * valueOfChar(value.charAt(i));
      
    }
    
  }
  
  public static void main(String[]args){
     
     System.out.println(decToBase(16,8));

   }


}
