package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * A function used by gtk_list_box_selected_foreach().
 * <p>
 * It will be called on every selected child of the {@code box}.
 */
@FunctionalInterface
public interface ListBoxForeachFunc {
        void onListBoxForeachFunc(ListBox box, ListBoxRow row);
}