# Array Pattern Identification Cheatsheet

Absolutely! Knowing which array pattern to apply is a game-changer for problem-solving.

Here’s your 🔍 Array Pattern Cheatsheet – a compact guide to help you identify the right approach by recognizing keywords, constraints, and goals in a problem.

---

## 🧠 Array Pattern Identification Cheatsheet

| 🔍 Problem Type / Keywords                                             | 🧩 Pattern To Use                 | 🛠️ When to Use It                                                        |
| ---------------------------------------------------------------------- | --------------------------------- | ------------------------------------------------------------------------- |
| "Max/Min sum of subarray", "fixed window size k"                       | Fixed Sliding Window              | When the window size is fixed (e.g., max sum of size `k`)                 |
| "Smallest/Largest window", "at most/exactly k", "substrings/subarrays" | Dynamic Sliding Window            | When the window size varies based on conditions                           |
| "Palindrome", "reversed array", "sorted input", "remove duplicates"    | Two Pointers                      | When you can operate from both ends or move slow/fast pointers            |
| "Find target sum", "count pairs", "complement", "frequency"            | Hash Map / Counting               | Use for quick lookups / frequency counts / prefix sums                    |
| "Sum of subarray", "range queries", "find total till index"            | Prefix Sum                        | Pre-calculate cumulative sums to answer range queries in O(1)             |
| "Max sum of contiguous subarray"                                       | Kadane’s Algorithm                | Use when you need to find max sum over any contiguous subarray            |
| "Search element", "sorted array", "rotated array", "first/last index"  | Binary Search                     | Array is sorted (fully or partially), search or optimize using mid-points |
| "Max area", "trapping water", "3Sum", "sorted + sum"                   | Two Pointers + Sorting            | Common for optimization with sorted input or symmetric traversal          |
| "Move elements", "rotate", "in-place changes", "rearrange"             | Reverse / In-place Swap           | Efficient memory use or rearranging arrays                                |
| "Prefix/suffix condition", "product except self"                       | Prefix + Suffix Arrays            | Useful when output depends on left + right traversal results              |
| "Sort colors", "partition 0/1/2", "Dutch flag"                         | Three Pointers / Partitioning     | Used to sort or group elements in-place in linear time                    |

---

## ⚡ Example Cues & Matches

| 💬 Problem Asks...                                 | ✅ Think Of...                              |
| -------------------------------------------------- | ------------------------------------------ |
| Find subarray of length `k` with max sum           | Fixed-size Sliding Window                  |
| Find longest substring with ≤ k distinct chars     | Variable-size Sliding Window + HashMap     |
| Sorted array; find if two elements sum to target   | Two Pointers                               |
| Find subarray with sum = k                         | Prefix Sum + Hash Map                      |
| Find first/last occurrence in sorted array         | Binary Search                              |
| Remove duplicates from sorted array in-place       | Two Pointers                               |
| Find max sum of subarray (any length)              | Kadane’s Algorithm                         |
| Find product of array except self (no division)    | Prefix + Suffix Product Arrays             |
| Search in rotated sorted array                     | Binary Search (with conditions)            |
| Group all 0s, 1s, 2s                                | Dutch National Flag Algorithm              |

---

## 🧩 Tips to Use This Cheatsheet

1. Start by scanning constraints:
   - Is the array sorted?
   - Are you allowed extra space?
   - Are you looking for a specific value, a count, or max/min?

2. Match problem structure to a pattern.

3. Use this as a decision tree:

```text
Is the array sorted?
  └─ Yes → Try Two Pointers or Binary Search

Is it about subarrays / substrings?
  └─ Fixed size? → Sliding Window (fixed)
  └─ Varying size with conditions? → Sliding Window + HashMap

Need to find max sum / product?
  └─ Max contiguous sum? → Kadane’s Algorithm
  └─ Product except self? → Prefix & Suffix arrays

Asking for pair/triplet sum?
  └─ Sorted? → Two Pointers
  └─ Unsorted? → Hash Map

Is the problem index-based or range-based?
  └─ Use Prefix Sum
