/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simpleint;
import java.io.*;
import java.util.*;
/**
 *
 * @author vini
 */
public class SimpleInt {

    // input from keyboard
    public static void main(String[] args) {
        System.out.println("Hello World!");
        float p, r, si; int n;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Enter the values of p, n, r");
        p = sc.nextFloat();
        n = sc. nextInt();
        r = sc.nextFloat();
        si = (p*n*r)/100;
        System.out.println("simple interest = Rs." +si);// + job is to convert the float into string and concatenate
        
    }
}
