public class exceptionpr3 {
    public static void main(String[] args) throws Exception {
        method1();
    }

    static void method1() throws Exception{
        try{
            throw new Exception();
        }catch (Exception e) {
            System.out.println("sdbhfkbjkbdskjf");
            e.printStackTrace();
        }
    }

    static void method2() throws  Exception{
        throw new Exception();
    }
}