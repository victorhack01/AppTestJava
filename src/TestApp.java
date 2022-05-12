public class TestApp {

    public void printlnMsj(){

        System.out.println("Impresion de msj from parent class");


    }

    public static class StaticClass{



        public void printMsj(){
            System.out.println("Impresion de msj from static class");
        }

    }

    public class InnerClass{
        public void printlMsj(){
            System.out.println("Impresion de msj fromm innner class");
        }
    }
}