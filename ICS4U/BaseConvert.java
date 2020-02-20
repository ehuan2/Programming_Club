public class BaseConvert {

  public static String valueToString(int value){
    String back = "ABCDEF";
    
    return value > 9 ? back.charAt(value-10) + "" : "" + value;
    
  }
  
  public static String decToBase(int value, int base){
    
    if(value < base){
     return valueToString(value); 
    }
 
    return decToBase(value/base, base) + valueToString(value%base);
    
  }
  
  
  
  public static int valueOfChar(char in){
    String hex = "ABCDEF";
   
    int index = hex.indexOf(in);
    
    return index == -1 ? Integer.parseInt(in + "") : index + 10;
    
  }
  
  public static int baseToDec(String value, int base){
   
    int out = 0;
    
    for(int i = 0; i < value.length(); i++){
       out += Math.pow(base, i) * valueOfChar(value.charAt(value.length()-i-1));
    }
    return out;
  }
  
  public static String baseToBase(String value, int baseOne, int baseTwo){
   return decToBase(baseToDec(value, baseOne), baseTwo); 
  }
  
  public static void main(String[]args){
    System.out.println(decToBase(16,2));
    
    System.out.println(baseToDec("1A", 16));
    System.out.println(baseToBase("1A", 16, 2));

   }


}
