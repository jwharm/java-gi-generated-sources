package org.gtk.gtk;

@FunctionalInterface
public interface FlowBoxFilterFunc {

    /**
     * A function that will be called whenever a child changes
     * or is added.
     * 
     * It lets you control if the child should be visible or not.
     */
    public boolean onFlowBoxFilterFunc(FlowBoxChild child, jdk.incubator.foreign.MemoryAddress userData);
}
