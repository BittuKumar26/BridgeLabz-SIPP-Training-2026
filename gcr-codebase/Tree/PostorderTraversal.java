public class PostorderTraversal {

    public void deleteFolderTree(Node node) {

        if (node == null)
            return;

        deleteFolderTree(node.left);
        deleteFolderTree(node.right);

        deleteNode(node);
    }

    private void deleteNode(Node node) {
        System.out.println("Deleting Node : " + node.val);
    }
}