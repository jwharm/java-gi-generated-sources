package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * A function that will be called whenever a child changes
 * or is added.
 * <p>
 * It lets you control if the child should be visible or not.
 */
@FunctionalInterface
public interface FlowBoxFilterFunc {
        boolean onFlowBoxFilterFunc(FlowBoxChild child);
}
