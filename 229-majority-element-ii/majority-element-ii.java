// class Solution {
//     public List<Integer> majorityElement(int[] nums) 
//     {
//         int n = nums.length;
//         List<Integer> answer = new ArrayList<>();

//         for (int i = 0; i < n; i++)
//         {
//             int count = 0;

//             for (int j = 0; j < n; j++)
//             {
//                 if (nums[i] == nums[j])
//                 {
//                     count++;
//                 }
//             }

//             if (count > n / 3 && !answer.contains(nums[i]))
//             {
//                 answer.add(nums[i]);
//             }
//         }

//         return answer;
//     }
// }
class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int n = nums.length;
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet())
        {
            if (map.get(num) > n / 3)
            {
                answer.add(num);
            }
        }

        return answer;
    }
}