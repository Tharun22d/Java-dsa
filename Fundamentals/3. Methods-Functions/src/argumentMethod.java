public class argumentMethod {
    public static void main(String[] args) {
        String a = greet("Good Evening"); //method call ->greet("arguments")
        System.out.println(a);
    }

    static String greet(String Mygreet){     //greet(type arg_variable)
        String a = Mygreet;
        return a;
    }
}
