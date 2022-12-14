package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Binding} is the representation of a binding between a property on a
 * {@link GObject} instance (or source) and another property on another {@link GObject}
 * instance (or target).
 * <p>
 * Whenever the source property changes, the same value is applied to the
 * target property; for instance, the following binding:
 * <pre>{@code <!-- language="C" -->
 *   g_object_bind_property (object1, "property-a",
 *                           object2, "property-b",
 *                           G_BINDING_DEFAULT);
 * }</pre>
 * <p>
 * will cause the property named "property-b" of {@code object2} to be updated
 * every time g_object_set() or the specific accessor changes the value of
 * the property "property-a" of {@code object1}.
 * <p>
 * It is possible to create a bidirectional binding between two properties
 * of two {@link GObject} instances, so that if either property changes, the
 * other is updated as well, for instance:
 * <pre>{@code <!-- language="C" -->
 *   g_object_bind_property (object1, "property-a",
 *                           object2, "property-b",
 *                           G_BINDING_BIDIRECTIONAL);
 * }</pre>
 * <p>
 * will keep the two properties in sync.
 * <p>
 * It is also possible to set a custom transformation function (in both
 * directions, in case of a bidirectional binding) to apply a custom
 * transformation from the source value to the target value before
 * applying it; for instance, the following binding:
 * <pre>{@code <!-- language="C" -->
 *   g_object_bind_property_full (adjustment1, "value",
 *                                adjustment2, "value",
 *                                G_BINDING_BIDIRECTIONAL,
 *                                celsius_to_fahrenheit,
 *                                fahrenheit_to_celsius,
 *                                NULL, NULL);
 * }</pre>
 * <p>
 * will keep the "value" property of the two adjustments in sync; the
 * {@code celsius_to_fahrenheit} function will be called whenever the "value"
 * property of {@code adjustment1} changes and will transform the current value
 * of the property before applying it to the "value" property of {@code adjustment2}.
 * <p>
 * Vice versa, the {@code fahrenheit_to_celsius} function will be called whenever
 * the "value" property of {@code adjustment2} changes, and will transform the
 * current value of the property before applying it to the "value" property
 * of {@code adjustment1}.
 * <p>
 * Note that {@link Binding} does not resolve cycles by itself; a cycle like
 * <pre>{@code 
 *   object1:propertyA -> object2:propertyB
 *   object2:propertyB -> object3:propertyC
 *   object3:propertyC -> object1:propertyA
 * }</pre>
 * <p>
 * might lead to an infinite loop. The loop, in this particular case,
 * can be avoided if the objects emit the {@link GObject}::notify signal only
 * if the value has effectively been changed. A binding is implemented
 * using the {@link GObject}::notify signal, so it is susceptible to all the
 * various ways of blocking a signal emission, like g_signal_stop_emission()
 * or g_signal_handler_block().
 * <p>
 * A binding will be severed, and the resources it allocates freed, whenever
 * either one of the {@link GObject} instances it refers to are finalized, or when
 * the {@link Binding} instance loses its last reference.
 * <p>
 * Bindings for languages with garbage collection can use
 * g_binding_unbind() to explicitly release a binding between the source
 * and target properties, instead of relying on the last reference on the
 * binding, source, and target instances to drop.
 * <p>
 * {@link Binding} is available since GObject 2.26
 * @version 2.26
 */
public class Binding extends org.gtk.gobject.GObject {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBinding";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Binding proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Binding(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Binding> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Binding(input);
    
    /**
     * Retrieves the {@link GObject} instance used as the source of the binding.
     * <p>
     * A {@link Binding} can outlive the source {@link GObject} as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return {@code null}.
     * @return the source {@link GObject}, or {@code null} if the
     *     source does not exist any more.
     */
    public @Nullable org.gtk.gobject.GObject dupSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_dup_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves the {@link GObject} instance used as the target of the binding.
     * <p>
     * A {@link Binding} can outlive the target {@link GObject} as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return {@code null}.
     * @return the target {@link GObject}, or {@code null} if the
     *     target does not exist any more.
     */
    public @Nullable org.gtk.gobject.GObject dupTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_dup_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves the flags passed when constructing the {@link Binding}.
     * @return the {@link BindingFlags} used by the {@link Binding}
     */
    public org.gtk.gobject.BindingFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_binding_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.BindingFlags(RESULT);
    }
    
    /**
     * Retrieves the {@link GObject} instance used as the source of the binding.
     * <p>
     * A {@link Binding} can outlive the source {@link GObject} as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return {@code null}.
     * <p>
     * Use g_binding_dup_source() if the source or binding are used from different
     * threads as otherwise the pointer returned from this function might become
     * invalid if the source is finalized from another thread in the meantime.
     * @return the source {@link GObject}, or {@code null} if the
     *     source does not exist any more.
     * @deprecated Use g_binding_dup_source() for a safer version of this
     * function.
     */
    @Deprecated
    public @Nullable org.gtk.gobject.GObject getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the name of the property of {@link Binding}:source used as the source
     * of the binding.
     * @return the name of the source property
     */
    public java.lang.String getSourceProperty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_source_property.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the {@link GObject} instance used as the target of the binding.
     * <p>
     * A {@link Binding} can outlive the target {@link GObject} as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return {@code null}.
     * <p>
     * Use g_binding_dup_target() if the target or binding are used from different
     * threads as otherwise the pointer returned from this function might become
     * invalid if the target is finalized from another thread in the meantime.
     * @return the target {@link GObject}, or {@code null} if the
     *     target does not exist any more.
     * @deprecated Use g_binding_dup_target() for a safer version of this
     * function.
     */
    @Deprecated
    public @Nullable org.gtk.gobject.GObject getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the name of the property of {@link Binding}:target used as the target
     * of the binding.
     * @return the name of the target property
     */
    public java.lang.String getTargetProperty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_target_property.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Explicitly releases the binding between the source and the target
     * property expressed by {@code binding}.
     * <p>
     * This function will release the reference that is being held on
     * the {@code binding} instance if the binding is still bound; if you want to hold on
     * to the {@link Binding} instance after calling g_binding_unbind(), you will need
     * to hold a reference to it.
     * <p>
     * Note however that this function does not take ownership of {@code binding}, it
     * only unrefs the reference that was initially created by
     * g_object_bind_property() and is owned by the binding.
     */
    public void unbind() {
        try {
            DowncallHandles.g_binding_unbind.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Binding.Builder} object constructs a {@link Binding} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Binding.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Binding} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Binding}.
         * @return A new instance of {@code Binding} with the properties 
         *         that were set in the Builder object.
         */
        public Binding build() {
            return (Binding) org.gtk.gobject.GObject.newWithProperties(
                Binding.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Flags to be used to control the {@link Binding}
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFlags(org.gtk.gobject.BindingFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        /**
         * The {@link GObject} that should be used as the source of the binding
         * @param source The value for the {@code source} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSource(org.gtk.gobject.GObject source) {
            names.add("source");
            values.add(org.gtk.gobject.Value.create(source));
            return this;
        }
        
        /**
         * The name of the property of {@link Binding}:source that should be used
         * as the source of the binding.
         * <p>
         * This should be in [canonical form][canonical-parameter-names] to get the
         * best performance.
         * @param sourceProperty The value for the {@code source-property} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSourceProperty(java.lang.String sourceProperty) {
            names.add("source-property");
            values.add(org.gtk.gobject.Value.create(sourceProperty));
            return this;
        }
        
        /**
         * The {@link GObject} that should be used as the target of the binding
         * @param target The value for the {@code target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTarget(org.gtk.gobject.GObject target) {
            names.add("target");
            values.add(org.gtk.gobject.Value.create(target));
            return this;
        }
        
        /**
         * The name of the property of {@link Binding}:target that should be used
         * as the target of the binding.
         * <p>
         * This should be in [canonical form][canonical-parameter-names] to get the
         * best performance.
         * @param targetProperty The value for the {@code target-property} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTargetProperty(java.lang.String targetProperty) {
            names.add("target-property");
            values.add(org.gtk.gobject.Value.create(targetProperty));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_binding_dup_source = Interop.downcallHandle(
                "g_binding_dup_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_dup_target = Interop.downcallHandle(
                "g_binding_dup_target",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_get_flags = Interop.downcallHandle(
                "g_binding_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_get_source = Interop.downcallHandle(
                "g_binding_get_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_get_source_property = Interop.downcallHandle(
                "g_binding_get_source_property",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_get_target = Interop.downcallHandle(
                "g_binding_get_target",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_get_target_property = Interop.downcallHandle(
                "g_binding_get_target_property",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_unbind = Interop.downcallHandle(
                "g_binding_unbind",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_binding_get_type = Interop.downcallHandle(
                "g_binding_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_binding_get_type != null;
    }
}
