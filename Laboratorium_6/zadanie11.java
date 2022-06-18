class Main {
    public static void main(String[] args) {
       try{
            throwexception(10);
            throwexception(-2);
       }catch (NegativeArgumentException exception){
           System.out.println(exception.getMessage());
       }
    }
    
    public static void throwexception (int number) throws NegativeArgumentException {
     if(number < 0){
         throw new NegativeArgumentException();
         }else{
         System.out.println(number);
     }
    }
}

class NegativeArgumentException extends Exception {
    public NegativeArgumentException() {
        super("Argument nie może być wartością ujemną");
    } 
}
