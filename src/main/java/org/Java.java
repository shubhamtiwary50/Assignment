package org;

public class Java {
    public static void main(String[] args) {
        String str= "hello";
        String str2="hello";
        String str3= new String("hello");
        str=str.concat("everyone");
//        System.out.println((str.concat("everyone")).hashCode());
        System.out.println(str+" "+str.hashCode());
//        System.out.println(str2+" "+str2.hashCode());
//        System.out.println(str3+" "+str3.hashCode());




        int start=0;
        int end = 5;
        char range[]= new char[end - start];
        str.getChars(start, end, range,0);
        System.out.println(range);
        System.out.println(range.hashCode());
    }
}
