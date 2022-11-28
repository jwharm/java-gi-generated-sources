package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link BindingGroup} can be used to bind multiple properties
 * from an object collectively.
 * <p>
 * Use the various methods to bind properties from a single source
 * object to multiple destination objects. Properties can be bound
 * bidirectionally and are connected when the source object is set
 * with g_binding_group_set_source().
 * @version 2.72
 */
public class BindingGroup extends org.gtk.gobject.Object {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBindingGroup";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BindingGroup proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BindingGroup(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BindingGroup if its GType is a (or inherits from) "GBindingGroup".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BindingGroup} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GBindingGroup", a ClassCastException will be thrown.
     */
    public static BindingGroup castFrom(org.gtk.gobject.Object gobject) {
            return new BindingGroup(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_group_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link BindingGroup}.
     */
    public BindingGroup() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Creates a binding between {@code source_property} on the source object
     * and {@code target_property} on {@code target}. Whenever the {@code source_property}
     * is changed the {@code target_property} is updated using the same value.
     * The binding flag {@link BindingFlags#SYNC_CREATE} is automatically specified.
     * <p>
     * See g_object_bind_property() for more information.
     * @param sourceProperty the property on the source to bind
     * @param target the target {@link Object}
     * @param targetProperty the property on {@code target} to bind
     * @param flags the flags used to create the {@link Binding}
     */
    public void bind(@NotNull java.lang.String sourceProperty, @NotNull org.gtk.gobject.Object target, @NotNull java.lang.String targetProperty, @NotNull org.gtk.gobject.BindingFlags flags) {
        java.util.Objects.requireNonNull(sourceProperty, "Parameter 'sourceProperty' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(targetProperty, "Parameter 'targetProperty' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_binding_group_bind.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sourceProperty),
                    target.handle(),
                    Interop.allocateNativeString(targetProperty),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a binding between {@code source_property} on the source object and
     * {@code target_property} on {@code target}, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * {@link BindingFlags#SYNC_CREATE} is automatically specified.
     * <p>
     * See g_object_bind_property_full() for more information.
     * @param sourceProperty the property on the source to bind
     * @param target the target {@link Object}
     * @param targetProperty the property on {@code target} to bind
     * @param flags the flags used to create the {@link Binding}
     * @param transformTo the transformation function
     *     from the source object to the {@code target}, or {@code null} to use the default
     * @param transformFrom the transformation function
     *     from the {@code target} to the source object, or {@code null} to use the default
     */
    public void bindFull(@NotNull java.lang.String sourceProperty, @NotNull org.gtk.gobject.Object target, @NotNull java.lang.String targetProperty, @NotNull org.gtk.gobject.BindingFlags flags, @Nullable org.gtk.gobject.BindingTransformFunc transformTo, @Nullable org.gtk.gobject.BindingTransformFunc transformFrom) {
        java.util.Objects.requireNonNull(sourceProperty, "Parameter 'sourceProperty' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(targetProperty, "Parameter 'targetProperty' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_binding_group_bind_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sourceProperty),
                    target.handle(),
                    Interop.allocateNativeString(targetProperty),
                    flags.getValue(),
                    (Addressable) (transformTo == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (transformFrom == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (transformTo == null ? MemoryAddress.NULL : Interop.registerCallback(transformTo)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a binding between {@code source_property} on the source object and
     * {@code target_property} on {@code target}, allowing you to set the transformation
     * functions to be used by the binding. The binding flag
     * {@link BindingFlags#SYNC_CREATE} is automatically specified.
     * <p>
     * This function is the language bindings friendly version of
     * g_binding_group_bind_property_full(), using {@code GClosures}
     * instead of function pointers.
     * <p>
     * See g_object_bind_property_with_closures() for more information.
     * @param sourceProperty the property on the source to bind
     * @param target the target {@link Object}
     * @param targetProperty the property on {@code target} to bind
     * @param flags the flags used to create the {@link Binding}
     * @param transformTo a {@link Closure} wrapping the
     *     transformation function from the source object to the {@code target},
     *     or {@code null} to use the default
     * @param transformFrom a {@link Closure} wrapping the
     *     transformation function from the {@code target} to the source object,
     *     or {@code null} to use the default
     */
    public void bindWithClosures(@NotNull java.lang.String sourceProperty, @NotNull org.gtk.gobject.Object target, @NotNull java.lang.String targetProperty, @NotNull org.gtk.gobject.BindingFlags flags, @Nullable org.gtk.gobject.Closure transformTo, @Nullable org.gtk.gobject.Closure transformFrom) {
        java.util.Objects.requireNonNull(sourceProperty, "Parameter 'sourceProperty' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(targetProperty, "Parameter 'targetProperty' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_binding_group_bind_with_closures.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sourceProperty),
                    target.handle(),
                    Interop.allocateNativeString(targetProperty),
                    flags.getValue(),
                    (Addressable) (transformTo == null ? MemoryAddress.NULL : transformTo.handle()),
                    (Addressable) (transformFrom == null ? MemoryAddress.NULL : transformFrom.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the source object used for binding properties.
     * @return a {@link Object} or {@code null}.
     */
    public @Nullable org.gtk.gobject.Object dupSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_binding_group_dup_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets {@code source} as the source object used for creating property
     * bindings. If there is already a source object all bindings from it
     * will be removed.
     * <p>
     * Note that all properties that have been bound must exist on {@code source}.
     * @param source the source {@link Object},
     *   or {@code null} to clear it
     */
    public void setSource(@Nullable org.gtk.gobject.Object source) {
        try {
            DowncallHandles.g_binding_group_set_source.invokeExact(
                    handle(),
                    (Addressable) (source == null ? MemoryAddress.NULL : source.handle()));
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
            RESULT = (long) DowncallHandles.g_binding_group_get_type.invokeExact();
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
         * A {@link BindingGroup.Build} object constructs a {@link BindingGroup} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BindingGroup} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BindingGroup} using {@link BindingGroup#castFrom}.
         * @return A new instance of {@code BindingGroup} with the properties 
         *         that were set in the Build object.
         */
        public BindingGroup construct() {
            return BindingGroup.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BindingGroup.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The source object used for binding properties.
         * @param source The value for the {@code source} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSource(org.gtk.gobject.Object source) {
            names.add("source");
            values.add(org.gtk.gobject.Value.create(source));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_binding_group_new = Interop.downcallHandle(
            "g_binding_group_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_binding_group_bind = Interop.downcallHandle(
            "g_binding_group_bind",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_binding_group_bind_full = Interop.downcallHandle(
            "g_binding_group_bind_full",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_binding_group_bind_with_closures = Interop.downcallHandle(
            "g_binding_group_bind_with_closures",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_binding_group_dup_source = Interop.downcallHandle(
            "g_binding_group_dup_source",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_binding_group_set_source = Interop.downcallHandle(
            "g_binding_group_set_source",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_binding_group_get_type = Interop.downcallHandle(
            "g_binding_group_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
