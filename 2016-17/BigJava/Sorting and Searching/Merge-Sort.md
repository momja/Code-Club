# Merge Sort
Much more efficient than selection sort

Merge sort works by dividing the array into smaller and smaller subarrays, sorting them, and then merging together the sorted subarrays
- alright so you have your two subarrays. Now you compare the first value of each subarray. The smaller value will be put into our new merged array, and dropped from the subarray. Keep comparing the first value, until all elements are dropped from the subarrays and placed in the merged array. So if we split into 4 subarrays, we will merge two together, making 2 subarrays, which we then merge to create 1 final sorted array.
