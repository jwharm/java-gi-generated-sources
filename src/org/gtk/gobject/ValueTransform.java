package org.gtk.gobject;

/**
 * The type of value transformation functions which can be registered with
 * g_value_register_transform_func().
 * <p>
 * {@code dest_value} will be initialized to the correct destination type.
 */
@FunctionalInterface
public interface ValueTransform {
        void onValueTransform(Value srcValue, Value destValue);
}
