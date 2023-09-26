class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int n = nums.size()-1;
      vector<int> ans;

        for(int i =0;i<=n;i++){
            int a = nums[i];
            for(int j = i+1;j<=n;j++){
                if(target-a == nums[j]){
                    ans.push_back(i);
                    ans.push_back(j);
                    break;
                }
            }
        }
        return ans;
    }
};
