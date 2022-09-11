package org.gtk.gtk;

/**
 * A function that will be called whenever a child changes
 * or is added.
 * 
 * It lets you control if the child should be visible or not.
 */
@FunctionalInterface
public interface FlowBoxFilterFunc {
        boolean onFlowBoxFilterFunc(FlowBoxChild child);
}
