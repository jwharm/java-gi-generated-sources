package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Called for flow boxes that are bound to a {@code GListModel}.
 * <p>
 * This function is called for each item that gets added to the model.
 */
@FunctionalInterface
public interface FlowBoxCreateWidgetFunc {
        Widget onFlowBoxCreateWidgetFunc(org.gtk.gobject.Object item);
}
