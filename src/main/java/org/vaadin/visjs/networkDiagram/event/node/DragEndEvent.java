package org.vaadin.visjs.networkDiagram.event.node;

import org.vaadin.visjs.networkDiagram.api.Event;

import elemental.json.JsonArray;
import elemental.json.JsonException;

/**
 * Created by roshans on 11/30/14.
 */
public class DragEndEvent extends Event {
    public DragEndEvent(JsonArray properties) throws JsonException {
        super();
        JsonArray nodes = properties.getObject(0).getArray("nodeIds");
        if(nodes != null){
	          for (int i = 0; i < nodes.length(); i++) {
	              getNodeIds().add(nodes.getString(i));
	          }
        }
    }
}
