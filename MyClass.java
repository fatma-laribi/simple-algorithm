public class MyClass {

    MyClass(String s){
        System.out.println("This is the compressed string: " + myMethod(s));
    }

    public String myMethod(String s){
        String secondString = "";
        int counter = 1; 
        
        for(int i= 1; i< s.length(); i++){
            if(s.charAt(i-1) == s.charAt(i)){
        counter++;
        }
        else{
            //get the previous character
            secondString+= s.charAt(i-1) +counter; //complexité en k^2
            //reset counter
            counter = 1;
            if(i == s.length() - 1){
        secondString += s.charAt(i)+"1";}
        }	
        }
        if(secondString.length() < s.length()) return secondString;
            else return s;
    }
}