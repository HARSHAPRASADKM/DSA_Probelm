# Intermediate Array Problems — Day 1

## Instructions
- Try each problem yourself before looking for help.
- Aim for 20–40 minutes per problem.
- Write the logic first, then code it in Java.
- Pay attention to edge cases.
- No solutions are included.

---

## 1. Second Smallest Distinct Element

### Problem
Given an integer array, find the second smallest **distinct** element.

### Example
Input:
```text
7 4 9 2 4 1 2
```

Output:
```text
2
```

### Test Cases

**Test Case 1**
```text
Input:
5 3 8 1 9 2
Output:
2
```

**Test Case 2**
```text
Input:
10 10 5 8 5 3
Output:
5
```

**Test Case 3**
```text
Input:
-5 -2 -8 -1 -3
Output:
-5
```

**Test Case 4**
```text
Input:
1 1 1 2 2
Output:
2
```

**Test Case 5**
```text
Input:
7
Output:
No second distinct element
```

---

## 2. Remove Duplicate Elements

### Problem
Given an integer array, remove duplicate elements while keeping the **first occurrence** of each element.

### Example
Input:
```text
1 2 3 2 4 1 5
```

Output:
```text
1 2 3 4 5
```

### Test Cases

**Test Case 1**
```text
Input:
1 2 3 2 4 1 5
Output:
1 2 3 4 5
```

**Test Case 2**
```text
Input:
5 5 5 5
Output:
5
```

**Test Case 3**
```text
Input:
1 2 3 4 5
Output:
1 2 3 4 5
```

**Test Case 4**
```text
Input:
-1 -2 -1 -3 -2
Output:
-1 -2 -3
```

**Test Case 5**
```text
Input:
0 1 0 2 1 3
Output:
0 1 2 3
```

---

## 3. Find All Duplicate Elements

### Problem
Given an integer array, find all values that occur more than once.

### Example
Input:
```text
1 2 3 2 4 1 5
```

Output:
```text
1 2
```

### Test Cases

**Test Case 1**
```text
Input:
1 2 3 2 4 1 5
Output:
1 2
```

**Test Case 2**
```text
Input:
5 5 5 5
Output:
5
```

**Test Case 3**
```text
Input:
1 2 3 4 5
Output:
No duplicates
```

**Test Case 4**
```text
Input:
2 3 2 4 3 5 4
Output:
2 3 4
```

**Test Case 5**
```text
Input:
-1 -2 -1 -3 -2 -3
Output:
-1 -2 -3
```

---

## 4. Find the Missing Number

### Problem
An array contains numbers from `1` to `n`, but exactly one number is missing. Find the missing number.

### Example
Input:
```text
1 2 3 5 6
```

Output:
```text
4
```

### Test Cases

**Test Case 1**
```text
Input:
1 2 3 4 6
Output:
5
```

**Test Case 2**
```text
Input:
2 3 4 5
Output:
1
```

**Test Case 3**
```text
Input:
1 2 3 4
Output:
5
```

**Test Case 4**
```text
Input:
1
Output:
2
```

**Test Case 5**
```text
Input:
2 3
Output:
1
```

---

## 5. Move Negative Numbers to One Side

### Problem
Rearrange the array so that all negative numbers are on one side and non-negative numbers are on the other side.

The exact order within each group does not matter unless you choose to preserve it.

### Example
Input:
```text
2 -3 4 -1 5 -6
```

Possible output:
```text
-3 -1 -6 2 4 5
```

### Test Cases

**Test Case 1**
```text
Input:
2 -3 4 -1 5 -6
Expected:
All negative numbers on one side and non-negative numbers on the other
```

**Test Case 2**
```text
Input:
-1 -2 -3 -4
Expected:
All elements are already negative
```

**Test Case 3**
```text
Input:
1 2 3 4
Expected:
All elements are already non-negative
```

**Test Case 4**
```text
Input:
0 -2 5 -7 3
Expected:
Negative numbers grouped on one side
```

**Test Case 5**
```text
Input:
-5 0 -1 2 -3 4
Expected:
Negative numbers grouped on one side and non-negative numbers on the other
```

---

## 6. Find a Pair With a Given Sum

### Problem
Given an array and a target value, find a pair of elements whose sum equals the target.

### Example
Input:
```text
Array: 2 7 11 15
Target: 9
```

Output:
```text
2 7
```

### Test Cases

**Test Case 1**
```text
Array:
2 7 11 15
Target:
9
Output:
2 7
```

**Test Case 2**
```text
Array:
1 4 6 8 10
Target:
14
Output:
4 10 or 6 8
```

**Test Case 3**
```text
Array:
1 2 3 4
Target:
20
Output:
No pair
```

**Test Case 4**
```text
Array:
3 3 5 7
Target:
6
Output:
3 3
```

**Test Case 5**
```text
Array:
-5 2 7 10 -2
Target:
5
Output:
-2 7
```

---

## 7. Find Common Elements of Two Arrays

### Problem
Given two arrays, find the elements that appear in both arrays.

### Example
```text
Array 1:
1 2 3 4

Array 2:
2 4 6 8
```

Output:
```text
2 4
```

### Test Cases

**Test Case 1**
```text
Array 1:
1 2 3 4
Array 2:
2 4 6 8
Output:
2 4
```

**Test Case 2**
```text
Array 1:
1 2 3
Array 2:
4 5 6
Output:
No common elements
```

**Test Case 3**
```text
Array 1:
1 2 2 3
Array 2:
2 2 4
Expected:
2
```

**Test Case 4**
```text
Array 1:
-1 -2 3 4
Array 2:
-2 4 5
Output:
-2 4
```

**Test Case 5**
```text
Array 1:
5 5 5
Array 2:
5 5
Expected:
5
```

---

## 8. Left Rotate an Array by One Position

### Problem
Move every element one position to the left. The first element moves to the end.

### Example
Input:
```text
1 2 3 4 5
```

Output:
```text
2 3 4 5 1
```

### Test Cases

**Test Case 1**
```text
Input:
1 2 3 4 5
Output:
2 3 4 5 1
```

**Test Case 2**
```text
Input:
10 20
Output:
20 10
```

**Test Case 3**
```text
Input:
7
Output:
7
```

**Test Case 4**
```text
Input:
5 4 3 2 1
Output:
4 3 2 1 5
```

**Test Case 5**
```text
Input:
-1 0 5 -3
Output:
0 5 -3 -1
```

---

## 9. Right Rotate an Array by One Position

### Problem
Move every element one position to the right. The last element moves to the beginning.

### Example
Input:
```text
1 2 3 4 5
```

Output:
```text
5 1 2 3 4
```

### Test Cases

**Test Case 1**
```text
Input:
1 2 3 4 5
Output:
5 1 2 3 4
```

**Test Case 2**
```text
Input:
10 20
Output:
20 10
```

**Test Case 3**
```text
Input:
7
Output:
7
```

**Test Case 4**
```text
Input:
5 4 3 2 1
Output:
1 5 4 3 2
```

**Test Case 5**
```text
Input:
-1 0 5 -3
Output:
-3 -1 0 5
```

---

## 10. Maximum Difference Between Two Elements

### Problem
Find the maximum possible difference between two elements where the larger element comes after the smaller element.

### Example
Input:
```text
2 3 10 6 4 8 1
```

Output:
```text
8
```

Because:
```text
10 - 2 = 8
```

### Test Cases

**Test Case 1**
```text
Input:
2 3 10 6 4 8 1
Output:
8
```

**Test Case 2**
```text
Input:
1 2 3 4 5
Output:
4
```

**Test Case 3**
```text
Input:
5 4 3 2 1
Output:
No positive difference
```

**Test Case 4**
```text
Input:
7 1 5 3 6 4
Output:
5
```

**Test Case 5**
```text
Input:
-5 -2 -10 4
Output:
9
```

---

# Recommended Order for Tomorrow

Start with:

1. Second Smallest Distinct Element
2. Remove Duplicate Elements
3. Find Missing Number
4. Pair With Given Sum
5. Left/Right Array Rotation

If you finish those comfortably, continue with 6–10.

**Important:** Some test cases deliberately contain edge cases. Don't change your logic just to pass one example—understand why the edge case behaves differently.
