package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to compare two children to determine which
 * should come first.
 */
@FunctionalInterface
public interface FlowBoxSortFunc {
        int onFlowBoxSortFunc(@NotNull org.gtk.gtk.FlowBoxChild child1, @NotNull org.gtk.gtk.FlowBoxChild child2);
}
