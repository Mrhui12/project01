package com.tang.tree;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HeapSort {
    public static void main(String[] args) {
        int arr[] = new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i] = (int) (Math.random() * 8000000);
        }
        System.out.println("排序前");
        Date data1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data1Str = simpleDateFormat.format(data1);
        System.out.println("排序前时间"+data1Str);

        heapSort(arr);
        System.out.println("排序hou");
        Date data2 = new Date();

        String data2Str = simpleDateFormat.format(data1);
        System.out.println("排序前时间"+data2Str);
    }

    public static void heapSort(int arr[]) {

        int temp = 0;
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);

        }
        for (int j = arr.length-1; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
    }

    public static void adjustHeap(int arr[], int i, int length) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            if (k + 1 < length && arr[k + 1] > arr[k]) {
                k++;
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }


        }
        arr[i] = temp;
    }

}

