# Beginner Array Programs - Quick Recap

This file contains all beginner array programs with 3 test cases each for quick revision.

---

## 1. Sum of Numbers (`sum_of_numbers.java`)

### Program
```java
import java.util.*;

class sum_of_numbers {
    public static void main(String[] args) {
        sum_of_numbers sm = new sum_of_numbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int res = sm.Solution(N, n);
        System.out.printf("smallest number  : %d ", res);
    }

    int Solution(int N[], int n) {
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum = sum + N[j];
        }
        return sum;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[1, 2, 3, 4, 5]` | `15` |
| 2 | `[10, -5, 3, 7]` | `15` |
| 3 | `[0, 0, 0, 0]` | `0` |

---

## 2. Smallest Number (`smallest_number.java`)

### Program
```java
import java.util.*;

class smallest_number {
    public static void main(String[] args) {
        smallest_number sm = new smallest_number();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int res = sm.Solution(N, n);
        System.out.printf("smallest number is : %d ", res);
    }

    int Solution(int N[], int n) {
        int smallest = N[0];
        for (int j = 1; j < n; j++) {
            if (N[j] < smallest) {
                smallest = N[j];
            }
        }
        return smallest;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[5, 2, 8, 1, 9]` | `1` |
| 2 | `[-3, -10, -1, -7]` | `-10` |
| 3 | `[42]` | `42` |

---

## 3. Second Largest Number (`second_largest_number.java`)

### Program
```java
import java.util.*;

class second_largest_number {
    public static void main(String[] args) {
        second_largest_number lg = new second_largest_number();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int res = lg.Solution(N, n);
        System.out.printf("%d ", res);
    }

    int Solution(int N[], int n) {
        int largest1 = N[0];
        int second_largest = Integer.MIN_VALUE;
        for (int j = 1; j < n; j++) {
            if (N[j] > largest1) {
                second_largest = largest1;
                largest1 = N[j];
            } else if (N[j] != largest1) {
                if (N[j] > second_largest) {
                    second_largest = N[j];
                }
            }
        }
        return second_largest;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[10, 20, 30, 40, 50]` | `40` |
| 2 | `[5, 5, 5, 5]` | `Integer.MIN_VALUE` (no second largest) |
| 3 | `[100, 50, 75, 25]` | `75` |

---

## 4. Reverse Numbers (`reverse_numbers.java`)

### Program
```java
import java.util.*;

class reverse_numbers {
    public static void main(String[] args) {
        reverse_numbers rv = new reverse_numbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        rv.Solution(N, n);
    }

    void Solution(int N[], int n) {
        int reverse_array[] = new int[n];
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            reverse_array[j] = N[i];
            System.out.printf("%d ", reverse_array[j]);
        }
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[1, 2, 3, 4, 5]` | `5 4 3 2 1` |
| 2 | `[10, 20, 30]` | `30 20 10` |
| 3 | `[7]` | `7` |

---

## 5. Positive, Negative & Zero Count (`positive_and_negative.java`)

### Program
```java
import java.util.*;

class positive_and_negative {
    public static void main(String[] args) {
        positive_and_negative sm = new positive_and_negative();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int res = sm.Solution(N, n);
        System.out.printf("number of zero's: %d ", res);
    }

    int Solution(int N[], int n) {
        int count_positive = 0;
        int count_negative = 0;
        int count_zero = 0;
        for (int j = 0; j < n; j++) {
            if (N[j] > 0) {
                count_positive = count_positive + 1;
            } else if (N[j] < 0) {
                count_negative = count_negative + 1;
            } else {
                count_zero = count_zero + 1;
            }
        }
        System.out.printf("number of positive numbers : %d ", count_positive);
        System.out.println();
        System.out.printf("number of negative numbers : %d ", count_negative);
        System.out.println();
        return count_zero;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[1, -2, 0, 3, -4, 0]` | Positive: 2, Negative: 2, Zero: 2 |
| 2 | `[-1, -2, -3]` | Positive: 0, Negative: 3, Zero: 0 |
| 3 | `[5, 10, 15]` | Positive: 3, Negative: 0, Zero: 0 |

---

## 6. Occurrence Count (`occurance.java`)

### Program
```java
import java.util.*;

class occurance {
    public static void main(String[] args) {
        occurance oc = new occurance();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }
        System.out.println("tell the number for finding occurance in this array : ");
        int occ = sc.nextInt();

        int res = oc.Solution(N, n, occ);
        System.out.printf("the number %d is occured %d times in given array ", occ, res);
    }

    int Solution(int N[], int n, int occ) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (occ == N[i]) {
                count = count + 1;
            }
        }
        System.out.println();
        return count;
    }
}
```

### Test Cases

| Test Case | Input Array | Number to Find | Expected Output |
|-----------|-------------|----------------|-----------------|
| 1 | `[1, 2, 3, 2, 4, 2]` | `2` | `3` |
| 2 | `[5, 5, 5, 5]` | `5` | `4` |
| 3 | `[10, 20, 30]` | `15` | `0` |

---

## 7. Move Zero to End (`move_zero_to_end.java`)

### Program
```java
import java.util.*;

class move_zero_to_end {
    public static void main(String[] args) {
        move_zero_to_end rv = new move_zero_to_end();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        rv.Solution(N, n);
    }

    int Solution(int N[], int n) {
        int new_array[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (N[i] != 0) {
                new_array[j] = N[i];
                j++;
            }
        }
        for (int k = j; k < n; k++) {
            new_array[k] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", new_array[i]);
        }
        return -1;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[1, 0, 2, 0, 3, 0]` | `1 2 3 0 0 0` |
| 2 | `[0, 0, 0]` | `0 0 0` |
| 3 | `[5, 10, 15]` | `5 10 15` |

---

## 8. Largest Number (`largest.java`)

### Program
```java
import java.util.*;

class largest {
    public static void main(String[] args) {
        largest lg = new largest();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers ", n);

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int res = lg.Solution(N, n);
        System.out.printf("%d ", res);
    }

    int Solution(int N[], int n) {
        int largest1 = N[0];
        for (int j = 1; j < n; j++) {
            if (N[j] > largest1) {
                largest1 = N[j];
            }
        }
        return largest1;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[3, 7, 2, 9, 5]` | `9` |
| 2 | `[-10, -5, -20]` | `-5` |
| 3 | `[100]` | `100` |

---

## 9. Even Number Count (`even_number.java`)

### Program
```java
import java.util.*;

class even_number {
    public static void main(String[] args) {
        even_number ev = new even_number();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int N[] = new int[n];
        System.out.printf("enter %d numbers : ", n);
        System.out.println();

        for (int i = 0; i < n; i++) {
            N[i] = sc.nextInt();
        }

        int res = ev.Solution(N, n);
        System.out.printf("total number of even number is : %d ", res);
    }

    int Solution(int N[], int n) {
        int count = 0;
        System.out.print("the numbers are :");
        for (int j = 0; j < n; j++) {
            if (N[j] % 2 == 0) {
                count = count + 1;
                System.out.printf(" %d  ", N[j]);
            }
        }
        System.out.println();
        return count;
    }
}
```

### Test Cases

| Test Case | Input Array | Expected Output |
|-----------|-------------|-----------------|
| 1 | `[1, 2, 3, 4, 5, 6]` | Even numbers: `2 4 6`, Count: `3` |
| 2 | `[2, 4, 6, 8]` | Even numbers: `2 4 6 8`, Count: `4` |
| 3 | `[1, 3, 5, 7]` | Even numbers: (none), Count: `0` |

---

## Quick Reference Summary

| Program | Method Name | Returns |
|---------|-------------|---------|
| Sum of Numbers | `Solution(int[], int)` | `int` (sum) |
| Smallest Number | `Solution(int[], int)` | `int` (smallest) |
| Second Largest | `Solution(int[], int)` | `int` (second largest) |
| Reverse Array | `Solution(int[], int)` | `void` (prints) |
| Pos/Neg/Zero Count | `Solution(int[], int)` | `int` (zero count) |
| Occurrence Count | `Solution(int[], int, int)` | `int` (count) |
| Move Zero to End | `Solution(int[], int)` | `int` (-1, prints) |
| Largest Number | `Solution(int[], int)` | `int` (largest) |
| Even Number Count | `Solution(int[], int)` | `int` (count) |