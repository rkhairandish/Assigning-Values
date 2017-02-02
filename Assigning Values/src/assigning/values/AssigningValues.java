package assigning.values;

public class AssigningValues {
    
    public static void main(String[] args) {
        
        //STRING
        //Add & Assign a text String value
        String txt = "Fantastic ";
        String lang = "Java";
        
        //Assign concatenated String
        txt += lang;
        System.out.println("Add & Assign Strings: " + txt);
        
        //INTEGER
        //Addition
        //Add & Assign an Integer
        int sum = 10;
        int num = 20;
        
        //Assign result (10 + 20 = 30)
        sum += num;
        System.out.println("Add & Assign Integers: " + sum);
        
        
        //Multiply 
        int factor = 5;
        
        //Assign Result (30 x 5 = 150)
        sum *= factor ;
        System.out.println("Multiplication Sum: " + sum);
        
        
        //Division
        //Assign Result (150 / 5 = 150)
        sum /= factor;
        System.out.println("Division Sum: " + sum);
    } 
}
