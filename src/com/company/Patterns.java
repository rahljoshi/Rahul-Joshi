package com.company;

import com.sun.source.util.DocTreePathScanner;

import javax.swing.*;
import java.util.*;

public class Patterns {
    public Patterns() {

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                if (col <= row)
                    System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}