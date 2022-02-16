# Data-Structures-and-Algorithm:man_technologist:
A documentation of my struggling journey with Data Structures and Algorithm. Entering the playing field with absolutely zero knowledge on DSA. LFG!:man_astronaut:

My journey begins on 06 Feb 2022.
After much persuasion from Fiora, I have decided to finally venture into the world of DSA after doing many if else statements and boring basic codes for my school assignments. <br/>
.<br/>
.<br/>
.<br/>

## Big O Cheat Sheet:ok_hand:	
### -Big Os-
**O(1)** Constant Time - no loops<br/>
<br/>
**O(log N)** Logarithmic Time - usually searching algorithms have log n if they are sorted (Binary Search)<br/>
<br/>
**O(n)** Linear Time - for loops, while loops through n items<br/>
<br/>
**O(n log(n))** Log Linear Time- usually sorting operations<br/>
<br/>
**O(n^2)** Quadratic Time- every element in a collection needs to be compared to ever other element. Two
nested loops<br/>
<br/>
**O(2^n)** Exponential Time- recursive algorithms that solves a problem of size N<br/>
<br/>
**O(n!)** Factorial Time- you are adding a loop for every element<br/>
<br/>
**Iterating through half a collection is still O(n)<br/>
Two separate collections: O(a * b)**
<br/>
<br/>
<br/>
<br/>
### -What can cause time in a function?-
Operations (+, -, *, /)<br/>
Comparisons (<, >, ==)<br/>
Looping (for, while)<br/>
Outside Function call (function())
<br/>
<br/>
<br/>
<br/>
### -Rule Book-
Rule 1: Always worst Case<br/>
Rule 2: Remove Constants<br/>
Rule 3: Different inputs should have different variables. O(a+b). A and B arrays nested would be
O(a*b)<br/>
'+' for steps in order<br/>
'*'* for nested steps<br/>
Rule 4: Drop Non-dominant terms<br/>
<br/>
<br/>
<br/>
### -What causes Space complexity?- <br/>
Variables<br/>
Data Structures<br/>
Function Call<br/>
Allocations<br/>
