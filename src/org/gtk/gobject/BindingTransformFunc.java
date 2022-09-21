package org.gtk.gobject;

/**
 * A function to be called to transform {@code from_value} to {@code to_value}.
 * <p>
 * If this is the {@code transform_to} function of a binding, then {@code from_value}
 * is the {@code source_property} on the {@code source} object, and {@code to_value} is the
 * {@code target_property} on the {@code target} object. If this is the
 * {@code transform_from} function of a {@link BindingFlags#BIDIRECTIONAL} binding,
 * then those roles are reversed.
 */
@FunctionalInterface
public interface BindingTransformFunc {
        boolean onBindingTransformFunc(Binding binding, Value fromValue, Value toValue);
}
