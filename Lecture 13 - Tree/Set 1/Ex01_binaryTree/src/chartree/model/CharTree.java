package chartree.model;

public class CharTree {
    Node root;

    public CharTree() {
        root = null;
    }

    public void insert(char value) {
        Node node = new Node();

        node.data = value;
        node.left = null;
        node.right = null;

        insertLeaf(root, node);
    }

    private void insertLeaf(Node rootSubtree, Node node) {
        if (root == null) {
            root = node;

        } else {
            if (node.data < rootSubtree.data) {
                if (rootSubtree.left == null) {
                    rootSubtree.left = node;

                } else {
                    insertLeaf(rootSubtree.left, node);
                }
            }

            if (node.data >= rootSubtree.data) {
                if (rootSubtree.right == null) {
                    rootSubtree.right = node;

                } else {
                    insertLeaf(rootSubtree.right, node);
                }
            }
        }
    }

    public void search(char value) {
        try {
            Node node = nodeSearch(root, value);
            int floor = nodeFloor(root, value);

            System.out.println(node.data + ", " + floor);

        } catch (Exception e) {
            System.err.println("Value not found");
        }
    }

    private Node nodeSearch(Node rootSubTree, char value) throws Exception {
        if (root == null) {
            throw new Exception("Empty tree");

        } else {
            if (rootSubTree.data > value) {
                return nodeSearch(rootSubTree.left, value);

            } else if (rootSubTree.data < value) {
                return nodeSearch(rootSubTree.right, value);

            } else {
                return rootSubTree;
            }
        }
    }

    private int nodeFloor(Node rootSubTree, char value) throws Exception {
        if (root == null) {
            throw new Exception("Empty tree");

        } else {
            if (rootSubTree.data > value) {
                return 1 + nodeFloor(rootSubTree.left, value);

            } else if (rootSubTree.data < value) {
                return 1 + nodeFloor(rootSubTree.right, value);

            } else {
                return 0;
            }
        }
    }

    public void prefixSearch() {
        try {
            prefix(root);

        } catch (Exception e) {
            System.err.println("Error prefix search");
        }
    }

    private void prefix(Node rootSubTree) throws Exception {
        if (root == null) {
            throw new Exception("Empty tree");

        } else {
            System.out.print(rootSubTree.data + "; ");

            if (rootSubTree.left != null) {
                prefix(rootSubTree.left);
            }

            if (rootSubTree.right != null) {
                prefix(rootSubTree.right);
            }
        }
    }

    public void infixSearch() {
        try {
            infix(root);

        } catch (Exception e) {
            System.err.println();
        }
    }

    private void infix(Node rootSubTree) throws Exception {
        if (root == null) {
            throw new Exception("Empty tree");

        } else {
            if (rootSubTree.left != null) {
                infix(rootSubTree.left);
            }

            System.out.print(rootSubTree.data + "; ");

            if (rootSubTree.right != null) {
                infix(rootSubTree.right);
            }
        }
    }

    public void postfixSearch() {
        try {
            postfix(root);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private void postfix(Node rootSubTree) throws Exception {
        if (root == null) {
            throw new Exception("Empty tree");

        } else {
            if (rootSubTree.left != null) {
                postfix(rootSubTree.left);
            }

            if (rootSubTree.right != null) {
                postfix(rootSubTree.right);
            }

            System.out.print(rootSubTree.data + "; ");
        }
    }

    public void remove(char value) {
        try {
            removeChild(root, value);

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    private Node removeChild(Node rootSubTree, char value) throws Exception {
        if (root == null) {
            throw new Exception("Empty tree");

        } else {
            if (rootSubTree.data > value) {
                rootSubTree.left = removeChild(rootSubTree.left, value);

            } else if (rootSubTree.data < value) {
                rootSubTree.right = removeChild(rootSubTree.right, value);

            } else { // node found.
                if ((rootSubTree.left == null) && (rootSubTree.right == null)) { // leaf case.
                    rootSubTree = null;

                } else if (rootSubTree.left == null) { // node with right-side child.
                    rootSubTree = rootSubTree.right;

                } else if (rootSubTree.right == null) { // node with left-side child.
                    rootSubTree = rootSubTree.left;

                } else { // node with two children.
                    Node node = rootSubTree.left;

                    while (node.right != null) {
                        node = node.right;
                    }

                    rootSubTree.data = node.data;
                    node.data = value;

                    rootSubTree.left = removeChild(rootSubTree.left, value);
                }
            }
        }

        return rootSubTree;
    }
}
