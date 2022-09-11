package org.gtk.gtk;

/**
 * A function to compare two children to determine which
 * should come first.
 */
@FunctionalInterface
public interface FlowBoxSortFunc {
        int onFlowBoxSortFunc(FlowBoxChild child1, FlowBoxChild child2);
}
