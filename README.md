# Leetcode Progress

A growing collection of LeetCode problem solutions organized by problem number and topic. This repository is primarily focused on Java solutions, with a few Python and C++ examples as well.

## Overview

This repository documents a consistent problem-solving journey across:

- Arrays and strings
- Hashing and maps
- Linked lists
- Trees and binary search
- Dynamic programming
- Greedy algorithms
- Backtracking
- SQL / database problems
- Common interview and algorithmic patterns

The goal is to practice, revisit, and improve problem-solving skills through clean, readable implementations.

## Repository Structure

```text
Leetcode-Progress/
├── .github/
├── leetcode-solutions/
│   ├── 0001-two-sum/
│   ├── 0002-add-two-numbers/
│   ├── 0003-longest-substring-without-repeating-characters/
│   ├── ...
│   └── 4342-create-grid-with-exactly-one-path/
├── SECURITY.md
├── README.md
└── LICENSE (if added later)
```

Each folder in `leetcode-solutions/` is named using the LeetCode problem number and title, such as:

- `0001-two-sum`
- `0053-maximum-subarray`
- `0102-binary-tree-level-order-traversal`
- `0215-kth-largest-element-in-an-array`

Inside each solution directory, you will typically find a source file implementing the solution for that problem.

## Languages

This repository is mainly Java-based, which matches the majority of the code in the project:

- Java: 94.6%
- Python: 5.3%
- C++: 0.1%

## How to Use

1. Browse the `leetcode-solutions/` directory.
2. Open the folder for the problem you want to study.
3. Read the implementation and compare it with your own approach.
4. Use the problem number in the folder name as a quick reference when revisiting problems.

## Example

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        return new int[] {-1, -1};
    }
}
```

## Learning Goals

This repository aims to:

- Strengthen algorithmic thinking
- Improve coding speed and accuracy
- Practice common interview patterns
- Maintain a clean record of daily/weekly progress
- Build a reusable reference library for future revisions

## Contribution

This repository is a personal progress tracker, but contributions, suggestions, and alternative solutions are welcome in the spirit of learning and improvement.

## Notes

- The project is organized by LeetCode ID for easy navigation.
- Many solutions follow standard competitive programming patterns and may be optimized further depending on the use case.
- This repository is intended for learning, practice, and progress tracking.

## License

This project does not currently declare a license file. If you plan to share it publicly, adding an appropriate open-source license is recommended.

---

Made with focus, consistency, and problem-solving practice.
