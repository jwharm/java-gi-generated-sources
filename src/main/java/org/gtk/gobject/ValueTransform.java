package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of value transformation functions which can be registered with
 * g_value_register_transform_func().
 * <p>
 * {@code dest_value} will be initialized to the correct destination type.
 */
@FunctionalInterface
public interface ValueTransform {
        void onValueTransform(@NotNull Value srcValue, @NotNull Value destValue);
}
