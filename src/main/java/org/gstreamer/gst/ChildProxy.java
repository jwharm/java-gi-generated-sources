package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This interface abstracts handling of property sets for elements with
 * children. Imagine elements such as mixers or polyphonic generators. They all
 * have multiple {@link Pad} or some kind of voice objects. Another use case are
 * container elements like {@link Bin}.
 * The element implementing the interface acts as a parent for those child
 * objects.
 * <p>
 * By implementing this interface the child properties can be accessed from the
 * parent element by using gst_child_proxy_get() and gst_child_proxy_set().
 * <p>
 * Property names are written as {@code child-name::property-name}. The whole naming
 * scheme is recursive. Thus {@code child1::child2::property} is valid too, if
 * {@code child1} and {@code child2} implement the {@link ChildProxy} interface.
 */
public interface ChildProxy extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to ChildProxy if its GType is a (or inherits from) "GstChildProxy".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ChildProxy} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstChildProxy", a ClassCastException will be thrown.
     */
    public static ChildProxy castFrom(org.gtk.gobject.Object gobject) {
            return new ChildProxyImpl(gobject.handle(), gobject.yieldOwnership());
    }
    
    /**
     * Emits the {@link ChildProxy}::child-added signal.
     * @param child the newly added child
     * @param name the name of the new child
     */
    default void childAdded(@NotNull org.gtk.gobject.Object child, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_child_proxy_child_added.invokeExact(
                    handle(),
                    child.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the {@link ChildProxy}::child-removed signal.
     * @param child the removed child
     * @param name the name of the old child
     */
    default void childRemoved(@NotNull org.gtk.gobject.Object child, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gst_child_proxy_child_removed.invokeExact(
                    handle(),
                    child.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets properties of the parent object and its children.
     * @param firstPropertyName name of the first property to get
     * @param varargs return location for the first property, followed optionally by more name/return location pairs, followed by {@code null}
     */
    default void get(@NotNull java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        try {
            DowncallHandles.gst_child_proxy_get.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fetches a child by its number.
     * @param index the child's position in the child list
     * @return the child object or {@code null} if
     *     not found (index too high).
     */
    default @Nullable org.gtk.gobject.Object getChildByIndex(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_child_proxy_get_child_by_index.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Looks up a child element by the given name.
     * <p>
     * This virtual method has a default implementation that uses {@link Object}
     * together with gst_object_get_name(). If the interface is to be used with
     * {@code GObjects}, this methods needs to be overridden.
     * @param name the child's name
     * @return the child object or {@code null} if
     *     not found.
     */
    default @Nullable org.gtk.gobject.Object getChildByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_child_proxy_get_child_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the number of child objects this parent contains.
     * @return the number of child objects
     */
    default int getChildrenCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_child_proxy_get_children_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a single property using the GstChildProxy mechanism.
     * You are responsible for freeing it by calling g_value_unset()
     * @param name name of the property
     * @param value a {@link org.gtk.gobject.Value} that should take the result.
     */
    default void getProperty(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_child_proxy_get_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets properties of the parent object and its children.
     * @param firstPropertyName name of the first property to get
     * @param varArgs return location for the first property, followed optionally by more name/return location pairs, followed by {@code null}
     */
    default void getValist(@NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gst_child_proxy_get_valist.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up which object and {@link org.gtk.gobject.ParamSpec} would be effected by the given {@code name}.
     * @param name name of the property to look up
     * @param target pointer to a {@link org.gtk.gobject.Object} that
     *     takes the real object to set property on
     * @param pspec pointer to take the {@link org.gtk.gobject.ParamSpec}
     *     describing the property
     * @return {@code true} if {@code target} and {@code pspec} could be found. {@code false} otherwise. In that
     * case the values for {@code pspec} and {@code target} are not modified. Unref {@code target} after
     * usage. For plain {@link org.gtk.gobject.Object} {@code target} is the same as {@code object}.
     */
    default boolean lookup(@NotNull java.lang.String name, @NotNull Out<org.gtk.gobject.Object> target, @NotNull Out<org.gtk.gobject.ParamSpec> pspec) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        MemorySegment targetPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        MemorySegment pspecPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_child_proxy_lookup.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    (Addressable) targetPOINTER.address(),
                    (Addressable) pspecPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        target.set(new org.gtk.gobject.Object(targetPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        pspec.set(new org.gtk.gobject.ParamSpec(pspecPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return RESULT != 0;
    }
    
    /**
     * Sets properties of the parent object and its children.
     * @param firstPropertyName name of the first property to set
     * @param varargs value for the first property, followed optionally by more name/value pairs, followed by {@code null}
     */
    default void set(@NotNull java.lang.String firstPropertyName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        try {
            DowncallHandles.gst_child_proxy_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a single property using the GstChildProxy mechanism.
     * @param name name of the property to set
     * @param value new {@link org.gtk.gobject.Value} for the property
     */
    default void setProperty(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_child_proxy_set_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets properties of the parent object and its children.
     * @param firstPropertyName name of the first property to set
     * @param varArgs value for the first property, followed optionally by more name/value pairs, followed by {@code null}
     */
    default void setValist(@NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gst_child_proxy_set_valist.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs);
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
            RESULT = (long) DowncallHandles.gst_child_proxy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ChildAdded {
        void signalReceived(ChildProxy source, @NotNull org.gtk.gobject.Object object, @NotNull java.lang.String name);
    }
    
    /**
     * Will be emitted after the {@code object} was added to the {@code child_proxy}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ChildProxy.ChildAdded> onChildAdded(ChildProxy.ChildAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("child-added"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ChildProxy.Callbacks.class, "signalChildProxyChildAdded",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ChildProxy.ChildAdded>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChildRemoved {
        void signalReceived(ChildProxy source, @NotNull org.gtk.gobject.Object object, @NotNull java.lang.String name);
    }
    
    /**
     * Will be emitted after the {@code object} was removed from the {@code child_proxy}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ChildProxy.ChildRemoved> onChildRemoved(ChildProxy.ChildRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("child-removed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(ChildProxy.Callbacks.class, "signalChildProxyChildRemoved",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<ChildProxy.ChildRemoved>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_child_added = Interop.downcallHandle(
            "gst_child_proxy_child_added",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_child_removed = Interop.downcallHandle(
            "gst_child_proxy_child_removed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get = Interop.downcallHandle(
            "gst_child_proxy_get",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get_child_by_index = Interop.downcallHandle(
            "gst_child_proxy_get_child_by_index",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get_child_by_name = Interop.downcallHandle(
            "gst_child_proxy_get_child_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get_children_count = Interop.downcallHandle(
            "gst_child_proxy_get_children_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get_property = Interop.downcallHandle(
            "gst_child_proxy_get_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get_valist = Interop.downcallHandle(
            "gst_child_proxy_get_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_lookup = Interop.downcallHandle(
            "gst_child_proxy_lookup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_set = Interop.downcallHandle(
            "gst_child_proxy_set",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_set_property = Interop.downcallHandle(
            "gst_child_proxy_set_property",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_set_valist = Interop.downcallHandle(
            "gst_child_proxy_set_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_child_proxy_get_type = Interop.downcallHandle(
            "gst_child_proxy_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalChildProxyChildAdded(MemoryAddress source, MemoryAddress object, MemoryAddress name, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ChildProxy.ChildAdded) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ChildProxy.ChildProxyImpl(source, Ownership.NONE), new org.gtk.gobject.Object(object, Ownership.NONE), Interop.getStringFrom(name));
        }
        
        public static void signalChildProxyChildRemoved(MemoryAddress source, MemoryAddress object, MemoryAddress name, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ChildProxy.ChildRemoved) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new ChildProxy.ChildProxyImpl(source, Ownership.NONE), new org.gtk.gobject.Object(object, Ownership.NONE), Interop.getStringFrom(name));
        }
    }
    
    class ChildProxyImpl extends org.gtk.gobject.Object implements ChildProxy {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        public ChildProxyImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
