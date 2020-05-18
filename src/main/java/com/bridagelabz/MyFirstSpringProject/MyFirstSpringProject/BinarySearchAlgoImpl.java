package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchAlgoImpl {
    @Autowired
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
