package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Called for flow boxes that are bound to a {@code GListModel}.
 * <p>
 * This function is called for each item that gets added to the model.
 */
@FunctionalInterface
public interface FlowBoxCreateWidgetFunc {
        org.gtk.gtk.Widget onFlowBoxCreateWidgetFunc(@NotNull org.gtk.gobject.Object item);
}
