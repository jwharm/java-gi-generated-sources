package org.gtk.gobject;

@FunctionalInterface
public interface BindingTransformFunc {

    /**
     * A function to be called to transform @from_value to @to_value.
     * 
     * If this is the @transform_to function of a binding, then @from_value
     * is the @source_property on the @source object, and @to_value is the
     * @target_property on the @target object. If this is the
     * @transform_from function of a %G_BINDING_BIDIRECTIONAL binding,
     * then those roles are reversed.
     */
    public boolean onBindingTransformFunc(Binding binding, Value fromValue, Value toValue, jdk.incubator.foreign.MemoryAddress userData);
}
