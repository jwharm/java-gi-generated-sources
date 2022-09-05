package org.gtk.gobject;

import org.gtk.gobject.*;
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

    public Object(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Object */
    public static Object castFrom(org.gtk.gobject.Object gobject) {
        return new Object(gobject.getProxy());
    }
    
    /**
     * Creates a new instance of a #GObject subtype and sets its properties.
     * 
     * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * which are not explicitly specified are set to their default values.
     */
    public Object(Type objectType, java.lang.String firstPropertyName, VaList varArgs) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_new_valist(objectType.getValue(), Interop.getAllocator().allocateUtf8String(firstPropertyName), varArgs), true));
    }
    
    /**
     * Creates a new instance of a #GObject subtype and sets its properties using
     * the provided arrays. Both arrays must have exactly @n_properties elements,
     * and the names and values correspond by index.
     * 
     * Construction parameters (see %G_PARAM_CONSTRUCT, %G_PARAM_CONSTRUCT_ONLY)
     * which are not explicitly specified are set to their default values.
     */
    public Object(Type objectType, int nProperties, java.lang.String[] names, Value[] values) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_new_with_properties(objectType.getValue(), nProperties, Interop.allocateNativeArray(names), Interop.allocateNativeArray(values)), true));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_add_weak_pointer(HANDLE(), weakPointerLocation);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_bind_property(HANDLE(), Interop.getAllocator().allocateUtf8String(sourceProperty), target.HANDLE(), Interop.getAllocator().allocateUtf8String(targetProperty), flags);
        return new Binding(ProxyFactory.getProxy(RESULT, false));
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_bind_property_with_closures(HANDLE(), Interop.getAllocator().allocateUtf8String(sourceProperty), target.HANDLE(), Interop.getAllocator().allocateUtf8String(targetProperty), flags, transformTo.HANDLE(), transformFrom.HANDLE());
        return new Binding(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * This function is intended for #GObject implementations to re-enforce
     * a [floating][floating-ref] object reference. Doing this is seldom
     * required: all #GInitiallyUnowneds are created with a floating reference
     * which usually just needs to be sunken by calling g_object_ref_sink().
     */
    public void forceFloating() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_force_floating(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_freeze_notify(HANDLE());
    }
    
    /**
     * Gets a named field from the objects table of associations (see g_object_set_data()).
     */
    public jdk.incubator.foreign.MemoryAddress getData(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_get_data(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_get_property(HANDLE(), Interop.getAllocator().allocateUtf8String(propertyName), value.HANDLE());
    }
    
    /**
     * This function gets back user data pointers stored via
     * g_object_set_qdata().
     */
    public jdk.incubator.foreign.MemoryAddress getQdata(org.gtk.glib.Quark quark) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_get_qdata(HANDLE(), quark.getValue());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_get_valist(HANDLE(), Interop.getAllocator().allocateUtf8String(firstPropertyName), varArgs);
    }
    
    /**
     * Gets @n_properties properties for an @object.
     * Obtained properties will be set to @values. All properties must be valid.
     * Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     */
    public void getv(int nProperties, java.lang.String[] names, Value[] values) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_getv(HANDLE(), nProperties, Interop.allocateNativeArray(names), Interop.allocateNativeArray(values));
    }
    
    /**
     * Checks whether @object has a [floating][floating-ref] reference.
     */
    public boolean isFloating() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_is_floating(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_notify(HANDLE(), Interop.getAllocator().allocateUtf8String(propertyName));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_notify_by_pspec(HANDLE(), pspec.HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_ref(HANDLE());
        return new Object(ProxyFactory.getProxy(RESULT, false));
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_ref_sink(HANDLE());
        return new Object(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Removes a weak reference from @object that was previously added
     * using g_object_add_weak_pointer(). The @weak_pointer_location has
     * to match the one used with g_object_add_weak_pointer().
     */
    public void removeWeakPointer(jdk.incubator.foreign.MemoryAddress weakPointerLocation) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_remove_weak_pointer(HANDLE(), weakPointerLocation);
    }
    
    /**
     * Releases all references to other objects. This can be used to break
     * reference cycles.
     * 
     * This function should only be called from object system implementations.
     */
    public void runDispose() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_run_dispose(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_set_data(HANDLE(), Interop.getAllocator().allocateUtf8String(key), data);
    }
    
    /**
     * Sets a property on an object.
     */
    public void setProperty(java.lang.String propertyName, Value value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_set_property(HANDLE(), Interop.getAllocator().allocateUtf8String(propertyName), value.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_set_qdata(HANDLE(), quark.getValue(), data);
    }
    
    /**
     * Sets properties on an object.
     */
    public void setValist(java.lang.String firstPropertyName, VaList varArgs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_set_valist(HANDLE(), Interop.getAllocator().allocateUtf8String(firstPropertyName), varArgs);
    }
    
    /**
     * Sets @n_properties properties for an @object.
     * Properties to be set will be taken from @values. All properties must be
     * valid. Warnings will be emitted and undefined behaviour may result if invalid
     * properties are passed in.
     */
    public void setv(int nProperties, java.lang.String[] names, Value[] values) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_setv(HANDLE(), nProperties, Interop.allocateNativeArray(names), Interop.allocateNativeArray(values));
    }
    
    /**
     * Remove a specified datum from the object's data associations,
     * without invoking the association's destroy handler.
     */
    public jdk.incubator.foreign.MemoryAddress stealData(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_steal_data(HANDLE(), Interop.getAllocator().allocateUtf8String(key));
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_steal_qdata(HANDLE(), quark.getValue());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_take_ref(HANDLE());
        return new Object(ProxyFactory.getProxy(RESULT, true));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_thaw_notify(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_unref(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_object_watch_closure(HANDLE(), closure.HANDLE());
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
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalObjectNotify", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("notify"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
