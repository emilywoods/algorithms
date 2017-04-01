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
