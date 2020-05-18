package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject;

public class BinarySearchAlgoImpl {
    SortingAlog sortingAlog;

    public BinarySearchAlgoImpl(SortingAlog sortingAlog)
    {
        this.sortingAlog = sortingAlog;
    }

    int binarySearch(int[] arr, int num)
     {
     sortingAlog.sort(arr);
         System.out.println(sortingAlog);
          return 3;
     }
}
