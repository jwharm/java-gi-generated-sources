package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function to compare two children to determine which
 * should come first.
 */
@FunctionalInterface
public interface FlowBoxSortFunc {
        int onFlowBoxSortFunc(@NotNull FlowBoxChild child1, @NotNull FlowBoxChild child2);
}
