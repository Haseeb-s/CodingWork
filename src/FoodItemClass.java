/**
 * Created by Haseeb on 9/29/2015.
 */
public class FoodItemClass{
    public FoodItemNode headNode = new FoodItemNode();
    public FoodItemNode currentNode = null;

    private void newNode(FoodItemNode newNode){
        if(headNode.getName()== null) {
            headNode = newNode;
            currentNode = headNode;
        }
        else{
            //creates new node
            currentNode.setNextNode(newNode);
            //sets new node's previous node to whatever is the current node(last node in list)
            currentNode.getNextNode().setPrevNode(currentNode);
            //sets current Node as the newest added Node
            currentNode = currentNode.getNextNode();
        }
    }
}