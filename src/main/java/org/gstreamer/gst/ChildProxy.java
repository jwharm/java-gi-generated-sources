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
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ChildProxyImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ChildProxyImpl(input, ownership);
    
    /**
     * Emits the {@link ChildProxy}::child-added signal.
     * @param child the newly added child
     * @param name the name of the new child
     */
    default void childAdded(org.gtk.gobject.GObject child, java.lang.String name) {
        try {
            DowncallHandles.gst_child_proxy_child_added.invokeExact(
                    handle(),
                    child.handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the {@link ChildProxy}::child-removed signal.
     * @param child the removed child
     * @param name the name of the old child
     */
    default void childRemoved(org.gtk.gobject.GObject child, java.lang.String name) {
        try {
            DowncallHandles.gst_child_proxy_child_removed.invokeExact(
                    handle(),
                    child.handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets properties of the parent object and its children.
     * @param firstPropertyName name of the first property to get
     * @param varargs return location for the first property, followed optionally by more name/return location pairs, followed by {@code null}
     */
    default void get(java.lang.String firstPropertyName, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_child_proxy_get.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstPropertyName, null),
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
    default @Nullable org.gtk.gobject.GObject getChildByIndex(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_child_proxy_get_child_by_index.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Looks up a child element by the given name.
     * <p>
     * This virtual method has a default implementation that uses {@link GstObject}
     * together with gst_object_get_name(). If the interface is to be used with
     * {@code GObjects}, this methods needs to be overridden.
     * @param name the child's name
     * @return the child object or {@code null} if
     *     not found.
     */
    default @Nullable org.gtk.gobject.GObject getChildByName(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_child_proxy_get_child_by_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.FULL);
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
    default void getProperty(java.lang.String name, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_child_proxy_get_property.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
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
    default void getValist(java.lang.String firstPropertyName, VaList varArgs) {
        try {
            DowncallHandles.gst_child_proxy_get_valist.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstPropertyName, null),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up which object and {@link org.gtk.gobject.ParamSpec} would be effected by the given {@code name}.
     * @param name name of the property to look up
     * @param target pointer to a {@link org.gtk.gobject.GObject} that
     *     takes the real object to set property on
     * @param pspec pointer to take the {@link org.gtk.gobject.ParamSpec}
     *     describing the property
     * @return {@code true} if {@code target} and {@code pspec} could be found. {@code false} otherwise. In that
     * case the values for {@code pspec} and {@code target} are not modified. Unref {@code target} after
     * usage. For plain {@link org.gtk.gobject.GObject} {@code target} is the same as {@code object}.
     */
    default boolean lookup(java.lang.String name, @Nullable Out<org.gtk.gobject.GObject> target, @Nullable Out<org.gtk.gobject.ParamSpec> pspec) {
        MemorySegment targetPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment pspecPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_child_proxy_lookup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    (Addressable) (target == null ? MemoryAddress.NULL : (Addressable) targetPOINTER.address()),
                    (Addressable) (pspec == null ? MemoryAddress.NULL : (Addressable) pspecPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (target != null) target.set((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(targetPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gobject.GObject.fromAddress).marshal(targetPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        if (pspec != null) pspec.set((org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspecPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspecPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.NONE));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets properties of the parent object and its children.
     * @param firstPropertyName name of the first property to set
     * @param varargs value for the first property, followed optionally by more name/value pairs, followed by {@code null}
     */
    default void set(java.lang.String firstPropertyName, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_child_proxy_set.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstPropertyName, null),
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
    default void setProperty(java.lang.String name, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gst_child_proxy_set_property.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
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
    default void setValist(java.lang.String firstPropertyName, VaList varArgs) {
        try {
            DowncallHandles.gst_child_proxy_set_valist.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(firstPropertyName, null),
                    varArgs);
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
            RESULT = (long) DowncallHandles.gst_child_proxy_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ChildAdded {
        void run(org.gtk.gobject.GObject object, java.lang.String name);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceChildProxy, MemoryAddress object, MemoryAddress name) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), Marshal.addressToString.marshal(name, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChildAdded.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Will be emitted after the {@code object} was added to the {@code child_proxy}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ChildProxy.ChildAdded> onChildAdded(ChildProxy.ChildAdded handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("child-added"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChildRemoved {
        void run(org.gtk.gobject.GObject object, java.lang.String name);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceChildProxy, MemoryAddress object, MemoryAddress name) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), Marshal.addressToString.marshal(name, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChildRemoved.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Will be emitted after the {@code object} was removed from the {@code child_proxy}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<ChildProxy.ChildRemoved> onChildRemoved(ChildProxy.ChildRemoved handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("child-removed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
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
    
    class ChildProxyImpl extends org.gtk.gobject.GObject implements ChildProxy {
        
        static {
            Gst.javagi$ensureInitialized();
        }
        
        public ChildProxyImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
