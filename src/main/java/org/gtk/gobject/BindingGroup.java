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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public BindingGroup(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to BindingGroup if its GType is a (or inherits from) "GBindingGroup".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BindingGroup" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GBindingGroup", a ClassCastException will be thrown.
     */
    public static BindingGroup castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GBindingGroup"))) {
            return new BindingGroup(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GBindingGroup");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_binding_group_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link BindingGroup}.
     */
    public BindingGroup() {
        super(constructNew());
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
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (transformFrom == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_binding_group_new = Interop.downcallHandle(
            "g_binding_group_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_binding_group_bind = Interop.downcallHandle(
            "g_binding_group_bind",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_binding_group_bind_full = Interop.downcallHandle(
            "g_binding_group_bind_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_binding_group_bind_with_closures = Interop.downcallHandle(
            "g_binding_group_bind_with_closures",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_binding_group_dup_source = Interop.downcallHandle(
            "g_binding_group_dup_source",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_binding_group_set_source = Interop.downcallHandle(
            "g_binding_group_set_source",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
