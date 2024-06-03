const rotate = function (nums, k) {
  let n = nums.length,
    temp = [];
  k = k % n;
  if (n === 0 || k > n) return nums;
  for (let i = n - k; i < n; i++) {
    temp.push(nums[i]);
  }

  for (let i = 0; i < n - k; i++) {
    temp.push(nums[i]);
  }

  for (let i = 0; i < n; i++) {
    nums[i] = temp[i];
  }
};
