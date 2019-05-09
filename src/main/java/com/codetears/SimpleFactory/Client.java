package com.codetears.SimpleFactory;

import java.util.Scanner;

/**
 * @Description: 测试客户端
 * @author: MAYUNKUN
 * @date: 2019年5月8日下午6:04:28
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("请输入数字A");
        Scanner a = new Scanner(System.in);
        Double numA = a.nextDouble();
        System.out.println("请输入数字B");
        Scanner b = new Scanner(System.in);
        Double numB = b.nextDouble();
        System.out.println("请输入运算操作");
        Scanner operation = new Scanner(System.in);
        System.out.println("运算结果为： " + OperationFactory.operation(numA, numB, operation.nextLine()).doOperation());
    }
}
