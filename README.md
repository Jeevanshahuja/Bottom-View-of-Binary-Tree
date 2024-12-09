
## Problem Description

You are given a binary tree, and your task is to return its **bottom view**.  

The **bottom view** of a binary tree is the set of nodes visible when the tree is viewed from the bottom.  

### Rules:  
1. Nodes should be returned in order from the **leftmost** to the **rightmost** position.  
2. If two nodes are at the same horizontal distance, the **lowest** node in the tree (farthest from the root) is considered.  

---

### Solution Approach

The solution employs a **Breadth-First Search (BFS)** technique to compute the bottom view using horizontal distances (HD) for each node.  

**Steps**:  
1. **Use Two Queues**:  
   - One for nodes (`q`) and another for their respective horizontal distances (`hd`).  
2. **Track Horizontal Distances**:  
   - Use a `TreeMap` to map horizontal distances to the last node encountered at each HD.  
3. **Processing Nodes**:  
   - For each node:
     - Calculate its HD:  
       - Left child: `currentHD - 1`  
       - Right child: `currentHD + 1`  
     - Update the map with the node’s value, as it represents the bottom view for that HD.  
4. **Extract Results**:  
   - Traverse the map from leftmost HD to rightmost HD and store the values in the result list.  

---

### Time and Space Complexity  

- **Time Complexity**: O(n), where `n` is the number of nodes in the binary tree. Each node is processed once.  
- **Space Complexity**: O(n), for the queues and the `TreeMap`.  

---

For a detailed explanation of the approach, visit the [description here](https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1).
