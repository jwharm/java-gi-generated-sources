package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link SettingsBackend} interface defines a generic interface for
 * non-strictly-typed data that is stored in a hierarchy. To implement
 * an alternative storage backend for {@link Settings}, you need to implement
 * the {@link SettingsBackend} interface and then make it implement the
 * extension point {@code G_SETTINGS_BACKEND_EXTENSION_POINT_NAME}.
 * <p>
 * The interface defines methods for reading and writing values, a
 * method for determining if writing of certain values will fail
 * (lockdown) and a change notification mechanism.
 * <p>
 * The semantics of the interface are very precisely defined and
 * implementations must carefully adhere to the expectations of
 * callers that are documented on each of the interface methods.
 * <p>
 * Some of the {@link SettingsBackend} functions accept or return a {@link org.gtk.glib.Tree}.
 * These trees always have strings as keys and {@link org.gtk.glib.Variant} as values.
 * g_settings_backend_create_tree() is a convenience function to create
 * suitable trees.
 * <p>
 * The {@link SettingsBackend} API is exported to allow third-party
 * implementations, but does not carry the same stability guarantees
 * as the public GIO API. For this reason, you have to define the
 * C preprocessor symbol {@code G_SETTINGS_ENABLE_BACKEND} before including
 * {@code gio/gsettingsbackend.h}.
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
     * <p>
     * {@code key} must be a valid key (ie starting with a slash, not containing
     * '//', and not ending with a slash).
     * <p>
     * The implementation must call this function during any call to
     * g_settings_backend_write(), before the call returns (except in the
     * case that no keys are actually changed and it cares to detect this
     * fact).  It may not rely on the existence of a mainloop for
     * dispatching the signal later.
     * <p>
     * The implementation may call this function at any other time it likes
     * in response to other events (such as changes occurring outside of the
     * program).  These calls may originate from a mainloop or may originate
     * in response to any other action (including from calls to
     * g_settings_backend_write()).
     * <p>
     * In the case that this call is in response to a call to
     * g_settings_backend_write() then {@code origin_tag} must be set to the same
     * value that was passed to that call.
     */
    public void changed(java.lang.String key, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_changed(handle(), Interop.allocateNativeString(key).handle(), originTag);
    }
    
    /**
     * This call is a convenience wrapper.  It gets the list of changes from
     * {@code tree}, computes the longest common prefix and calls
     * g_settings_backend_changed().
     */
    public void changedTree(org.gtk.glib.Tree tree, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_changed_tree(handle(), tree.handle(), originTag);
    }
    
    /**
     * Signals that a list of keys have possibly changed.  Backend
     * implementations should call this if keys have possibly changed their
     * values.
     * <p>
     * {@code path} must be a valid path (ie starting and ending with a slash and
     * not containing '//').  Each string in {@code items} must form a valid key
     * name when {@code path} is prefixed to it (ie: each item must not start or
     * end with '/' and must not contain '//').
     * <p>
     * The meaning of this signal is that any of the key names resulting
     * from the contatenation of {@code path} with each item in {@code items} may have
     * changed.
     * <p>
     * The same rules for when notifications must occur apply as per
     * g_settings_backend_changed().  These two calls can be used
     * interchangeably if exactly one item has changed (although in that
     * case g_settings_backend_changed() is definitely preferred).
     * <p>
     * For efficiency reasons, the implementation should strive for {@code path} to
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
     * <p>
     * {@code path} must be a valid path (ie starting and ending with a slash and
     * not containing '//').
     * <p>
     * The meaning of this signal is that any of the key which has a name
     * starting with {@code path} may have changed.
     * <p>
     * The same rules for when notifications must occur apply as per
     * g_settings_backend_changed().  This call might be an appropriate
     * reasponse to a 'reset' call but implementations are also free to
     * explicitly list the keys that were affected by that call if they can
     * easily do so.
     * <p>
     * For efficiency reasons, the implementation should strive for {@code path} to
     * be as long as possible (ie: the longest common prefix of all of the
     * keys that were changed) but this is not strictly required.  As an
     * example, if this function is called with the path of "/" then every
     * single key in the application will be notified of a possible change.
     */
    public void pathChanged(java.lang.String path, jdk.incubator.foreign.MemoryAddress originTag) {
        gtk_h.g_settings_backend_path_changed(handle(), Interop.allocateNativeString(path).handle(), originTag);
    }
    
    /**
     * Signals that the writability of all keys below a given path may have
     * changed.
     * <p>
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     */
    public void pathWritableChanged(java.lang.String path) {
        gtk_h.g_settings_backend_path_writable_changed(handle(), Interop.allocateNativeString(path).handle());
    }
    
    /**
     * Signals that the writability of a single key has possibly changed.
     * <p>
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
     * <p>
     * You must free the value returned in {@code path}, {@code keys} and {@code values} using
     * g_free().  You should not attempt to free or unref the contents of
     * {@code keys} or {@code values}.
     */
    public static void flattenTree(org.gtk.glib.Tree tree, java.lang.String[] path, java.lang.String[] keys, org.gtk.glib.Variant[] values) {
        gtk_h.g_settings_backend_flatten_tree(tree.handle(), Interop.allocateNativeArray(path).handle(), Interop.allocateNativeArray(keys).handle(), Interop.allocateNativeArray(values).handle());
    }
    
    /**
     * Returns the default {@link SettingsBackend}. It is possible to override
     * the default by setting the {@code GSETTINGS_BACKEND} environment variable
     * to the name of a settings backend.
     * <p>
     * The user gets a reference to the backend.
     */
    public static SettingsBackend getDefault() {
        var RESULT = gtk_h.g_settings_backend_get_default();
        return new SettingsBackend(References.get(RESULT, true));
    }
    
}
