package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A #GClosure represents a callback supplied by the programmer.
 * 
 * It will generally comprise a function of some kind and a marshaller
 * used to call it. It is the responsibility of the marshaller to
 * convert the arguments for the invocation from #GValues into
 * a suitable form, perform the callback on the converted arguments,
 * and transform the return value back into a #GValue.
 * 
 * In the case of C programs, a closure usually just holds a pointer
 * to a function and maybe a data argument, and the marshaller
 * converts between #GValue and native C types. The GObject
 * library provides the #GCClosure type for this purpose. Bindings for
 * other languages need marshallers which convert between #GValues
 * and suitable representations in the runtime of the language in
 * order to use functions written in that language as callbacks. Use
 * g_closure_set_marshal() to set the marshaller on such a custom
 * closure implementation.
 * 
 * Within GObject, closures play an important role in the
 * implementation of signals. When a signal is registered, the
 * @c_marshaller argument to g_signal_new() specifies the default C
 * marshaller for any closure which is connected to this
 * signal. GObject provides a number of C marshallers for this
 * purpose, see the g_cclosure_marshal_*() functions. Additional C
 * marshallers can be generated with the [glib-genmarshal][glib-genmarshal]
 * utility.  Closures can be explicitly connected to signals with
 * g_signal_connect_closure(), but it usually more convenient to let
 * GObject create a closure automatically by using one of the
 * g_signal_connect_*() functions which take a callback function/user
 * data pair.
 * 
 * Using closures has a number of important advantages over a simple
 * callback function/data pointer combination:
 * 
 * - Closures allow the callee to get the types of the callback parameters,
 *   which means that language bindings don't have to write individual glue
 *   for each callback type.
 * 
 * - The reference counting of #GClosure makes it easy to handle reentrancy
 *   right; if a callback is removed while it is being invoked, the closure
 *   and its parameters won't be freed until the invocation finishes.
 * 
 * - g_closure_invalidate() and invalidation notifiers allow callbacks to be
 *   automatically removed when the objects they point to go away.
 */
public class Closure extends io.github.jwharm.javagi.interop.ResourceBase {

    public Closure(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * A variant of g_closure_new_simple() which stores @object in the
     * @data field of the closure and calls g_object_watch_closure() on
     * @object and the created closure. This function is mainly useful
     * when implementing new types of closures.
     */
    public static Closure newObject(int sizeofClosure, Object object) {
        return new Closure(References.get(gtk_h.g_closure_new_object(sizeofClosure, object.handle()), true));
    }
    
    /**
     * Allocates a struct of the given size and initializes the initial
     * part as a #GClosure.
     * 
     * This function is mainly useful when implementing new types of closures:
     * 
     * |[<!-- language="C" -->
     * typedef struct _MyClosure MyClosure;
     * struct _MyClosure
     * {
     *   GClosure closure;
     *   // extra data goes here
     * };
     * 
     * static void
     * my_closure_finalize (gpointer  notify_data,
     *                      GClosure *closure)
     * {
     *   MyClosure *my_closure = (MyClosure *)closure;
     * 
     *   // free extra data here
     * }
     * 
     * MyClosure *my_closure_new (gpointer data)
     * {
     *   GClosure *closure;
     *   MyClosure *my_closure;
     * 
     *   closure = g_closure_new_simple (sizeof (MyClosure), data);
     *   my_closure = (MyClosure *) closure;
     * 
     *   // initialize extra data here
     * 
     *   g_closure_add_finalize_notifier (closure, notify_data,
     *                                    my_closure_finalize);
     *   return my_closure;
     * }
     * ]|
     */
    public static Closure newSimple(int sizeofClosure, jdk.incubator.foreign.MemoryAddress data) {
        return new Closure(References.get(gtk_h.g_closure_new_simple(sizeofClosure, data), false));
    }
    
    /**
     * Sets a flag on the closure to indicate that its calling
     * environment has become invalid, and thus causes any future
     * invocations of g_closure_invoke() on this @closure to be
     * ignored.
     * 
     * Also, invalidation notifiers installed on the closure will
     * be called at this point. Note that unless you are holding a
     * reference to the closure yourself, the invalidation notifiers may
     * unref the closure and cause it to be destroyed, so if you need to
     * access the closure after calling g_closure_invalidate(), make sure
     * that you've previously called g_closure_ref().
     * 
     * Note that g_closure_invalidate() will also be called when the
     * reference count of a closure drops to zero (unless it has already
     * been invalidated before).
     */
    public void invalidate() {
        gtk_h.g_closure_invalidate(handle());
    }
    
    /**
     * Invokes the closure, i.e. executes the callback represented by the @closure.
     */
    public void invoke(Value returnValue, int nParamValues, Value[] paramValues, jdk.incubator.foreign.MemoryAddress invocationHint) {
        gtk_h.g_closure_invoke(handle(), returnValue.handle(), nParamValues, Interop.allocateNativeArray(paramValues).handle(), invocationHint);
    }
    
    /**
     * Increments the reference count on a closure to force it staying
     * alive while the caller holds a pointer to it.
     */
    public Closure ref() {
        var RESULT = gtk_h.g_closure_ref(handle());
        return new Closure(References.get(RESULT, false));
    }
    
    /**
     * Takes over the initial ownership of a closure.
     * 
     * Each closure is initially created in a "floating" state, which means
     * that the initial reference count is not owned by any caller.
     * 
     * This function checks to see if the object is still floating, and if so,
     * unsets the floating state and decreases the reference count. If the
     * closure is not floating, g_closure_sink() does nothing.
     * 
     * The reason for the existence of the floating state is to prevent
     * cumbersome code sequences like:
     * 
     * |[<!-- language="C" -->
     * closure = g_cclosure_new (cb_func, cb_data);
     * g_source_set_closure (source, closure);
     * g_closure_unref (closure); // GObject doesn't really need this
     * ]|
     * 
     * Because g_source_set_closure() (and similar functions) take ownership of the
     * initial reference count, if it is unowned, we instead can write:
     * 
     * |[<!-- language="C" -->
     * g_source_set_closure (source, g_cclosure_new (cb_func, cb_data));
     * ]|
     * 
     * Generally, this function is used together with g_closure_ref(). An example
     * of storing a closure for later notification looks like:
     * 
     * |[<!-- language="C" -->
     * static GClosure *notify_closure = NULL;
     * void
     * foo_notify_set_closure (GClosure *closure)
     * {
     *   if (notify_closure)
     *     g_closure_unref (notify_closure);
     *   notify_closure = closure;
     *   if (notify_closure)
     *     {
     *       g_closure_ref (notify_closure);
     *       g_closure_sink (notify_closure);
     *     }
     * }
     * ]|
     * 
     * Because g_closure_sink() may decrement the reference count of a closure
     * (if it hasn't been called on @closure yet) just like g_closure_unref(),
     * g_closure_ref() should be called prior to this function.
     */
    public void sink() {
        gtk_h.g_closure_sink(handle());
    }
    
    /**
     * Decrements the reference count of a closure after it was previously
     * incremented by the same caller.
     * 
     * If no other callers are using the closure, then the closure will be
     * destroyed and freed.
     */
    public void unref() {
        gtk_h.g_closure_unref(handle());
    }
    
}
