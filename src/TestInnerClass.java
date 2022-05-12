public class TestInnerClass {

    public static void main(String[] args) {

        TestApp testApp = new TestApp();

        testApp.printlnMsj();
        TestApp.StaticClass stClast = new TestApp.StaticClass();
        stClast.printMsj();



        TestApp.InnerClass innerClass = testApp.new InnerClass();

        innerClass.printlMsj();
    }

}
