package java_study;

import java.util.ArrayList;
public class example16 {
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList();

        arrayList.add("more");
        arrayList.add(22);

        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }
}
