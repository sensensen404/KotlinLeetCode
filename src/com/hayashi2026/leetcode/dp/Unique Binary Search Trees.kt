package com.hayashi2026.leetcode.dp

class `Unique Binary Search Trees` {

    fun numTrees(n: Int): Int {
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1
        for (i in 2 until n + 1) {
            for (j in 0 until i) {
                dp[i] += dp[j] * dp[i - j - 1]
            }
        }
        return dp[n]
    }
}