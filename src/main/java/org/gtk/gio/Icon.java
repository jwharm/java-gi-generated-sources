package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Icon} is a very minimal interface for icons. It provides functions
 * for checking the equality of two icons, hashing of icons and
 * serializing an icon to and from strings.
 * <p>
 * {@link Icon} does not provide the actual pixmap for the icon as this is out
 * of GIO's scope, however implementations of {@link Icon} may contain the name
 * of an icon (see {@link ThemedIcon}), or the path to an icon (see {@link LoadableIcon}).
 * <p>
 * To obtain a hash of a {@link Icon}, see g_icon_hash().
 * <p>
 * To check if two {@code GIcons} are equal, see g_icon_equal().
 * <p>
 * For serializing a {@link Icon}, use g_icon_serialize() and
 * g_icon_deserialize().
 * <p>
 * If you want to consume {@link Icon} (for example, in a toolkit) you must
 * be prepared to handle at least the three following cases:
 * {@link LoadableIcon}, {@link ThemedIcon} and {@link EmblemedIcon}.  It may also make
 * sense to have fast-paths for other cases (like handling {@code GdkPixbuf}
 * directly, for example) but all compliant {@link Icon} implementations
 * outside of GIO must implement {@link LoadableIcon}.
 * <p>
 * If your application or library provides one or more {@link Icon}
 * implementations you need to ensure that your new implementation also
 * implements {@link LoadableIcon}.  Additionally, you must provide an
 * implementation of g_icon_serialize() that gives a result that is
 * understood by g_icon_deserialize(), yielding one of the built-in icon
 * types.
 */
public interface Icon extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, IconImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new IconImpl(input, ownership);
    
    /**
     * Checks if two icons are equal.
     * @param icon2 pointer to the second {@link Icon}.
     * @return {@code true} if {@code icon1} is equal to {@code icon2}. {@code false} otherwise.
     */
    default boolean equal(@Nullable org.gtk.gio.Icon icon2) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_icon_equal.invokeExact(
                    handle(),
                    (Addressable) (icon2 == null ? MemoryAddress.NULL : icon2.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Serializes a {@link Icon} into a {@link org.gtk.glib.Variant}. An equivalent {@link Icon} can be retrieved
     * back by calling g_icon_deserialize() on the returned value.
     * As serialization will avoid using raw icon data when possible, it only
     * makes sense to transfer the {@link org.gtk.glib.Variant} between processes on the same machine,
     * (as opposed to over the network), and within the same file system namespace.
     * @return a {@link org.gtk.glib.Variant}, or {@code null} when serialization fails. The {@link org.gtk.glib.Variant} will not be floating.
     */
    default @Nullable org.gtk.glib.Variant serialize() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_icon_serialize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Variant.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Generates a textual representation of {@code icon} that can be used for
     * serialization such as when passing {@code icon} to a different process or
     * saving it to persistent storage. Use g_icon_new_for_string() to
     * get {@code icon} back from the returned string.
     * <p>
     * The encoding of the returned string is proprietary to {@link Icon} except
     * in the following two cases
     * <ul>
     * <li>If {@code icon} is a {@link FileIcon}, the returned string is a native path
     *   (such as {@code /path/to/my icon.png}) without escaping
     *   if the {@link File} for {@code icon} is a native file.  If the file is not
     *   native, the returned string is the result of g_file_get_uri()
     *   (such as {@code sftp://path/to/my%20icon.png}).
     * </ul>
     * <ul>
     * <li>If {@code icon} is a {@link ThemedIcon} with exactly one name and no fallbacks,
     *   the encoding is simply the name (such as {@code network-server}).
     * </ul>
     * @return An allocated NUL-terminated UTF8 string or
     * {@code null} if {@code icon} can't be serialized. Use g_free() to free.
     */
    default @Nullable java.lang.String toString_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_icon_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_icon_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Deserializes a {@link Icon} previously serialized using g_icon_serialize().
     * @param value a {@link org.gtk.glib.Variant} created with g_icon_serialize()
     * @return a {@link Icon}, or {@code null} when deserialization fails.
     */
    public static @Nullable org.gtk.gio.Icon deserialize(org.gtk.glib.Variant value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_icon_deserialize.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a hash for an icon.
     * @param icon {@code gconstpointer} to an icon object.
     * @return a {@code guint} containing a hash for the {@code icon}, suitable for
     * use in a {@link org.gtk.glib.HashTable} or similar data structure.
     */
    public static int hash(java.lang.foreign.MemoryAddress icon) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_icon_hash.invokeExact(
                    (Addressable) icon);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Generate a {@link Icon} instance from {@code str}. This function can fail if
     * {@code str} is not valid - see g_icon_to_string() for discussion.
     * <p>
     * If your application or library provides one or more {@link Icon}
     * implementations you need to ensure that each {@link org.gtk.glib.Type} is registered
     * with the type system prior to calling g_icon_new_for_string().
     * @param str A string obtained via g_icon_to_string().
     * @return An object implementing the {@link Icon}
     *          interface or {@code null} if {@code error} is set.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static org.gtk.gio.Icon newForString(java.lang.String str) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_icon_new_for_string.invokeExact(
                    Marshal.stringToAddress.marshal(str, null),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_equal = Interop.downcallHandle(
            "g_icon_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_serialize = Interop.downcallHandle(
            "g_icon_serialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_to_string = Interop.downcallHandle(
            "g_icon_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_get_type = Interop.downcallHandle(
            "g_icon_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_deserialize = Interop.downcallHandle(
            "g_icon_deserialize",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_hash = Interop.downcallHandle(
            "g_icon_hash",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle g_icon_new_for_string = Interop.downcallHandle(
            "g_icon_new_for_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    class IconImpl extends org.gtk.gobject.GObject implements Icon {
        
        static {
            Gio.javagi$ensureInitialized();
        }
        
        public IconImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
