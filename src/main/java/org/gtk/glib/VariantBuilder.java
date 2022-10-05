package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A utility type for constructing container-type {@link Variant} instances.
 * <p>
 * This is an opaque structure and may only be accessed using the
 * following functions.
 * <p>
 * {@link VariantBuilder} is not threadsafe in any way.  Do not attempt to
 * access it from more than one thread.
 */
public class VariantBuilder extends io.github.jwharm.javagi.ResourceBase {

    public VariantBuilder(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_variant_builder_new = Interop.downcallHandle(
        "g_variant_builder_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(VariantType type) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_variant_builder_new.invokeExact(type.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Allocates and initialises a new {@link VariantBuilder}.
     * <p>
     * You should call g_variant_builder_unref() on the return value when it
     * is no longer needed.  The memory will not be automatically freed by
     * any other call.
     * <p>
     * In most cases it is easier to place a {@link VariantBuilder} directly on
     * the stack of the calling function and initialise it with
     * g_variant_builder_init().
     */
    public VariantBuilder(VariantType type) {
        super(constructNew(type));
    }
    
    static final MethodHandle g_variant_builder_add_value = Interop.downcallHandle(
        "g_variant_builder_add_value",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code value} to {@code builder}.
     * <p>
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed.  Some examples of this are
     * putting different types of items into an array, putting the wrong
     * types or number of items in a tuple, putting more than one value into
     * a variant, etc.
     * <p>
     * If {@code value} is a floating reference (see g_variant_ref_sink()),
     * the {@code builder} instance takes ownership of {@code value}.
     */
    public void addValue(Variant value) {
        try {
            g_variant_builder_add_value.invokeExact(handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_clear = Interop.downcallHandle(
        "g_variant_builder_clear",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases all memory associated with a {@link VariantBuilder} without
     * freeing the {@link VariantBuilder} structure itself.
     * <p>
     * It typically only makes sense to do this on a stack-allocated
     * {@link VariantBuilder} if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_builder_end() and it also doesn't need to be called on
     * builders allocated with g_variant_builder_new() (see
     * g_variant_builder_unref() for that).
     * <p>
     * This function leaves the {@link VariantBuilder} structure set to all-zeros.
     * It is valid to call this function on either an initialised
     * {@link VariantBuilder} or one that is set to all-zeros but it is not valid
     * to call this function on uninitialised memory.
     */
    public void clear() {
        try {
            g_variant_builder_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_close = Interop.downcallHandle(
        "g_variant_builder_close",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Closes the subcontainer inside the given {@code builder} that was opened by
     * the most recent call to g_variant_builder_open().
     * <p>
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed (ie: too few values added to the
     * subcontainer).
     */
    public void close() {
        try {
            g_variant_builder_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_end = Interop.downcallHandle(
        "g_variant_builder_end",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Ends the builder process and returns the constructed value.
     * <p>
     * It is not permissible to use {@code builder} in any way after this call
     * except for reference counting operations (in the case of a
     * heap-allocated {@link VariantBuilder}) or by reinitialising it with
     * g_variant_builder_init() (in the case of stack-allocated). This
     * means that for the stack-allocated builders there is no need to
     * call g_variant_builder_clear() after the call to
     * g_variant_builder_end().
     * <p>
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed (ie: insufficient number of
     * items added to a container with a specific number of children
     * required).  It is also an error to call this function if the builder
     * was created with an indefinite array or maybe type and no children
     * have been added; in this case it is impossible to infer the type of
     * the empty array.
     */
    public Variant end() {
        try {
            var RESULT = (MemoryAddress) g_variant_builder_end.invokeExact(handle());
            return new Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_init = Interop.downcallHandle(
        "g_variant_builder_init",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initialises a {@link VariantBuilder} structure.
     * <p>
     * {@code type} must be non-{@code null}.  It specifies the type of container to
     * construct.  It can be an indefinite type such as
     * {@code G_VARIANT_TYPE_ARRAY} or a definite type such as "as" or "(ii)".
     * Maybe, array, tuple, dictionary entry and variant-typed values may be
     * constructed.
     * <p>
     * After the builder is initialised, values are added using
     * g_variant_builder_add_value() or g_variant_builder_add().
     * <p>
     * After all the child values are added, g_variant_builder_end() frees
     * the memory associated with the builder and returns the {@link Variant} that
     * was created.
     * <p>
     * This function completely ignores the previous contents of {@code builder}.
     * On one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing {@link VariantBuilder} you need to
     * first call g_variant_builder_clear() in order to avoid leaking
     * memory.
     * <p>
     * You must not call g_variant_builder_ref() or
     * g_variant_builder_unref() on a {@link VariantBuilder} that was initialised
     * with this function.  If you ever pass a reference to a
     * {@link VariantBuilder} outside of the control of your own code then you
     * should assume that the person receiving that reference may try to use
     * reference counting; you should use g_variant_builder_new() instead of
     * this function.
     */
    public void init(VariantType type) {
        try {
            g_variant_builder_init.invokeExact(handle(), type.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_open = Interop.downcallHandle(
        "g_variant_builder_open",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Opens a subcontainer inside the given {@code builder}.  When done adding
     * items to the subcontainer, g_variant_builder_close() must be called. {@code type}
     * is the type of the container: so to build a tuple of several values, {@code type}
     * must include the tuple itself.
     * <p>
     * It is an error to call this function in any way that would cause an
     * inconsistent value to be constructed (ie: adding too many values or
     * a value of an incorrect type).
     * <p>
     * Example of building a nested variant:
     * <pre>{@code <!-- language="C" -->
     * GVariantBuilder builder;
     * guint32 some_number = get_number ();
     * g_autoptr (GHashTable) some_dict = get_dict ();
     * GHashTableIter iter;
     * const gchar *key;
     * const GVariant *value;
     * g_autoptr (GVariant) output = NULL;
     * 
     * g_variant_builder_init (&builder, G_VARIANT_TYPE ("(ua{sv})"));
     * g_variant_builder_add (&builder, "u", some_number);
     * g_variant_builder_open (&builder, G_VARIANT_TYPE ("a{sv}"));
     * 
     * g_hash_table_iter_init (&iter, some_dict);
     * while (g_hash_table_iter_next (&iter, (gpointer *) &key, (gpointer *) &value))
     *   {
     *     g_variant_builder_open (&builder, G_VARIANT_TYPE ("{sv}"));
     *     g_variant_builder_add (&builder, "s", key);
     *     g_variant_builder_add (&builder, "v", value);
     *     g_variant_builder_close (&builder);
     *   }
     * 
     * g_variant_builder_close (&builder);
     * 
     * output = g_variant_builder_end (&builder);
     * }</pre>
     */
    public void open(VariantType type) {
        try {
            g_variant_builder_open.invokeExact(handle(), type.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_ref = Interop.downcallHandle(
        "g_variant_builder_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on {@code builder}.
     * <p>
     * Don't call this on stack-allocated {@link VariantBuilder} instances or bad
     * things will happen.
     */
    public VariantBuilder ref() {
        try {
            var RESULT = (MemoryAddress) g_variant_builder_ref.invokeExact(handle());
            return new VariantBuilder(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_variant_builder_unref = Interop.downcallHandle(
        "g_variant_builder_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on {@code builder}.
     * <p>
     * In the event that there are no more references, releases all memory
     * associated with the {@link VariantBuilder}.
     * <p>
     * Don't call this on stack-allocated {@link VariantBuilder} instances or bad
     * things will happen.
     */
    public void unref() {
        try {
            g_variant_builder_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
