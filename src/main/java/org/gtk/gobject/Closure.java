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
 * <li>The reference counting of {@link Closure} makes it easy to handle reentrancy
 *   right; if a callback is removed while it is being invoked, the closure
 *   and its parameters won't be freed until the invocation finishes.
 * <li>g_closure_invalidate() and invalidation notifiers allow callbacks to be
 *   automatically removed when the objects they point to go away.
 */
public class Closure extends io.github.jwharm.javagi.ResourceBase {

    public Closure(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_closure_new_object = Interop.downcallHandle(
        "g_closure_new_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewObject(@NotNull int sizeofClosure, @NotNull Object object) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_closure_new_object.invokeExact(sizeofClosure, object.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A variant of g_closure_new_simple() which stores {@code object} in the
     * {@code data} field of the closure and calls g_object_watch_closure() on
     * {@code object} and the created closure. This function is mainly useful
     * when implementing new types of closures.
     */
    public static Closure newObject(@NotNull int sizeofClosure, @NotNull Object object) {
        return new Closure(constructNewObject(sizeofClosure, object));
    }
    
    private static final MethodHandle g_closure_new_simple = Interop.downcallHandle(
        "g_closure_new_simple",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewSimple(@NotNull int sizeofClosure, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_closure_new_simple.invokeExact(sizeofClosure, data), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates a struct of the given size and initializes the initial
     * part as a {@link Closure}.
     * <p>
     * This function is mainly useful when implementing new types of closures:
     * <p>
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
     */
    public static Closure newSimple(@NotNull int sizeofClosure, @Nullable java.lang.foreign.MemoryAddress data) {
        return new Closure(constructNewSimple(sizeofClosure, data));
    }
    
    private static final MethodHandle g_closure_add_finalize_notifier = Interop.downcallHandle(
        "g_closure_add_finalize_notifier",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers a finalization notifier which will be called when the
     * reference count of {@code closure} goes down to 0.
     * <p>
     * Multiple finalization notifiers on a single closure are invoked in
     * unspecified order. If a single call to g_closure_unref() results in
     * the closure being both invalidated and finalized, then the invalidate
     * notifiers will be run before the finalize notifiers.
     */
    public @NotNull void addFinalizeNotifier(@Nullable ClosureNotify notifyFunc) {
        try {
            g_closure_add_finalize_notifier.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notifyFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_add_invalidate_notifier = Interop.downcallHandle(
        "g_closure_add_invalidate_notifier",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers an invalidation notifier which will be called when the
     * {@code closure} is invalidated with g_closure_invalidate().
     * <p>
     * Invalidation notifiers are invoked before finalization notifiers,
     * in an unspecified order.
     */
    public @NotNull void addInvalidateNotifier(@Nullable ClosureNotify notifyFunc) {
        try {
            g_closure_add_invalidate_notifier.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notifyFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_add_marshal_guards = Interop.downcallHandle(
        "g_closure_add_marshal_guards",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a pair of notifiers which get invoked before and after the
     * closure callback, respectively.
     * <p>
     * This is typically used to protect the extra arguments for the
     * duration of the callback. See g_object_watch_closure() for an
     * example of marshal guards.
     */
    public @NotNull void addMarshalGuards(@Nullable ClosureNotify preMarshalNotify, @Nullable ClosureNotify postMarshalNotify) {
        try {
            g_closure_add_marshal_guards.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(preMarshalNotify)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(preMarshalNotify)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_invalidate = Interop.downcallHandle(
        "g_closure_invalidate",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void invalidate() {
        try {
            g_closure_invalidate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_invoke = Interop.downcallHandle(
        "g_closure_invoke",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Invokes the closure, i.e. executes the callback represented by the {@code closure}.
     */
    public @NotNull void invoke(@NotNull Out<Value> returnValue, @NotNull int nParamValues, @NotNull Value[] paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        MemorySegment returnValuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            g_closure_invoke.invokeExact(handle(), (Addressable) returnValuePOINTER.address(), nParamValues, Interop.allocateNativeArray(paramValues), invocationHint);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        returnValue.set(new Value(Refcounted.get(returnValuePOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle g_closure_ref = Interop.downcallHandle(
        "g_closure_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increments the reference count on a closure to force it staying
     * alive while the caller holds a pointer to it.
     */
    public @NotNull Closure ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_closure_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Closure(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_closure_remove_finalize_notifier = Interop.downcallHandle(
        "g_closure_remove_finalize_notifier",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a finalization notifier.
     * <p>
     * Notice that notifiers are automatically removed after they are run.
     */
    public @NotNull void removeFinalizeNotifier(@NotNull ClosureNotify notifyFunc) {
        try {
            g_closure_remove_finalize_notifier.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notifyFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_remove_invalidate_notifier = Interop.downcallHandle(
        "g_closure_remove_invalidate_notifier",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an invalidation notifier.
     * <p>
     * Notice that notifiers are automatically removed after they are run.
     */
    public @NotNull void removeInvalidateNotifier(@NotNull ClosureNotify notifyFunc) {
        try {
            g_closure_remove_invalidate_notifier.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(notifyFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_set_meta_marshal = Interop.downcallHandle(
        "g_closure_set_meta_marshal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void setMetaMarshal(@Nullable ClosureMarshal metaMarshal) {
        try {
            g_closure_set_meta_marshal.invokeExact(handle(), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(metaMarshal)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureMarshal",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_sink = Interop.downcallHandle(
        "g_closure_sink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
     * <p>
     * <pre>{@code <!-- language="C" -->
     * closure = g_cclosure_new (cb_func, cb_data);
     * g_source_set_closure (source, closure);
     * g_closure_unref (closure); // GObject doesn't really need this
     * }</pre>
     * <p>
     * Because g_source_set_closure() (and similar functions) take ownership of the
     * initial reference count, if it is unowned, we instead can write:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * g_source_set_closure (source, g_cclosure_new (cb_func, cb_data));
     * }</pre>
     * <p>
     * Generally, this function is used together with g_closure_ref(). An example
     * of storing a closure for later notification looks like:
     * <p>
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
    public @NotNull void sink() {
        try {
            g_closure_sink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_closure_unref = Interop.downcallHandle(
        "g_closure_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count of a closure after it was previously
     * incremented by the same caller.
     * <p>
     * If no other callers are using the closure, then the closure will be
     * destroyed and freed.
     */
    public @NotNull void unref() {
        try {
            g_closure_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
