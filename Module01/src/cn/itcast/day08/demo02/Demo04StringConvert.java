package cn.itcast.day08.demo02;
public class Demo04StringConvert {
    public static void main(String[] args) {
//        转换成字符数组
        char[] chars = "Hello".toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("=========");

//        转换成字节数组
        byte[] bytes = "abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("============");
        String str1 = "How do you do?";
        String str2 = str1.replace("o","*");
        System.out.println(str1); // How do you do?
        System.out.println(str2); // H*w d* y*u d*?
        System.out.println("=============");

        String lang1 = "会不会玩呀！你大爷的！你大爷的！你大爷的！你大爷的！!!";
        String lang2 = lang1.replace("你大爷的", "****");
        System.out.println(lang2); // 会不会玩呀！****！****！****！****！!!
    }
}

