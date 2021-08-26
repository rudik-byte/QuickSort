# QuickSort

Time taken by QuickSort, in general, can be written as following
```console
T(n) = T(k) + T(n-k-1) + \theta(n)
```
The first two terms are for two recursive calls, the last term is for the partition process. k is the number of elements which are smaller than pivot. 
The time taken by QuickSort depends upon the input array and partition strategy. 

- In the best case, the algorithm will divide the list into two equal size sub-lists. So, the first iteration of the full n-sized list needs O(n). Sorting the remaining two sub-lists with n/2 elements takes 2*O(n/2) each. As a result, the QuickSort algorithm has the complexity of O(n log n).

- In the worst case, the algorithm will select only one element in each iteration, so O(n) + O(n-1) + … + O(1), which is equal to O(n2).

- On the average QuickSort has O(n log n) complexity, making it suitable for big data volumes.

### Choosing the optimal pivot
- The crucial point in QuickSort is to choose the best pivot. The middle element is, of course, the best, as it would divide the list into two equal sub-lists.

- But finding the middle element from an unordered list is difficult and time-consuming, that is why we take as pivot the first element, the last element, the median or any other random element.
