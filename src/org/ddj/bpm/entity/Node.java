package org.ddj.bpm.entity;

import java.util.HashMap;
import java.util.Map;

/**
 * 路径上的节点
 * Created by dong on 2016/8/12.
 */
public class Node {
    private Map<PathType,Path> from = new HashMap<PathType, Path>();
    private Map<PathType,Path> to = new HashMap<PathType, Path>();
    private NodeType type = NodeType.NODE;

    public Map<PathType, Path> getFrom() {
        return from;
    }

    public void setFrom(Map<PathType, Path> from) {
        this.from = from;
    }

    public Map<PathType, Path> getTo() {
        return to;
    }

    public void setTo(Map<PathType, Path> to) {
        this.to = to;
    }

    public NodeType getType() {
        return type;
    }

    public void setType(NodeType type) {
        this.type = type;
    }
}
