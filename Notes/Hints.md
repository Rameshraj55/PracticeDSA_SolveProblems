=======================================================================================================================
Irrespective of the loops, the total time complexity of any algorithm is nothing but total number of times each statements gets executed.

Now coming back to your question of What is the TC of while loops; It depends on the loop control variable, hows the value of that variable is changing because the number of times the statements inside the loop gets executed depends on the loop control variable behaviour.

In layman’s terms; if the loop control variable is getting incremented linearly say every time +1 or getting decremented linearly say every time -1, in that case the complexity would be O(n).

if the loop control variable is getting incremented by say every time multiplication by 2 or say getting decremented every time say divide by 2, in that case the complexity would be O(lgn).

if the loop control variable is getting incremented by say every time square of 2 or say every time getting square root of 2, in that case the complexity would be O(lglgn).

But in case if you have the nested loops as well, then as simple as that it depends on their loop control variable behavior as well.
============================================================================================================================
1. Using Collections can take Less Memory Space
