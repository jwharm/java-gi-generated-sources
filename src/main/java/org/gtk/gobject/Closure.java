package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Closure} represents a callback supplied by the programmer.
 * <p>
 * It will generally comprise a function of some kind and a marshaller
 * used to call it. It is the responsibility of the marshaller to
 * convert the arguments for the invocation from {@code GValues} into
 * a suitable form, perform the callback on the converted arguments,
 * and transform the return value back into a {@link Value}.
 * <p>
 * In the case of C programs, a closure usually just holds a pointer
 * to a function and maybe a data argument, and the marshaller
 * converts between {@link Value} and native C types. The GObject
 * library provides the {@link CClosure} type for this purpose. Bindings for
 * other languages need marshallers which convert between {@code GValues}
 * and suitable representations in the runtime of the language in
 * order to use functions written in that language as callbacks. Use
 * g_closure_set_marshal() to set the marshaller on such a custom
 * closure implementation.
 * <p>
 * Within GObject, closures play an important role in the
 * implementation of signals. When a signal is registered, the
 * {@code c_marshaller} argument to g_signal_new() specifies the default C
 * marshaller for any closure which is connected to this
 * signal. GObject provides a number of C marshallers for this
 * purpose, see the g_cclosure_marshal_*() functions. Additional C
 * marshallers can be generated with the [glib-genmarshal][glib-genmarshal]
 * utility.  Closures can be explicitly connected to signals with
 * g_signal_connect_closure(), but it usually more convenient to let
 * GObject create a closure automatically by using one of the
 * g_signal_connect_*() functions which take a callback function/user
 * data pair.
 * <p>
 * Using closures has a number of important advantages over a simple
 * callback function/data pointer combination:
 * <ul>
 * <li>Closures allow the callee to get the types of the callback parameters,
 *   which means that language bindings don't have to write individual glue
 *   for each callback type.
 * </ul>
 * <ul>
 * <li>The reference counting of {@link Closure} makes it easy to handle reentrancy
 *   right; if a callback is removed while it is being invoked, the closure
 *   and its parameters won't be freed until the invocation finishes.
 * </ul>
 * <ul>
 * <li>g_closure_invalidate() and invalidation notifiers allow callbacks to be
 *   automatically removed when the objects they point to go away.
 * </ul>
 */
public class Closure extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GClosure";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ref_count"),
        ValueLayout.JAVA_INT.withName("meta_marshal_nouse"),
        ValueLayout.JAVA_INT.withName("n_guards"),
        ValueLayout.JAVA_INT.withName("n_fnotifiers"),
        ValueLayout.JAVA_INT.withName("n_inotifiers"),
        ValueLayout.JAVA_INT.withName("in_inotify"),
        ValueLayout.JAVA_INT.withName("floating"),
        ValueLayout.JAVA_INT.withName("derivative_flag"),
        ValueLayout.JAVA_INT.withName("in_marshal"),
        ValueLayout.JAVA_INT.withName("is_invalid"),
        Interop.valueLayout.ADDRESS.withName("marshal"),
        Interop.valueLayout.ADDRESS.withName("data"),
        Interop.valueLayout.ADDRESS.withName("notifiers")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static Closure allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Closure newInstance = new Closure(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code in_marshal}
     * @return The value of the field {@code in_marshal}
     */
    public int in_marshal$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("in_marshal"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code in_marshal}
     * @param in_marshal The new value of the field {@code in_marshal}
     */
    public void in_marshal$set(int in_marshal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("in_marshal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), in_marshal);
    }
    
    /**
     * Get the value of the field {@code is_invalid}
     * @return The value of the field {@code is_invalid}
     */
    public int is_invalid$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_invalid"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code is_invalid}
     * @param is_invalid The new value of the field {@code is_invalid}
     */
    public void is_invalid$set(int is_invalid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_invalid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), is_invalid);
    }
    
    /**
     * Create a Closure proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Closure(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewObject(int sizeofClosure, @NotNull org.gtk.gobject.Object object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_closure_new_object.invokeExact(
                    sizeofClosure,
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * A variant of g_closure_new_simple() which stores {@code object} in the
     * {@code data} field of the closure and calls g_object_watch_closure() on
     * {@code object} and the created closure. This function is mainly useful
     * when implementing new types of closures.
     * @param sizeofClosure the size of the structure to allocate, must be at least
     *  {@code sizeof (GClosure)}
     * @param object a {@link Object} pointer to store in the {@code data} field of the newly
     *  allocated {@link Closure}
     * @return a newly allocated {@link Closure}
     */
    public static Closure newObject(int sizeofClosure, @NotNull org.gtk.gobject.Object object) {
        return new Closure(constructNewObject(sizeofClosure, object), Ownership.FULL);
    }
    
    private static Addressable constructNewSimple(int sizeofClosure, @Nullable java.lang.foreign.MemoryAddress data) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_closure_new_simple.invokeExact(
                    sizeofClosure,
                    data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Allocates a struct of the given size and initializes the initial
     * part as a {@link Closure}.
     * <p>
     * This function is mainly useful when implementing new types of closures:
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     * @param sizeofClosure the size of the structure to allocate, must be at least
     *                  {@code sizeof (GClosure)}
     * @param data data to store in the {@code data} field of the newly allocated {@link Closure}
     * @return a floating reference to a new {@link Closure}
     */
    public static Closure newSimple(int sizeofClosure, @Nullable java.lang.foreign.MemoryAddress data) {
        return new Closure(constructNewSimple(sizeofClosure, data), Ownership.NONE);
    }
    
    /**
     * Registers a finalization notifier which will be called when the
     * reference count of {@code closure} goes down to 0.
     * <p>
     * Multiple finalization notifiers on a single closure are invoked in
     * unspecified order. If a single call to g_closure_unref() results in
     * the closure being both invalidated and finalized, then the invalidate
     * notifiers will be run before the finalize notifiers.
     * @param notifyFunc the callback function to register
     */
    public void addFinalizeNotifier(@Nullable org.gtk.gobject.ClosureNotify notifyFunc) {
        try {
            DowncallHandles.g_closure_add_finalize_notifier.invokeExact(
                    handle(),
                    (Addressable) (notifyFunc == null ? MemoryAddress.NULL : Interop.registerCallback(notifyFunc)),
                    (Addressable) (notifyFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Registers an invalidation notifier which will be called when the
     * {@code closure} is invalidated with g_closure_invalidate().
     * <p>
     * Invalidation notifiers are invoked before finalization notifiers,
     * in an unspecified order.
     * @param notifyFunc the callback function to register
     */
    public void addInvalidateNotifier(@Nullable org.gtk.gobject.ClosureNotify notifyFunc) {
        try {
            DowncallHandles.g_closure_add_invalidate_notifier.invokeExact(
                    handle(),
                    (Addressable) (notifyFunc == null ? MemoryAddress.NULL : Interop.registerCallback(notifyFunc)),
                    (Addressable) (notifyFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a pair of notifiers which get invoked before and after the
     * closure callback, respectively.
     * <p>
     * This is typically used to protect the extra arguments for the
     * duration of the callback. See g_object_watch_closure() for an
     * example of marshal guards.
     * @param preMarshalNotify a function to call before the closure callback
     * @param postMarshalNotify a function to call after the closure callback
     */
    public void addMarshalGuards(@Nullable org.gtk.gobject.ClosureNotify preMarshalNotify, @Nullable org.gtk.gobject.ClosureNotify postMarshalNotify) {
        try {
            DowncallHandles.g_closure_add_marshal_guards.invokeExact(
                    handle(),
                    (Addressable) (preMarshalNotify == null ? MemoryAddress.NULL : Interop.registerCallback(preMarshalNotify)),
                    (Addressable) (preMarshalNotify == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (preMarshalNotify == null ? MemoryAddress.NULL : Interop.registerCallback(preMarshalNotify)),
                    (Addressable) (postMarshalNotify == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a flag on the closure to indicate that its calling
     * environment has become invalid, and thus causes any future
     * invocations of g_closure_invoke() on this {@code closure} to be
     * ignored.
     * <p>
     * Also, invalidation notifiers installed on the closure will
     * be called at this point. Note that unless you are holding a
     * reference to the closure yourself, the invalidation notifiers may
     * unref the closure and cause it to be destroyed, so if you need to
     * access the closure after calling g_closure_invalidate(), make sure
     * that you've previously called g_closure_ref().
     * <p>
     * Note that g_closure_invalidate() will also be called when the
     * reference count of a closure drops to zero (unless it has already
     * been invalidated before).
     */
    public void invalidate() {
        try {
            DowncallHandles.g_closure_invalidate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Invokes the closure, i.e. executes the callback represented by the {@code closure}.
     * @param returnValue a {@link Value} to store the return
     *                value. May be {@code null} if the callback of {@code closure}
     *                doesn't return a value.
     * @param nParamValues the length of the {@code param_values} array
     * @param paramValues an array of
     *                {@code GValues} holding the arguments on which to
     *                invoke the callback of {@code closure}
     * @param invocationHint a context-dependent invocation hint
     */
    public void invoke(@NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value[] paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_closure_invoke.invokeExact(
                    handle(),
                    returnValue.handle(),
                    nParamValues,
                    Interop.allocateNativeArray(paramValues, false),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increments the reference count on a closure to force it staying
     * alive while the caller holds a pointer to it.
     * @return The {@code closure} passed in, for convenience
     */
    public @NotNull org.gtk.gobject.Closure ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_closure_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Closure(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes a finalization notifier.
     * <p>
     * Notice that notifiers are automatically removed after they are run.
     * @param notifyFunc the callback function to remove
     */
    public void removeFinalizeNotifier(@NotNull org.gtk.gobject.ClosureNotify notifyFunc) {
        java.util.Objects.requireNonNull(notifyFunc, "Parameter 'notifyFunc' must not be null");
        try {
            DowncallHandles.g_closure_remove_finalize_notifier.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(notifyFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes an invalidation notifier.
     * <p>
     * Notice that notifiers are automatically removed after they are run.
     * @param notifyFunc the callback function to remove
     */
    public void removeInvalidateNotifier(@NotNull org.gtk.gobject.ClosureNotify notifyFunc) {
        java.util.Objects.requireNonNull(notifyFunc, "Parameter 'notifyFunc' must not be null");
        try {
            DowncallHandles.g_closure_remove_invalidate_notifier.invokeExact(
                    handle(),
                    (Addressable) (Interop.registerCallback(notifyFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the marshaller of {@code closure}.
     * <p>
     * The {@code marshal_data} of {@code marshal} provides a way for a meta marshaller to
     * provide additional information to the marshaller.
     * <p>
     * For GObject's C predefined marshallers (the {@code g_cclosure_marshal_*()}
     * functions), what it provides is a callback function to use instead of
     * {@code closure}-&gt;callback.
     * <p>
     * See also: g_closure_set_meta_marshal()
     * @param marshal a {@link ClosureMarshal} function
     */
    public void setMarshal(@NotNull org.gtk.gobject.ClosureMarshal marshal) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets the meta marshaller of {@code closure}.
     * <p>
     * A meta marshaller wraps the {@code closure}'s marshal and modifies the way
     * it is called in some fashion. The most common use of this facility
     * is for C callbacks.
     * <p>
     * The same marshallers (generated by [glib-genmarshal][glib-genmarshal]),
     * are used everywhere, but the way that we get the callback function
     * differs. In most cases we want to use the {@code closure}'s callback, but in
     * other cases we want to use some different technique to retrieve the
     * callback function.
     * <p>
     * For example, class closures for signals (see
     * g_signal_type_cclosure_new()) retrieve the callback function from a
     * fixed offset in the class structure.  The meta marshaller retrieves
     * the right callback and passes it to the marshaller as the
     * {@code marshal_data} argument.
     * @param metaMarshal a {@link ClosureMarshal} function
     */
    public void setMetaMarshal(@Nullable org.gtk.gobject.ClosureMarshal metaMarshal) {
        try {
            DowncallHandles.g_closure_set_meta_marshal.invokeExact(
                    handle(),
                    (Addressable) (metaMarshal == null ? MemoryAddress.NULL : Interop.registerCallback(metaMarshal)),
                    (Addressable) (metaMarshal == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureMarshal",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Takes over the initial ownership of a closure.
     * <p>
     * Each closure is initially created in a "floating" state, which means
     * that the initial reference count is not owned by any caller.
     * <p>
     * This function checks to see if the object is still floating, and if so,
     * unsets the floating state and decreases the reference count. If the
     * closure is not floating, g_closure_sink() does nothing.
     * <p>
     * The reason for the existence of the floating state is to prevent
     * cumbersome code sequences like:
     * <pre>{@code <!-- language="C" -->
     * closure = g_cclosure_new (cb_func, cb_data);
     * g_source_set_closure (source, closure);
     * g_closure_unref (closure); // GObject doesn't really need this
     * }</pre>
     * <p>
     * Because g_source_set_closure() (and similar functions) take ownership of the
     * initial reference count, if it is unowned, we instead can write:
     * <pre>{@code <!-- language="C" -->
     * g_source_set_closure (source, g_cclosure_new (cb_func, cb_data));
     * }</pre>
     * <p>
     * Generally, this function is used together with g_closure_ref(). An example
     * of storing a closure for later notification looks like:
     * <pre>{@code <!-- language="C" -->
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
     * }</pre>
     * <p>
     * Because g_closure_sink() may decrement the reference count of a closure
     * (if it hasn't been called on {@code closure} yet) just like g_closure_unref(),
     * g_closure_ref() should be called prior to this function.
     */
    public void sink() {
        try {
            DowncallHandles.g_closure_sink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decrements the reference count of a closure after it was previously
     * incremented by the same caller.
     * <p>
     * If no other callers are using the closure, then the closure will be
     * destroyed and freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_closure_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_closure_new_object = Interop.downcallHandle(
            "g_closure_new_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_new_simple = Interop.downcallHandle(
            "g_closure_new_simple",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_add_finalize_notifier = Interop.downcallHandle(
            "g_closure_add_finalize_notifier",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_add_invalidate_notifier = Interop.downcallHandle(
            "g_closure_add_invalidate_notifier",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_add_marshal_guards = Interop.downcallHandle(
            "g_closure_add_marshal_guards",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_invalidate = Interop.downcallHandle(
            "g_closure_invalidate",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_invoke = Interop.downcallHandle(
            "g_closure_invoke",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_ref = Interop.downcallHandle(
            "g_closure_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_remove_finalize_notifier = Interop.downcallHandle(
            "g_closure_remove_finalize_notifier",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_remove_invalidate_notifier = Interop.downcallHandle(
            "g_closure_remove_invalidate_notifier",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_set_marshal = Interop.downcallHandle(
            "g_closure_set_marshal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_set_meta_marshal = Interop.downcallHandle(
            "g_closure_set_meta_marshal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_sink = Interop.downcallHandle(
            "g_closure_sink",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_closure_unref = Interop.downcallHandle(
            "g_closure_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
