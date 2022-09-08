package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GVariantDict is a mutable interface to #GVariant dictionaries.
 * 
 * It can be used for doing a sequence of dictionary lookups in an
 * efficient way on an existing #GVariant dictionary or it can be used
 * to construct new dictionaries with a hashtable-like interface.  It
 * can also be used for taking existing dictionaries and modifying them
 * in order to create new ones.
 * 
 * #GVariantDict can only be used with %G_VARIANT_TYPE_VARDICT
 * dictionaries.
 * 
 * It is possible to use #GVariantDict allocated on the stack or on the
 * heap.  When using a stack-allocated #GVariantDict, you begin with a
 * call to g_variant_dict_init() and free the resources with a call to
 * g_variant_dict_clear().
 * 
 * Heap-allocated #GVariantDict follows normal refcounting rules: you
 * allocate it with g_variant_dict_new() and use g_variant_dict_ref()
 * and g_variant_dict_unref().
 * 
 * g_variant_dict_end() is used to convert the #GVariantDict back into a
 * dictionary-type #GVariant.  When used with stack-allocated instances,
 * this also implicitly frees all associated memory, but for
 * heap-allocated instances, you must still call g_variant_dict_unref()
 * afterwards.
 * 
 * You will typically want to use a heap-allocated #GVariantDict when
 * you expose it as part of an API.  For most other uses, the
 * stack-allocated form will be more convenient.
 * 
 * Consider the following two examples that do the same thing in each
 * style: take an existing dictionary and look up the "count" uint32
 * key, adding 1 to it if it is found, or returning an error if the
 * key is not found.  Each returns the new dictionary as a floating
 * #GVariant.
 * 
 * ## Using a stack-allocated GVariantDict
 * 
 * |[<!-- language="C" -->
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict dict;
 *     guint32 count;
 * 
 *     g_variant_dict_init (&dict, orig);
 *     if (!g_variant_dict_lookup (&dict, "count", "u", &count))
 *       {
 *         g_set_error (...);
 *         g_variant_dict_clear (&dict);
 *         return NULL;
 *       }
 * 
 *     g_variant_dict_insert (&dict, "count", "u", count + 1);
 * 
 *     return g_variant_dict_end (&dict);
 *   }
 * ]|
 * 
 * ## Using heap-allocated GVariantDict
 * 
 * |[<!-- language="C" -->
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict *dict;
 *     GVariant *result;
 *     guint32 count;
 * 
 *     dict = g_variant_dict_new (orig);
 * 
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
 * 
 *     g_variant_dict_unref (dict);
 * 
 *     return result;
 *   }
 * ]|
 */
public class VariantDict extends io.github.jwharm.javagi.interop.ResourceBase {

    public VariantDict(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Allocates and initialises a new #GVariantDict.
     * 
     * You should call g_variant_dict_unref() on the return value when it
     * is no longer needed.  The memory will not be automatically freed by
     * any other call.
     * 
     * In some cases it may be easier to place a #GVariantDict directly on
     * the stack of the calling function and initialise it with
     * g_variant_dict_init().  This is particularly useful when you are
     * using #GVariantDict to construct a #GVariant.
     */
    public VariantDict(Variant fromAsv) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_new(fromAsv.HANDLE()), true));
    }
    
    /**
     * Releases all memory associated with a #GVariantDict without freeing
     * the #GVariantDict structure itself.
     * 
     * It typically only makes sense to do this on a stack-allocated
     * #GVariantDict if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_dict_end() and it also doesn't need to be called on dicts
     * allocated with g_variant_dict_new (see g_variant_dict_unref() for
     * that).
     * 
     * It is valid to call this function on either an initialised
     * #GVariantDict or one that was previously cleared by an earlier call
     * to g_variant_dict_clear() but it is not valid to call this function
     * on uninitialised memory.
     */
    public void clear() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_clear(HANDLE());
    }
    
    /**
     * Checks if @key exists in @dict.
     */
    public boolean contains(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_contains(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current value of @dict as a #GVariant of type
     * %G_VARIANT_TYPE_VARDICT, clearing it in the process.
     * 
     * It is not permissible to use @dict in any way after this call except
     * for reference counting operations (in the case of a heap-allocated
     * #GVariantDict) or by reinitialising it with g_variant_dict_init() (in
     * the case of stack-allocated).
     */
    public Variant end() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_end(HANDLE());
        return new Variant(References.get(RESULT, false));
    }
    
    /**
     * Initialises a #GVariantDict structure.
     * 
     * If @from_asv is given, it is used to initialise the dictionary.
     * 
     * This function completely ignores the previous contents of @dict.  On
     * one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing #GVariantDict you need to first
     * call g_variant_dict_clear() in order to avoid leaking memory.
     * 
     * You must not call g_variant_dict_ref() or g_variant_dict_unref() on a
     * #GVariantDict that was initialised with this function.  If you ever
     * pass a reference to a #GVariantDict outside of the control of your
     * own code then you should assume that the person receiving that
     * reference may try to use reference counting; you should use
     * g_variant_dict_new() instead of this function.
     */
    public void init(Variant fromAsv) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_init(HANDLE(), fromAsv.HANDLE());
    }
    
    /**
     * Inserts (or replaces) a key in a #GVariantDict.
     * 
     * @value is consumed if it is floating.
     */
    public void insertValue(java.lang.String key, Variant value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_insert_value(HANDLE(), Interop.allocateNativeString(key).HANDLE(), value.HANDLE());
    }
    
    /**
     * Looks up a value in a #GVariantDict.
     * 
     * If @key is not found in @dictionary, %NULL is returned.
     * 
     * The @expected_type string specifies what type of value is expected.
     * If the value associated with @key has a different type then %NULL is
     * returned.
     * 
     * If the key is found and the value has the correct type, it is
     * returned.  If @expected_type was specified then any non-%NULL return
     * value will have this type.
     */
    public Variant lookupValue(java.lang.String key, VariantType expectedType) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_lookup_value(HANDLE(), Interop.allocateNativeString(key).HANDLE(), expectedType.HANDLE());
        return new Variant(References.get(RESULT, true));
    }
    
    /**
     * Increases the reference count on @dict.
     * 
     * Don't call this on stack-allocated #GVariantDict instances or bad
     * things will happen.
     */
    public VariantDict ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_ref(HANDLE());
        return new VariantDict(References.get(RESULT, true));
    }
    
    /**
     * Removes a key and its associated value from a #GVariantDict.
     */
    public boolean remove(java.lang.String key) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_remove(HANDLE(), Interop.allocateNativeString(key).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Decreases the reference count on @dict.
     * 
     * In the event that there are no more references, releases all memory
     * associated with the #GVariantDict.
     * 
     * Don't call this on stack-allocated #GVariantDict instances or bad
     * things will happen.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_variant_dict_unref(HANDLE());
    }
    
}
