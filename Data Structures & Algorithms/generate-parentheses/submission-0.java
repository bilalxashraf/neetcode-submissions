public class Solution {
    public List<String> generateParenthesis(int n) {

        List<List<String>> dpTable = new ArrayList<>();
        for(int i = 0; i <= n; i++) {
            dpTable.add(new ArrayList<>());
        }

        dpTable.get(0).add("");

        for(int pairs = 1; pairs <= n; pairs++) {
            for(int leftPairs = 0; leftPairs < pairs; leftPairs++) {
                int rightPairs = pairs - 1 - leftPairs;

                List<String> leftSq = dpTable.get(leftPairs);
                List<String> rightSq = dpTable.get(rightPairs);

                for(String left : leftSq) {
                    for(String right : rightSq) {
                        String combination = "(" + left + ")" + right;

                        dpTable.get(pairs).add(combination);
                    }
                }
            }
        }
        return dpTable.get(n);
    }
}