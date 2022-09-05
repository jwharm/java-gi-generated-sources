package org.gtk.gobject;

@FunctionalInterface
public interface ValueTransform {

    /**
     * The type of value transformation functions which can be registered with
     * g_value_register_transform_func().
     * 
     * @dest_value will be initialized to the correct destination type.
     */
    public void onValueTransform(Value srcValue, Value destValue);
}
