package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A GHashTableIter structure represents an iterator that can be used
 * to iterate over the elements of a {@link org.gtk.glib.HashTable}  GHashTableIter
 * structures are typically allocated on the stack and then initialized
 * with g_hash_table_iter_init().
 * 
 * The iteration order of a {@link org.gtk.glib.HashTableIter} over the keys/values in a hash
 * table is not defined.
 */
public class HashTableIter extends io.github.jwharm.javagi.ResourceBase {

    public HashTableIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Returns the {@link org.gtk.glib.HashTable} associated with @iter.
     */
    public org.gtk.glib.HashTable getHashTable() {
        var RESULT = gtk_h.g_hash_table_iter_get_hash_table(handle());
        return new org.gtk.glib.HashTable(References.get(RESULT, false));
    }
    
    /**
     * Initializes a key/value pair iterator and associates it with
     * @hash_table. Modifying the hash table after calling this function
     * invalidates the returned iterator.
     * 
     * The iteration order of a {@link org.gtk.glib.HashTableIter} over the keys/values in a hash
     * table is not defined.
     * 
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * GHashTableIter iter;
     * gpointer key, value;
     * 
     * g_hash_table_iter_init (&<code>#38</code> iter, hash_table);
     * while (g_hash_table_iter_next (&<code>#38</code> iter, &<code>#38</code> key, &<code>#38</code> value))
     *   {
     *     // do something with key and value
     *   }
     * ]}|
     */
    public void init(org.gtk.glib.HashTable hashTable) {
        gtk_h.g_hash_table_iter_init(handle(), hashTable.handle());
    }
    
    /**
     * Advances @iter and retrieves the key and/or value that are now
     * pointed to as a result of this advancement. If <code>false</code> is returned,
     * @key and @value are not set, and the iterator becomes invalid.
     */
    public boolean next(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value) {
        var RESULT = gtk_h.g_hash_table_iter_next(handle(), key, value);
        return (RESULT != 0);
    }
    
    /**
     * Removes the key/value pair currently pointed to by the iterator
     * from its associated {@link org.gtk.glib.HashTable}  Can only be called after
     * g_hash_table_iter_next() returned <code>true</code>  and cannot be called
     * more than once for the same key/value pair.
     * 
     * If the {@link org.gtk.glib.HashTable} was created using g_hash_table_new_full(),
     * the key and value are freed using the supplied destroy functions,
     * otherwise you have to make sure that any dynamically allocated
     * values are freed yourself.
     * 
     * It is safe to continue iterating the {@link org.gtk.glib.HashTable} afterward:
     * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
     * while (g_hash_table_iter_next (&<code>#38</code> iter, &<code>#38</code> key, &<code>#38</code> value))
     *   {
     *     if (condition)
     *       g_hash_table_iter_remove (&<code>#38</code> iter);
     *   }
     * ]}|
     */
    public void remove() {
        gtk_h.g_hash_table_iter_remove(handle());
    }
    
    /**
     * Replaces the value currently pointed to by the iterator
     * from its associated {@link org.gtk.glib.HashTable}  Can only be called after
     * g_hash_table_iter_next() returned <code>true</code> 
     * 
     * If you supplied a @value_destroy_func when creating the
     * {@link org.gtk.glib.HashTable}  the old value is freed using that function.
     */
    public void replace(jdk.incubator.foreign.MemoryAddress value) {
        gtk_h.g_hash_table_iter_replace(handle(), value);
    }
    
    /**
     * Removes the key/value pair currently pointed to by the
     * iterator from its associated {@link org.gtk.glib.HashTable}  without calling
     * the key and value destroy functions. Can only be called
     * after g_hash_table_iter_next() returned <code>true</code>  and cannot
     * be called more than once for the same key/value pair.
     */
    public void steal() {
        gtk_h.g_hash_table_iter_steal(handle());
    }
    
}
