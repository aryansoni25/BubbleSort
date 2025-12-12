package org.studyeasy;
public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]={1,50,60,2,0,91,34,21,4};
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }
}