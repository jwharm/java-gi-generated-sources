package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public Object(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Object */
    public static Object castFrom(org.gtk.gobject.Object gobject) {
        return new Object(gobject.refcounted());
    }
    
    private static Refcounted constructNewValist(org.gtk.gobject.Type objectType, java.lang.String firstPropertyName, VaList varArgs) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_object_new_valist(objectType.getValue(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs), true);
        return RESULT;
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values.
     */
    public static Object newValist(org.gtk.gobject.Type objectType, java.lang.String firstPropertyName, VaList varArgs) {
        return new Object(constructNewValist(objectType, firstPropertyName, varArgs));
    }
    
    private static Refcounted constructNewWithProperties(org.gtk.gobject.Type objectType, int nProperties, java.lang.String[] names, Value[] values) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_object_new_with_properties(objectType.getValue(), nProperties, Interop.allocateNativeArray(names).handle(), Interop.allocateNativeArray(values).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties using
     * the provided arrays. Both arrays must have exactly {@code n_properties} elements,
     * and the names and values correspond by index.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values.
     */
    public static Object newWithProperties(org.gtk.gobject.Type objectType, int nProperties, java.lang.String[] names, Value[] values) {
        return new Object(constructNewWithProperties(objectType, nProperties, names, values));
    }
    
    private static Refcounted constructNewv(org.gtk.gobject.Type objectType, int nParameters, Parameter[] parameters) {
        Refcounted RESULT = Refcounted.get(gtk_h.g_object_newv(objectType.getValue(), nParameters, Interop.allocateNativeArray(parameters).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new instance of a {@link Object} subtype and sets its properties.
     * <p>
     * Construction parameters (see {@link ParamFlags#CONSTRUCT}, {@link ParamFlags#CONSTRUCT_ONLY})
     * which are not explicitly specified are set to their default values.
     */
    public static Object newv(org.gtk.gobject.Type objectType, int nParameters, Parameter[] parameters) {
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
     */
    public void addToggleRef(ToggleNotify notify) {
        try {
            gtk_h.g_object_add_toggle_ref(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbToggleNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notify.hashCode(), notify)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
     */
    public void addWeakPointer(java.lang.foreign.MemoryAddress weakPointerLocation) {
        gtk_h.g_object_add_weak_pointer(handle(), weakPointerLocation);
    }
    
    /**
     * Creates a binding between {@code source_property} on {@code source} and {@code target_property}
     * on {@code target}.
     * <p>
     * Whenever the {@code source_property} is changed the {@code target_property} is
     * updated using the same value. For instance:
     * <p>
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
     */
    public Binding bindProperty(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, BindingFlags flags) {
        var RESULT = gtk_h.g_object_bind_property(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags.getValue());
        return new Binding(Refcounted.get(RESULT, false));
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
     */
    public Binding bindPropertyFull(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, BindingFlags flags, BindingTransformFunc transformTo, BindingTransformFunc transformFrom) {
        try {
            var RESULT = gtk_h.g_object_bind_property_full(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbBindingTransformFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(transformTo.hashCode(), transformTo)), 
                    Interop.cbDestroyNotifySymbol());
            return new Binding(Refcounted.get(RESULT, false));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a binding between {@code source_property} on {@code source} and {@code target_property}
     * on {@code target}, allowing you to set the transformation functions to be used by
     * the binding.
     * <p>
     * This function is the language bindings friendly version of
     * g_object_bind_property_full(), using {@code GClosures} instead of
     * function pointers.
     */
    public Binding bindPropertyWithClosures(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, BindingFlags flags, Closure transformTo, Closure transformFrom) {
        var RESULT = gtk_h.g_object_bind_property_with_closures(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags.getValue(), transformTo.handle(), transformFrom.handle());
        return new Binding(Refcounted.get(RESULT, false));
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
     */
    public java.lang.foreign.MemoryAddress dupData(java.lang.String key, org.gtk.glib.DuplicateFunc dupFunc) {
        try {
            var RESULT = gtk_h.g_object_dup_data(handle(), Interop.allocateNativeString(key).handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbDuplicateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(dupFunc.hashCode(), dupFunc)));
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
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
     */
    public java.lang.foreign.MemoryAddress dupQdata(org.gtk.glib.Quark quark, org.gtk.glib.DuplicateFunc dupFunc) {
        try {
            var RESULT = gtk_h.g_object_dup_qdata(handle(), quark.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbDuplicateFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(dupFunc.hashCode(), dupFunc)));
            return RESULT;
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function is intended for {@link Object} implementations to re-enforce
     * a [floating][floating-ref] object reference. Doing this is seldom
     * required: all {@code GInitiallyUnowneds} are created with a floating reference
     * which usually just needs to be sunken by calling g_object_ref_sink().
     */
    public void forceFloating() {
        gtk_h.g_object_force_floating(handle());
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
        gtk_h.g_object_freeze_notify(handle());
    }
    
    /**
     * Gets a named field from the objects table of associations (see g_object_set_data()).
     */
    public java.lang.foreign.MemoryAddress getData(java.lang.String key) {
        var RESULT = gtk_h.g_object_get_data(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets a property of an object.
     * <p>
     * The {@code value} can be:
     * <p>
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
     */
    public void getProperty(java.lang.String propertyName, Value value) {
        gtk_h.g_object_get_property(handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
    }
    
    /**
     * This function gets back user data pointers stored via
     * g_object_set_qdata().
     */
    public java.lang.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_object_get_qdata(handle(), quark.getValue());
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
     */
    public void getValist(java.lang.String firstPropertyName, VaList varArgs) {
        gtk_h.g_object_get_valist(handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
    }
    
    /**
     * Gets {@code n_properties} properties for an {@code object}.
     * Obtained properties will be set to {@code values}. All properties must be valid.
     * Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     */
    public void getv(int nProperties, java.lang.String[] names, Value[] values) {
        gtk_h.g_object_getv(handle(), nProperties, Interop.allocateNativeArray(names).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Checks whether {@code object} has a [floating][floating-ref] reference.
     */
    public boolean isFloating() {
        var RESULT = gtk_h.g_object_is_floating(handle());
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
     */
    public void notify(java.lang.String propertyName) {
        gtk_h.g_object_notify(handle(), Interop.allocateNativeString(propertyName).handle());
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
     * <p>
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
     * <p>
     * <pre>{@code <!-- language="C" -->
     *   g_object_notify_by_pspec (self, properties[PROP_FOO]);
     * }</pre>
     */
    public void notifyByPspec(ParamSpec pspec) {
        gtk_h.g_object_notify_by_pspec(handle(), pspec.handle());
    }
    
    /**
     * Increases the reference count of {@code object}.
     * <p>
     * Since GLib 2.56, if {@code GLIB_VERSION_MAX_ALLOWED} is 2.56 or greater, the type
     * of {@code object} will be propagated to the return type (using the GCC typeof()
     * extension), so any casting the caller needs to do on the return type must be
     * explicit.
     */
    public Object ref() {
        var RESULT = gtk_h.g_object_ref(handle());
        return new Object(Refcounted.get(RESULT, false));
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
     */
    public Object refSink() {
        var RESULT = gtk_h.g_object_ref_sink(handle());
        return new Object(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a reference added with g_object_add_toggle_ref(). The
     * reference count of the object is decreased by one.
     */
    public void removeToggleRef(ToggleNotify notify) {
        try {
            gtk_h.g_object_remove_toggle_ref(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbToggleNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notify.hashCode(), notify)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes a weak reference from {@code object} that was previously added
     * using g_object_add_weak_pointer(). The {@code weak_pointer_location} has
     * to match the one used with g_object_add_weak_pointer().
     */
    public void removeWeakPointer(java.lang.foreign.MemoryAddress weakPointerLocation) {
        gtk_h.g_object_remove_weak_pointer(handle(), weakPointerLocation);
    }
    
    /**
     * Releases all references to other objects. This can be used to break
     * reference cycles.
     * <p>
     * This function should only be called from object system implementations.
     */
    public void runDispose() {
        gtk_h.g_object_run_dispose(handle());
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
     */
    public void setData(java.lang.String key, java.lang.foreign.MemoryAddress data) {
        gtk_h.g_object_set_data(handle(), Interop.allocateNativeString(key).handle(), data);
    }
    
    /**
     * Like g_object_set_data() except it adds notification
     * for when the association is destroyed, either by setting it
     * to a different value or when the object is destroyed.
     * <p>
     * Note that the {@code destroy} callback is not called if {@code data} is {@code null}.
     */
    public void setDataFull(java.lang.String key, java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify destroy) {
        gtk_h.g_object_set_data_full(handle(), Interop.allocateNativeString(key).handle(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
    /**
     * Sets a property on an object.
     */
    public void setProperty(java.lang.String propertyName, Value value) {
        gtk_h.g_object_set_property(handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
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
     */
    public void setQdata(org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data) {
        gtk_h.g_object_set_qdata(handle(), quark.getValue(), data);
    }
    
    /**
     * This function works like g_object_set_qdata(), but in addition,
     * a void (*destroy) (gpointer) function may be specified which is
     * called with {@code data} as argument when the {@code object} is finalized, or
     * the data is being overwritten by a call to g_object_set_qdata()
     * with the same {@code quark}.
     */
    public void setQdataFull(org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data, org.gtk.glib.DestroyNotify destroy) {
        gtk_h.g_object_set_qdata_full(handle(), quark.getValue(), data, 
                    Interop.cbDestroyNotifySymbol());
    }
    
    /**
     * Sets properties on an object.
     */
    public void setValist(java.lang.String firstPropertyName, VaList varArgs) {
        gtk_h.g_object_set_valist(handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
    }
    
    /**
     * Sets {@code n_properties} properties for an {@code object}.
     * Properties to be set will be taken from {@code values}. All properties must be
     * valid. Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     */
    public void setv(int nProperties, java.lang.String[] names, Value[] values) {
        gtk_h.g_object_setv(handle(), nProperties, Interop.allocateNativeArray(names).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Remove a specified datum from the object's data associations,
     * without invoking the association's destroy handler.
     */
    public java.lang.foreign.MemoryAddress stealData(java.lang.String key) {
        var RESULT = gtk_h.g_object_steal_data(handle(), Interop.allocateNativeString(key).handle());
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
     */
    public java.lang.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_object_steal_qdata(handle(), quark.getValue());
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
     */
    public Object takeRef() {
        var RESULT = gtk_h.g_object_take_ref(handle());
        return new Object(Refcounted.get(RESULT, true));
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
        gtk_h.g_object_thaw_notify(handle());
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
        gtk_h.g_object_unref(handle());
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
     */
    public void watchClosure(Closure closure) {
        gtk_h.g_object_watch_closure(handle(), closure.handle());
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
     */
    public void weakRef(WeakNotify notify) {
        try {
            gtk_h.g_object_weak_ref(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbWeakNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notify.hashCode(), notify)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes a weak reference callback to an object.
     */
    public void weakUnref(WeakNotify notify) {
        try {
            gtk_h.g_object_weak_unref(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbWeakNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notify.hashCode(), notify)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static long compatControl(long what, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_object_compat_control(what, data);
        return RESULT;
    }
    
    /**
     * Find the {@link ParamSpec} with the given name for an
     * interface. Generally, the interface vtable passed in as {@code g_iface}
     * will be the default vtable from g_type_default_interface_ref(), or,
     * if you know the interface has already been loaded,
     * g_type_default_interface_peek().
     */
    public static ParamSpec interfaceFindProperty(TypeInterface gIface, java.lang.String propertyName) {
        var RESULT = gtk_h.g_object_interface_find_property(gIface.handle(), Interop.allocateNativeString(propertyName).handle());
        return new ParamSpec(Refcounted.get(RESULT, false));
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
     */
    public static void interfaceInstallProperty(TypeInterface gIface, ParamSpec pspec) {
        gtk_h.g_object_interface_install_property(gIface.handle(), pspec.handle());
    }
    
    /**
     * Lists the properties of an interface.Generally, the interface
     * vtable passed in as {@code g_iface} will be the default vtable from
     * g_type_default_interface_ref(), or, if you know the interface has
     * already been loaded, g_type_default_interface_peek().
     */
    public static PointerIterator<ParamSpec> interfaceListProperties(TypeInterface gIface, PointerInteger nPropertiesP) {
        var RESULT = gtk_h.g_object_interface_list_properties(gIface.handle(), nPropertiesP.handle());
        return new PointerProxy<ParamSpec>(RESULT, ParamSpec.class).iterator();
    }
    
    @FunctionalInterface
    public interface NotifyHandler {
        void signalReceived(Object source, ParamSpec pspec);
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
     * <p>
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
    public SignalHandle onNotify(NotifyHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("notify").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Object.Callbacks.class, "signalObjectNotify",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static class Callbacks {
    
        public static void signalObjectNotify(MemoryAddress source, MemoryAddress pspec, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Object.NotifyHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Object(Refcounted.get(source)), new ParamSpec(Refcounted.get(pspec, false)));
        }
        
    }
}
