package com.education.ztu.lab1;


public class Task3 {
    public static void main(String[] args) {
        task3(new String[]{"2","3","5","8"});
    }

    public static void task3(String[] args){
        if(args.length>0){
            StringBuilder res = new StringBuilder();
            for(String arg : args){
                res.append(arg).append(" ");
            }
            res.deleteCharAt(res.length()-1);
            System.out.println(res);
        }
    }
}
