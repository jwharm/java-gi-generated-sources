package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class SettingsBackend extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsBackend";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a SettingsBackend proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SettingsBackend(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SettingsBackend> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SettingsBackend(input);
    
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
     * @param key the name of the key
     * @param originTag the origin tag
     */
    public void changed(java.lang.String key, @Nullable java.lang.foreign.MemoryAddress originTag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_backend_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE),
                        (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * This call is a convenience wrapper.  It gets the list of changes from
     * {@code tree}, computes the longest common prefix and calls
     * g_settings_backend_changed().
     * @param tree a {@link org.gtk.glib.Tree} containing the changes
     * @param originTag the origin tag
     */
    public void changedTree(org.gtk.glib.Tree tree, @Nullable java.lang.foreign.MemoryAddress originTag) {
        try {
            DowncallHandles.g_settings_backend_changed_tree.invokeExact(
                    handle(),
                    tree.handle(),
                    (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param path the path containing the changes
     * @param items the {@code null}-terminated list of changed keys
     * @param originTag the origin tag
     */
    public void keysChanged(java.lang.String path, java.lang.String[] items, @Nullable java.lang.foreign.MemoryAddress originTag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_backend_keys_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE),
                        Interop.allocateNativeArray(items, false, SCOPE),
                        (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param path the path containing the changes
     * @param originTag the origin tag
     */
    public void pathChanged(java.lang.String path, @Nullable java.lang.foreign.MemoryAddress originTag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_backend_path_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE),
                        (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Signals that the writability of all keys below a given path may have
     * changed.
     * <p>
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     * @param path the name of the path
     */
    public void pathWritableChanged(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_backend_path_writable_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(path, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Signals that the writability of a single key has possibly changed.
     * <p>
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     * @param key the name of the key
     */
    public void writableChanged(java.lang.String key) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_settings_backend_writable_changed.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(key, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_settings_backend_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Calculate the longest common prefix of all keys in a tree and write
     * out an array of the key names relative to that prefix and,
     * optionally, the value to store at each of those keys.
     * <p>
     * You must free the value returned in {@code path}, {@code keys} and {@code values} using
     * g_free().  You should not attempt to free or unref the contents of
     * {@code keys} or {@code values}.
     * @param tree a {@link org.gtk.glib.Tree} containing the changes
     * @param path the location to save the path
     * @param keys the
     *        location to save the relative keys
     * @param values the location to save the values, or {@code null}
     */
    public static void flattenTree(org.gtk.glib.Tree tree, Out<java.lang.String> path, java.lang.String[] keys, @Nullable org.gtk.glib.Variant[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment pathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.g_settings_backend_flatten_tree.invokeExact(
                        tree.handle(),
                        (Addressable) pathPOINTER.address(),
                        Interop.allocateNativeArray(keys, false, SCOPE),
                        (Addressable) (values == null ? MemoryAddress.NULL : Interop.allocateNativeArray(values, org.gtk.glib.Variant.getMemoryLayout(), false, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    path.set(Marshal.addressToString.marshal(pathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Returns the default {@link SettingsBackend}. It is possible to override
     * the default by setting the {@code GSETTINGS_BACKEND} environment variable
     * to the name of a settings backend.
     * <p>
     * The user gets a reference to the backend.
     * @return the default {@link SettingsBackend},
     *     which will be a dummy (memory) settings backend if no other settings
     *     backend is available.
     */
    public static org.gtk.gio.SettingsBackend getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_backend_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.SettingsBackend) Interop.register(RESULT, org.gtk.gio.SettingsBackend.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A {@link SettingsBackend.Builder} object constructs a {@link SettingsBackend} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SettingsBackend.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SettingsBackend} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SettingsBackend}.
         * @return A new instance of {@code SettingsBackend} with the properties 
         *         that were set in the Builder object.
         */
        public SettingsBackend build() {
            return (SettingsBackend) org.gtk.gobject.GObject.newWithProperties(
                SettingsBackend.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_settings_backend_changed = Interop.downcallHandle(
                "g_settings_backend_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_changed_tree = Interop.downcallHandle(
                "g_settings_backend_changed_tree",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_keys_changed = Interop.downcallHandle(
                "g_settings_backend_keys_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_path_changed = Interop.downcallHandle(
                "g_settings_backend_path_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_path_writable_changed = Interop.downcallHandle(
                "g_settings_backend_path_writable_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_writable_changed = Interop.downcallHandle(
                "g_settings_backend_writable_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_get_type = Interop.downcallHandle(
                "g_settings_backend_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_settings_backend_flatten_tree = Interop.downcallHandle(
                "g_settings_backend_flatten_tree",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_settings_backend_get_default = Interop.downcallHandle(
                "g_settings_backend_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.g_settings_backend_get_type != null;
    }
}
