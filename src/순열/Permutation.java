package ����;

import java.util.Scanner;

/**
 * ���� : n �� �߿��� r ���� �����ְ� �̱�
 * �ð����⵵: O(n!)
 */

public class Permutation {
    public static void main(String[] args) {

        char[] alpha = new char[26];
        
        for(int i=0; i<26; i++) {
        	alpha[i] = (char) (i+97);
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] visited = new boolean[n];
        char[] print = new char[n];
        int r = sc.nextInt();
        
        alphaPerm(alpha, print, visited, 0, n, r);
              
        n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        visited = new boolean[n];
        
        perm(arr, output, visited, 0, n, 3);
        System.out.println();
        permutation(arr, 0, n, 3);
    }
    
    static void alphaPerm(char[] arr, char[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
        	show(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                alphaPerm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
                ;
            }
        }
    }

    static void show(char[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // ���������� ���� ���ϱ�
    // ��� ����: perm(arr, output, visited, 0, n, 3);
    static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1, n, r);
                visited[i] = false;
                ;
            }
        }
    }

    // ���� ���ϱ�
    // ��� ����: permutation(arr, 0, n, 4);
    static void permutation(int[] arr, int depth, int n, int r) {
        if (depth == r) {
            print(arr, r);
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r);
            swap(arr, depth, i);
        }
    }

    static void swap(int[] arr, int depth, int i) {
        int temp = arr[depth];
        arr[depth] = arr[i];
        arr[i] = temp;
    }

    // �迭 ���
    static void print(int[] arr, int r) {
        for (int i = 0; i < r; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}