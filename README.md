# 常用算法练习

<h1>目录
<h2>1. 排序
### 1.1 基本练习

* [冒泡排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/BubbleSort.java)<br>
* [快速排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/QuickSort.java)<br>
* [插入排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/InsertionSort.java)<br>
* [希尔排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/HeapSort.java)<br>
* [选择排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/SelectionSort.java)<br>
* [堆排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/HeapSort.java)<br>
* [归并排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/MergeSort.java)<br>
* [计数排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/CountSort.java)<br>

### 1.2 进阶练习

* [重复值判断](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting3/Checker.java)<br>
* [有序数组合并](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting3/Merge.java)<br>
* [小范围排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting3/ScaleSort.java)<br>
* [有序矩阵查找](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting4/Finder.java)<br>
* [相邻两数最大差值](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting4/Gap.java)<br>
* [最短子数组](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting4/Subsequence.java)<br>
* [三色排序问题](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/sorting4/ThreeColor.java)<br>

<h2>2. 字符串
### 2.1 基本练习
* [拓扑结构相同子树](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex01/IdenticalTree.java)<br>
* [词语变形](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex01/Transform.java)<br>

### 2.2 进阶练习
* [两串旋转](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex02/Rotation.java)<br>
* [句子的逆序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex02/Reverse.java)<br>
* [字符串移位](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex02/Translation.java)
* [拼接最小字典序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex02/Prior.java)

### 2.3 进阶练习
* [空格替换](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex03/Replacement.java)<br>
* [合法括号序列判断](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex03/Parenthesis.java)<br>
* [最长无重复字符子串](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/string/ex03/DistinctSubstring.java)

<h2>3. 栈和队列
### 3.1 基本练习
* [可查询最值的栈](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/stack_queue/ex01/Solution.java)<br>

### 3.2 进阶练习
* [双栈排序](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/stack_queue/ex02/TwoStacks.java)<br>
* [双栈队列](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/stack_queue/ex02/TwoStack.java)<br>
* [栈的反转](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/stack_queue/ex02/StackReverse.java)

### 3.3 进阶练习
* [滑动窗口](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/stack_queue/ex03/SlideWindow.java)<br>
* [构造一棵MaxTree](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/stack_queue/ex03/MaxTree.java)<br>

---

---

基本排序算法简单测试比较,随机生成5万个数值，排序的时间对比如下：

|排序算法|耗时（ms）|
|:---|:---|
|[BubbleSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/BubbleSort.java) | 耗时：4982|
|[InsertionSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/InsertionSort.java)|耗时：4690 |
|[ShellSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/ShellSort.java)|耗时：2168 |
|[SelectionSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/SelectionSort.java)|耗时：1961 |
|[MergeSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/MergeSort.java)| 耗时：10|
|[HeapSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/HeapSort.java)| 耗时：9|
|[QuickSort](https://github.com/LeeeYou/Algorithm2Practice/blob/master/src/com/algorithm2practice/sorting/basic/comparator_speed/QuickSort.java)| 耗时：8|
