public class Main {

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        // Inorder Traversal
        InorderTraversal inorder = new InorderTraversal();
        System.out.println("Inorder Traversal");
        System.out.println(inorder.getSortedLeaderboard(root));

        // Preorder Traversal
        PreorderTraversal preorder = new PreorderTraversal();
        System.out.println("\nPreorder Traversal");
        System.out.println(preorder.iterativePreorder(root));

        // Level Order Traversal
        LevelOrderTraversal level = new LevelOrderTraversal();
        System.out.println("\nLevel Order Traversal");
        System.out.println(level.broadcastByLevel(root));

        // Height
        Height h = new Height();
        System.out.println("\nHeight : " + h.height(root));
        System.out.println("Tree exceeds height 2 : " + h.isTooDeep(root, 2));

        // Diameter
        Diameter d = new Diameter();
        System.out.println("\nDiameter : " + d.longestCommunicationPath(root));

        // Postorder Traversal
        PostorderTraversal post = new PostorderTraversal();
        System.out.println("\nDeleting Tree");
        post.deleteFolderTree(root);
    }
}