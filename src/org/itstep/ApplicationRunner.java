package org.itstep;

public class ApplicationRunner {

    public static void main(String[] args) {

        String str1 = "some test string";
        String str2 = "some test string";

        String str3 = new String("1500 UAH");


//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.equals(str3));

        str1 = str1 + " has new text";

        char[] str1Chars = str1.toCharArray();

//        for (int i = 0; i<str1Chars.length; i++){
//            System.out.println(str1Chars[i]);
//        }

//        System.out.println(str1);

        StringBuffer stringBuffer = new StringBuffer(str2);
//        System.out.println(stringBuffer);

        stringBuffer.append(" has new text");
//        System.out.println(stringBuffer);

        StringBuffer stringBufferReversed = stringBuffer.reverse();
//        System.out.println(stringBufferReversed);

        StringBuilder stringBuilder = new StringBuilder(str2);

        String formatedString = str1.replaceAll(" ", "");
        System.out.println(str3);

        String regexString = str3.replaceAll("\\D", "");


        System.out.println(regexString);

        String name = "My name is\n\"Alex\"";

        System.out.println(name);

        String[] lines = name.split("\n");
        System.out.println(lines.length);

    }
}
