package String;

import Inheritance.second;

interface stringInterface{
    int length(String str);
}

abstract class AbstractClass implements stringInterface{
    abstract String toggleString(String str);
}

abstract class Implementation extends AbstractClass{
    public int length(String str){
        return str.length();
    }
    
    public String toggleString(String str){
        StringBuilder string = new StringBuilder();
        for(int i=0; i<string.length(); i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                string.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                string.append(Character.toUpperCase(ch));
            }
            else{
                string.append(ch);
            }
        }
        return string.toString();
    }
}

public class main {
    public static void main(String[] args){
        Implementation done = new Implementation() {
            
        }; 
    }
}
