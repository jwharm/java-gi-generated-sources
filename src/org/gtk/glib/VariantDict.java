package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link VariantDict} is a mutable interface to {@link Variant} dictionaries.
 * <p>
 * It can be used for doing a sequence of dictionary lookups in an
 * efficient way on an existing {@link Variant} dictionary or it can be used
 * to construct new dictionaries with a hashtable-like interface.  It
 * can also be used for taking existing dictionaries and modifying them
 * in order to create new ones.
 * <p>
 * {@link VariantDict} can only be used with {@code G_VARIANT_TYPE_VARDICT}
 * dictionaries.
 * <p>
 * It is possible to use {@link VariantDict} allocated on the stack or on the
 * heap.  When using a stack-allocated {@link VariantDict}, you begin with a
 * call to g_variant_dict_init() and free the resources with a call to
 * g_variant_dict_clear().
 * <p>
 * Heap-allocated {@link VariantDict} follows normal refcounting rules: you
 * allocate it with g_variant_dict_new() and use g_variant_dict_ref()
 * and g_variant_dict_unref().
 * <p>
 * g_variant_dict_end() is used to convert the {@link VariantDict} back into a
 * dictionary-type {@link Variant}.  When used with stack-allocated instances,
 * this also implicitly frees all associated memory, but for
 * heap-allocated instances, you must still call g_variant_dict_unref()
 * afterwards.
 * <p>
 * You will typically want to use a heap-allocated {@link VariantDict} when
 * you expose it as part of an API.  For most other uses, the
 * stack-allocated form will be more convenient.
 * <p>
 * Consider the following two examples that do the same thing in each
 * style: take an existing dictionary and look up the "count" uint32
 * key, adding 1 to it if it is found, or returning an error if the
 * key is not found.  Each returns the new dictionary as a floating
 * {@link Variant}.
 * <p>
 * <h2>Using a stack-allocated GVariantDict</h2>
 * <p>
 * |[&lt;!-- language="C" --&gt;
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict dict;
 *     guint32 count;
 * <p>
 *     g_variant_dict_init (&dict, orig);
 *     if (!g_variant_dict_lookup (&dict, "count", "u", &count))
 *       {
 *         g_set_error (...);
 *         g_variant_dict_clear (&dict);
 *         return NULL;
 *       }
 * <p>
 *     g_variant_dict_insert (&dict, "count", "u", count + 1);
 * <p>
 *     return g_variant_dict_end (&dict);
 *   }
 * ]|
 * <p>
 * <h2>Using heap-allocated GVariantDict</h2>
 * <p>
 * |[&lt;!-- language="C" --&gt;
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict *dict;
 *     GVariant *result;
 *     guint32 count;
 * <p>
 *     dict = g_variant_dict_new (orig);
 * <p>
 *     if (g_variant_dict_lookup (dict, "count", "u", &count))
 *       {
 *         g_variant_dict_insert (dict, "count", "u", count + 1);
 *         result = g_variant_dict_end (dict);
 *       }
 *     else
 *       {
 *         g_set_error (...);
 *         result = NULL;
 *       }
 * <p>
 *     g_variant_dict_unref (dict);
 * <p>
 *     return result;
 *   }
 * ]|
 */
public class VariantDict extends io.github.jwharm.javagi.ResourceBase {

    public VariantDict(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(Variant fromAsv) {
        Reference RESULT = References.get(gtk_h.g_variant_dict_new(fromAsv.handle()), true);
        return RESULT;
    }
    
    /**
     * Allocates and initialises a new {@link VariantDict}.
     * <p>
     * You should call g_variant_dict_unref() on the return value when it
     * is no longer needed.  The memory will not be automatically freed by
     * any other call.
     * <p>
     * In some cases it may be easier to place a {@link VariantDict} directly on
     * the stack of the calling function and initialise it with
     * g_variant_dict_init().  This is particularly useful when you are
     * using {@link VariantDict} to construct a {@link Variant}.
     */
    public VariantDict(Variant fromAsv) {
        super(constructNew(fromAsv));
    }
    
    /**
     * Releases all memory associated with a {@link VariantDict} without freeing
     * the {@link VariantDict} structure itself.
     * <p>
     * It typically only makes sense to do this on a stack-allocated
     * {@link VariantDict} if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_dict_end() and it also doesn't need to be called on dicts
     * allocated with g_variant_dict_new (see g_variant_dict_unref() for
     * that).
     * <p>
     * It is valid to call this function on either an initialised
     * {@link VariantDict} or one that was previously cleared by an earlier call
     * to g_variant_dict_clear() but it is not valid to call this function
     * on uninitialised memory.
     */
    public void clear() {
        gtk_h.g_variant_dict_clear(handle());
    }
    
    /**
     * Checks if {@code key} exists in {@code dict}.
     */
    public boolean contains(java.lang.String key) {
        var RESULT = gtk_h.g_variant_dict_contains(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current value of {@code dict} as a {@link Variant} of type
     * {@code G_VARIANT_TYPE_VARDICT}, clearing it in the process.
     * <p>
     * It is not permissible to use {@code dict} in any way after this call except
     * for reference counting operations (in the case of a heap-allocated
     * {@link VariantDict}) or by reinitialising it with g_variant_dict_init() (in
     * the case of stack-allocated).
     */
    public Variant end() {
        var RESULT = gtk_h.g_variant_dict_end(handle());
        return new Variant(References.get(RESULT, false));
    }
    
    /**
     * Initialises a {@link VariantDict} structure.
     * <p>
     * If {@code from_asv} is given, it is used to initialise the dictionary.
     * <p>
     * This function completely ignores the previous contents of {@code dict}.  On
     * one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing {@link VariantDict} you need to first
     * call g_variant_dict_clear() in order to avoid leaking memory.
     * <p>
     * You must not call g_variant_dict_ref() or g_variant_dict_unref() on a
     * {@link VariantDict} that was initialised with this function.  If you ever
     * pass a reference to a {@link VariantDict} outside of the control of your
     * own code then you should assume that the person receiving that
     * reference may try to use reference counting; you should use
     * g_variant_dict_new() instead of this function.
     */
    public void init(Variant fromAsv) {
        gtk_h.g_variant_dict_init(handle(), fromAsv.handle());
    }
    
    /**
     * Inserts (or replaces) a key in a {@link VariantDict}.
     * <p>
     * {@code value} is consumed if it is floating.
     */
    public void insertValue(java.lang.String key, Variant value) {
        gtk_h.g_variant_dict_insert_value(handle(), Interop.allocateNativeString(key).handle(), value.handle());
    }
    
    /**
     * Looks up a value in a {@link VariantDict}.
     * <p>
     * If {@code key} is not found in {@code dictionary}, <code>null</code> is returned.
     * <p>
     * The {@code expected_type} string specifies what type of value is expected.
     * If the value associated with {@code key} has a different type then <code>null</code> is
     * returned.
     * <p>
     * If the key is found and the value has the correct type, it is
     * returned.  If {@code expected_type} was specified then any non-<code>null</code> return
     * value will have this type.
     */
    public Variant lookupValue(java.lang.String key, VariantType expectedType) {
        var RESULT = gtk_h.g_variant_dict_lookup_value(handle(), Interop.allocateNativeString(key).handle(), expectedType.handle());
        return new Variant(References.get(RESULT, true));
    }
    
    /**
     * Increases the reference count on {@code dict}.
     * <p>
     * Don't call this on stack-allocated {@link VariantDict} instances or bad
     * things will happen.
     */
    public VariantDict ref() {
        var RESULT = gtk_h.g_variant_dict_ref(handle());
        return new VariantDict(References.get(RESULT, true));
    }
    
    /**
     * Removes a key and its associated value from a {@link VariantDict}.
     */
    public boolean remove(java.lang.String key) {
        var RESULT = gtk_h.g_variant_dict_remove(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Decreases the reference count on {@code dict}.
     * <p>
     * In the event that there are no more references, releases all memory
     * associated with the {@link VariantDict}.
     * <p>
     * Don't call this on stack-allocated {@link VariantDict} instances or bad
     * things will happen.
     */
    public void unref() {
        gtk_h.g_variant_dict_unref(handle());
    }
    
}
