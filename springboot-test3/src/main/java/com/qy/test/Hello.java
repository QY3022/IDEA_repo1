package com.qy.test;


/**
 * @author by QY3022
 * @date 2020/1/15.
 */
//@Component
//@ConfigurationProperties(prefix = "csc.asd")
public class Hello {

    public static void main(String[] args) {
        int i = chengJi(3);
        System.out.println(i);
        String str = "112";
        str.toLowerCase();
    }


    //打印乘法口诀表
    public static void println(){
        for(int i =1;i<=9;i++){
            for(int j =1;j<=9;j++){
                if(j<=i){
                    System.out.print(i+"*"+j+"="+i*j);
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * 乘积问题
     */
    public static int chengJi(int i){
        if(i == 1){
            return 1;
        }
        return i * chengJi(i-1);
    }

}
