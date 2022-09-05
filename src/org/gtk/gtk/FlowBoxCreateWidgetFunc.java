package org.gtk.gtk;

@FunctionalInterface
public interface FlowBoxCreateWidgetFunc {

    /**
     * Called for flow boxes that are bound to a `GListModel`.
     * 
     * This function is called for each item that gets added to the model.
     */
    public Widget onFlowBoxCreateWidgetFunc(org.gtk.gobject.Object item, jdk.incubator.foreign.MemoryAddress userData);
}
