package org.gtk.gtk;

/**
 * Called for flow boxes that are bound to a `GListModel`.
 * 
 * This function is called for each item that gets added to the model.
 */
@FunctionalInterface
public interface FlowBoxCreateWidgetFunc {
        Widget onFlowBoxCreateWidgetFunc(org.gtk.gobject.Object item);
}
