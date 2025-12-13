package org.studyeasy;
public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort=new BubbleSort();
        int arr[]={11,50,60,22,0,91,34,1,4};
        bubbleSort.bubbleSort(arr);
        bubbleSort.printArray(arr);
    }
}