function twoSum(nums: number[], target: number): number[] {
  const solution = new Map<number, number>();

  for (let i = 0; i < nums.length; i += 1) {
    const complement = target - nums[i];

    if (solution.has(complement)) {
      if (complement !== undefined) {
        return [complement, i];
      }
    }

    solution.set(nums[i], i);
  }

  return [];
}

export default twoSum;
