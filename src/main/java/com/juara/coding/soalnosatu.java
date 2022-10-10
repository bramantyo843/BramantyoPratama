package com.juara.coding;

public class soalnosatu {
    public static void main(String[] args) {
        int angka = 4;

        // Nested Loops atau double looping


            for (int a = 10; a >= 0; a--) {
                if (a % 3 == 0) {
                    for (int b = 1; b <= a; b++) {
                        System.out.print(b + "_");
                        b++;
                    }
                    System.out.println();
                }

            }
        }
    }

