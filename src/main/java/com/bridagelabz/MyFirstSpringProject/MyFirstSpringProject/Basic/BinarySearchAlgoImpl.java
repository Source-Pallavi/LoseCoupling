package com.bridagelabz.MyFirstSpringProject.MyFirstSpringProject.Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchAlgoImpl {
    @Autowired
    @Qualifier("bubbleSortAlgo")
    SortingAlog sortingAlog;

    public BinarySearchAlgoImpl(@Qualifier("bubbleSortAlgo") SortingAlog sortingAlog) {
        this.sortingAlog = sortingAlog;
    }

    int binarySearch(int[] arr, int num) {
        sortingAlog.sort(arr);
        System.out.println(sortingAlog);
        return 3;
    }
}
