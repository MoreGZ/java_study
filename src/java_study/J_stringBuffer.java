package java_study;


public class J_stringBuffer {
    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("welcome");
        stringBuffer.append(" ");
        stringBuffer.append("to java");

        stringBuffer.insert(11,"html and ");

        System.out.println(stringBuffer);

        stringBuffer.delete(8,10);
        System.out.println(stringBuffer);


        System.out.println(stringBuffer.toString());
    }

}
