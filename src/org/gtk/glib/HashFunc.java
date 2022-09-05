package org.gtk.glib;

@FunctionalInterface
public interface HashFunc {

    /**
     * Specifies the type of the hash function which is passed to
     * g_hash_table_new() when a #GHashTable is created.
     * 
     * The function is passed a key and should return a #guint hash value.
     * The functions g_direct_hash(), g_int_hash() and g_str_hash() provide
     * hash functions which can be used when the key is a #gpointer, #gint*,
     * and #gchar* respectively.
     * 
     * g_direct_hash() is also the appropriate hash function for keys
     * of the form `GINT_TO_POINTER (n)` (or similar macros).
     * 
     * A good hash functions should produce
     * hash values that are evenly distributed over a fairly large range.
     * The modulus is taken with the hash table size (a prime number) to
     * find the 'bucket' to place each key into. The function should also
     * be very fast, since it is called for each key lookup.
     * 
     * Note that the hash functions provided by GLib have these qualities,
     * but are not particularly robust against manufactured keys that
     * cause hash collisions. Therefore, you should consider choosing
     * a more secure hash function when using a GHashTable with keys
     * that originate in untrusted data (such as HTTP requests).
     * Using g_str_hash() in that situation might make your application
     * vulnerable to
     * [Algorithmic Complexity Attacks](https://lwn.net/Articles/474912/).
     * 
     * The key to choosing a good hash is unpredictability.  Even
     * cryptographic hashes are very easy to find collisions for when the
     * remainder is taken modulo a somewhat predictable prime number.  There
     * must be an element of randomness that an attacker is unable to guess.
     */
    public int onHashFunc(jdk.incubator.foreign.MemoryAddress key);
}
