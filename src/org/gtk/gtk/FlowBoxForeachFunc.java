package org.gtk.gtk;

/**
 * A function used by gtk_flow_box_selected_foreach().
 * 
 * It will be called on every selected child of the @box.
 */
@FunctionalInterface
public interface FlowBoxForeachFunc {
        void onFlowBoxForeachFunc(FlowBox box, FlowBoxChild child);
}
