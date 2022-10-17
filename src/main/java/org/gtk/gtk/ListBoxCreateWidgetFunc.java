package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Called for list boxes that are bound to a {@code GListModel} with
 * gtk_list_box_bind_model() for each item that gets added to the model.
 * <p>
 * If the widget returned is not a {@link ListBoxRow} widget, then the widget
 * will be inserted as the child of an intermediate {@link ListBoxRow}.
 */
@FunctionalInterface
public interface ListBoxCreateWidgetFunc {
        Widget onListBoxCreateWidgetFunc(@NotNull org.gtk.gobject.Object item);
}
