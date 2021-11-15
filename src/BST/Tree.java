package BST;

class Tree {
    int data;
    Tree left, right;
    String[] space = {""," ","│"}, symbol = {"","└","├"};

    Tree(int elem) {
        data = elem;
        left = right = null;
    }
}
