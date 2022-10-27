package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of value transformation functions which can be registered with
 * g_value_register_transform_func().
 * <p>
 * {@code dest_value} will be initialized to the correct destination type.
 */
@FunctionalInterface
public interface ValueTransform {
        void onValueTransform(@NotNull org.gtk.gobject.Value srcValue, @NotNull org.gtk.gobject.Value destValue);
}
