package org.ddj.bpm.entity;

/**
 * Created by dong on 2016/8/12.
 */
public class Path {

    private Node startNode;
    private Node endNode;
    private PathType type = PathType.GOTO;

    public Path(PathType type) {
        this.type = type;
    }

    public Node getStartNode() {
        return startNode;
    }

    public void setStartNode(Node startNode) {
        this.startNode = startNode;
        if (startNode != null)
            startNode.getTo().put(type, this);
    }

    public Node getEndNode() {
        return endNode;
    }

    public void setEndNode(Node endNode) {
        this.endNode = endNode;
        if (endNode != null)
            endNode.getFrom().put(type, this);
    }
}
