package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The base object type.
 * <p>
 * All the fields in the {@code GObject} structure are private to the implementation
 * and should never be accessed directly.
 * <p>
 * Since GLib 2.72, all {@code GObjects} are guaranteed to be aligned to at least the
 * alignment of the largest basic GLib type (typically this is {@code guint64} or
 * {@code gdouble}). If you need larger alignment for an element in a {@link Object}, you
 * should allocate it on the heap (aligned), or arrange for your {@link Object} to be
 * appropriately padded. This guarantee applies to the {@link Object} (or derived)
 * struct, the {@link ObjectClass} (or derived) struct, and any private data allocated
 * by G_ADD_PRIVATE().
 */
public class Object extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GObject";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInstance.getMemoryLayout().withName("g_type_instance"),
        ValueLayout.JAVA_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("qdata")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code g_type_instance}
     * @return The value of the field {@code g_type_instance}
     */
    public org.gtk.gobject.TypeInstance g_type_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_instance"));
        return new org.gtk.gobject.TypeInstance(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public Object(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Object if its GType is a (or inherits from) "GObject".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Object" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GObject", a ClassCastException will be thrown.
     */
    public static Object castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GObject"))) {
            return new Object(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GObject");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type objectType, @NotNull java.lang.String firstPropertyName) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values. Any
     * private data for the object is guaranteed to be initialized with zeros, as
     * per g_type_create_instance().
     * <p>
     * Note that in C, small integer types in variable argument lists are promoted
     * up to {@code gint} or {@code guint} as appropriate, and read back accordingly. {@code gint} is 32
     * bits on every platform on which GLib is currently supported. This means that
     * you can use C expressions of type {@code gint} with g_object_new() and properties of
     * type {@code gint} or {@code guint} or smaller. Specifically, you can use integer literals
     * with these property types.
     * <p>
     * When using property types of {@code gint64} or {@code guint64}, you must ensure that the
     * value that you provide is 64 bit. This means that you should use a cast or
     * make use of the {@code G_GINT64_CONSTANT} or {@code G_GUINT64_CONSTANT} macros.
     * <p>
     * Similarly, {@code gfloat} is promoted to {@code gdouble}, so you must ensure that the value
     * you provide is a {@code gdouble}, even for a property of type {@code gfloat}.
     * <p>
     * Since GLib 2.72, all {@code GObjects} are guaranteed to be aligned to at least the
     * alignment of the largest basic GLib type (typically this is {@code guint64} or
     * {@code gdouble}). If you need larger alignment for an element in a {@link Object}, you
     * should allocate it on the heap (aligned), or arrange for your {@link Object} to be
     * appropriately padded.
     * @param objectType the type id of the {@link Object} subtype to instantiate
     * @param firstPropertyName the name of the first property
     */
    public Object(@NotNull org.gtk.glib.Type objectType, @NotNull java.lang.String firstPropertyName) {
        this(Refcounted.get(null)); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static Refcounted constructNewValist(@NotNull org.gtk.glib.Type objectType, @NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_object_new_valist.invokeExact(
                    objectType.getValue().longValue(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values.
     * @param objectType the type id of the {@link Object} subtype to instantiate
     * @param firstPropertyName the name of the first property
     * @param varArgs the value of the first property, followed optionally by more
     *  name/value pairs, followed by {@code null}
     * @return a new instance of {@code object_type}
     */
    public static Object newValist(@NotNull org.gtk.glib.Type objectType, @NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        return new Object(constructNewValist(objectType, firstPropertyName, varArgs));
    }
    
    private static Refcounted constructNewWithProperties(@NotNull org.gtk.glib.Type objectType, int nProperties, java.lang.String[] names, org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(names, "Parameter 'names' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_object_new_with_properties.invokeExact(
                    objectType.getValue().longValue(),
                    nProperties,
                    Interop.allocateNativeArray(names, false),
                    Interop.allocateNativeArray(values, false)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties using
     * the provided arrays. Both arrays must have exactly {@code n_properties} elements,
     * and the names and values correspond by index.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values.
     * @param objectType the object type to instantiate
     * @param nProperties the number of properties
     * @param names the names of each property to be set
     * @param values the values of each property to be set
     * @return a new instance of
     * {@code object_type}
     */
    public static Object newWithProperties(@NotNull org.gtk.glib.Type objectType, int nProperties, java.lang.String[] names, org.gtk.gobject.Value[] values) {
        return new Object(constructNewWithProperties(objectType, nProperties, names, values));
    }
    
    private static Refcounted constructNewv(@NotNull org.gtk.glib.Type objectType, int nParameters, org.gtk.gobject.Parameter[] parameters) {
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(parameters, "Parameter 'parameters' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_object_newv.invokeExact(
                    objectType.getValue().longValue(),
                    nParameters,
                    Interop.allocateNativeArray(parameters, false)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values.
     * @param objectType the type id of the {@link Object} subtype to instantiate
     * @param nParameters the length of the {@code parameters} array
     * @param parameters an array of {@link Parameter}
     * @return a new instance of
     * {@code object_type}
     * @deprecated Use g_object_new_with_properties() instead.
     * deprecated. See {@link Parameter} for more information.
     */
    @Deprecated
    public static Object newv(@NotNull org.gtk.glib.Type objectType, int nParameters, org.gtk.gobject.Parameter[] parameters) {
        return new Object(constructNewv(objectType, nParameters, parameters));
    }
    
    /**
     * Increases the reference count of the object by one and sets a
     * callback to be called when all other references to the object are
     * dropped, or when this is already the last reference to the object
     * and another reference is established.
     * <p>
     * This functionality is intended for binding {@code object} to a proxy
     * object managed by another memory manager. This is done with two
     * paired references: the strong reference added by
     * g_object_add_toggle_ref() and a reverse reference to the proxy
     * object which is either a strong reference or weak reference.
     * <p>
     * The setup is that when there are no other references to {@code object},
     * only a weak reference is held in the reverse direction from {@code object}
     * to the proxy object, but when there are other references held to
     * {@code object}, a strong reference is held. The {@code notify} callback is called
     * when the reference from {@code object} to the proxy object should be
     * "toggled" from strong to weak ({@code is_last_ref} true) or weak to strong
     * ({@code is_last_ref} false).
     * <p>
     * Since a (normal) reference must be held to the object before
     * calling g_object_add_toggle_ref(), the initial state of the reverse
     * link is always strong.
     * <p>
     * Multiple toggle references may be added to the same gobject,
     * however if there are multiple toggle references to an object, none
     * of them will ever be notified until all but one are removed.  For
     * this reason, you should only ever use a toggle reference if there
     * is important state in the proxy object.
     * @param notify a function to call when this reference is the
     *  last reference to the object, or is no longer
     *  the last reference.
     */
    public void addToggleRef(@NotNull org.gtk.gobject.ToggleNotify notify) {
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        try {
            DowncallHandles.g_object_add_toggle_ref.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbToggleNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a weak reference from weak_pointer to {@code object} to indicate that
     * the pointer located at {@code weak_pointer_location} is only valid during
     * the lifetime of {@code object}. When the {@code object} is finalized,
     * {@code weak_pointer} will be set to {@code null}.
     * <p>
     * Note that as with g_object_weak_ref(), the weak references created by
     * this method are not thread-safe: they cannot safely be used in one
     * thread if the object's last g_object_unref() might happen in another
     * thread. Use {@link WeakRef} if thread-safety is required.
     * @param weakPointerLocation The memory address
     *    of a pointer.
     */
    public void addWeakPointer(@NotNull Out<java.lang.foreign.MemoryAddress> weakPointerLocation) {
        java.util.Objects.requireNonNull(weakPointerLocation, "Parameter 'weakPointerLocation' must not be null");
        MemorySegment weakPointerLocationPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.g_object_add_weak_pointer.invokeExact(
                    handle(),
                    (Addressable) weakPointerLocationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        weakPointerLocation.set(weakPointerLocationPOINTER.get(ValueLayout.ADDRESS, 0));
    }
    
    /**
     * Creates a binding between {@code source_property} on {@code source} and {@code target_property}
     * on {@code target}.
     * <p>
     * Whenever the {@code source_property} is changed the {@code target_property} is
     * updated using the same value. For instance:
     * <pre>{@code <!-- language="C" -->
     *   g_object_bind_property (action, "active", widget, "sensitive", 0);
     * }</pre>
     * <p>
     * Will result in the "sensitive" property of the widget {@link Object} instance to be
     * updated with the same value of the "active" property of the action {@link Object}
     * instance.
     * <p>
     * If {@code flags} contains {@link BindingFlags#BIDIRECTIONAL} then the binding will be mutual:
     * if {@code target_property} on {@code target} changes then the {@code source_property} on {@code source}
     * will be updated as well.
     * <p>
     * The binding will automatically be removed when either the {@code source} or the
     * {@code target} instances are finalized. To remove the binding without affecting the
     * {@code source} and the {@code target} you can just call g_object_unref() on the returned
     * {@link Binding} instance.
     * <p>
     * Removing the binding by calling g_object_unref() on it must only be done if
     * the binding, {@code source} and {@code target} are only used from a single thread and it
     * is clear that both {@code source} and {@code target} outlive the binding. Especially it
     * is not safe to rely on this if the binding, {@code source} or {@code target} can be
     * finalized from different threads. Keep another reference to the binding and
     * use g_binding_unbind() instead to be on the safe side.
     * <p>
     * A {@link Object} can have multiple bindings.
     * @param sourceProperty the property on {@code source} to bind
     * @param target the target {@link Object}
     * @param targetProperty the property on {@code target} to bind
     * @param flags flags to pass to {@link Binding}
     * @return the {@link Binding} instance representing the
     *     binding between the two {@link Object} instances. The binding is released
     *     whenever the {@link Binding} reference count reaches zero.
     */
    public @NotNull org.gtk.gobject.Binding bindProperty(@NotNull java.lang.String sourceProperty, @NotNull org.gtk.gobject.Object target, @NotNull java.lang.String targetProperty, @NotNull org.gtk.gobject.BindingFlags flags) {
        java.util.Objects.requireNonNull(sourceProperty, "Parameter 'sourceProperty' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(targetProperty, "Parameter 'targetProperty' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_bind_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sourceProperty),
                    target.handle(),
                    Interop.allocateNativeString(targetProperty),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Binding(Refcounted.get(RESULT, false));
    }
    
    /**
     * Complete version of g_object_bind_property().
     * <p>
     * Creates a binding between {@code source_property} on {@code source} and {@code target_property}
     * on {@code target}, allowing you to set the transformation functions to be used by
     * the binding.
     * <p>
     * If {@code flags} contains {@link BindingFlags#BIDIRECTIONAL} then the binding will be mutual:
     * if {@code target_property} on {@code target} changes then the {@code source_property} on {@code source}
     * will be updated as well. The {@code transform_from} function is only used in case
     * of bidirectional bindings, otherwise it will be ignored
     * <p>
     * The binding will automatically be removed when either the {@code source} or the
     * {@code target} instances are finalized. This will release the reference that is
     * being held on the {@link Binding} instance; if you want to hold on to the
     * {@link Binding} instance, you will need to hold a reference to it.
     * <p>
     * To remove the binding, call g_binding_unbind().
     * <p>
     * A {@link Object} can have multiple bindings.
     * <p>
     * The same {@code user_data} parameter will be used for both {@code transform_to}
     * and {@code transform_from} transformation functions; the {@code notify} function will
     * be called once, when the binding is removed. If you need different data
     * for each transformation function, please use
     * g_object_bind_property_with_closures() instead.
     * @param sourceProperty the property on {@code source} to bind
     * @param target the target {@link Object}
     * @param targetProperty the property on {@code target} to bind
     * @param flags flags to pass to {@link Binding}
     * @param transformTo the transformation function
     *     from the {@code source} to the {@code target}, or {@code null} to use the default
     * @param transformFrom the transformation function
     *     from the {@code target} to the {@code source}, or {@code null} to use the default
     * @return the {@link Binding} instance representing the
     *     binding between the two {@link Object} instances. The binding is released
     *     whenever the {@link Binding} reference count reaches zero.
     */
    public @NotNull org.gtk.gobject.Binding bindPropertyFull(@NotNull java.lang.String sourceProperty, @NotNull org.gtk.gobject.Object target, @NotNull java.lang.String targetProperty, @NotNull org.gtk.gobject.BindingFlags flags, @Nullable org.gtk.gobject.BindingTransformFunc transformTo, @Nullable org.gtk.gobject.BindingTransformFunc transformFrom) {
        java.util.Objects.requireNonNull(sourceProperty, "Parameter 'sourceProperty' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(targetProperty, "Parameter 'targetProperty' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_bind_property_full.invokeExact(
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
        return new org.gtk.gobject.Binding(Refcounted.get(RESULT, false));
    }
    
    /**
     * Creates a binding between {@code source_property} on {@code source} and {@code target_property}
     * on {@code target}, allowing you to set the transformation functions to be used by
     * the binding.
     * <p>
     * This function is the language bindings friendly version of
     * g_object_bind_property_full(), using {@code GClosures} instead of
     * function pointers.
     * @param sourceProperty the property on {@code source} to bind
     * @param target the target {@link Object}
     * @param targetProperty the property on {@code target} to bind
     * @param flags flags to pass to {@link Binding}
     * @param transformTo a {@link Closure} wrapping the transformation function
     *     from the {@code source} to the {@code target}, or {@code null} to use the default
     * @param transformFrom a {@link Closure} wrapping the transformation function
     *     from the {@code target} to the {@code source}, or {@code null} to use the default
     * @return the {@link Binding} instance representing the
     *     binding between the two {@link Object} instances. The binding is released
     *     whenever the {@link Binding} reference count reaches zero.
     */
    public @NotNull org.gtk.gobject.Binding bindPropertyWithClosures(@NotNull java.lang.String sourceProperty, @NotNull org.gtk.gobject.Object target, @NotNull java.lang.String targetProperty, @NotNull org.gtk.gobject.BindingFlags flags, @NotNull org.gtk.gobject.Closure transformTo, @NotNull org.gtk.gobject.Closure transformFrom) {
        java.util.Objects.requireNonNull(sourceProperty, "Parameter 'sourceProperty' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        java.util.Objects.requireNonNull(targetProperty, "Parameter 'targetProperty' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(transformTo, "Parameter 'transformTo' must not be null");
        java.util.Objects.requireNonNull(transformFrom, "Parameter 'transformFrom' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_bind_property_with_closures.invokeExact(
                    handle(),
                    Interop.allocateNativeString(sourceProperty),
                    target.handle(),
                    Interop.allocateNativeString(targetProperty),
                    flags.getValue(),
                    transformTo.handle(),
                    transformFrom.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Binding(Refcounted.get(RESULT, false));
    }
    
    /**
     * A convenience function to connect multiple signals at once.
     * <p>
     * The signal specs expected by this function have the form
     * "modifier::signal_name", where modifier can be one of the following:
     * <ul>
     * <li>signal: equivalent to g_signal_connect_data (..., NULL, 0)
     * <li>object-signal, object_signal: equivalent to g_signal_connect_object (..., 0)
     * <li>swapped-signal, swapped_signal: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED)
     * <li>swapped_object_signal, swapped-object-signal: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED)
     * <li>signal_after, signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_AFTER)
     * <li>object_signal_after, object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_AFTER)
     * <li>swapped_signal_after, swapped-signal-after: equivalent to g_signal_connect_data (..., NULL, G_CONNECT_SWAPPED | G_CONNECT_AFTER)
     * <li>swapped_object_signal_after, swapped-object-signal-after: equivalent to g_signal_connect_object (..., G_CONNECT_SWAPPED | G_CONNECT_AFTER)
     * </ul>
     * <pre>{@code <!-- language="C" -->
     *   menu->toplevel = g_object_connect (g_object_new (GTK_TYPE_WINDOW,
     * 						   "type", GTK_WINDOW_POPUP,
     * 						   "child", menu,
     * 						   NULL),
     * 				     "signal::event", gtk_menu_window_event, menu,
     * 				     "signal::size_request", gtk_menu_window_size_request, menu,
     * 				     "signal::destroy", gtk_widget_destroyed, &menu->toplevel,
     * 				     NULL);
     * }</pre>
     * @param signalSpec the spec for the first signal
     * @return {@code object}
     */
    public @NotNull org.gtk.gobject.Object connect(@NotNull java.lang.String signalSpec) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * A convenience function to disconnect multiple signals at once.
     * <p>
     * The signal specs expected by this function have the form
     * "any_signal", which means to disconnect any signal with matching
     * callback and data, or "any_signal::signal_name", which only
     * disconnects the signal named "signal_name".
     * @param signalSpec the spec for the first signal
     */
    public void disconnect(@NotNull java.lang.String signalSpec) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * This is a variant of g_object_get_data() which returns
     * a 'duplicate' of the value. {@code dup_func} defines the
     * meaning of 'duplicate' in this context, it could e.g.
     * take a reference on a ref-counted object.
     * <p>
     * If the {@code key} is not set on the object then {@code dup_func}
     * will be called with a {@code null} argument.
     * <p>
     * Note that {@code dup_func} is called while user data of {@code object}
     * is locked.
     * <p>
     * This function can be useful to avoid races when multiple
     * threads are using object data on the same key on the same
     * object.
     * @param key a string, naming the user data pointer
     * @param dupFunc function to dup the value
     * @return the result of calling {@code dup_func} on the value
     *     associated with {@code key} on {@code object}, or {@code null} if not set.
     *     If {@code dup_func} is {@code null}, the value is returned
     *     unmodified.
     */
    public @Nullable java.lang.foreign.MemoryAddress dupData(@NotNull java.lang.String key, @Nullable org.gtk.glib.DuplicateFunc dupFunc) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_dup_data.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    (Addressable) (dupFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbDuplicateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (dupFunc == null ? MemoryAddress.NULL : Interop.registerCallback(dupFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This is a variant of g_object_get_qdata() which returns
     * a 'duplicate' of the value. {@code dup_func} defines the
     * meaning of 'duplicate' in this context, it could e.g.
     * take a reference on a ref-counted object.
     * <p>
     * If the {@code quark} is not set on the object then {@code dup_func}
     * will be called with a {@code null} argument.
     * <p>
     * Note that {@code dup_func} is called while user data of {@code object}
     * is locked.
     * <p>
     * This function can be useful to avoid races when multiple
     * threads are using object data on the same key on the same
     * object.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param dupFunc function to dup the value
     * @return the result of calling {@code dup_func} on the value
     *     associated with {@code quark} on {@code object}, or {@code null} if not set.
     *     If {@code dup_func} is {@code null}, the value is returned
     *     unmodified.
     */
    public @Nullable java.lang.foreign.MemoryAddress dupQdata(@NotNull org.gtk.glib.Quark quark, @Nullable org.gtk.glib.DuplicateFunc dupFunc) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_dup_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    (Addressable) (dupFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbDuplicateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (dupFunc == null ? MemoryAddress.NULL : Interop.registerCallback(dupFunc)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function is intended for {@link Object} implementations to re-enforce
     * a [floating][floating-ref] object reference. Doing this is seldom
     * required: all {@code GInitiallyUnowneds} are created with a floating reference
     * which usually just needs to be sunken by calling g_object_ref_sink().
     */
    public void forceFloating() {
        try {
            DowncallHandles.g_object_force_floating.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the freeze count on {@code object}. If the freeze count is
     * non-zero, the emission of "notify" signals on {@code object} is
     * stopped. The signals are queued until the freeze count is decreased
     * to zero. Duplicate notifications are squashed so that at most one
     * {@link Object}::notify signal is emitted for each property modified while the
     * object is frozen.
     * <p>
     * This is necessary for accessors that modify multiple properties to prevent
     * premature notification while the object is still being modified.
     */
    public void freezeNotify() {
        try {
            DowncallHandles.g_object_freeze_notify.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets properties of an object.
     * <p>
     * In general, a copy is made of the property contents and the caller
     * is responsible for freeing the memory in the appropriate manner for
     * the type, for instance by calling g_free() or g_object_unref().
     * <p>
     * Here is an example of using g_object_get() to get the contents
     * of three properties: an integer, a string and an object:
     * <pre>{@code <!-- language="C" -->
     *  gint intval;
     *  guint64 uint64val;
     *  gchar *strval;
     *  GObject *objval;
     * 
     *  g_object_get (my_object,
     *                "int-property", &intval,
     *                "uint64-property", &uint64val,
     *                "str-property", &strval,
     *                "obj-property", &objval,
     *                NULL);
     * 
     *  // Do something with intval, uint64val, strval, objval
     * 
     *  g_free (strval);
     *  g_object_unref (objval);
     * }</pre>
     * @param firstPropertyName name of the first property to get
     */
    public void get(@NotNull java.lang.String firstPropertyName) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Gets a named field from the objects table of associations (see g_object_set_data()).
     * @param key name of the key for that association
     * @return the data if found,
     *          or {@code null} if no such data exists.
     */
    public @Nullable java.lang.foreign.MemoryAddress getData(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_get_data.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a property of an object.
     * <p>
     * The {@code value} can be:
     * <ul>
     * <li>an empty {@link Value} initialized by {@code G_VALUE_INIT}, which will be
     *    automatically initialized with the expected type of the property
     *    (since GLib 2.60)
     * <li>a {@link Value} initialized with the expected type of the property
     * <li>a {@link Value} initialized with a type to which the expected type
     *    of the property can be transformed
     * </ul>
     * <p>
     * In general, a copy is made of the property contents and the caller is
     * responsible for freeing the memory by calling g_value_unset().
     * <p>
     * Note that g_object_get_property() is really intended for language
     * bindings, g_object_get() is much more convenient for C programming.
     * @param propertyName the name of the property to get
     * @param value return location for the property value
     */
    public void getProperty(@NotNull java.lang.String propertyName, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_object_get_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(propertyName),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function gets back user data pointers stored via
     * g_object_set_qdata().
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return The user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_get_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets properties of an object.
     * <p>
     * In general, a copy is made of the property contents and the caller
     * is responsible for freeing the memory in the appropriate manner for
     * the type, for instance by calling g_free() or g_object_unref().
     * <p>
     * See g_object_get().
     * @param firstPropertyName name of the first property to get
     * @param varArgs return location for the first property, followed optionally by more
     *  name/return location pairs, followed by {@code null}
     */
    public void getValist(@NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.g_object_get_valist.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets {@code n_properties} properties for an {@code object}.
     * Obtained properties will be set to {@code values}. All properties must be valid.
     * Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     * @param nProperties the number of properties
     * @param names the names of each property to get
     * @param values the values of each property to get
     */
    public void getv(int nProperties, java.lang.String[] names, org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(names, "Parameter 'names' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.g_object_getv.invokeExact(
                    handle(),
                    nProperties,
                    Interop.allocateNativeArray(names, false),
                    Interop.allocateNativeArray(values, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks whether {@code object} has a [floating][floating-ref] reference.
     * @return {@code true} if {@code object} has a floating reference
     */
    public boolean isFloating() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_object_is_floating.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Emits a "notify" signal for the property {@code property_name} on {@code object}.
     * <p>
     * When possible, eg. when signaling a property change from within the class
     * that registered the property, you should use g_object_notify_by_pspec()
     * instead.
     * <p>
     * Note that emission of the notify signal may be blocked with
     * g_object_freeze_notify(). In this case, the signal emissions are queued
     * and will be emitted (in reverse order) when g_object_thaw_notify() is
     * called.
     * @param propertyName the name of a property installed on the class of {@code object}.
     */
    public void notify(@NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        try {
            DowncallHandles.g_object_notify.invokeExact(
                    handle(),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits a "notify" signal for the property specified by {@code pspec} on {@code object}.
     * <p>
     * This function omits the property name lookup, hence it is faster than
     * g_object_notify().
     * <p>
     * One way to avoid using g_object_notify() from within the
     * class that registered the properties, and using g_object_notify_by_pspec()
     * instead, is to store the GParamSpec used with
     * g_object_class_install_property() inside a static array, e.g.:
     * <pre>{@code <!-- language="C" -->
     *   enum
     *   {
     *     PROP_0,
     *     PROP_FOO,
     *     PROP_LAST
     *   };
     * 
     *   static GParamSpec *properties[PROP_LAST];
     * 
     *   static void
     *   my_object_class_init (MyObjectClass *klass)
     *   {
     *     properties[PROP_FOO] = g_param_spec_int ("foo", "Foo", "The foo",
     *                                              0, 100,
     *                                              50,
     *                                              G_PARAM_READWRITE);
     *     g_object_class_install_property (gobject_class,
     *                                      PROP_FOO,
     *                                      properties[PROP_FOO]);
     *   }
     * }</pre>
     * <p>
     * and then notify a change on the "foo" property with:
     * <pre>{@code <!-- language="C" -->
     *   g_object_notify_by_pspec (self, properties[PROP_FOO]);
     * }</pre>
     * @param pspec the {@link ParamSpec} of a property installed on the class of {@code object}.
     */
    public void notifyByPspec(@NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        try {
            DowncallHandles.g_object_notify_by_pspec.invokeExact(
                    handle(),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count of {@code object}.
     * <p>
     * Since GLib 2.56, if {@code GLIB_VERSION_MAX_ALLOWED} is 2.56 or greater, the type
     * of {@code object} will be propagated to the return type (using the GCC typeof()
     * extension), so any casting the caller needs to do on the return type must be
     * explicit.
     * @return the same {@code object}
     */
    public @NotNull org.gtk.gobject.Object ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Increase the reference count of {@code object}, and possibly remove the
     * [floating][floating-ref] reference, if {@code object} has a floating reference.
     * <p>
     * In other words, if the object is floating, then this call "assumes
     * ownership" of the floating reference, converting it to a normal
     * reference by clearing the floating flag while leaving the reference
     * count unchanged.  If the object is not floating, then this call
     * adds a new normal reference increasing the reference count by one.
     * <p>
     * Since GLib 2.56, the type of {@code object} will be propagated to the return type
     * under the same conditions as for g_object_ref().
     * @return {@code object}
     */
    public @NotNull org.gtk.gobject.Object refSink() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_ref_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a reference added with g_object_add_toggle_ref(). The
     * reference count of the object is decreased by one.
     * @param notify a function to call when this reference is the
     *  last reference to the object, or is no longer
     *  the last reference.
     */
    public void removeToggleRef(@NotNull org.gtk.gobject.ToggleNotify notify) {
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        try {
            DowncallHandles.g_object_remove_toggle_ref.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbToggleNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a weak reference from {@code object} that was previously added
     * using g_object_add_weak_pointer(). The {@code weak_pointer_location} has
     * to match the one used with g_object_add_weak_pointer().
     * @param weakPointerLocation The memory address
     *    of a pointer.
     */
    public void removeWeakPointer(@NotNull Out<java.lang.foreign.MemoryAddress> weakPointerLocation) {
        java.util.Objects.requireNonNull(weakPointerLocation, "Parameter 'weakPointerLocation' must not be null");
        MemorySegment weakPointerLocationPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            DowncallHandles.g_object_remove_weak_pointer.invokeExact(
                    handle(),
                    (Addressable) weakPointerLocationPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        weakPointerLocation.set(weakPointerLocationPOINTER.get(ValueLayout.ADDRESS, 0));
    }
    
    /**
     * Compares the user data for the key {@code key} on {@code object} with
     * {@code oldval}, and if they are the same, replaces {@code oldval} with
     * {@code newval}.
     * <p>
     * This is like a typical atomic compare-and-exchange
     * operation, for user data on an object.
     * <p>
     * If the previous value was replaced then ownership of the
     * old value ({@code oldval}) is passed to the caller, including
     * the registered destroy notify for it (passed out in {@code old_destroy}).
     * It’s up to the caller to free this as needed, which may
     * or may not include using {@code old_destroy} as sometimes replacement
     * should not destroy the object in the normal way.
     * <p>
     * See g_object_set_data() for guidance on using a small, bounded set of values
     * for {@code key}.
     * @param key a string, naming the user data pointer
     * @param oldval the old value to compare against
     * @param newval the new value
     * @param destroy a destroy notify for the new value
     * @param oldDestroy destroy notify for the existing value
     * @return {@code true} if the existing value for {@code key} was replaced
     *  by {@code newval}, {@code false} otherwise.
     */
    public boolean replaceData(@NotNull java.lang.String key, @Nullable java.lang.foreign.MemoryAddress oldval, @Nullable java.lang.foreign.MemoryAddress newval, @Nullable org.gtk.glib.DestroyNotify destroy, @NotNull Out<org.gtk.glib.DestroyNotify> oldDestroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Compares the user data for the key {@code quark} on {@code object} with
     * {@code oldval}, and if they are the same, replaces {@code oldval} with
     * {@code newval}.
     * <p>
     * This is like a typical atomic compare-and-exchange
     * operation, for user data on an object.
     * <p>
     * If the previous value was replaced then ownership of the
     * old value ({@code oldval}) is passed to the caller, including
     * the registered destroy notify for it (passed out in {@code old_destroy}).
     * It’s up to the caller to free this as needed, which may
     * or may not include using {@code old_destroy} as sometimes replacement
     * should not destroy the object in the normal way.
     * @param quark a {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param oldval the old value to compare against
     * @param newval the new value
     * @param destroy a destroy notify for the new value
     * @param oldDestroy destroy notify for the existing value
     * @return {@code true} if the existing value for {@code quark} was replaced
     *  by {@code newval}, {@code false} otherwise.
     */
    public boolean replaceQdata(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress oldval, @Nullable java.lang.foreign.MemoryAddress newval, @Nullable org.gtk.glib.DestroyNotify destroy, @NotNull Out<org.gtk.glib.DestroyNotify> oldDestroy) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Releases all references to other objects. This can be used to break
     * reference cycles.
     * <p>
     * This function should only be called from object system implementations.
     */
    public void runDispose() {
        try {
            DowncallHandles.g_object_run_dispose.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets properties on an object.
     * <p>
     * The same caveats about passing integer literals as varargs apply as with
     * g_object_new(). In particular, any integer literals set as the values for
     * properties of type {@code gint64} or {@code guint64} must be 64 bits wide, using the
     * {@code G_GINT64_CONSTANT} or {@code G_GUINT64_CONSTANT} macros.
     * <p>
     * Note that the "notify" signals are queued and only emitted (in
     * reverse order) after all properties have been set. See
     * g_object_freeze_notify().
     * @param firstPropertyName name of the first property to set
     */
    public void set(@NotNull java.lang.String firstPropertyName) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Each object carries around a table of associations from
     * strings to pointers.  This function lets you set an association.
     * <p>
     * If the object already had an association with that name,
     * the old association will be destroyed.
     * <p>
     * Internally, the {@code key} is converted to a {@link org.gtk.glib.Quark} using g_quark_from_string().
     * This means a copy of {@code key} is kept permanently (even after {@code object} has been
     * finalized) — so it is recommended to only use a small, bounded set of values
     * for {@code key} in your program, to avoid the {@link org.gtk.glib.Quark} storage growing unbounded.
     * @param key name of the key
     * @param data data to associate with that key
     */
    public void setData(@NotNull java.lang.String key, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.g_object_set_data.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like g_object_set_data() except it adds notification
     * for when the association is destroyed, either by setting it
     * to a different value or when the object is destroyed.
     * <p>
     * Note that the {@code destroy} callback is not called if {@code data} is {@code null}.
     * @param key name of the key
     * @param data data to associate with that key
     * @param destroy function to call when the association is destroyed
     */
    public void setDataFull(@NotNull java.lang.String key, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.gtk.glib.DestroyNotify destroy) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.g_object_set_data_full.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    data,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a property on an object.
     * @param propertyName the name of the property to set
     * @param value the value
     */
    public void setProperty(@NotNull java.lang.String propertyName, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_object_set_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(propertyName),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This sets an opaque, named pointer on an object.
     * The name is specified through a {@link org.gtk.glib.Quark} (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer
     * can be gotten back from the {@code object} with g_object_get_qdata()
     * until the {@code object} is finalized.
     * Setting a previously set user data pointer, overrides (frees)
     * the old pointer set, using {@code NULL} as pointer essentially
     * removes the data stored.
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param data An opaque user data pointer
     */
    public void setQdata(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_object_set_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function works like g_object_set_qdata(), but in addition,
     * a void (*destroy) (gpointer) function may be specified which is
     * called with {@code data} as argument when the {@code object} is finalized, or
     * the data is being overwritten by a call to g_object_set_qdata()
     * with the same {@code quark}.
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @param data An opaque user data pointer
     * @param destroy Function to invoke with {@code data} as argument, when {@code data}
     *           needs to be freed
     */
    public void setQdataFull(@NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data, @Nullable org.gtk.glib.DestroyNotify destroy) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_object_set_qdata_full.invokeExact(
                    handle(),
                    quark.getValue().intValue(),
                    data,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets properties on an object.
     * @param firstPropertyName name of the first property to set
     * @param varArgs value for the first property, followed optionally by more
     *  name/value pairs, followed by {@code null}
     */
    public void setValist(@NotNull java.lang.String firstPropertyName, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(firstPropertyName, "Parameter 'firstPropertyName' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.g_object_set_valist.invokeExact(
                    handle(),
                    Interop.allocateNativeString(firstPropertyName),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code n_properties} properties for an {@code object}.
     * Properties to be set will be taken from {@code values}. All properties must be
     * valid. Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     * @param nProperties the number of properties
     * @param names the names of each property to be set
     * @param values the values of each property to be set
     */
    public void setv(int nProperties, java.lang.String[] names, org.gtk.gobject.Value[] values) {
        java.util.Objects.requireNonNull(names, "Parameter 'names' must not be null");
        java.util.Objects.requireNonNull(values, "Parameter 'values' must not be null");
        try {
            DowncallHandles.g_object_setv.invokeExact(
                    handle(),
                    nProperties,
                    Interop.allocateNativeArray(names, false),
                    Interop.allocateNativeArray(values, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Remove a specified datum from the object's data associations,
     * without invoking the association's destroy handler.
     * @param key name of the key
     * @return the data if found, or {@code null}
     *          if no such data exists.
     */
    public @Nullable java.lang.foreign.MemoryAddress stealData(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_steal_data.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function gets back user data pointers stored via
     * g_object_set_qdata() and removes the {@code data} from object
     * without invoking its destroy() function (if any was
     * set).
     * Usually, calling this function is only required to update
     * user data pointers with a destroy notifier, for example:
     * <pre>{@code <!-- language="C" -->
     * void
     * object_add_to_user_list (GObject     *object,
     *                          const gchar *new_string)
     * {
     *   // the quark, naming the object data
     *   GQuark quark_string_list = g_quark_from_static_string ("my-string-list");
     *   // retrieve the old string list
     *   GList *list = g_object_steal_qdata (object, quark_string_list);
     * 
     *   // prepend new string
     *   list = g_list_prepend (list, g_strdup (new_string));
     *   // this changed 'list', so we need to set it again
     *   g_object_set_qdata_full (object, quark_string_list, list, free_string_list);
     * }
     * static void
     * free_string_list (gpointer data)
     * {
     *   GList *node, *list = data;
     * 
     *   for (node = list; node; node = node->next)
     *     g_free (node->data);
     *   g_list_free (list);
     * }
     * }</pre>
     * Using g_object_get_qdata() in the above example, instead of
     * g_object_steal_qdata() would have left the destroy function set,
     * and thus the partial string list would have been freed upon
     * g_object_set_qdata_full().
     * @param quark A {@link org.gtk.glib.Quark}, naming the user data pointer
     * @return The user data pointer set, or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress stealQdata(@NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_steal_qdata.invokeExact(
                    handle(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * If {@code object} is floating, sink it.  Otherwise, do nothing.
     * <p>
     * In other words, this function will convert a floating reference (if
     * present) into a full reference.
     * <p>
     * Typically you want to use g_object_ref_sink() in order to
     * automatically do the correct thing with respect to floating or
     * non-floating references, but there is one specific scenario where
     * this function is helpful.
     * <p>
     * The situation where this function is helpful is when creating an API
     * that allows the user to provide a callback function that returns a
     * GObject. We certainly want to allow the user the flexibility to
     * return a non-floating reference from this callback (for the case
     * where the object that is being returned already exists).
     * <p>
     * At the same time, the API style of some popular GObject-based
     * libraries (such as Gtk) make it likely that for newly-created GObject
     * instances, the user can be saved some typing if they are allowed to
     * return a floating reference.
     * <p>
     * Using this function on the return value of the user's callback allows
     * the user to do whichever is more convenient for them. The caller will
     * alway receives exactly one full reference to the value: either the
     * one that was returned in the first place, or a floating reference
     * that has been converted to a full reference.
     * <p>
     * This function has an odd interaction when combined with
     * g_object_ref_sink() running at the same time in another thread on
     * the same {@link Object} instance. If g_object_ref_sink() runs first then
     * the result will be that the floating reference is converted to a hard
     * reference. If g_object_take_ref() runs first then the result will be
     * that the floating reference is converted to a hard reference and an
     * additional reference on top of that one is added. It is best to avoid
     * this situation.
     * @return {@code object}
     */
    public @NotNull org.gtk.gobject.Object takeRef() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_take_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, true));
    }
    
    /**
     * Reverts the effect of a previous call to
     * g_object_freeze_notify(). The freeze count is decreased on {@code object}
     * and when it reaches zero, queued "notify" signals are emitted.
     * <p>
     * Duplicate notifications for each property are squashed so that at most one
     * {@link Object}::notify signal is emitted for each property, in the reverse order
     * in which they have been queued.
     * <p>
     * It is an error to call this function when the freeze count is zero.
     */
    public void thawNotify() {
        try {
            DowncallHandles.g_object_thaw_notify.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count of {@code object}. When its reference count
     * drops to 0, the object is finalized (i.e. its memory is freed).
     * <p>
     * If the pointer to the {@link Object} may be reused in future (for example, if it is
     * an instance variable of another object), it is recommended to clear the
     * pointer to {@code null} rather than retain a dangling pointer to a potentially
     * invalid {@link Object} instance. Use g_clear_object() for this.
     */
    public void unref() {
        try {
            DowncallHandles.g_object_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function essentially limits the life time of the {@code closure} to
     * the life time of the object. That is, when the object is finalized,
     * the {@code closure} is invalidated by calling g_closure_invalidate() on
     * it, in order to prevent invocations of the closure with a finalized
     * (nonexisting) object. Also, g_object_ref() and g_object_unref() are
     * added as marshal guards to the {@code closure}, to ensure that an extra
     * reference count is held on {@code object} during invocation of the
     * {@code closure}.  Usually, this function will be called on closures that
     * use this {@code object} as closure data.
     * @param closure {@link Closure} to watch
     */
    public void watchClosure(@NotNull org.gtk.gobject.Closure closure) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        try {
            DowncallHandles.g_object_watch_closure.invokeExact(
                    handle(),
                    closure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a weak reference callback to an object. Weak references are
     * used for notification when an object is disposed. They are called
     * "weak references" because they allow you to safely hold a pointer
     * to an object without calling g_object_ref() (g_object_ref() adds a
     * strong reference, that is, forces the object to stay alive).
     * <p>
     * Note that the weak references created by this method are not
     * thread-safe: they cannot safely be used in one thread if the
     * object's last g_object_unref() might happen in another thread.
     * Use {@link WeakRef} if thread-safety is required.
     * @param notify callback to invoke before the object is freed
     */
    public void weakRef(@NotNull org.gtk.gobject.WeakNotify notify) {
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        try {
            DowncallHandles.g_object_weak_ref.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbWeakNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a weak reference callback to an object.
     * @param notify callback to search for
     */
    public void weakUnref(@NotNull org.gtk.gobject.WeakNotify notify) {
        java.util.Objects.requireNonNull(notify, "Parameter 'notify' must not be null");
        try {
            DowncallHandles.g_object_weak_unref.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbWeakNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(notify)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static long compatControl(long what, @Nullable java.lang.foreign.MemoryAddress data) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_object_compat_control.invokeExact(
                    what,
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Find the {@link ParamSpec} with the given name for an
     * interface. Generally, the interface vtable passed in as {@code g_iface}
     * will be the default vtable from g_type_default_interface_ref(), or,
     * if you know the interface has already been loaded,
     * g_type_default_interface_peek().
     * @param gIface any interface vtable for the
     *  interface, or the default vtable for the interface
     * @param propertyName name of a property to look up.
     * @return the {@link ParamSpec} for the property of the
     *          interface with the name {@code property_name}, or {@code null} if no
     *          such property exists.
     */
    public static @NotNull org.gtk.gobject.ParamSpec interfaceFindProperty(@NotNull org.gtk.gobject.TypeInterface gIface, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(gIface, "Parameter 'gIface' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_interface_find_property.invokeExact(
                    gIface.handle(),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Add a property to an interface; this is only useful for interfaces
     * that are added to GObject-derived types. Adding a property to an
     * interface forces all objects classes with that interface to have a
     * compatible property. The compatible property could be a newly
     * created {@link ParamSpec}, but normally
     * g_object_class_override_property() will be used so that the object
     * class only needs to provide an implementation and inherits the
     * property description, default value, bounds, and so forth from the
     * interface property.
     * <p>
     * This function is meant to be called from the interface's default
     * vtable initialization function (the {@code class_init} member of
     * {@link TypeInfo}.) It must not be called after after {@code class_init} has
     * been called for any object types implementing this interface.
     * <p>
     * If {@code pspec} is a floating reference, it will be consumed.
     * @param gIface any interface vtable for the
     *    interface, or the default
     *  vtable for the interface.
     * @param pspec the {@link ParamSpec} for the new property
     */
    public static void interfaceInstallProperty(@NotNull org.gtk.gobject.TypeInterface gIface, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(gIface, "Parameter 'gIface' must not be null");
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        try {
            DowncallHandles.g_object_interface_install_property.invokeExact(
                    gIface.handle(),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lists the properties of an interface.Generally, the interface
     * vtable passed in as {@code g_iface} will be the default vtable from
     * g_type_default_interface_ref(), or, if you know the interface has
     * already been loaded, g_type_default_interface_peek().
     * @param gIface any interface vtable for the
     *  interface, or the default vtable for the interface
     * @param nPropertiesP location to store number of properties returned.
     * @return a
     *          pointer to an array of pointers to {@link ParamSpec}
     *          structures. The paramspecs are owned by GLib, but the
     *          array should be freed with g_free() when you are done with
     *          it.
     */
    public static @NotNull org.gtk.gobject.ParamSpec[] interfaceListProperties(@NotNull org.gtk.gobject.TypeInterface gIface, Out<Integer> nPropertiesP) {
        java.util.Objects.requireNonNull(gIface, "Parameter 'gIface' must not be null");
        java.util.Objects.requireNonNull(nPropertiesP, "Parameter 'nPropertiesP' must not be null");
        MemorySegment nPropertiesPPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_interface_list_properties.invokeExact(
                    gIface.handle(),
                    (Addressable) nPropertiesPPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPropertiesP.set(nPropertiesPPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nPropertiesP.get().intValue()];
        for (int I = 0; I < nPropertiesP.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gobject.ParamSpec(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    @FunctionalInterface
    public interface Notify {
        void signalReceived(Object source, @NotNull org.gtk.gobject.ParamSpec pspec);
    }
    
    /**
     * The notify signal is emitted on an object when one of its properties has
     * its value set through g_object_set_property(), g_object_set(), et al.
     * <p>
     * Note that getting this signal doesn’t itself guarantee that the value of
     * the property has actually changed. When it is emitted is determined by the
     * derived GObject class. If the implementor did not create the property with
     * {@link ParamFlags#EXPLICIT_NOTIFY}, then any call to g_object_set_property() results
     * in ::notify being emitted, even if the new value is the same as the old.
     * If they did pass {@link ParamFlags#EXPLICIT_NOTIFY}, then this signal is emitted only
     * when they explicitly call g_object_notify() or g_object_notify_by_pspec(),
     * and common practice is to do that only when the value has actually changed.
     * <p>
     * This signal is typically used to obtain change notification for a
     * single property, by specifying the property name as a detail in the
     * g_signal_connect() call, like this:
     * <pre>{@code <!-- language="C" -->
     * g_signal_connect (text_view->buffer, "notify::paste-target-list",
     *                   G_CALLBACK (gtk_text_view_target_list_notify),
     *                   text_view)
     * }</pre>
     * <p>
     * It is important to note that you must use
     * [canonical parameter names][canonical-parameter-names] as
     * detail strings for the notify signal.
     */
    public Signal<Object.Notify> onNotify(@Nullable String detail, Object.Notify handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("notify" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Object.Callbacks.class, "signalObjectNotify",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Object.Notify>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_object_new = Interop.downcallHandle(
            "g_object_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_new_valist = Interop.downcallHandle(
            "g_object_new_valist",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_new_with_properties = Interop.downcallHandle(
            "g_object_new_with_properties",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_newv = Interop.downcallHandle(
            "g_object_newv",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_add_toggle_ref = Interop.downcallHandle(
            "g_object_add_toggle_ref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_add_weak_pointer = Interop.downcallHandle(
            "g_object_add_weak_pointer",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_bind_property = Interop.downcallHandle(
            "g_object_bind_property",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_object_bind_property_full = Interop.downcallHandle(
            "g_object_bind_property_full",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_bind_property_with_closures = Interop.downcallHandle(
            "g_object_bind_property_with_closures",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_connect = Interop.downcallHandle(
            "g_object_connect",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_disconnect = Interop.downcallHandle(
            "g_object_disconnect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_dup_data = Interop.downcallHandle(
            "g_object_dup_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_dup_qdata = Interop.downcallHandle(
            "g_object_dup_qdata",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_force_floating = Interop.downcallHandle(
            "g_object_force_floating",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_freeze_notify = Interop.downcallHandle(
            "g_object_freeze_notify",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_get = Interop.downcallHandle(
            "g_object_get",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_get_data = Interop.downcallHandle(
            "g_object_get_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_get_property = Interop.downcallHandle(
            "g_object_get_property",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_get_qdata = Interop.downcallHandle(
            "g_object_get_qdata",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_object_get_valist = Interop.downcallHandle(
            "g_object_get_valist",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_getv = Interop.downcallHandle(
            "g_object_getv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_is_floating = Interop.downcallHandle(
            "g_object_is_floating",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_notify = Interop.downcallHandle(
            "g_object_notify",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_notify_by_pspec = Interop.downcallHandle(
            "g_object_notify_by_pspec",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_ref = Interop.downcallHandle(
            "g_object_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_ref_sink = Interop.downcallHandle(
            "g_object_ref_sink",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_remove_toggle_ref = Interop.downcallHandle(
            "g_object_remove_toggle_ref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_remove_weak_pointer = Interop.downcallHandle(
            "g_object_remove_weak_pointer",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_replace_data = Interop.downcallHandle(
            "g_object_replace_data",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_replace_qdata = Interop.downcallHandle(
            "g_object_replace_qdata",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_run_dispose = Interop.downcallHandle(
            "g_object_run_dispose",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set = Interop.downcallHandle(
            "g_object_set",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set_data = Interop.downcallHandle(
            "g_object_set_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set_data_full = Interop.downcallHandle(
            "g_object_set_data_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set_property = Interop.downcallHandle(
            "g_object_set_property",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set_qdata = Interop.downcallHandle(
            "g_object_set_qdata",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set_qdata_full = Interop.downcallHandle(
            "g_object_set_qdata_full",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_set_valist = Interop.downcallHandle(
            "g_object_set_valist",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_setv = Interop.downcallHandle(
            "g_object_setv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_steal_data = Interop.downcallHandle(
            "g_object_steal_data",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_steal_qdata = Interop.downcallHandle(
            "g_object_steal_qdata",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_object_take_ref = Interop.downcallHandle(
            "g_object_take_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_thaw_notify = Interop.downcallHandle(
            "g_object_thaw_notify",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_unref = Interop.downcallHandle(
            "g_object_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_watch_closure = Interop.downcallHandle(
            "g_object_watch_closure",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_weak_ref = Interop.downcallHandle(
            "g_object_weak_ref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_weak_unref = Interop.downcallHandle(
            "g_object_weak_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_compat_control = Interop.downcallHandle(
            "g_object_compat_control",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_interface_find_property = Interop.downcallHandle(
            "g_object_interface_find_property",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_interface_install_property = Interop.downcallHandle(
            "g_object_interface_install_property",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_interface_list_properties = Interop.downcallHandle(
            "g_object_interface_list_properties",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalObjectNotify(MemoryAddress source, MemoryAddress pspec, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Object.Notify) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Object(Refcounted.get(source)), new org.gtk.gobject.ParamSpec(Refcounted.get(pspec, false)));
        }
    }
}
