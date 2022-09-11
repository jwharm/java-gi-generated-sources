package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The base object type.
 * 
 * All the fields in the `GObject` structure are private to the implementation
 * and should never be accessed directly.
 * 
 * Since GLib 2.72, all #GObjects are guaranteed to be aligned to at least the
 * alignment of the largest basic GLib type (typically this is #guint64 or
 * #gdouble). If you need larger alignment for an element in a #GObject, you
 * should allocate it on the heap (aligned), or arrange for your #GObject to be
 * appropriately padded. This guarantee applies to the #GObject (or derived)
 * struct, the #GObjectClass (or derived) struct, and any private data allocated
 * by G_ADD_PRIVATE().
 */
public class Object extends io.github.jwharm.javagi.interop.ResourceBase {

    public Object(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Object */
    public static Object castFrom(org.gtk.gobject.Object gobject) {
        return new Object(gobject.getReference());
    }
    
    /**
     * Creates a new instance of a #GObject subtype and sets its properties.
     * 
     * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * which are not explicitly specified are set to their default values.
     */
    public static Object newValist(Type objectType, java.lang.String firstPropertyName, VaList varArgs) {
        return new Object(References.get(gtk_h.g_object_new_valist(objectType.getValue(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs), true));
    }
    
    /**
     * Creates a new instance of a #GObject subtype and sets its properties using
     * the provided arrays. Both arrays must have exactly @n_properties elements,
     * and the names and values correspond by index.
     * 
     * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * which are not explicitly specified are set to their default values.
     */
    public static Object newWithProperties(Type objectType, int nProperties, java.lang.String[] names, Value[] values) {
        return new Object(References.get(gtk_h.g_object_new_with_properties(objectType.getValue(), nProperties, Interop.allocateNativeArray(names).handle(), Interop.allocateNativeArray(values).handle()), true));
    }
    
    /**
     * Creates a new instance of a #GObject subtype and sets its properties.
     * 
     * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * which are not explicitly specified are set to their default values.
     */
    public static Object newv(Type objectType, int nParameters, Parameter[] parameters) {
        return new Object(References.get(gtk_h.g_object_newv(objectType.getValue(), nParameters, Interop.allocateNativeArray(parameters).handle()), true));
    }
    
    /**
     * Increases the reference count of the object by one and sets a
     * callback to be called when all other references to the object are
     * dropped, or when this is already the last reference to the object
     * and another reference is established.
     * 
     * This functionality is intended for binding @object to a proxy
     * object managed by another memory manager. This is done with two
     * paired references: the strong reference added by
     * g_object_add_toggle_ref() and a reverse reference to the proxy
     * object which is either a strong reference or weak reference.
     * 
     * The setup is that when there are no other references to @object,
     * only a weak reference is held in the reverse direction from @object
     * to the proxy object, but when there are other references held to
     * @object, a strong reference is held. The @notify callback is called
     * when the reference from @object to the proxy object should be
     * "toggled" from strong to weak (@is_last_ref true) or weak to strong
     * (@is_last_ref false).
     * 
     * Since a (normal) reference must be held to the object before
     * calling g_object_add_toggle_ref(), the initial state of the reverse
     * link is always strong.
     * 
     * Multiple toggle references may be added to the same gobject,
     * however if there are multiple toggle references to an object, none
     * of them will ever be notified until all but one are removed.  For
     * this reason, you should only ever use a toggle reference if there
     * is important state in the proxy object.
     */
    public void addToggleRef(Object object, ToggleNotify notify) {
        try {
            int hash = notify.hashCode();
            Interop.signalRegistry.put(hash, notify);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbToggleNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_add_toggle_ref(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Adds a weak reference from weak_pointer to @object to indicate that
     * the pointer located at @weak_pointer_location is only valid during
     * the lifetime of @object. When the @object is finalized,
     * @weak_pointer will be set to %NULL.
     * 
     * Note that as with g_object_weak_ref(), the weak references created by
     * this method are not thread-safe: they cannot safely be used in one
     * thread if the object's last g_object_unref() might happen in another
     * thread. Use #GWeakRef if thread-safety is required.
     */
    public void addWeakPointer(jdk.incubator.foreign.MemoryAddress weakPointerLocation) {
        gtk_h.g_object_add_weak_pointer(handle(), weakPointerLocation);
    }
    
    /**
     * Creates a binding between @source_property on @source and @target_property
     * on @target.
     * 
     * Whenever the @source_property is changed the @target_property is
     * updated using the same value. For instance:
     * 
     * |[<!-- language="C" -->
     *   g_object_bind_property (action, "active", widget, "sensitive", 0);
     * ]|
     * 
     * Will result in the "sensitive" property of the widget #GObject instance to be
     * updated with the same value of the "active" property of the action #GObject
     * instance.
     * 
     * If @flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * if @target_property on @target changes then the @source_property on @source
     * will be updated as well.
     * 
     * The binding will automatically be removed when either the @source or the
     * @target instances are finalized. To remove the binding without affecting the
     * @source and the @target you can just call g_object_unref() on the returned
     * #GBinding instance.
     * 
     * Removing the binding by calling g_object_unref() on it must only be done if
     * the binding, @source and @target are only used from a single thread and it
     * is clear that both @source and @target outlive the binding. Especially it
     * is not safe to rely on this if the binding, @source or @target can be
     * finalized from different threads. Keep another reference to the binding and
     * use g_binding_unbind() instead to be on the safe side.
     * 
     * A #GObject can have multiple bindings.
     */
    public Binding bindProperty(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, int flags) {
        var RESULT = gtk_h.g_object_bind_property(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags);
        return new Binding(References.get(RESULT, false));
    }
    
    /**
     * Complete version of g_object_bind_property().
     * 
     * Creates a binding between @source_property on @source and @target_property
     * on @target, allowing you to set the transformation functions to be used by
     * the binding.
     * 
     * If @flags contains %G_BINDING_BIDIRECTIONAL then the binding will be mutual:
     * if @target_property on @target changes then the @source_property on @source
     * will be updated as well. The @transform_from function is only used in case
     * of bidirectional bindings, otherwise it will be ignored
     * 
     * The binding will automatically be removed when either the @source or the
     * @target instances are finalized. This will release the reference that is
     * being held on the #GBinding instance; if you want to hold on to the
     * #GBinding instance, you will need to hold a reference to it.
     * 
     * To remove the binding, call g_binding_unbind().
     * 
     * A #GObject can have multiple bindings.
     * 
     * The same @user_data parameter will be used for both @transform_to
     * and @transform_from transformation functions; the @notify function will
     * be called once, when the binding is removed. If you need different data
     * for each transformation function, please use
     * g_object_bind_property_with_closures() instead.
     */
    public Binding bindPropertyFull(Object source, java.lang.String sourceProperty, Object target, java.lang.String targetProperty, int flags, BindingTransformFunc transformTo, BindingTransformFunc transformFrom) {
        try {
            int hash = transformTo.hashCode();
            Interop.signalRegistry.put(hash, transformTo);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbBindingTransformFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_bind_property_full(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags, nativeSymbol, nativeSymbol, intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a binding between @source_property on @source and @target_property
     * on @target, allowing you to set the transformation functions to be used by
     * the binding.
     * 
     * This function is the language bindings friendly version of
     * g_object_bind_property_full(), using #GClosures instead of
     * function pointers.
     */
    public Binding bindPropertyWithClosures(java.lang.String sourceProperty, Object target, java.lang.String targetProperty, int flags, Closure transformTo, Closure transformFrom) {
        var RESULT = gtk_h.g_object_bind_property_with_closures(handle(), Interop.allocateNativeString(sourceProperty).handle(), target.handle(), Interop.allocateNativeString(targetProperty).handle(), flags, transformTo.handle(), transformFrom.handle());
        return new Binding(References.get(RESULT, false));
    }
    
    /**
     * This is a variant of g_object_get_data() which returns
     * a 'duplicate' of the value. @dup_func defines the
     * meaning of 'duplicate' in this context, it could e.g.
     * take a reference on a ref-counted object.
     * 
     * If the @key is not set on the object then @dup_func
     * will be called with a %NULL argument.
     * 
     * Note that @dup_func is called while user data of @object
     * is locked.
     * 
     * This function can be useful to avoid races when multiple
     * threads are using object data on the same key on the same
     * object.
     */
    public jdk.incubator.foreign.MemoryAddress dupData(Object object, java.lang.String key, org.gtk.glib.DuplicateFunc dupFunc) {
        try {
            int hash = dupFunc.hashCode();
            Interop.signalRegistry.put(hash, dupFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDuplicateFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_dup_data(handle(), Interop.allocateNativeString(key).handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This is a variant of g_object_get_qdata() which returns
     * a 'duplicate' of the value. @dup_func defines the
     * meaning of 'duplicate' in this context, it could e.g.
     * take a reference on a ref-counted object.
     * 
     * If the @quark is not set on the object then @dup_func
     * will be called with a %NULL argument.
     * 
     * Note that @dup_func is called while user data of @object
     * is locked.
     * 
     * This function can be useful to avoid races when multiple
     * threads are using object data on the same key on the same
     * object.
     */
    public jdk.incubator.foreign.MemoryAddress dupQdata(Object object, org.gtk.glib.Quark quark, org.gtk.glib.DuplicateFunc dupFunc) {
        try {
            int hash = dupFunc.hashCode();
            Interop.signalRegistry.put(hash, dupFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDuplicateFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_dup_qdata(handle(), quark.getValue(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function is intended for #GObject implementations to re-enforce
     * a [floating][floating-ref] object reference. Doing this is seldom
     * required: all #GInitiallyUnowneds are created with a floating reference
     * which usually just needs to be sunken by calling g_object_ref_sink().
     */
    public void forceFloating() {
        gtk_h.g_object_force_floating(handle());
    }
    
    /**
     * Increases the freeze count on @object. If the freeze count is
     * non-zero, the emission of "notify" signals on @object is
     * stopped. The signals are queued until the freeze count is decreased
     * to zero. Duplicate notifications are squashed so that at most one
     * #GObject::notify signal is emitted for each property modified while the
     * object is frozen.
     * 
     * This is necessary for accessors that modify multiple properties to prevent
     * premature notification while the object is still being modified.
     */
    public void freezeNotify() {
        gtk_h.g_object_freeze_notify(handle());
    }
    
    /**
     * Gets a named field from the objects table of associations (see g_object_set_data()).
     */
    public jdk.incubator.foreign.MemoryAddress getData(java.lang.String key) {
        var RESULT = gtk_h.g_object_get_data(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * Gets a property of an object.
     * 
     * The @value can be:
     * 
     *  - an empty #GValue initialized by %G_VALUE_INIT, which will be
     *    automatically initialized with the expected type of the property
     *    (since GLib 2.60)
     *  - a #GValue initialized with the expected type of the property
     *  - a #GValue initialized with a type to which the expected type
     *    of the property can be transformed
     * 
     * In general, a copy is made of the property contents and the caller is
     * responsible for freeing the memory by calling g_value_unset().
     * 
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
    public jdk.incubator.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_object_get_qdata(handle(), quark.getValue());
        return RESULT;
    }
    
    /**
     * Gets properties of an object.
     * 
     * In general, a copy is made of the property contents and the caller
     * is responsible for freeing the memory in the appropriate manner for
     * the type, for instance by calling g_free() or g_object_unref().
     * 
     * See g_object_get().
     */
    public void getValist(java.lang.String firstPropertyName, VaList varArgs) {
        gtk_h.g_object_get_valist(handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
    }
    
    /**
     * Gets @n_properties properties for an @object.
     * Obtained properties will be set to @values. All properties must be valid.
     * Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     */
    public void getv(int nProperties, java.lang.String[] names, Value[] values) {
        gtk_h.g_object_getv(handle(), nProperties, Interop.allocateNativeArray(names).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Checks whether @object has a [floating][floating-ref] reference.
     */
    public boolean isFloating() {
        var RESULT = gtk_h.g_object_is_floating(handle());
        return (RESULT != 0);
    }
    
    /**
     * Emits a "notify" signal for the property @property_name on @object.
     * 
     * When possible, eg. when signaling a property change from within the class
     * that registered the property, you should use g_object_notify_by_pspec()
     * instead.
     * 
     * Note that emission of the notify signal may be blocked with
     * g_object_freeze_notify(). In this case, the signal emissions are queued
     * and will be emitted (in reverse order) when g_object_thaw_notify() is
     * called.
     */
    public void notify(java.lang.String propertyName) {
        gtk_h.g_object_notify(handle(), Interop.allocateNativeString(propertyName).handle());
    }
    
    /**
     * Emits a "notify" signal for the property specified by @pspec on @object.
     * 
     * This function omits the property name lookup, hence it is faster than
     * g_object_notify().
     * 
     * One way to avoid using g_object_notify() from within the
     * class that registered the properties, and using g_object_notify_by_pspec()
     * instead, is to store the GParamSpec used with
     * g_object_class_install_property() inside a static array, e.g.:
     * 
     * |[<!-- language="C" -->
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
     * ]|
     * 
     * and then notify a change on the "foo" property with:
     * 
     * |[<!-- language="C" -->
     *   g_object_notify_by_pspec (self, properties[PROP_FOO]);
     * ]|
     */
    public void notifyByPspec(ParamSpec pspec) {
        gtk_h.g_object_notify_by_pspec(handle(), pspec.handle());
    }
    
    /**
     * Increases the reference count of @object.
     * 
     * Since GLib 2.56, if `GLIB_VERSION_MAX_ALLOWED` is 2.56 or greater, the type
     * of @object will be propagated to the return type (using the GCC typeof()
     * extension), so any casting the caller needs to do on the return type must be
     * explicit.
     */
    public Object ref() {
        var RESULT = gtk_h.g_object_ref(handle());
        return new Object(References.get(RESULT, false));
    }
    
    /**
     * Increase the reference count of @object, and possibly remove the
     * [floating][floating-ref] reference, if @object has a floating reference.
     * 
     * In other words, if the object is floating, then this call "assumes
     * ownership" of the floating reference, converting it to a normal
     * reference by clearing the floating flag while leaving the reference
     * count unchanged.  If the object is not floating, then this call
     * adds a new normal reference increasing the reference count by one.
     * 
     * Since GLib 2.56, the type of @object will be propagated to the return type
     * under the same conditions as for g_object_ref().
     */
    public Object refSink() {
        var RESULT = gtk_h.g_object_ref_sink(handle());
        return new Object(References.get(RESULT, false));
    }
    
    /**
     * Removes a reference added with g_object_add_toggle_ref(). The
     * reference count of the object is decreased by one.
     */
    public void removeToggleRef(Object object, ToggleNotify notify) {
        try {
            int hash = notify.hashCode();
            Interop.signalRegistry.put(hash, notify);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, boolean.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbToggleNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_remove_toggle_ref(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes a weak reference from @object that was previously added
     * using g_object_add_weak_pointer(). The @weak_pointer_location has
     * to match the one used with g_object_add_weak_pointer().
     */
    public void removeWeakPointer(jdk.incubator.foreign.MemoryAddress weakPointerLocation) {
        gtk_h.g_object_remove_weak_pointer(handle(), weakPointerLocation);
    }
    
    /**
     * Releases all references to other objects. This can be used to break
     * reference cycles.
     * 
     * This function should only be called from object system implementations.
     */
    public void runDispose() {
        gtk_h.g_object_run_dispose(handle());
    }
    
    /**
     * Each object carries around a table of associations from
     * strings to pointers.  This function lets you set an association.
     * 
     * If the object already had an association with that name,
     * the old association will be destroyed.
     * 
     * Internally, the @key is converted to a #GQuark using g_quark_from_string().
     * This means a copy of @key is kept permanently (even after @object has been
     * finalized) — so it is recommended to only use a small, bounded set of values
     * for @key in your program, to avoid the #GQuark storage growing unbounded.
     */
    public void setData(java.lang.String key, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_object_set_data(handle(), Interop.allocateNativeString(key).handle(), data);
    }
    
    /**
     * Like g_object_set_data() except it adds notification
     * for when the association is destroyed, either by setting it
     * to a different value or when the object is destroyed.
     * 
     * Note that the @destroy callback is not called if @data is %NULL.
     */
    public void setDataFull(Object object, java.lang.String key) {
        try {
            int hash = destroy.hashCode();
            Interop.signalRegistry.put(hash, destroy);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDestroyNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_set_data_full(handle(), Interop.allocateNativeString(key).handle(), intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets a property on an object.
     */
    public void setProperty(java.lang.String propertyName, Value value) {
        gtk_h.g_object_set_property(handle(), Interop.allocateNativeString(propertyName).handle(), value.handle());
    }
    
    /**
     * This sets an opaque, named pointer on an object.
     * The name is specified through a #GQuark (retrieved e.g. via
     * g_quark_from_static_string()), and the pointer
     * can be gotten back from the @object with g_object_get_qdata()
     * until the @object is finalized.
     * Setting a previously set user data pointer, overrides (frees)
     * the old pointer set, using #NULL as pointer essentially
     * removes the data stored.
     */
    public void setQdata(org.gtk.glib.Quark quark, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_object_set_qdata(handle(), quark.getValue(), data);
    }
    
    /**
     * This function works like g_object_set_qdata(), but in addition,
     * a void (*destroy) (gpointer) function may be specified which is
     * called with @data as argument when the @object is finalized, or
     * the data is being overwritten by a call to g_object_set_qdata()
     * with the same @quark.
     */
    public void setQdataFull(Object object, org.gtk.glib.Quark quark) {
        try {
            int hash = destroy.hashCode();
            Interop.signalRegistry.put(hash, destroy);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDestroyNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_set_qdata_full(handle(), quark.getValue(), intSegment, Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets properties on an object.
     */
    public void setValist(java.lang.String firstPropertyName, VaList varArgs) {
        gtk_h.g_object_set_valist(handle(), Interop.allocateNativeString(firstPropertyName).handle(), varArgs);
    }
    
    /**
     * Sets @n_properties properties for an @object.
     * Properties to be set will be taken from @values. All properties must be
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
    public jdk.incubator.foreign.MemoryAddress stealData(java.lang.String key) {
        var RESULT = gtk_h.g_object_steal_data(handle(), Interop.allocateNativeString(key).handle());
        return RESULT;
    }
    
    /**
     * This function gets back user data pointers stored via
     * g_object_set_qdata() and removes the @data from object
     * without invoking its destroy() function (if any was
     * set).
     * Usually, calling this function is only required to update
     * user data pointers with a destroy notifier, for example:
     * |[<!-- language="C" -->
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
     * ]|
     * Using g_object_get_qdata() in the above example, instead of
     * g_object_steal_qdata() would have left the destroy function set,
     * and thus the partial string list would have been freed upon
     * g_object_set_qdata_full().
     */
    public jdk.incubator.foreign.MemoryAddress stealQdata(org.gtk.glib.Quark quark) {
        var RESULT = gtk_h.g_object_steal_qdata(handle(), quark.getValue());
        return RESULT;
    }
    
    /**
     * If @object is floating, sink it.  Otherwise, do nothing.
     * 
     * In other words, this function will convert a floating reference (if
     * present) into a full reference.
     * 
     * Typically you want to use g_object_ref_sink() in order to
     * automatically do the correct thing with respect to floating or
     * non-floating references, but there is one specific scenario where
     * this function is helpful.
     * 
     * The situation where this function is helpful is when creating an API
     * that allows the user to provide a callback function that returns a
     * GObject. We certainly want to allow the user the flexibility to
     * return a non-floating reference from this callback (for the case
     * where the object that is being returned already exists).
     * 
     * At the same time, the API style of some popular GObject-based
     * libraries (such as Gtk) make it likely that for newly-created GObject
     * instances, the user can be saved some typing if they are allowed to
     * return a floating reference.
     * 
     * Using this function on the return value of the user's callback allows
     * the user to do whichever is more convenient for them. The caller will
     * alway receives exactly one full reference to the value: either the
     * one that was returned in the first place, or a floating reference
     * that has been converted to a full reference.
     * 
     * This function has an odd interaction when combined with
     * g_object_ref_sink() running at the same time in another thread on
     * the same #GObject instance. If g_object_ref_sink() runs first then
     * the result will be that the floating reference is converted to a hard
     * reference. If g_object_take_ref() runs first then the result will be
     * that the floating reference is converted to a hard reference and an
     * additional reference on top of that one is added. It is best to avoid
     * this situation.
     */
    public Object takeRef() {
        var RESULT = gtk_h.g_object_take_ref(handle());
        return new Object(References.get(RESULT, true));
    }
    
    /**
     * Reverts the effect of a previous call to
     * g_object_freeze_notify(). The freeze count is decreased on @object
     * and when it reaches zero, queued "notify" signals are emitted.
     * 
     * Duplicate notifications for each property are squashed so that at most one
     * #GObject::notify signal is emitted for each property, in the reverse order
     * in which they have been queued.
     * 
     * It is an error to call this function when the freeze count is zero.
     */
    public void thawNotify() {
        gtk_h.g_object_thaw_notify(handle());
    }
    
    /**
     * Decreases the reference count of @object. When its reference count
     * drops to 0, the object is finalized (i.e. its memory is freed).
     * 
     * If the pointer to the #GObject may be reused in future (for example, if it is
     * an instance variable of another object), it is recommended to clear the
     * pointer to %NULL rather than retain a dangling pointer to a potentially
     * invalid #GObject instance. Use g_clear_object() for this.
     */
    public void unref() {
        gtk_h.g_object_unref(handle());
    }
    
    /**
     * This function essentially limits the life time of the @closure to
     * the life time of the object. That is, when the object is finalized,
     * the @closure is invalidated by calling g_closure_invalidate() on
     * it, in order to prevent invocations of the closure with a finalized
     * (nonexisting) object. Also, g_object_ref() and g_object_unref() are
     * added as marshal guards to the @closure, to ensure that an extra
     * reference count is held on @object during invocation of the
     * @closure.  Usually, this function will be called on closures that
     * use this @object as closure data.
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
     * 
     * Note that the weak references created by this method are not
     * thread-safe: they cannot safely be used in one thread if the
     * object's last g_object_unref() might happen in another thread.
     * Use #GWeakRef if thread-safety is required.
     */
    public void weakRef(Object object, WeakNotify notify) {
        try {
            int hash = notify.hashCode();
            Interop.signalRegistry.put(hash, notify);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbWeakNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_weak_ref(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Removes a weak reference callback to an object.
     */
    public void weakUnref(Object object, WeakNotify notify) {
        try {
            int hash = notify.hashCode();
            Interop.signalRegistry.put(hash, notify);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbWeakNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_object_weak_unref(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static long compatControl(long what, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_object_compat_control(what, data);
        return RESULT;
    }
    
    /**
     * Find the #GParamSpec with the given name for an
     * interface. Generally, the interface vtable passed in as @g_iface
     * will be the default vtable from g_type_default_interface_ref(), or,
     * if you know the interface has already been loaded,
     * g_type_default_interface_peek().
     */
    public static ParamSpec interfaceFindProperty(TypeInterface gIface, java.lang.String propertyName) {
        var RESULT = gtk_h.g_object_interface_find_property(gIface.handle(), Interop.allocateNativeString(propertyName).handle());
        return new ParamSpec(References.get(RESULT, false));
    }
    
    /**
     * Add a property to an interface; this is only useful for interfaces
     * that are added to GObject-derived types. Adding a property to an
     * interface forces all objects classes with that interface to have a
     * compatible property. The compatible property could be a newly
     * created #GParamSpec, but normally
     * g_object_class_override_property() will be used so that the object
     * class only needs to provide an implementation and inherits the
     * property description, default value, bounds, and so forth from the
     * interface property.
     * 
     * This function is meant to be called from the interface's default
     * vtable initialization function (the @class_init member of
     * #GTypeInfo.) It must not be called after after @class_init has
     * been called for any object types implementing this interface.
     * 
     * If @pspec is a floating reference, it will be consumed.
     */
    public static void interfaceInstallProperty(TypeInterface gIface, ParamSpec pspec) {
        gtk_h.g_object_interface_install_property(gIface.handle(), pspec.handle());
    }
    
    @FunctionalInterface
    public interface NotifyHandler {
        void signalReceived(Object source, ParamSpec pspec);
    }
    
    /**
     * The notify signal is emitted on an object when one of its properties has
     * its value set through g_object_set_property(), g_object_set(), et al.
     * 
     * Note that getting this signal doesn’t itself guarantee that the value of
     * the property has actually changed. When it is emitted is determined by the
     * derived GObject class. If the implementor did not create the property with
     * %G_PARAM_EXPLICIT_NOTIFY, then any call to g_object_set_property() results
     * in ::notify being emitted, even if the new value is the same as the old.
     * If they did pass %G_PARAM_EXPLICIT_NOTIFY, then this signal is emitted only
     * when they explicitly call g_object_notify() or g_object_notify_by_pspec(),
     * and common practice is to do that only when the value has actually changed.
     * 
     * This signal is typically used to obtain change notification for a
     * single property, by specifying the property name as a detail in the
     * g_signal_connect() call, like this:
     * 
     * |[<!-- language="C" -->
     * g_signal_connect (text_view->buffer, "notify::paste-target-list",
     *                   G_CALLBACK (gtk_text_view_target_list_notify),
     *                   text_view)
     * ]|
     * 
     * It is important to note that you must use
     * [canonical parameter names][canonical-parameter-names] as
     * detail strings for the notify signal.
     */
    public void onNotify(NotifyHandler handler) {
        try {
            int hash = handler.hashCode();
            Interop.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalObjectNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("notify").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
