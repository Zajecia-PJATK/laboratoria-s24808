class Main {
    public static void main(String[] args) {
       try{
            throwexception(10);
            throwexception(-2);
       }catch (IllegalArgumentException exception){
           System.out.println(exception.getMessage());
       }
    }
    
    public static void throwexception (int number) throws IllegalArgumentException{
     if(number < 0)
     {
         throw new IllegalArgumentException("Argument nie może być wartością ujemną");
     }else{
         System.out.println(number);
     }
}
}
