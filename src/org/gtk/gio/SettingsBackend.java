package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GSettingsBackend interface defines a generic interface for
 * non-strictly-typed data that is stored in a hierarchy. To implement
 * an alternative storage backend for #GSettings, you need to implement
 * the #GSettingsBackend interface and then make it implement the
 * extension point <code>G_SETTINGS_BACKEND_EXTENSION_POINT_NAME.
 * <p>
 * The</code> interface defines methods for reading and writing values, a
 * method for determining if writing of certain values will fail
 * (lockdown) and a change notification mechanism.
 * <p>
 * The semantics of the interface are very precisely defined and
 * implementations must carefully adhere to the expectations of
 * callers that are documented on each of the interface methods.
 * <p>
 * Some of the #GSettingsBackend functions accept or return a #GTree.
 * These trees always have strings as keys and #GVariant as values.
 * g_settings_backend_create_tree() is a convenience function to create
 * suitable trees.
 * <p>
 * The #GSettingsBackend API is exported to allow third-party
 * implementations, but does not carry the same stability guarantees
 * as the public GIO API. For this reason, you have to define the
 * C preprocessor symbol <code>G_SETTINGS_ENABLE_BACKEND</code> before including<code>gio/gsettingsbackend.h</code>.
 */
public class SettingsBackend extends org.gtk.gobject.Object {

    public SettingsBackend(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to SettingsBackend */
    public static SettingsBackend castFrom(org.gtk.gobject.Object gobject) {
        return new SettingsBackend(gobject.getReference());
    }
    
    /**
     * Signals that a single key has possibly changed.  Backend
     * implementations should call this if a key has possibly changed its
     * value.
     * 
     * @key must be a valid key (ie starting with a slash, not containing
     * &#39;//&#39;, and not ending with a slash).
     * 
     * The implementation must call this function during any call to
     * g_settings_backend_write(), before the call returns (except in the
     * case that no keys are actually changed and it cares to detect this
     * fact).  It may not rely on the existence of a mainloop for
     * dispatching the signal later.
     * 
     * The implementation may call this function at any other time it likes
     * in response to other events (such as changes occurring outside of the
     * program).  These calls may originate from a mainloop or may originate
     * in response to any other action (including from calls to
     * g_settings_backend_write()).
     * 
     * In the case that this call is in response to a call to
     * g_settings_backend_write() then @origin_tag must be set to the same
     * value that was passed to that call.
     */
    public void changed(java.lang.String key, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_changed(handle(), Interop.allocateNativeString(key).handle(), originTag);
    }
    
    /**
     * This call is a convenience wrapper.  It gets the list of changes from
     * @tree, computes the longest common prefix and calls
     * g_settings_backend_changed().
     */
    public void changedTree(org.gtk.glib.Tree tree, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_changed_tree(handle(), tree.handle(), originTag);
    }
    
    /**
     * Signals that a list of keys have possibly changed.  Backend
     * implementations should call this if keys have possibly changed their
     * values.
     * 
     * @path must be a valid path (ie starting and ending with a slash and
     * not containing &#39;//&#39;).  Each string in @items must form a valid key
     * name when @path is prefixed to it (ie: each item must not start or
     * end with &#39;/&#39; and must not contain &#39;//&#39;).
     * 
     * The meaning of this signal is that any of the key names resulting
     * from the contatenation of @path with each item in @items may have
     * changed.
     * 
     * The same rules for when notifications must occur apply as per
     * g_settings_backend_changed().  These two calls can be used
     * interchangeably if exactly one item has changed (although in that
     * case g_settings_backend_changed() is definitely preferred).
     * 
     * For efficiency reasons, the implementation should strive for @path to
     * be as long as possible (ie: the longest common prefix of all of the
     * keys that were changed) but this is not strictly required.
     */
    public void keysChanged(java.lang.String path, java.lang.String[] items, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_keys_changed(handle(), Interop.allocateNativeString(path).handle(), Interop.allocateNativeArray(items).handle(), originTag);
    }
    
    /**
     * Signals that all keys below a given path may have possibly changed.
     * Backend implementations should call this if an entire path of keys
     * have possibly changed their values.
     * 
     * @path must be a valid path (ie starting and ending with a slash and
     * not containing &#39;//&#39;).
     * 
     * The meaning of this signal is that any of the key which has a name
     * starting with @path may have changed.
     * 
     * The same rules for when notifications must occur apply as per
     * g_settings_backend_changed().  This call might be an appropriate
     * reasponse to a &#39;reset&#39; call but implementations are also free to
     * explicitly list the keys that were affected by that call if they can
     * easily do so.
     * 
     * For efficiency reasons, the implementation should strive for @path to
     * be as long as possible (ie: the longest common prefix of all of the
     * keys that were changed) but this is not strictly required.  As an
     * example, if this function is called with the path of &#34;/&#34; then every
     * single key in the application will be notified of a possible change.
     */
    public void pathChanged(java.lang.String path, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_path_changed(handle(), Interop.allocateNativeString(path).handle(), originTag);
    }
    
    /**
     * Signals that the writability of all keys below a given path may have
     * changed.
     * 
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     */
    public void pathWritableChanged(java.lang.String path) {
        gtk_h.g_settings_backend_path_writable_changed(handle(), Interop.allocateNativeString(path).handle());
    }
    
    /**
     * Signals that the writability of a single key has possibly changed.
     * 
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     */
    public void writableChanged(java.lang.String key) {
        gtk_h.g_settings_backend_writable_changed(handle(), Interop.allocateNativeString(key).handle());
    }
    
    /**
     * Calculate the longest common prefix of all keys in a tree and write
     * out an array of the key names relative to that prefix and,
     * optionally, the value to store at each of those keys.
     * 
     * You must free the value returned in @path, @keys and @values using
     * g_free().  You should not attempt to free or unref the contents of
     * @keys or @values.
     */
    public static void flattenTree(org.gtk.glib.Tree tree, java.lang.String[] path, java.lang.String[] keys, org.gtk.glib.Variant[] values) {
        gtk_h.g_settings_backend_flatten_tree(tree.handle(), Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(keys).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Returns the default #GSettingsBackend. It is possible to override
     * the default by setting the <code>GSETTINGS_BACKEND</code> environment variable
     * to the name of a settings backend.
     * 
     * The user gets a reference to the backend.
     */
    public static SettingsBackend getDefault() {
        var RESULT = gtk_h.g_settings_backend_get_default();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
}
