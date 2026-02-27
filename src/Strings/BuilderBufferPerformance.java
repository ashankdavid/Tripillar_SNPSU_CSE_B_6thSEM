package Strings;

public class BuilderBufferPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("Placement");
        for(int i=0; i<10000000; i++){
            sbf.append("Training");
        }
        System.out.println("Time Taken by String Buffer: "
         + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        StringBuilder sbl = new StringBuilder("Placement");
        for(int i=0; i<10000000; i++){
            sbl.append("Training");
        }
        System.out.println("Time Taken by String Builder: "
         + (System.currentTimeMillis() - startTime) + "ms");
    }
}
