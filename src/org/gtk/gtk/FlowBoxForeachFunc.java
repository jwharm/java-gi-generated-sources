package org.gtk.gtk;

@FunctionalInterface
public interface FlowBoxForeachFunc {

    /**
     * A function used by gtk_flow_box_selected_foreach().
     * 
     * It will be called on every selected child of the @box.
     */
    public void onFlowBoxForeachFunc(FlowBox box, FlowBoxChild child, jdk.incubator.foreign.MemoryAddress userData);
}
