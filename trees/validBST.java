// check if a binary tree is a binary search tree
//METHOD 1-> INORDER TRAVERSAL AND PUT VALUES INTO AN ARRAY. THE PROBLEM IS THAT IT TAKES A LOT OF SPACE AND WE WOULD HAVE TROUBLE HANDLING DUPLICATE. WE WOULD NOT BE ABLE TO DISTINGUISH BTW
//     20 This would be valid                          20 This would be invalid
//    /                                AND               \
// 20                                                      20
// IMPLEMENTATION
// class validBST{
//     int index = 0;
//     void copyBST(TreeNode root, int[] arr){
//         if(root == null) return;
//         copyBST(root.left, arr);
//         arr[index] = root.data;
//         index++;
//         copyBST(root.right, arr);
//     }
//     boolean checkBST(TreeNode root){
//         int[] arr = new int[root.size];
//         copyBST(root, arr);
//         for(int i = 0; i < arr.length, i++){
//             if(arr[i] <= arr[i-1]) return false;
//         }
//         return true;
//     }
// }
// METHOD 2
// CHECK CONDITION THAT left.val <= curr.val < right.val
// time->O(n); space->O(log(n)) 
class validBST {
    boolean checkBST(TreeNode root) {
        checkBST(roo, null, null);
    }

    boolean checkBST(TreeNode n, Integer min, Integer max) {
        if (n == null)
            return true;
        if (min != null && n.data <= min || max != null && n.data > max) {
            return false;
        }
        if (!checkBST(n.left, min, n.data) || !checkBST(n.right, n.data, max)) {
            return false;
        }
        return true;
    }
}