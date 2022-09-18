package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.glib.VariantDict} is a mutable interface to {@link org.gtk.glib.Variant} dictionaries.
 * 
 * It can be used for doing a sequence of dictionary lookups in an
 * efficient way on an existing {@link org.gtk.glib.Variant} dictionary or it can be used
 * to construct new dictionaries with a hashtable-like interface.  It
 * can also be used for taking existing dictionaries and modifying them
 * in order to create new ones.
 * 
 * {@link org.gtk.glib.VariantDict} can only be used with <code>G_VARIANT_TYPE_VARDICT</code> dictionaries.
 * 
 * It is possible to use {@link org.gtk.glib.VariantDict} allocated on the stack or on the
 * heap.  When using a stack-allocated {@link org.gtk.glib.VariantDict}  you begin with a
 * call to g_variant_dict_init() and free the resources with a call to
 * g_variant_dict_clear().
 * 
 * Heap-allocated {@link org.gtk.glib.VariantDict} follows normal refcounting rules: you
 * allocate it with g_variant_dict_new() and use g_variant_dict_ref()
 * and g_variant_dict_unref().
 * 
 * g_variant_dict_end() is used to convert the {@link org.gtk.glib.VariantDict} back into a
 * dictionary-type {@link org.gtk.glib.Variant}   When used with stack-allocated instances,
 * this also implicitly frees all associated memory, but for
 * heap-allocated instances, you must still call g_variant_dict_unref()
 * afterwards.
 * 
 * You will typically want to use a heap-allocated {@link org.gtk.glib.VariantDict} when
 * you expose it as part of an API.  For most other uses, the
 * stack-allocated form will be more convenient.
 * 
 * Consider the following two examples that do the same thing in each
 * style: take an existing dictionary and look up the &<code>#34</code> count&<code>#34</code>  uint32
 * key, adding 1 to it if it is found, or returning an error if the
 * key is not found.  Each returns the new dictionary as a floating
 * {@link org.gtk.glib.Variant} 
 * 
 * <code>#</code>  Using a stack-allocated GVariantDict
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict dict;
 *     guint32 count;
 * 
 *     g_variant_dict_init (&<code>#38</code> dict, orig);
 *     if (!g_variant_dict_lookup (&<code>#38</code> dict, &<code>#34</code> count&<code>#34</code> , &<code>#34</code> u&<code>#34</code> , &<code>#38</code> count))
 *       {
 *         g_set_error (...);
 *         g_variant_dict_clear (&<code>#38</code> dict);
 *         return NULL;
 *       }
 * 
 *     g_variant_dict_insert (&<code>#38</code> dict, &<code>#34</code> count&<code>#34</code> , &<code>#34</code> u&<code>#34</code> , count + 1);
 * 
 *     return g_variant_dict_end (&<code>#38</code> dict);
 *   }
 * ]}|
 * 
 * <code>#</code>  Using heap-allocated GVariantDict
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
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
 *     if (g_variant_dict_lookup (dict, &<code>#34</code> count&<code>#34</code> , &<code>#34</code> u&<code>#34</code> , &<code>#38</code> count))
 *       {
 *         g_variant_dict_insert (dict, &<code>#34</code> count&<code>#34</code> , &<code>#34</code> u&<code>#34</code> , count + 1);
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
 * ]}|
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
     * Allocates and initialises a new {@link org.gtk.glib.VariantDict} 
     * 
     * You should call g_variant_dict_unref() on the return value when it
     * is no longer needed.  The memory will not be automatically freed by
     * any other call.
     * 
     * In some cases it may be easier to place a {@link org.gtk.glib.VariantDict} directly on
     * the stack of the calling function and initialise it with
     * g_variant_dict_init().  This is particularly useful when you are
     * using {@link org.gtk.glib.VariantDict} to construct a {@link org.gtk.glib.Variant}
     */
    public VariantDict(Variant fromAsv) {
        super(constructNew(fromAsv));
    }
    
    /**
     * Releases all memory associated with a {@link org.gtk.glib.VariantDict} without freeing
     * the {@link org.gtk.glib.VariantDict} structure itself.
     * 
     * It typically only makes sense to do this on a stack-allocated
     * {@link org.gtk.glib.VariantDict} if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_dict_end() and it also doesn&<code>#39</code> t need to be called on dicts
     * allocated with g_variant_dict_new (see g_variant_dict_unref() for
     * that).
     * 
     * It is valid to call this function on either an initialised
     * {@link org.gtk.glib.VariantDict} or one that was previously cleared by an earlier call
     * to g_variant_dict_clear() but it is not valid to call this function
     * on uninitialised memory.
     */
    public void clear() {
        gtk_h.g_variant_dict_clear(handle());
    }
    
    /**
     * Checks if @key exists in @dict.
     */
    public boolean contains(java.lang.String key) {
        var RESULT = gtk_h.g_variant_dict_contains(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current value of @dict as a {@link org.gtk.glib.Variant} of type
     * <code>G_VARIANT_TYPE_VARDICT</code>  clearing it in the process.
     * 
     * It is not permissible to use @dict in any way after this call except
     * for reference counting operations (in the case of a heap-allocated
     * {@link org.gtk.glib.VariantDict}  or by reinitialising it with g_variant_dict_init() (in
     * the case of stack-allocated).
     */
    public Variant end() {
        var RESULT = gtk_h.g_variant_dict_end(handle());
        return new Variant(References.get(RESULT, false));
    }
    
    /**
     * Initialises a {@link org.gtk.glib.VariantDict} structure.
     * 
     * If @from_asv is given, it is used to initialise the dictionary.
     * 
     * This function completely ignores the previous contents of @dict.  On
     * one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing {@link org.gtk.glib.VariantDict} you need to first
     * call g_variant_dict_clear() in order to avoid leaking memory.
     * 
     * You must not call g_variant_dict_ref() or g_variant_dict_unref() on a
     * {@link org.gtk.glib.VariantDict} that was initialised with this function.  If you ever
     * pass a reference to a {@link org.gtk.glib.VariantDict} outside of the control of your
     * own code then you should assume that the person receiving that
     * reference may try to use reference counting; you should use
     * g_variant_dict_new() instead of this function.
     */
    public void init(Variant fromAsv) {
        gtk_h.g_variant_dict_init(handle(), fromAsv.handle());
    }
    
    /**
     * Inserts (or replaces) a key in a {@link org.gtk.glib.VariantDict} 
     * 
     * @value is consumed if it is floating.
     */
    public void insertValue(java.lang.String key, Variant value) {
        gtk_h.g_variant_dict_insert_value(handle(), Interop.allocateNativeString(key).handle(), value.handle());
    }
    
    /**
     * Looks up a value in a {@link org.gtk.glib.VariantDict} 
     * 
     * If @key is not found in @dictionary, <code>null</code> is returned.
     * 
     * The @expected_type string specifies what type of value is expected.
     * If the value associated with @key has a different type then <code>null</code> is
     * returned.
     * 
     * If the key is found and the value has the correct type, it is
     * returned.  If @expected_type was specified then any non-<code>null</code> return
     * value will have this type.
     */
    public Variant lookupValue(java.lang.String key, VariantType expectedType) {
        var RESULT = gtk_h.g_variant_dict_lookup_value(handle(), Interop.allocateNativeString(key).handle(), expectedType.handle());
        return new Variant(References.get(RESULT, true));
    }
    
    /**
     * Increases the reference count on @dict.
     * 
     * Don&<code>#39</code> t call this on stack-allocated {@link org.gtk.glib.VariantDict} instances or bad
     * things will happen.
     */
    public VariantDict ref() {
        var RESULT = gtk_h.g_variant_dict_ref(handle());
        return new VariantDict(References.get(RESULT, true));
    }
    
    /**
     * Removes a key and its associated value from a {@link org.gtk.glib.VariantDict}
     */
    public boolean remove(java.lang.String key) {
        var RESULT = gtk_h.g_variant_dict_remove(handle(), Interop.allocateNativeString(key).handle());
        return (RESULT != 0);
    }
    
    /**
     * Decreases the reference count on @dict.
     * 
     * In the event that there are no more references, releases all memory
     * associated with the {@link org.gtk.glib.VariantDict} 
     * 
     * Don&<code>#39</code> t call this on stack-allocated {@link org.gtk.glib.VariantDict} instances or bad
     * things will happen.
     */
    public void unref() {
        gtk_h.g_variant_dict_unref(handle());
    }
    
}
