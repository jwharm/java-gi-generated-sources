package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Binding} is the representation of a binding between a property on a
 * {@link Object} instance (or source) and another property on another {@link Object}
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
 * of two {@link Object} instances, so that if either property changes, the
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
 * can be avoided if the objects emit the {@link Object}::notify signal only
 * if the value has effectively been changed. A binding is implemented
 * using the {@link Object}::notify signal, so it is susceptible to all the
 * various ways of blocking a signal emission, like g_signal_stop_emission()
 * or g_signal_handler_block().
 * <p>
 * A binding will be severed, and the resources it allocates freed, whenever
 * either one of the {@link Object} instances it refers to are finalized, or when
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
public class Binding extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Binding(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Binding if its GType is a (or inherits from) "GBinding".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Binding} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GBinding", a ClassCastException will be thrown.
     */
    public static Binding castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Binding.getType())) {
            return new Binding(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GBinding");
        }
    }
    
    /**
     * Retrieves the {@link Object} instance used as the source of the binding.
     * <p>
     * A {@link Binding} can outlive the source {@link Object} as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return {@code null}.
     * @return the source {@link Object}, or {@code null} if the
     *     source does not exist any more.
     */
    public @Nullable org.gtk.gobject.Object dupSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_dup_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the {@link Object} instance used as the target of the binding.
     * <p>
     * A {@link Binding} can outlive the target {@link Object} as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return {@code null}.
     * @return the target {@link Object}, or {@code null} if the
     *     target does not exist any more.
     */
    public @Nullable org.gtk.gobject.Object dupTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_dup_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieves the flags passed when constructing the {@link Binding}.
     * @return the {@link BindingFlags} used by the {@link Binding}
     */
    public @NotNull org.gtk.gobject.BindingFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_binding_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.BindingFlags(RESULT);
    }
    
    /**
     * Retrieves the {@link Object} instance used as the source of the binding.
     * <p>
     * A {@link Binding} can outlive the source {@link Object} as the binding does not hold a
     * strong reference to the source. If the source is destroyed before the
     * binding then this function will return {@code null}.
     * <p>
     * Use g_binding_dup_source() if the source or binding are used from different
     * threads as otherwise the pointer returned from this function might become
     * invalid if the source is finalized from another thread in the meantime.
     * @return the source {@link Object}, or {@code null} if the
     *     source does not exist any more.
     * @deprecated Use g_binding_dup_source() for a safer version of this
     * function.
     */
    @Deprecated
    public @Nullable org.gtk.gobject.Object getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the name of the property of {@link Binding}:source used as the source
     * of the binding.
     * @return the name of the source property
     */
    public @NotNull java.lang.String getSourceProperty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_source_property.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the {@link Object} instance used as the target of the binding.
     * <p>
     * A {@link Binding} can outlive the target {@link Object} as the binding does not hold a
     * strong reference to the target. If the target is destroyed before the
     * binding then this function will return {@code null}.
     * <p>
     * Use g_binding_dup_target() if the target or binding are used from different
     * threads as otherwise the pointer returned from this function might become
     * invalid if the target is finalized from another thread in the meantime.
     * @return the target {@link Object}, or {@code null} if the
     *     target does not exist any more.
     * @deprecated Use g_binding_dup_target() for a safer version of this
     * function.
     */
    @Deprecated
    public @Nullable org.gtk.gobject.Object getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the name of the property of {@link Binding}:target used as the target
     * of the binding.
     * @return the name of the target property
     */
    public @NotNull java.lang.String getTargetProperty() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_get_target_property.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
            DowncallHandles.g_binding_unbind.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_binding_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link Binding.Build} object constructs a {@link Binding} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Binding} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Binding} using {@link Binding#castFrom}.
         * @return A new instance of {@code Binding} with the properties 
         *         that were set in the Build object.
         */
        public Binding construct() {
            return Binding.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Binding.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Flags to be used to control the {@link Binding}
         * @param flags The value for the {@code flags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlags(org.gtk.gobject.BindingFlags flags) {
            names.add("flags");
            values.add(org.gtk.gobject.Value.create(flags));
            return this;
        }
        
        /**
         * The {@link Object} that should be used as the source of the binding
         * @param source The value for the {@code source} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSource(org.gtk.gobject.Object source) {
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
        public Build setSourceProperty(java.lang.String sourceProperty) {
            names.add("source-property");
            values.add(org.gtk.gobject.Value.create(sourceProperty));
            return this;
        }
        
        /**
         * The {@link Object} that should be used as the target of the binding
         * @param target The value for the {@code target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTarget(org.gtk.gobject.Object target) {
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
        public Build setTargetProperty(java.lang.String targetProperty) {
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
}
