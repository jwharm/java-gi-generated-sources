package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for activating
 * actions installed with gtk_widget_class_install_action().
 * <p>
 * The {@code parameter} must match the {@code parameter_type} of the action.
 */
@FunctionalInterface
public interface WidgetActionActivateFunc {
        void onWidgetActionActivateFunc(@NotNull Widget widget, @NotNull java.lang.String actionName, @NotNull org.gtk.glib.Variant parameter);
}
