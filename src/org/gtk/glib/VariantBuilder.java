package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A utility type for constructing container-type {@link org.gtk.glib.Variant} instances.
 * 
 * This is an opaque structure and may only be accessed using the
 * following functions.
 * 
 * {@link org.gtk.glib.VariantBuilder} is not threadsafe in any way.  Do not attempt to
 * access it from more than one thread.
 */
public class VariantBuilder extends io.github.jwharm.javagi.ResourceBase {

    public VariantBuilder(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(VariantType type) {
        Reference RESULT = References.get(gtk_h.g_variant_builder_new(type.handle()), true);
        return RESULT;
    }
    
    /**
     * Allocates and initialises a new {@link org.gtk.glib.VariantBuilder} 
     * 
     * You should call g_variant_builder_unref() on the return value when it
     * is no longer needed.  The memory will not be automatically freed by
     * any other call.
     * 
     * In most cases it is easier to place a {@link org.gtk.glib.VariantBuilder} directly on
     * the stack of the calling function and initialise it with
     * g_variant_builder_init().
     */
    public VariantBuilder(VariantType type) {
        super(constructNew(type));
    }
    
    /**
     * Adds @value to @builder.
     * 
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed.  Some examples of this are
     * putting different types of items into an array, putting the wrong
     * types or number of items in a tuple, putting more than one value into
     * a variant, etc.
     * 
     * If @value is a floating reference (see g_variant_ref_sink()),
     * the @builder instance takes ownership of @value.
     */
    public void addValue(Variant value) {
        gtk_h.g_variant_builder_add_value(handle(), value.handle());
    }
    
    /**
     * Releases all memory associated with a {@link org.gtk.glib.VariantBuilder} without
     * freeing the {@link org.gtk.glib.VariantBuilder} structure itself.
     * 
     * It typically only makes sense to do this on a stack-allocated
     * {@link org.gtk.glib.VariantBuilder} if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_builder_end() and it also doesn&<code>#39</code> t need to be called on
     * builders allocated with g_variant_builder_new() (see
     * g_variant_builder_unref() for that).
     * 
     * This function leaves the {@link org.gtk.glib.VariantBuilder} structure set to all-zeros.
     * It is valid to call this function on either an initialised
     * {@link org.gtk.glib.VariantBuilder} or one that is set to all-zeros but it is not valid
     * to call this function on uninitialised memory.
     */
    public void clear() {
        gtk_h.g_variant_builder_clear(handle());
    }
    
    /**
     * Closes the subcontainer inside the given @builder that was opened by
     * the most recent call to g_variant_builder_open().
     * 
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed (ie: too few values added to the
     * subcontainer).
     */
    public void close() {
        gtk_h.g_variant_builder_close(handle());
    }
    
    /**
     * Ends the builder process and returns the constructed value.
     * 
     * It is not permissible to use @builder in any way after this call
     * except for reference counting operations (in the case of a
     * heap-allocated {@link org.gtk.glib.VariantBuilder}  or by reinitialising it with
     * g_variant_builder_init() (in the case of stack-allocated). This
     * means that for the stack-allocated builders there is no need to
     * call g_variant_builder_clear() after the call to
     * g_variant_builder_end().
     * 
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed (ie: insufficient number of
     * items added to a container with a specific number of children
     * required).  It is also an error to call this function if the builder
     * was created with an indefinite array or maybe type and no children
     * have been added; in this case it is impossible to infer the type of
     * the empty array.
     */
    public Variant end() {
        var RESULT = gtk_h.g_variant_builder_end(handle());
        return new Variant(References.get(RESULT, false));
    }
    
    /**
     * Initialises a {@link org.gtk.glib.VariantBuilder} structure.
     * 
     * @type must be non-<code>null</code>   It specifies the type of container to
     * construct.  It can be an indefinite type such as
     * <code>G_VARIANT_TYPE_ARRAY</code> or a definite type such as &<code>#34</code> as&<code>#34</code>  or &<code>#34</code> (ii)&<code>#34</code> .
     * Maybe, array, tuple, dictionary entry and variant-typed values may be
     * constructed.
     * 
     * After the builder is initialised, values are added using
     * g_variant_builder_add_value() or g_variant_builder_add().
     * 
     * After all the child values are added, g_variant_builder_end() frees
     * the memory associated with the builder and returns the {@link org.gtk.glib.Variant} that
     * was created.
     * 
     * This function completely ignores the previous contents of @builder.
     * On one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing {@link org.gtk.glib.VariantBuilder} you need to
     * first call g_variant_builder_clear() in order to avoid leaking
     * memory.
     * 
     * You must not call g_variant_builder_ref() or
     * g_variant_builder_unref() on a {@link org.gtk.glib.VariantBuilder} that was initialised
     * with this function.  If you ever pass a reference to a
     * {@link org.gtk.glib.VariantBuilder} outside of the control of your own code then you
     * should assume that the person receiving that reference may try to use
     * reference counting; you should use g_variant_builder_new() instead of
     * this function.
     */
    public void init(VariantType type) {
        gtk_h.g_variant_builder_init(handle(), type.handle());
    }
    
    /**
     * Opens a subcontainer inside the given @builder.  When done adding
     * items to the subcontainer, g_variant_builder_close() must be called. @type
     * is the type of the container: so to build a tuple of several values, @type
     * must include the tuple itself.
     * 
     * It is an error to call this function in any way that would cause an
     * inconsistent value to be constructed (ie: adding too many values or
     * a value of an incorrect type).
     * 
     * Example of building a nested variant:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * GVariantBuilder builder;
     * guint32 some_number = get_number ();
     * g_autoptr (GHashTable) some_dict = get_dict ();
     * GHashTableIter iter;
     * const gchar *key;
     * const GVariant *value;
     * g_autoptr (GVariant) output = NULL;
     * 
     * g_variant_builder_init (&<code>#38</code> builder, G_VARIANT_TYPE (&<code>#34</code> (ua{sv})&<code>#34</code> ));
     * g_variant_builder_add (&<code>#38</code> builder, &<code>#34</code> u&<code>#34</code> , some_number);
     * g_variant_builder_open (&<code>#38</code> builder, G_VARIANT_TYPE (&<code>#34</code> a{sv}&<code>#34</code> ));
     * 
     * g_hash_table_iter_init (&<code>#38</code> iter, some_dict);
     * while (g_hash_table_iter_next (&<code>#38</code> iter, (gpointer *) &<code>#38</code> key, (gpointer *) &<code>#38</code> value))
     *   {
     *     g_variant_builder_open (&<code>#38</code> builder, G_VARIANT_TYPE (&<code>#34</code> {sv}&<code>#34</code> ));
     *     g_variant_builder_add (&<code>#38</code> builder, &<code>#34</code> s&<code>#34</code> , key);
     *     g_variant_builder_add (&<code>#38</code> builder, &<code>#34</code> v&<code>#34</code> , value);
     *     g_variant_builder_close (&<code>#38</code> builder);
     *   }
     * 
     * g_variant_builder_close (&<code>#38</code> builder);
     * 
     * output = g_variant_builder_end (&<code>#38</code> builder);
     * ]}|
     */
    public void open(VariantType type) {
        gtk_h.g_variant_builder_open(handle(), type.handle());
    }
    
    /**
     * Increases the reference count on @builder.
     * 
     * Don&<code>#39</code> t call this on stack-allocated {@link org.gtk.glib.VariantBuilder} instances or bad
     * things will happen.
     */
    public VariantBuilder ref() {
        var RESULT = gtk_h.g_variant_builder_ref(handle());
        return new VariantBuilder(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count on @builder.
     * 
     * In the event that there are no more references, releases all memory
     * associated with the {@link org.gtk.glib.VariantBuilder} 
     * 
     * Don&<code>#39</code> t call this on stack-allocated {@link org.gtk.glib.VariantBuilder} instances or bad
     * things will happen.
     */
    public void unref() {
        gtk_h.g_variant_builder_unref(handle());
    }
    
}
