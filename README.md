## Algorithms ##

#### 1. Insertion Sort ####

A comparison algorithm used to sort an array of elements. 

The array is subdivided into two sections sorted and unsorted, beginning
with the first element and iterating sequentially through the array. The first two elements are compared,
and are swapped if not in ascending order. This continues to the next element, and compares with the preceding element. If they are not in order
then again they are swapped. The preceding elements of the sorted sublist are then checked again, and 
swapped if no longer in sorted order.

The efficiency and running time of insertion sort is affected by the size of the input,
and how well sorted its values already are.

Insertion sort has order of growth of &theta;(n<sup>2</sup>), and is unsuitable for large data sets.

#### 2. Merge Sort ####
A divide and conquer algorithm which works by recursively dividing the original problem into smaller problems
which are solved for and subsequently recombined to produce a sorted solution.
 
The original array is divided into two subarrays, with indices p - the first element of the first subarray;
q - the last element of the second subarray; and q - the last element of the second subarray.
The subsequences are divided recursively, until divided into sequences of length one, which is already in sorted order.
Following this, the merge process initiates wherein two subsequences are merged in sorted order by comparing the first elements
of the subsequences, and adding the lesser of the two compared values to a sorted sequence.

Merge sort has an order of growth of &theta;(nlgn). The divide step of this algorithm computes the 
middle element of the subarray, and therefore takes constant time. Recursively solving two subsequences
contributes 2T(n/2) [explain] to running time. Merging takes time &theta;(n). The total cost of this can 
be proven to be &theta;(nlgn).

