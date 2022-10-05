package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A type for representing D-Bus messages that can be sent or received
 * on a {@link DBusConnection}.
 */
public class DBusMessage extends org.gtk.gobject.Object {

    public DBusMessage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DBusMessage */
    public static DBusMessage castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMessage(gobject.refcounted());
    }
    
    static final MethodHandle g_dbus_message_new = Interop.downcallHandle(
        "g_dbus_message_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_message_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new empty {@link DBusMessage}.
     */
    public DBusMessage() {
        super(constructNew());
    }
    
    static final MethodHandle g_dbus_message_new_from_blob = Interop.downcallHandle(
        "g_dbus_message_new_from_blob",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewFromBlob(byte[] blob, long blobLen, DBusCapabilityFlags capabilities) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_message_new_from_blob.invokeExact(Interop.allocateNativeArray(blob).handle(), blobLen, capabilities.getValue(), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusMessage} from the data stored at {@code blob}. The byte
     * order that the message was in can be retrieved using
     * g_dbus_message_get_byte_order().
     * <p>
     * If the {@code blob} cannot be parsed, contains invalid fields, or contains invalid
     * headers, {@link IOErrorEnum#INVALID_ARGUMENT} will be returned.
     */
    public static DBusMessage newFromBlob(byte[] blob, long blobLen, DBusCapabilityFlags capabilities) throws GErrorException {
        return new DBusMessage(constructNewFromBlob(blob, blobLen, capabilities));
    }
    
    static final MethodHandle g_dbus_message_new_method_call = Interop.downcallHandle(
        "g_dbus_message_new_method_call",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewMethodCall(java.lang.String name, java.lang.String path, java.lang.String interface_, java.lang.String method) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_message_new_method_call.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(interface_).handle(), Interop.allocateNativeString(method).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusMessage} for a method call.
     */
    public static DBusMessage newMethodCall(java.lang.String name, java.lang.String path, java.lang.String interface_, java.lang.String method) {
        return new DBusMessage(constructNewMethodCall(name, path, interface_, method));
    }
    
    static final MethodHandle g_dbus_message_new_signal = Interop.downcallHandle(
        "g_dbus_message_new_signal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewSignal(java.lang.String path, java.lang.String interface_, java.lang.String signal) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_message_new_signal.invokeExact(Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(interface_).handle(), Interop.allocateNativeString(signal).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link DBusMessage} for a signal emission.
     */
    public static DBusMessage newSignal(java.lang.String path, java.lang.String interface_, java.lang.String signal) {
        return new DBusMessage(constructNewSignal(path, interface_, signal));
    }
    
    static final MethodHandle g_dbus_message_copy = Interop.downcallHandle(
        "g_dbus_message_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies {@code message}. The copy is a deep copy and the returned
     * {@link DBusMessage} is completely identical except that it is guaranteed
     * to not be locked.
     * <p>
     * This operation can fail if e.g. {@code message} contains file descriptors
     * and the per-process or system-wide open files limit is reached.
     */
    public DBusMessage copy() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dbus_message_copy.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new DBusMessage(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_arg0 = Interop.downcallHandle(
        "g_dbus_message_get_arg0",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience to get the first item in the body of {@code message}.
     */
    public java.lang.String getArg0() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_arg0.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_body = Interop.downcallHandle(
        "g_dbus_message_get_body",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the body of a message.
     */
    public org.gtk.glib.Variant getBody() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_body.invokeExact(handle());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_byte_order = Interop.downcallHandle(
        "g_dbus_message_get_byte_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the byte order of {@code message}.
     */
    public DBusMessageByteOrder getByteOrder() {
        try {
            var RESULT = (int) g_dbus_message_get_byte_order.invokeExact(handle());
            return new DBusMessageByteOrder(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_destination = Interop.downcallHandle(
        "g_dbus_message_get_destination",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#DESTINATION} header field.
     */
    public java.lang.String getDestination() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_destination.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_error_name = Interop.downcallHandle(
        "g_dbus_message_get_error_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#ERROR_NAME} header field.
     */
    public java.lang.String getErrorName() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_error_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_flags = Interop.downcallHandle(
        "g_dbus_message_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flags for {@code message}.
     */
    public DBusMessageFlags getFlags() {
        try {
            var RESULT = (int) g_dbus_message_get_flags.invokeExact(handle());
            return new DBusMessageFlags(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_header = Interop.downcallHandle(
        "g_dbus_message_get_header",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a header field on {@code message}.
     * <p>
     * The caller is responsible for checking the type of the returned {@link org.gtk.glib.Variant}
     * matches what is expected.
     */
    public org.gtk.glib.Variant getHeader(DBusMessageHeaderField headerField) {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_header.invokeExact(handle(), headerField.getValue());
            return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_header_fields = Interop.downcallHandle(
        "g_dbus_message_get_header_fields",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an array of all header fields on {@code message} that are set.
     */
    public PointerIterator<Byte> getHeaderFields() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_header_fields.invokeExact(handle());
            return new PointerByte(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_interface = Interop.downcallHandle(
        "g_dbus_message_get_interface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#INTERFACE} header field.
     */
    public java.lang.String getInterface() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_interface.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_locked = Interop.downcallHandle(
        "g_dbus_message_get_locked",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code message} is locked. To monitor changes to this
     * value, conncet to the {@link org.gtk.gobject.Object}::notify signal to listen for changes
     * on the {@link DBusMessage}:locked property.
     */
    public boolean getLocked() {
        try {
            var RESULT = (int) g_dbus_message_get_locked.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_member = Interop.downcallHandle(
        "g_dbus_message_get_member",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#MEMBER} header field.
     */
    public java.lang.String getMember() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_member.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_message_type = Interop.downcallHandle(
        "g_dbus_message_get_message_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of {@code message}.
     */
    public DBusMessageType getMessageType() {
        try {
            var RESULT = (int) g_dbus_message_get_message_type.invokeExact(handle());
            return new DBusMessageType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_num_unix_fds = Interop.downcallHandle(
        "g_dbus_message_get_num_unix_fds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#NUM_UNIX_FDS} header field.
     */
    public int getNumUnixFds() {
        try {
            var RESULT = (int) g_dbus_message_get_num_unix_fds.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_path = Interop.downcallHandle(
        "g_dbus_message_get_path",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#PATH} header field.
     */
    public java.lang.String getPath() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_path.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_reply_serial = Interop.downcallHandle(
        "g_dbus_message_get_reply_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#REPLY_SERIAL} header field.
     */
    public int getReplySerial() {
        try {
            var RESULT = (int) g_dbus_message_get_reply_serial.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_sender = Interop.downcallHandle(
        "g_dbus_message_get_sender",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#SENDER} header field.
     */
    public java.lang.String getSender() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_sender.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_serial = Interop.downcallHandle(
        "g_dbus_message_get_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the serial for {@code message}.
     */
    public int getSerial() {
        try {
            var RESULT = (int) g_dbus_message_get_serial.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_signature = Interop.downcallHandle(
        "g_dbus_message_get_signature",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience getter for the {@link DBusMessageHeaderField#SIGNATURE} header field.
     * <p>
     * This will always be non-{@code null}, but may be an empty string.
     */
    public java.lang.String getSignature() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_signature.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_get_unix_fd_list = Interop.downcallHandle(
        "g_dbus_message_get_unix_fd_list",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public UnixFDList getUnixFdList() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_get_unix_fd_list.invokeExact(handle());
            return new UnixFDList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_lock = Interop.downcallHandle(
        "g_dbus_message_lock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code message} is locked, does nothing. Otherwise locks the message.
     */
    public void lock() {
        try {
            g_dbus_message_lock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_new_method_error_literal = Interop.downcallHandle(
        "g_dbus_message_new_method_error_literal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link DBusMessage} that is an error reply to {@code method_call_message}.
     */
    public DBusMessage newMethodErrorLiteral(java.lang.String errorName, java.lang.String errorMessage) {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_new_method_error_literal.invokeExact(handle(), Interop.allocateNativeString(errorName).handle(), Interop.allocateNativeString(errorMessage).handle());
            return new DBusMessage(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_new_method_error_valist = Interop.downcallHandle(
        "g_dbus_message_new_method_error_valist",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Like g_dbus_message_new_method_error() but intended for language bindings.
     */
    public DBusMessage newMethodErrorValist(java.lang.String errorName, java.lang.String errorMessageFormat, VaList varArgs) {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_new_method_error_valist.invokeExact(handle(), Interop.allocateNativeString(errorName).handle(), Interop.allocateNativeString(errorMessageFormat).handle(), varArgs);
            return new DBusMessage(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_new_method_reply = Interop.downcallHandle(
        "g_dbus_message_new_method_reply",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link DBusMessage} that is a reply to {@code method_call_message}.
     */
    public DBusMessage newMethodReply() {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_new_method_reply.invokeExact(handle());
            return new DBusMessage(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_print = Interop.downcallHandle(
        "g_dbus_message_print",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public java.lang.String print(int indent) {
        try {
            var RESULT = (MemoryAddress) g_dbus_message_print.invokeExact(handle(), indent);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_body = Interop.downcallHandle(
        "g_dbus_message_set_body",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the body {@code message}. As a side-effect the
     * {@link DBusMessageHeaderField#SIGNATURE} header field is set to the
     * type string of {@code body} (or cleared if {@code body} is {@code null}).
     * <p>
     * If {@code body} is floating, {@code message} assumes ownership of {@code body}.
     */
    public void setBody(org.gtk.glib.Variant body) {
        try {
            g_dbus_message_set_body.invokeExact(handle(), body.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_byte_order = Interop.downcallHandle(
        "g_dbus_message_set_byte_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the byte order of {@code message}.
     */
    public void setByteOrder(DBusMessageByteOrder byteOrder) {
        try {
            g_dbus_message_set_byte_order.invokeExact(handle(), byteOrder.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_destination = Interop.downcallHandle(
        "g_dbus_message_set_destination",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#DESTINATION} header field.
     */
    public void setDestination(java.lang.String value) {
        try {
            g_dbus_message_set_destination.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_error_name = Interop.downcallHandle(
        "g_dbus_message_set_error_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#ERROR_NAME} header field.
     */
    public void setErrorName(java.lang.String value) {
        try {
            g_dbus_message_set_error_name.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_flags = Interop.downcallHandle(
        "g_dbus_message_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flags to set on {@code message}.
     */
    public void setFlags(DBusMessageFlags flags) {
        try {
            g_dbus_message_set_flags.invokeExact(handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_header = Interop.downcallHandle(
        "g_dbus_message_set_header",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a header field on {@code message}.
     * <p>
     * If {@code value} is floating, {@code message} assumes ownership of {@code value}.
     */
    public void setHeader(DBusMessageHeaderField headerField, org.gtk.glib.Variant value) {
        try {
            g_dbus_message_set_header.invokeExact(handle(), headerField.getValue(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_interface = Interop.downcallHandle(
        "g_dbus_message_set_interface",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#INTERFACE} header field.
     */
    public void setInterface(java.lang.String value) {
        try {
            g_dbus_message_set_interface.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_member = Interop.downcallHandle(
        "g_dbus_message_set_member",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#MEMBER} header field.
     */
    public void setMember(java.lang.String value) {
        try {
            g_dbus_message_set_member.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_message_type = Interop.downcallHandle(
        "g_dbus_message_set_message_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code message} to be of {@code type}.
     */
    public void setMessageType(DBusMessageType type) {
        try {
            g_dbus_message_set_message_type.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_num_unix_fds = Interop.downcallHandle(
        "g_dbus_message_set_num_unix_fds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#NUM_UNIX_FDS} header field.
     */
    public void setNumUnixFds(int value) {
        try {
            g_dbus_message_set_num_unix_fds.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_path = Interop.downcallHandle(
        "g_dbus_message_set_path",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#PATH} header field.
     */
    public void setPath(java.lang.String value) {
        try {
            g_dbus_message_set_path.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_reply_serial = Interop.downcallHandle(
        "g_dbus_message_set_reply_serial",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#REPLY_SERIAL} header field.
     */
    public void setReplySerial(int value) {
        try {
            g_dbus_message_set_reply_serial.invokeExact(handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_sender = Interop.downcallHandle(
        "g_dbus_message_set_sender",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#SENDER} header field.
     */
    public void setSender(java.lang.String value) {
        try {
            g_dbus_message_set_sender.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_serial = Interop.downcallHandle(
        "g_dbus_message_set_serial",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the serial for {@code message}.
     */
    public void setSerial(int serial) {
        try {
            g_dbus_message_set_serial.invokeExact(handle(), serial);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_signature = Interop.downcallHandle(
        "g_dbus_message_set_signature",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience setter for the {@link DBusMessageHeaderField#SIGNATURE} header field.
     */
    public void setSignature(java.lang.String value) {
        try {
            g_dbus_message_set_signature.invokeExact(handle(), Interop.allocateNativeString(value).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_set_unix_fd_list = Interop.downcallHandle(
        "g_dbus_message_set_unix_fd_list",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
     */
    public void setUnixFdList(UnixFDList fdList) {
        try {
            g_dbus_message_set_unix_fd_list.invokeExact(handle(), fdList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_to_blob = Interop.downcallHandle(
        "g_dbus_message_to_blob",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Serializes {@code message} to a blob. The byte order returned by
     * g_dbus_message_get_byte_order() will be used.
     */
    public PointerIterator<Byte> toBlob(PointerLong outSize, DBusCapabilityFlags capabilities) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_dbus_message_to_blob.invokeExact(handle(), outSize.handle(), capabilities.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerByte(RESULT).iterator();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_to_gerror = Interop.downcallHandle(
        "g_dbus_message_to_gerror",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code message} is not of type {@link DBusMessageType#ERROR} does
     * nothing and returns {@code false}.
     * <p>
     * Otherwise this method encodes the error in {@code message} as a {@link org.gtk.glib.Error}
     * using g_dbus_error_set_dbus_error() using the information in the
     * {@link DBusMessageHeaderField#ERROR_NAME} header field of {@code message} as
     * well as the first string item in {@code message}'s body.
     */
    public boolean toGerror() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_dbus_message_to_gerror.invokeExact(handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_dbus_message_bytes_needed = Interop.downcallHandle(
        "g_dbus_message_bytes_needed",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Utility function to calculate how many bytes are needed to
     * completely deserialize the D-Bus message stored at {@code blob}.
     */
    public static long bytesNeeded(byte[] blob, long blobLen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (long) g_dbus_message_bytes_needed.invokeExact(Interop.allocateNativeArray(blob).handle(), blobLen, GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
