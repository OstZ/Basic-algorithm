package CodeTest;
import CS61B.MyArrayQueue;
import CS61B.Sorts;
import DSA.*;
import DSA.Search.Search;
import DSA.Sort.*;
import DSA.List.*;
import DSA.Sort.BubbleSort;
import DSA.Sort.QuickSort;
import DSA.Recursion.Maze;
import JAVA.LearnString.LearnString;
import org.junit.Test;


import java.util.Arrays;

import static org.junit.Assert.*;
public class CodeTest {
    @Test
    public void selectSortTest(){
        int[] arrTest = new int[10];
        int[] arrTgt = new int[10];
        for(int i = 0; i < arrTest.length; ++i) { arrTest[i] = i; arrTgt[i] = i;}
        Sorts.shuffle(arrTest);
        Sorts.selectSort(arrTest);
        assertArrayEquals(arrTest, arrTgt);
    }
    @Test
    public void arrayQueueTest(){
        MyArrayQueue maq = new MyArrayQueue(4);
        maq.addQueue(2);
        maq.addQueue(3);
        maq.addQueue(8);
        maq.getQueue();
        maq.getQueue();
        maq.getQueue();
//        assertEquals(2,maq.getQueue());
//        maq.addQueue(4);
//        maq.addQueue(9);
//        maq.addQueue(0);
//        maq.addQueue(0);
//        for(int i = 0; i < 5; ++i) maq.getQueue();
        maq.show();
    }
    @Test
    public void MyListTest(){
        MyList ml = new MyList();
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; ++i) arr[i] = i;
//        Sorts.shuffle(arr);
        System.out.println("start:");
        for(int i : arr) ml.addNode(i);
        ml.show();
        System.out.println("end:");
        MyList.reverse(ml);
        ml.show();
    }
    @Test
    public void CircleSingleLinkedListTest(){
        int n = 125;
        int k = 10;
        int m = 20;
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; ++i) arr[i] = i + 1;
        CircleSingleLinkedList csll = new CircleSingleLinkedList(arr);
//        String s0 = csll.popM(m, k);
        String s0 = csll.josepfu(m, k);
        System.out.println(s0);
    }
    @Test
    public void ArrStackTest(){
        ArrStack ast = new ArrStack();
        ast.push(20);
        for(int i = 0; i < 10; ++i) ast.push(i);
        while(ast.size() > 0) System.out.println(ast.pop());
    }
    @Test
    public void LinkedListStack(){
        LinkedListStack<Integer> stk = new LinkedListStack<>();
//        stk.push(23);
//        stk.push(90);
//        while(!stk.isEmpty()) System.out.println(stk.pop());
    }
    @Test
    public void RPNCalculatorTest(){
        RPNCalculator calculator = new RPNCalculator();
        Calculator calculator1 = new Calculator();
        String s1 = "9 3 1 - 3 * + 10 2 / +";
        String s2 = "4 5 * 8 - 60 + 8 2 / +";
        String s3 = "(10 + (8-7/9)) + (10 * (8 + 9))";
        String s4 = "1 2 3 4 5 6*****";
        System.out.println(calculator1.getElem(s3));
        System.out.println(calculator1.inToPost(calculator1.getElem(s4)));
        System.out.println(calculator1.compute(s4));
    }
    @Test
    public void KMPTest(){
        String str1 = "bacbadbbabca";
        String str2 = "aaaaaabccvbbbcaaa";
        String str3 = "abc";
//        int[] n = KMP.getNext(str2);
//        Sorts.prtarr(n);
        System.out.println(KMP.kmp(str1, str3));
    }
    @Test
    public void MazeTest(){
        int[][] maze;
        boolean flag;
        while(true){
            maze = Maze.mazeGen(10, 10, 0.4);
            flag = Maze.findWay(maze, 0, 1);
            if(flag) break;
        }
        System.out.println("find way out? " + flag);
        Maze.prtMat(maze);
    }

    @Test
    public void BubbleTest(){
        int[] arr = {2, 1, 7, 5, 9, 10, 8, 3, 4};
        MergeSort.sort(arr);
        Sorts.prtarr(arr);
    }
    @Test
    public void SortEfficTest(){
        int len = 800000;
        int range = 7000000;
        int[] arr = new int[len];
        int[] arrTest = new int[len];
        for(int i = 0; i < len; ++i) {

            arr[i] = (int)(Math.random() * range);
            arrTest[i] = arr[i];
        }
        double st, et;
        double totaltime = 0.0;
        int trail = 30;
        int k = 0;
        while(trail > k){
            for(int i = 0; i < len; ++i) {

                arr[i] = (int)(Math.random() * range);
                arrTest[i] = arr[i];
            }
            st = System.currentTimeMillis();
            RadixSort.sort(arr);
            et = System.currentTimeMillis();
            totaltime += (et - st);
            k++;
        }
        System.out.println("avg: " + totaltime / trail + "ms");
    }
    @Test
    public void SortCorectTest(){
        int len = 50;
        int range = 700;
        int[] arr = new int[len];
        int[] arrTest = new int[len];

        int trail = 30;
        int k = 0;
        while(trail > k){
            for(int i = 0; i < len; ++i) {
                arr[i] = (int)(Math.random() * range);
                arrTest[i] = arr[i];
            }
//            System.arraycopy(arr, 0, arrTest, 0, arr.length - 1);
            Arrays.sort(arrTest);
            RadixSort.sort(arr);
            assertArrayEquals(arrTest, arr);
            k++;
        }
    }

    @Test
    public void SearchTest(){
        int[] arr = {3, 5, 6, 9, 12, 17};
        assertEquals(Search.interPolationSearch(arr, 1), -1);
   /*     int[] arr1 = {4, 2, 1, 9, 3, 2};
        for(int i = arr1.length -1; i > 0; i--)
            for(int j = 0; j < i; ++j){
                if(arr1[j] > arr1[j + 1]){
                    int tmp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = tmp;
                }
            }
        Sorts.prtarr(arr1);*/
    }
    @Test
    public void StringTest(){
        String str = "12345678";
        System.out.println(LearnString.reverse(str, 2, 4));
    }

}
