package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_flow_box_selected_foreach().
 * <p>
 * It will be called on every selected child of the {@code box}.
 */
@FunctionalInterface
public interface FlowBoxForeachFunc {
        void onFlowBoxForeachFunc(@NotNull org.gtk.gtk.FlowBox box, @NotNull org.gtk.gtk.FlowBoxChild child);
}
