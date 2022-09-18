package org.gtk.gobject;

/**
 * A function to be called to transform @from_value to @to_value.
 * 
 * If this is the @transform_to function of a binding, then @from_value
 * is the @source_property on the @source object, and @to_value is the
 * @target_property on the @target object. If this is the
 * @transform_from function of a {@link org.gtk.gobject.BindingFlags<code>#BIDIRECTIONAL</code>  binding,
 * then those roles are reversed.
 */
@FunctionalInterface
public interface BindingTransformFunc {
        boolean onBindingTransformFunc(Binding binding, Value fromValue, Value toValue);
}
