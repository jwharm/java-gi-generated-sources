package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the hash function which is passed to
 * g_hash_table_new() when a {@link HashTable} is created.
 * <p>
 * The function is passed a key and should return a {@code guint} hash value.
 * The functions g_direct_hash(), g_int_hash() and g_str_hash() provide
 * hash functions which can be used when the key is a {@code gpointer}, {@code gint}*,
 * and {@code gchar}* respectively.
 * <p>
 * g_direct_hash() is also the appropriate hash function for keys
 * of the form {@code GINT_TO_POINTER (n)} (or similar macros).
 * <p>
 * A good hash functions should produce
 * hash values that are evenly distributed over a fairly large range.
 * The modulus is taken with the hash table size (a prime number) to
 * find the 'bucket' to place each key into. The function should also
 * be very fast, since it is called for each key lookup.
 * <p>
 * Note that the hash functions provided by GLib have these qualities,
 * but are not particularly robust against manufactured keys that
 * cause hash collisions. Therefore, you should consider choosing
 * a more secure hash function when using a GHashTable with keys
 * that originate in untrusted data (such as HTTP requests).
 * Using g_str_hash() in that situation might make your application
 * vulnerable to
 * <a href="https://lwn.net/Articles/474912/">Algorithmic Complexity Attacks</a>.
 * <p>
 * The key to choosing a good hash is unpredictability.  Even
 * cryptographic hashes are very easy to find collisions for when the
 * remainder is taken modulo a somewhat predictable prime number.  There
 * must be an element of randomness that an attacker is unable to guess.
 */
@FunctionalInterface
public interface HashFunc {
        int onHashFunc(@Nullable java.lang.foreign.MemoryAddress key);
}
