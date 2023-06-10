class exceptionpr1 {
    public static void main(String[] args) {
        int n = 100;
        int a = 0;

        for (int i = 0; i < 10; i++) {
            try{
                a = n / (int)(Math.random() * 10);
                System.out.println(a);
            } catch (Exception e){
                System.out.println("0");
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                //e.printStackTrace();

            }
        }
    }
}