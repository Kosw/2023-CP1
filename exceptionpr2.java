public class exceptionpr2 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생시킴");
            throw e;
        }catch (Exception e){
            System.out.println("error message" + e.getMessage());
            //e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음");
    }
}
