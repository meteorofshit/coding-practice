package com.practice;

public class ArrayString {

  public static boolean isPelindrome(String str) {
    for(int i=0; i < str.length()/2; i++) {
      if(str.charAt(i) != str.charAt(str.length()-1-i)) {
        return false;
      }
    }
    return true;
  }

  public static String Reverse(String str) {
    char[] arr = str.toCharArray();
    for(int i=0; i < arr.length/2; i++) {
      int last = arr.length - 1 - i;
      char swap = arr[i];
      arr[i] = arr[last];
      arr[last] = swap;
    }
    return new String(arr);
  }

  public static char[] MergeArrays(char[] a, char[] b) {
    int i = 0, j = 0;
    char[] c = new char[a.length + b.length];
    while(i < a.length &&  j < b.length)  {
      if(a[i] < b[j]){
        c[i+j] = a[i++];
      } else {
        c[i+j] = b[j++];
      }
    }
    while(i < a.length) {
      c[i+j] = a[i++];
    }
    while(j < b.length) {
      c[i+j] = a[j++];
    }
    return c;
  }

  public static boolean hasRepeatedLetters(String str) {
    int size = 17*65536;
    boolean[] arr = new boolean[size];
    for(int i=0; i < str.length(); i++) {
        int idx = str.charAt(i) % size;
        if(arr[idx] == true) {
            return true;
        }
        arr[idx] = true;
    }
    return false;
  }
}
