package ¼ø¿­;

import java.util.Scanner;

public class Main {
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
            }
        }
    }

    static void show(char[] arr, int r) {
    	String answer = "";
        for (int i = 0; i < r; i++) {
        	answer += arr[i];
        }
        System.out.println(answer);
    }
}