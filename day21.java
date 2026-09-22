public class main {
    public static void main(String[] args) {
       
        String stringAngka = "123";
        String stringDesimal = "3.14";
        String stringBoolean = "true";
    

      //  String ke int
        int angka = Integer.parseInt(stringAngka);

        //  String ke double
        double desimal = Double.parseDouble(stringDesimal);

        //  String ke boolean
        boolean nilaiBoolean = Boolean.parseBoolean(stringBoolean);


//untuk float gunakan float.parseFloat() 
//untuk byte gunakan byte.parseByte() 
//untuk short gunakan short.parseShort() 
//untuk long gunkan long.parseLong() 
//untuk char gunakan chart.parseCharAt(0) 
      
        System.out.println("String ke int: " + angka);
        System.out.println("String ke double: " + desimal);
        System.out.println("String ke boolean: " + nilaiBoolean);
    }
}
