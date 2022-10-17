package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_flow_box_selected_foreach().
 * <p>
 * It will be called on every selected child of the {@code box}.
 */
@FunctionalInterface
public interface FlowBoxForeachFunc {
        void onFlowBoxForeachFunc(@NotNull FlowBox box, @NotNull FlowBoxChild child);
}
