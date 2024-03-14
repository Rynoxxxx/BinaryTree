public class Baum {
    BinaryTree<String> b7

    public Baum(){

        BinaryTree<String> b1=new BinaryTree<String>("Jürgen");
        BinaryTree<String> b2=new BinaryTree<String>("Sibille");
        BinaryTree<String> b3=new BinaryTree<String>("Jason Jerome", b1,b2);
        BinaryTree<String> b4=new BinaryTree<String>("Anette");
        BinaryTree<String> b5=new BinaryTree<String>("Dieter" );
        BinaryTree<String> b6=new BinaryTree<String>("Eywa", b4,b5);
       b7=new BinaryTree<String>("Jeremy Pascal", b3,b6);
    }
    public void preorder(){

    }
    public void besuche(BinaryTree<String> b ){
        if(b7.getLeftTree()==null){
            b7.getRightTree();


        }

    }
}
