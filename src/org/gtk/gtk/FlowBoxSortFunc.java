package org.gtk.gtk;

@FunctionalInterface
public interface FlowBoxSortFunc {

    /**
     * A function to compare two children to determine which
     * should come first.
     */
    public int onFlowBoxSortFunc(FlowBoxChild child1, FlowBoxChild child2, jdk.incubator.foreign.MemoryAddress userData);
}
