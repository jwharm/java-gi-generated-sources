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
public class SettingsBackend extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSettingsBackend";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a SettingsBackend proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SettingsBackend(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SettingsBackend if its GType is a (or inherits from) "GSettingsBackend".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SettingsBackend} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GSettingsBackend", a ClassCastException will be thrown.
     */
    public static SettingsBackend castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), SettingsBackend.getType())) {
            return new SettingsBackend(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GSettingsBackend");
        }
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
     * @param key the name of the key
     * @param originTag the origin tag
     */
    public void changed(@NotNull java.lang.String key, @Nullable java.lang.foreign.MemoryAddress originTag) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.g_settings_backend_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key),
                    (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This call is a convenience wrapper.  It gets the list of changes from
     * {@code tree}, computes the longest common prefix and calls
     * g_settings_backend_changed().
     * @param tree a {@link org.gtk.glib.Tree} containing the changes
     * @param originTag the origin tag
     */
    public void changedTree(@NotNull org.gtk.glib.Tree tree, @Nullable java.lang.foreign.MemoryAddress originTag) {
        java.util.Objects.requireNonNull(tree, "Parameter 'tree' must not be null");
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
    public void keysChanged(@NotNull java.lang.String path, @NotNull java.lang.String[] items, @Nullable java.lang.foreign.MemoryAddress originTag) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(items, "Parameter 'items' must not be null");
        try {
            DowncallHandles.g_settings_backend_keys_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path),
                    Interop.allocateNativeArray(items, false),
                    (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void pathChanged(@NotNull java.lang.String path, @Nullable java.lang.foreign.MemoryAddress originTag) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.g_settings_backend_path_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path),
                    (Addressable) (originTag == null ? MemoryAddress.NULL : (Addressable) originTag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void pathWritableChanged(@NotNull java.lang.String path) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        try {
            DowncallHandles.g_settings_backend_path_writable_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(path));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Signals that the writability of a single key has possibly changed.
     * <p>
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     * @param key the name of the key
     */
    public void writableChanged(@NotNull java.lang.String key) {
        java.util.Objects.requireNonNull(key, "Parameter 'key' must not be null");
        try {
            DowncallHandles.g_settings_backend_writable_changed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(key));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static void flattenTree(@NotNull org.gtk.glib.Tree tree, @NotNull Out<java.lang.String> path, @NotNull Out<java.lang.String[]> keys, @NotNull Out<org.gtk.glib.Variant[]> values) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
    public static @NotNull org.gtk.gio.SettingsBackend getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_settings_backend_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.SettingsBackend(RESULT, Ownership.FULL);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link SettingsBackend.Build} object constructs a {@link SettingsBackend} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SettingsBackend} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SettingsBackend} using {@link SettingsBackend#castFrom}.
         * @return A new instance of {@code SettingsBackend} with the properties 
         *         that were set in the Build object.
         */
        public SettingsBackend construct() {
            return SettingsBackend.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SettingsBackend.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
