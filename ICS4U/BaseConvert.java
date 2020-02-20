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
  
  public static String addBaseNumbers(String a, String b, int base){
    
    int[]one = new int[a.length()];
    
    int[] two = new int[b.length()];
    
    for(int i = 0; i < a.length(); i++){
      one[i] = valueOfChar(a.charAt(a.length()-i-1);
    }
    
    for(int i = 0; i < b.length(); i++){
      two[i] = valueOfChar(b.charAt(b.length()-i-1));
    }
    
    int[]out = new int[Integer.max(a.length(), b.length())];
    
    int carry = 0;
    
    for(int i = 0; i < Integer.max(a.length(), b.length()); i++){
      int sum = one[i] + two[i] + carry;
      out[i] = sum % base;
      carry = sum / base;
    
      if(carry > 0 && i == out.length-1){
        out = Arrays.copyOf(out, out.length+1);
        out[out.length-1] = carry;
      }
    }
    
    String strOut = "";
                           
    for(int i = out.length-1; i >= 0; i--){
      strOut += out[i];
    }
        
                           
                           return strOut;
  }
  
  public static void main(String[]args){
    System.out.println(decToBase(16,2));
    
    System.out.println(baseToDec("1A", 16));
    System.out.println(baseToBase("1A", 16, 2));

   }


}
