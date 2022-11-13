package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A type for representing D-Bus messages that can be sent or received
 * on a {@link DBusConnection}.
 * @version 2.26
 */
public class DBusMessage extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMessage";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DBusMessage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusMessage(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DBusMessage if its GType is a (or inherits from) "GDBusMessage".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DBusMessage} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GDBusMessage", a ClassCastException will be thrown.
     */
    public static DBusMessage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GDBusMessage"))) {
            return new DBusMessage(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GDBusMessage");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty {@link DBusMessage}.
     */
    public DBusMessage() {
        super(constructNew(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromBlob(@NotNull byte[] blob, long blobLen, @NotNull org.gtk.gio.DBusCapabilityFlags capabilities) throws GErrorException {
        java.util.Objects.requireNonNull(blob, "Parameter 'blob' must not be null");
        java.util.Objects.requireNonNull(capabilities, "Parameter 'capabilities' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_from_blob.invokeExact(
                    Interop.allocateNativeArray(blob, false),
                    blobLen,
                    capabilities.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusMessage} from the data stored at {@code blob}. The byte
     * order that the message was in can be retrieved using
     * g_dbus_message_get_byte_order().
     * <p>
     * If the {@code blob} cannot be parsed, contains invalid fields, or contains invalid
     * headers, {@link IOErrorEnum#INVALID_ARGUMENT} will be returned.
     * @param blob A blob representing a binary D-Bus message.
     * @param blobLen The length of {@code blob}.
     * @param capabilities A {@link DBusCapabilityFlags} describing what protocol features are supported.
     * @return A new {@link DBusMessage} or {@code null} if {@code error} is set. Free with
     * g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusMessage newFromBlob(@NotNull byte[] blob, long blobLen, @NotNull org.gtk.gio.DBusCapabilityFlags capabilities) throws GErrorException {
        return new DBusMessage(constructNewFromBlob(blob, blobLen, capabilities), Ownership.FULL);
    }
    
    private static Addressable constructNewMethodCall(@Nullable java.lang.String name, @NotNull java.lang.String path, @Nullable java.lang.String interface_, @NotNull java.lang.String method) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_method_call.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    Interop.allocateNativeString(path),
                    (Addressable) (interface_ == null ? MemoryAddress.NULL : Interop.allocateNativeString(interface_)),
                    Interop.allocateNativeString(method));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusMessage} for a method call.
     * @param name A valid D-Bus name or {@code null}.
     * @param path A valid object path.
     * @param interface_ A valid D-Bus interface name or {@code null}.
     * @param method A valid method name.
     * @return A {@link DBusMessage}. Free with g_object_unref().
     */
    public static DBusMessage newMethodCall(@Nullable java.lang.String name, @NotNull java.lang.String path, @Nullable java.lang.String interface_, @NotNull java.lang.String method) {
        return new DBusMessage(constructNewMethodCall(name, path, interface_, method), Ownership.FULL);
    }
    
    private static Addressable constructNewSignal(@NotNull java.lang.String path, @NotNull java.lang.String interface_, @NotNull java.lang.String signal) {
        java.util.Objects.requireNonNull(path, "Parameter 'path' must not be null");
        java.util.Objects.requireNonNull(interface_, "Parameter 'interface_' must not be null");
        java.util.Objects.requireNonNull(signal, "Parameter 'signal' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_signal.invokeExact(
                    Interop.allocateNativeString(path),
                    Interop.allocateNativeString(interface_),
                    Interop.allocateNativeString(signal));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link DBusMessage} for a signal emission.
     * @param path A valid object path.
     * @param interface_ A valid D-Bus interface name.
     * @param signal A valid signal name.
     * @return A {@link DBusMessage}. Free with g_object_unref().
     */
    public static DBusMessage newSignal(@NotNull java.lang.String path, @NotNull java.lang.String interface_, @NotNull java.lang.String signal) {
        return new DBusMessage(constructNewSignal(path, interface_, signal), Ownership.FULL);
    }
    
    /**
     * Copies {@code message}. The copy is a deep copy and the returned
     * {@link DBusMessage} is completely identical except that it is guaranteed
     * to not be locked.
     * <p>
     * This operation can fail if e.g. {@code message} contains file descriptors
     * and the per-process or system-wide open files limit is reached.
     * @return A new {@link DBusMessage} or {@code null} if {@code error} is set.
     *     Free with g_object_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull org.gtk.gio.DBusMessage copy() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_copy.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.DBusMessage(RESULT, Ownership.FULL);
    }
    
    /**
     * Convenience to get the first item in the body of {@code message}.
     * @return The string item or {@code null} if the first item in the body of
     * {@code message} is not a string.
     */
    public @Nullable java.lang.String getArg0() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_arg0.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the body of a message.
     * @return A {@link org.gtk.glib.Variant} or {@code null} if the body is
     * empty. Do not free, it is owned by {@code message}.
     */
    public @Nullable org.gtk.glib.Variant getBody() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_body.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the byte order of {@code message}.
     * @return The byte order.
     */
    public @NotNull org.gtk.gio.DBusMessageByteOrder getByteOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_byte_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessageByteOrder(RESULT);
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#DESTINATION} header field.
     * @return The value.
     */
    public @Nullable java.lang.String getDestination() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_destination.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#ERROR_NAME} header field.
     * @return The value.
     */
    public @Nullable java.lang.String getErrorName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_error_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the flags for {@code message}.
     * @return Flags that are set (typically values from the {@link DBusMessageFlags} enumeration bitwise ORed together).
     */
    public @NotNull org.gtk.gio.DBusMessageFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessageFlags(RESULT);
    }
    
    /**
     * Gets a header field on {@code message}.
     * <p>
     * The caller is responsible for checking the type of the returned {@link org.gtk.glib.Variant}
     * matches what is expected.
     * @param headerField A 8-bit unsigned integer (typically a value from the {@link DBusMessageHeaderField} enumeration)
     * @return A {@link org.gtk.glib.Variant} with the value if the header was found, {@code null}
     * otherwise. Do not free, it is owned by {@code message}.
     */
    public @Nullable org.gtk.glib.Variant getHeader(@NotNull org.gtk.gio.DBusMessageHeaderField headerField) {
        java.util.Objects.requireNonNull(headerField, "Parameter 'headerField' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_header.invokeExact(
                    handle(),
                    headerField.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets an array of all header fields on {@code message} that are set.
     * @return An array of header fields
     * terminated by {@link DBusMessageHeaderField#INVALID}.  Each element
     * is a {@code guchar}. Free with g_free().
     */
    public @NotNull PointerByte getHeaderFields() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_header_fields.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerByte(RESULT);
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#INTERFACE} header field.
     * @return The value.
     */
    public @Nullable java.lang.String getInterface() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_interface.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks whether {@code message} is locked. To monitor changes to this
     * value, conncet to the {@link org.gtk.gobject.Object}::notify signal to listen for changes
     * on the {@link DBusMessage}:locked property.
     * @return {@code true} if {@code message} is locked, {@code false} otherwise.
     */
    public boolean getLocked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_locked.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#MEMBER} header field.
     * @return The value.
     */
    public @Nullable java.lang.String getMember() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_member.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the type of {@code message}.
     * @return A 8-bit unsigned integer (typically a value from the {@link DBusMessageType} enumeration).
     */
    public @NotNull org.gtk.gio.DBusMessageType getMessageType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_message_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessageType(RESULT);
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#NUM_UNIX_FDS} header field.
     * @return The value.
     */
    public int getNumUnixFds() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_num_unix_fds.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#PATH} header field.
     * @return The value.
     */
    public @Nullable java.lang.String getPath() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_path.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#REPLY_SERIAL} header field.
     * @return The value.
     */
    public int getReplySerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_reply_serial.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#SENDER} header field.
     * @return The value.
     */
    public @Nullable java.lang.String getSender() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_sender.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the serial for {@code message}.
     * @return A {@code guint32}.
     */
    public int getSerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_get_serial.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#SIGNATURE} header field.
     * <p>
     * This will always be non-{@code null}, but may be an empty string.
     * @return The value.
     */
    public @NotNull java.lang.String getSignature() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_signature.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the UNIX file descriptors associated with {@code message}, if any.
     * <p>
     * This method is only available on UNIX.
     * <p>
     * The file descriptors normally correspond to {@code G_VARIANT_TYPE_HANDLE}
     * values in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by
     * {@code g_unix_fd_list_get (list, 5, ...)}.
     * @return A {@link UnixFDList} or {@code null} if no file descriptors are
     * associated. Do not free, this object is owned by {@code message}.
     */
    public @Nullable org.gtk.gio.UnixFDList getUnixFdList() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_get_unix_fd_list.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.UnixFDList(RESULT, Ownership.NONE);
    }
    
    /**
     * If {@code message} is locked, does nothing. Otherwise locks the message.
     */
    public void lock() {
        try {
            DowncallHandles.g_dbus_message_lock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusMessage} that is an error reply to {@code method_call_message}.
     * @param errorName A valid D-Bus error name.
     * @param errorMessageFormat The D-Bus error message in a printf() format.
     * @param varargs Arguments for {@code error_message_format}.
     * @return A {@link DBusMessage}. Free with g_object_unref().
     */
    public @NotNull org.gtk.gio.DBusMessage newMethodError(@NotNull java.lang.String errorName, @NotNull java.lang.String errorMessageFormat, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(errorName, "Parameter 'errorName' must not be null");
        java.util.Objects.requireNonNull(errorMessageFormat, "Parameter 'errorMessageFormat' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_method_error.invokeExact(
                    handle(),
                    Interop.allocateNativeString(errorName),
                    Interop.allocateNativeString(errorMessageFormat),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessage(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link DBusMessage} that is an error reply to {@code method_call_message}.
     * @param errorName A valid D-Bus error name.
     * @param errorMessage The D-Bus error message.
     * @return A {@link DBusMessage}. Free with g_object_unref().
     */
    public @NotNull org.gtk.gio.DBusMessage newMethodErrorLiteral(@NotNull java.lang.String errorName, @NotNull java.lang.String errorMessage) {
        java.util.Objects.requireNonNull(errorName, "Parameter 'errorName' must not be null");
        java.util.Objects.requireNonNull(errorMessage, "Parameter 'errorMessage' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_method_error_literal.invokeExact(
                    handle(),
                    Interop.allocateNativeString(errorName),
                    Interop.allocateNativeString(errorMessage));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessage(RESULT, Ownership.FULL);
    }
    
    /**
     * Like g_dbus_message_new_method_error() but intended for language bindings.
     * @param errorName A valid D-Bus error name.
     * @param errorMessageFormat The D-Bus error message in a printf() format.
     * @param varArgs Arguments for {@code error_message_format}.
     * @return A {@link DBusMessage}. Free with g_object_unref().
     */
    public @NotNull org.gtk.gio.DBusMessage newMethodErrorValist(@NotNull java.lang.String errorName, @NotNull java.lang.String errorMessageFormat, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(errorName, "Parameter 'errorName' must not be null");
        java.util.Objects.requireNonNull(errorMessageFormat, "Parameter 'errorMessageFormat' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_method_error_valist.invokeExact(
                    handle(),
                    Interop.allocateNativeString(errorName),
                    Interop.allocateNativeString(errorMessageFormat),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessage(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link DBusMessage} that is a reply to {@code method_call_message}.
     * @return {@link DBusMessage}. Free with g_object_unref().
     */
    public @NotNull org.gtk.gio.DBusMessage newMethodReply() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_new_method_reply.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMessage(RESULT, Ownership.FULL);
    }
    
    /**
     * Produces a human-readable multi-line description of {@code message}.
     * <p>
     * The contents of the description has no ABI guarantees, the contents
     * and formatting is subject to change at any time. Typical output
     * looks something like this:
     * <pre>{@code 
     * Flags:   none
     * Version: 0
     * Serial:  4
     * Headers:
     *   path -> objectpath '/org/gtk/GDBus/TestObject'
     *   interface -> 'org.gtk.GDBus.TestInterface'
     *   member -> 'GimmeStdout'
     *   destination -> ':1.146'
     * Body: ()
     * UNIX File Descriptors:
     *   (none)
     * }</pre>
     * or
     * <pre>{@code 
     * Flags:   no-reply-expected
     * Version: 0
     * Serial:  477
     * Headers:
     *   reply-serial -> uint32 4
     *   destination -> ':1.159'
     *   sender -> ':1.146'
     *   num-unix-fds -> uint32 1
     * Body: ()
     * UNIX File Descriptors:
     *   fd 12: dev=0:10,mode=020620,ino=5,uid=500,gid=5,rdev=136:2,size=0,atime=1273085037,mtime=1273085851,ctime=1272982635
     * }</pre>
     * @param indent Indentation level.
     * @return A string that should be freed with g_free().
     */
    public @NotNull java.lang.String print(int indent) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_print.invokeExact(
                    handle(),
                    indent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Sets the body {@code message}. As a side-effect the
     * {@link DBusMessageHeaderField#SIGNATURE} header field is set to the
     * type string of {@code body} (or cleared if {@code body} is {@code null}).
     * <p>
     * If {@code body} is floating, {@code message} assumes ownership of {@code body}.
     * @param body Either {@code null} or a {@link org.gtk.glib.Variant} that is a tuple.
     */
    public void setBody(@NotNull org.gtk.glib.Variant body) {
        java.util.Objects.requireNonNull(body, "Parameter 'body' must not be null");
        try {
            DowncallHandles.g_dbus_message_set_body.invokeExact(
                    handle(),
                    body.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the byte order of {@code message}.
     * @param byteOrder The byte order.
     */
    public void setByteOrder(@NotNull org.gtk.gio.DBusMessageByteOrder byteOrder) {
        java.util.Objects.requireNonNull(byteOrder, "Parameter 'byteOrder' must not be null");
        try {
            DowncallHandles.g_dbus_message_set_byte_order.invokeExact(
                    handle(),
                    byteOrder.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#DESTINATION} header field.
     * @param value The value to set.
     */
    public void setDestination(@Nullable java.lang.String value) {
        try {
            DowncallHandles.g_dbus_message_set_destination.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#ERROR_NAME} header field.
     * @param value The value to set.
     */
    public void setErrorName(@NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_dbus_message_set_error_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flags to set on {@code message}.
     * @param flags Flags for {@code message} that are set (typically values from the {@link DBusMessageFlags}
     * enumeration bitwise ORed together).
     */
    public void setFlags(@NotNull org.gtk.gio.DBusMessageFlags flags) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        try {
            DowncallHandles.g_dbus_message_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a header field on {@code message}.
     * <p>
     * If {@code value} is floating, {@code message} assumes ownership of {@code value}.
     * @param headerField A 8-bit unsigned integer (typically a value from the {@link DBusMessageHeaderField} enumeration)
     * @param value A {@link org.gtk.glib.Variant} to set the header field or {@code null} to clear the header field.
     */
    public void setHeader(@NotNull org.gtk.gio.DBusMessageHeaderField headerField, @Nullable org.gtk.glib.Variant value) {
        java.util.Objects.requireNonNull(headerField, "Parameter 'headerField' must not be null");
        try {
            DowncallHandles.g_dbus_message_set_header.invokeExact(
                    handle(),
                    headerField.getValue(),
                    (Addressable) (value == null ? MemoryAddress.NULL : value.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#INTERFACE} header field.
     * @param value The value to set.
     */
    public void setInterface(@Nullable java.lang.String value) {
        try {
            DowncallHandles.g_dbus_message_set_interface.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#MEMBER} header field.
     * @param value The value to set.
     */
    public void setMember(@Nullable java.lang.String value) {
        try {
            DowncallHandles.g_dbus_message_set_member.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code message} to be of {@code type}.
     * @param type A 8-bit unsigned integer (typically a value from the {@link DBusMessageType} enumeration).
     */
    public void setMessageType(@NotNull org.gtk.gio.DBusMessageType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.g_dbus_message_set_message_type.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#NUM_UNIX_FDS} header field.
     * @param value The value to set.
     */
    public void setNumUnixFds(int value) {
        try {
            DowncallHandles.g_dbus_message_set_num_unix_fds.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#PATH} header field.
     * @param value The value to set.
     */
    public void setPath(@Nullable java.lang.String value) {
        try {
            DowncallHandles.g_dbus_message_set_path.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#REPLY_SERIAL} header field.
     * @param value The value to set.
     */
    public void setReplySerial(int value) {
        try {
            DowncallHandles.g_dbus_message_set_reply_serial.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#SENDER} header field.
     * @param value The value to set.
     */
    public void setSender(@Nullable java.lang.String value) {
        try {
            DowncallHandles.g_dbus_message_set_sender.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the serial for {@code message}.
     * @param serial A {@code guint32}.
     */
    public void setSerial(int serial) {
        try {
            DowncallHandles.g_dbus_message_set_serial.invokeExact(
                    handle(),
                    serial);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#SIGNATURE} header field.
     * @param value The value to set.
     */
    public void setSignature(@Nullable java.lang.String value) {
        try {
            DowncallHandles.g_dbus_message_set_signature.invokeExact(
                    handle(),
                    (Addressable) (value == null ? MemoryAddress.NULL : Interop.allocateNativeString(value)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the UNIX file descriptors associated with {@code message}. As a
     * side-effect the {@link DBusMessageHeaderField#NUM_UNIX_FDS} header
     * field is set to the number of fds in {@code fd_list} (or cleared if
     * {@code fd_list} is {@code null}).
     * <p>
     * This method is only available on UNIX.
     * <p>
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced by a value of type
     * {@code G_VARIANT_TYPE_HANDLE} in the body of the message.
     * @param fdList A {@link UnixFDList} or {@code null}.
     */
    public void setUnixFdList(@Nullable org.gtk.gio.UnixFDList fdList) {
        try {
            DowncallHandles.g_dbus_message_set_unix_fd_list.invokeExact(
                    handle(),
                    (Addressable) (fdList == null ? MemoryAddress.NULL : fdList.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serializes {@code message} to a blob. The byte order returned by
     * g_dbus_message_get_byte_order() will be used.
     * @param outSize Return location for size of generated blob.
     * @param capabilities A {@link DBusCapabilityFlags} describing what protocol features are supported.
     * @return A pointer to a
     * valid binary D-Bus message of {@code out_size} bytes generated by {@code message}
     * or {@code null} if {@code error} is set. Free with g_free().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull byte[] toBlob(Out<Long> outSize, @NotNull org.gtk.gio.DBusCapabilityFlags capabilities) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(outSize, "Parameter 'outSize' must not be null");
        java.util.Objects.requireNonNull(capabilities, "Parameter 'capabilities' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment outSizePOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_message_to_blob.invokeExact(
                    handle(),
                    (Addressable) outSizePOINTER.address(),
                    capabilities.getValue(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        outSize.set(outSizePOINTER.get(ValueLayout.JAVA_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), outSize.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
    /**
     * If {@code message} is not of type {@link DBusMessageType#ERROR} does
     * nothing and returns {@code false}.
     * <p>
     * Otherwise this method encodes the error in {@code message} as a {@link org.gtk.glib.Error}
     * using g_dbus_error_set_dbus_error() using the information in the
     * {@link DBusMessageHeaderField#ERROR_NAME} header field of {@code message} as
     * well as the first string item in {@code message}'s body.
     * @return {@code true} if {@code error} was set, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean toGerror() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_dbus_message_to_gerror.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Utility function to calculate how many bytes are needed to
     * completely deserialize the D-Bus message stored at {@code blob}.
     * @param blob A blob representing a binary D-Bus message.
     * @param blobLen The length of {@code blob} (must be at least 16).
     * @return Number of bytes needed or -1 if {@code error} is set (e.g. if
     * {@code blob} contains invalid data or not enough data is available to
     * determine the size).
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static long bytesNeeded(@NotNull byte[] blob, long blobLen) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(blob, "Parameter 'blob' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_dbus_message_bytes_needed.invokeExact(
                    Interop.allocateNativeArray(blob, false),
                    blobLen,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_message_new = Interop.downcallHandle(
            "g_dbus_message_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_new_from_blob = Interop.downcallHandle(
            "g_dbus_message_new_from_blob",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_new_method_call = Interop.downcallHandle(
            "g_dbus_message_new_method_call",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_new_signal = Interop.downcallHandle(
            "g_dbus_message_new_signal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_copy = Interop.downcallHandle(
            "g_dbus_message_copy",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_arg0 = Interop.downcallHandle(
            "g_dbus_message_get_arg0",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_body = Interop.downcallHandle(
            "g_dbus_message_get_body",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_byte_order = Interop.downcallHandle(
            "g_dbus_message_get_byte_order",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_destination = Interop.downcallHandle(
            "g_dbus_message_get_destination",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_error_name = Interop.downcallHandle(
            "g_dbus_message_get_error_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_flags = Interop.downcallHandle(
            "g_dbus_message_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_header = Interop.downcallHandle(
            "g_dbus_message_get_header",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_header_fields = Interop.downcallHandle(
            "g_dbus_message_get_header_fields",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_interface = Interop.downcallHandle(
            "g_dbus_message_get_interface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_locked = Interop.downcallHandle(
            "g_dbus_message_get_locked",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_member = Interop.downcallHandle(
            "g_dbus_message_get_member",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_message_type = Interop.downcallHandle(
            "g_dbus_message_get_message_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_num_unix_fds = Interop.downcallHandle(
            "g_dbus_message_get_num_unix_fds",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_path = Interop.downcallHandle(
            "g_dbus_message_get_path",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_reply_serial = Interop.downcallHandle(
            "g_dbus_message_get_reply_serial",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_sender = Interop.downcallHandle(
            "g_dbus_message_get_sender",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_serial = Interop.downcallHandle(
            "g_dbus_message_get_serial",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_signature = Interop.downcallHandle(
            "g_dbus_message_get_signature",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_get_unix_fd_list = Interop.downcallHandle(
            "g_dbus_message_get_unix_fd_list",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_lock = Interop.downcallHandle(
            "g_dbus_message_lock",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_new_method_error = Interop.downcallHandle(
            "g_dbus_message_new_method_error",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_dbus_message_new_method_error_literal = Interop.downcallHandle(
            "g_dbus_message_new_method_error_literal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_new_method_error_valist = Interop.downcallHandle(
            "g_dbus_message_new_method_error_valist",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_new_method_reply = Interop.downcallHandle(
            "g_dbus_message_new_method_reply",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_print = Interop.downcallHandle(
            "g_dbus_message_print",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_body = Interop.downcallHandle(
            "g_dbus_message_set_body",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_byte_order = Interop.downcallHandle(
            "g_dbus_message_set_byte_order",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_destination = Interop.downcallHandle(
            "g_dbus_message_set_destination",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_error_name = Interop.downcallHandle(
            "g_dbus_message_set_error_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_flags = Interop.downcallHandle(
            "g_dbus_message_set_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_header = Interop.downcallHandle(
            "g_dbus_message_set_header",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_interface = Interop.downcallHandle(
            "g_dbus_message_set_interface",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_member = Interop.downcallHandle(
            "g_dbus_message_set_member",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_message_type = Interop.downcallHandle(
            "g_dbus_message_set_message_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_num_unix_fds = Interop.downcallHandle(
            "g_dbus_message_set_num_unix_fds",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_path = Interop.downcallHandle(
            "g_dbus_message_set_path",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_reply_serial = Interop.downcallHandle(
            "g_dbus_message_set_reply_serial",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_sender = Interop.downcallHandle(
            "g_dbus_message_set_sender",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_serial = Interop.downcallHandle(
            "g_dbus_message_set_serial",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_signature = Interop.downcallHandle(
            "g_dbus_message_set_signature",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_set_unix_fd_list = Interop.downcallHandle(
            "g_dbus_message_set_unix_fd_list",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_to_blob = Interop.downcallHandle(
            "g_dbus_message_to_blob",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_to_gerror = Interop.downcallHandle(
            "g_dbus_message_to_gerror",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_message_bytes_needed = Interop.downcallHandle(
            "g_dbus_message_bytes_needed",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
    }
}
