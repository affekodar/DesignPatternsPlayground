package Composite.Video;

import java.util.ArrayList;

public abstract class Node {
    private ArrayList<Node> children = new ArrayList<>();
    private String name;

    public Node(String name) {
        this.name = name;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Node> children) {
        this.children = children;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChild(Node node) {
        this.children.add(node);
    }
    abstract double getTemperature();

    private Node getNodeRecursive(Node node, String name) {
        if (node.getName().equals(name)){
            return node;
        }else {
            for (Node n : node.getChildren()) {
                Node result = getNodeRecursive(n, name);
                if (result != null){
                    return result;
                }
            }
        }
        return null;
    }

    public Node getNodeByName(String name) {
        Node node = getNodeRecursive(this, name);
        return node;
    }




}
