package todo.Array;

public class Q4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int left = (n + m + 1) / 2;
        int right = (n + m + 2) / 2;
        //将偶数和奇数的情况合并，如果是奇数，会求两次同样的 k 。
        return (getKth(nums1, 0, n - 1, nums2, 0, m - 1, left)
                + getKth(nums1, 0, n - 1, nums2, 0, m - 1, right)) * 0.5;
    }

    public double getKth(int[] nums1, int s1, int e1, int[] nums2, int s2, int e2, int k) {
        int len1 = e1 - s1 + 1;
        int len2 = e2 - s2 + 1;
        if (len1 > len2) {
            // 确保len1<len2
            return getKth(nums2, s2, e2, nums1, s1, e1, k);
        }
        if (len1 == 0) {
            // nums1为空，直接取nums2的第k个即可
            return nums2[s2 + k - 1];
        }
        if (k == 1) {
            // 剪枝，可以不处理
            return Math.min(nums1[s1], nums2[s2]);
        }
        // 若len 小于 k，则该数组全部去除
        int i = s1 + Math.min(len1, k / 2) - 1;
        int j = s2 + Math.min(len2, k / 2) - 1;

        if (nums1[i] > nums2[j]) {
            // 对于小的那组数，前k/2 个数必不包含所需数字，直接去除
            return getKth(nums1, s1, e1, nums2, j + 1, e2, k - (j - s2 + 1));
        } else {
            return getKth(nums1, i + 1, e1, nums2, s2, e2, k - (i - s1 + 1));
        }

    }
}
