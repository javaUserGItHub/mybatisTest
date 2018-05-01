import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

import java.io.*;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    private String name = "ddd";
    // @Override

//    public Test() {
//        System.out.println("Test1");
//    }
//
//    {
//        System.out.println("Test2");
//    }
//
//    static {
//        System.out.println("Test3");
//    }
//
//    String str = new String("good");
//    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {

//    Test t=new Test();
//    t.method(t.str,t.ch);
//        System.out.println(t.str+" , "+t.ch);
//        Test t=new Test();
// System.out.println(t.getName()+"----"+t.name);
//        String s=new String("abc");
//        String s1="abc";
        //      String s2=new String("abc");
//        Integer s= new Integer(100);

//        Integer s1=100;
//        int [] a=new int[]{1,2,3};
//      new Test();

//        Test1 t1=new Test1();
//        System.out.println(6<<2);
        //  t.defaultMethod();
//        System.out.println(s==s2);
//        System.out.println(s2==s1);

//        int result=0;
//        switch (2){
//            case 1:
//                result=result+2;
//            case 2:
//                result=result+2*2;
//            case 3:
//                result=result+2*3;
//        }
//        System.out.println(result);
        String path="D:\\rights_management.sql";
        //读取文件  141
        Long stat=System.currentTimeMillis();
//        FileInputStream inputStream = null;
//
//        Scanner sc = null;
//
//        try {
//
//            inputStream = new
//                    FileInputStream(path);
//
//            sc = new
//                    Scanner(inputStream, "UTF-8");
//            int i = 0;
//            while
//                    (sc.hasNextLine()) {
//                i++;
//                String line = sc.nextLine();
//                System.out.println(i);
//                System.out.println(line);
//
//            }
//
//            // note that Scanner suppresses exceptions
//
//            if
//                    (sc.ioException() != null) {
//
//                throw
//                        sc.ioException();
//
//            }
//            System.out.println(System.currentTimeMillis()-stat);
//        } catch (Exception e) {
//
//        } finally {
//
//            if
//                    (inputStream != null) {
//                try {
//
//                    inputStream.close();
//                } catch (Exception e) {
//                }
//
//            }
//
//            if
//                    (sc != null) {
//
//                sc.close();
//
//            }
//
//        }

      //  readFileByByte(path);
      //  readFileByLine(path);



        System.out.println(encode("123456"));





    }

    public static String encode(String password){
        Md5PasswordEncoder encoder = new Md5PasswordEncoder();
        return encoder.encodePassword(password, "hyll");
    }

    /**
     * 以行为单位读取文件内容 50
     * @param filePath
     */
    public static void readFileByLine(String filePath){
        File file = new File(filePath);
        // BufferedReader:从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
        BufferedReader buf = null;
        try{
            // FileReader:用来读取字符文件的便捷类。
            buf = new BufferedReader(new FileReader(file));
            // buf = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String temp = null ;
            while ((temp = buf.readLine()) != null ){
                System.out.println(temp);
            }
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            if(buf != null){
                try{
                    buf.close();
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        }
    }

    /**
     * 以字符为单位读取文件内容 322
     * @param filePath
     */
    public static void readFileByCharacter(String filePath){
        File file = new File(filePath);
        // FileReader:用来读取字符文件的便捷类。
        FileReader reader = null;
        try{
            reader = new FileReader(file);
            int temp ;

            while((temp = reader.read()) != -1){
                if (((char) temp) != '\r') {
                    System.out.print((char) temp);
                }
            }
        }catch(IOException e){
            e.getStackTrace();
        }finally{
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 以字节为单位读取文件内容    255
     * @param filePath：需要读取的文件路径
     */
    public static void readFileByByte(String filePath) {
        File file = new File(filePath);
        // InputStream:此抽象类是表示字节输入流的所有类的超类。
        InputStream ins = null ;
        try{
            // FileInputStream:从文件系统中的某个文件中获得输入字节。
            ins = new FileInputStream(file);
            int temp ;
            // read():从输入流中读取数据的下一个字节。
            while((temp = ins.read())!=-1){
                System.out.write(temp);
            }
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            if (ins != null){
                try{
                    ins.close();
                }catch(IOException e){
                    e.getStackTrace();
                }
            }
        }
    }

    public void method(String str, char ch[]) {
        str = "test";
        ch[0] = 'g';
        System.out.println("11");
    }



}

class HelloA {
    public HelloA() {
        System.out.println("helloa1");
    }

    {
        System.out.println("helloa2");
    }

    static {
        System.out.println("helloa3");
    }
}
