package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A type for representing D-Bus messages that can be sent or received
 * on a {@link org.gtk.gio.DBusConnection}
 */
public class DBusMessage extends org.gtk.gobject.Object {

    public DBusMessage(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusMessage */
    public static DBusMessage castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMessage(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_dbus_message_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new empty {@link org.gtk.gio.DBusMessage}
     */
    public DBusMessage() {
        super(constructNew());
    }
    
    private static Reference constructNewFromBlob(byte[] blob, long blobLen, int capabilities) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_message_new_from_blob(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, blob)).handle(), blobLen, capabilities, GERROR), true);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DBusMessage} from the data stored at @blob. The byte
     * order that the message was in can be retrieved using
     * g_dbus_message_get_byte_order().
     * 
     * If the @blob cannot be parsed, contains invalid fields, or contains invalid
     * headers, {@link org.gtk.gio.IOErrorEnum<code>#INVALID_ARGUMENT</code>  will be returned.
     */
    public static DBusMessage newFromBlob(byte[] blob, long blobLen, int capabilities) throws GErrorException {
        return new DBusMessage(constructNewFromBlob(blob, blobLen, capabilities));
    }
    
    private static Reference constructNewMethodCall(java.lang.String name, java.lang.String path, java.lang.String interface_, java.lang.String method) {
        Reference RESULT = References.get(gtk_h.g_dbus_message_new_method_call(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(interface_).handle(), Interop.allocateNativeString(method).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DBusMessage} for a method call.
     */
    public static DBusMessage newMethodCall(java.lang.String name, java.lang.String path, java.lang.String interface_, java.lang.String method) {
        return new DBusMessage(constructNewMethodCall(name, path, interface_, method));
    }
    
    private static Reference constructNewSignal(java.lang.String path, java.lang.String interface_, java.lang.String signal) {
        Reference RESULT = References.get(gtk_h.g_dbus_message_new_signal(Interop.allocateNativeString(path).handle(), Interop.allocateNativeString(interface_).handle(), Interop.allocateNativeString(signal).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DBusMessage} for a signal emission.
     */
    public static DBusMessage newSignal(java.lang.String path, java.lang.String interface_, java.lang.String signal) {
        return new DBusMessage(constructNewSignal(path, interface_, signal));
    }
    
    /**
     * Copies @message. The copy is a deep copy and the returned
     * {@link org.gtk.gio.DBusMessage} is completely identical except that it is guaranteed
     * to not be locked.
     * 
     * This operation can fail if e.g. @message contains file descriptors
     * and the per-process or system-wide open files limit is reached.
     */
    public DBusMessage copy() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_message_copy(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Convenience to get the first item in the body of @message.
     */
    public java.lang.String getArg0() {
        var RESULT = gtk_h.g_dbus_message_get_arg0(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the body of a message.
     */
    public org.gtk.glib.Variant getBody() {
        var RESULT = gtk_h.g_dbus_message_get_body(handle());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets the byte order of @message.
     */
    public DBusMessageByteOrder getByteOrder() {
        var RESULT = gtk_h.g_dbus_message_get_byte_order(handle());
        return DBusMessageByteOrder.fromValue(RESULT);
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#DESTINATION</code>  header field.
     */
    public java.lang.String getDestination() {
        var RESULT = gtk_h.g_dbus_message_get_destination(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#ERROR_NAME</code>  header field.
     */
    public java.lang.String getErrorName() {
        var RESULT = gtk_h.g_dbus_message_get_error_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the flags for @message.
     */
    public int getFlags() {
        var RESULT = gtk_h.g_dbus_message_get_flags(handle());
        return RESULT;
    }
    
    /**
     * Gets a header field on @message.
     * 
     * The caller is responsible for checking the type of the returned {@link org.gtk.glib.Variant} matches what is expected.
     */
    public org.gtk.glib.Variant getHeader(DBusMessageHeaderField headerField) {
        var RESULT = gtk_h.g_dbus_message_get_header(handle(), headerField.getValue());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#INTERFACE</code>  header field.
     */
    public java.lang.String getInterface() {
        var RESULT = gtk_h.g_dbus_message_get_interface(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks whether @message is locked. To monitor changes to this
     * value, conncet to the {@link org.gtk.gobject.Object} :notify signal to listen for changes
     * on the {@link org.gtk.gio.DBusMessage} locked property.
     */
    public boolean getLocked() {
        var RESULT = gtk_h.g_dbus_message_get_locked(handle());
        return (RESULT != 0);
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#MEMBER</code>  header field.
     */
    public java.lang.String getMember() {
        var RESULT = gtk_h.g_dbus_message_get_member(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the type of @message.
     */
    public DBusMessageType getMessageType() {
        var RESULT = gtk_h.g_dbus_message_get_message_type(handle());
        return DBusMessageType.fromValue(RESULT);
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#NUM_UNIX_FDS</code>  header field.
     */
    public int getNumUnixFds() {
        var RESULT = gtk_h.g_dbus_message_get_num_unix_fds(handle());
        return RESULT;
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#PATH</code>  header field.
     */
    public java.lang.String getPath() {
        var RESULT = gtk_h.g_dbus_message_get_path(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#REPLY_SERIAL</code>  header field.
     */
    public int getReplySerial() {
        var RESULT = gtk_h.g_dbus_message_get_reply_serial(handle());
        return RESULT;
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#SENDER</code>  header field.
     */
    public java.lang.String getSender() {
        var RESULT = gtk_h.g_dbus_message_get_sender(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the serial for @message.
     */
    public int getSerial() {
        var RESULT = gtk_h.g_dbus_message_get_serial(handle());
        return RESULT;
    }
    
    /**
     * Convenience getter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#SIGNATURE</code>  header field.
     * 
     * This will always be non-<code>null</code>  but may be an empty string.
     */
    public java.lang.String getSignature() {
        var RESULT = gtk_h.g_dbus_message_get_signature(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the UNIX file descriptors associated with @message, if any.
     * <p>
     * This method is only available on UNIX.
     * <p>
     * The file descriptors normally correspond to <code>G_VARIANT_TYPE_HANDLE</code> values in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by<code>g_unix_fd_list_get (list, 5, ...)</code>.
     */
    public UnixFDList getUnixFdList() {
        var RESULT = gtk_h.g_dbus_message_get_unix_fd_list(handle());
        return new UnixFDList(References.get(RESULT, false));
    }
    
    /**
     * If @message is locked, does nothing. Otherwise locks the message.
     */
    public void lock() {
        gtk_h.g_dbus_message_lock(handle());
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DBusMessage} that is an error reply to @method_call_message.
     */
    public DBusMessage newMethodErrorLiteral(java.lang.String errorName, java.lang.String errorMessage) {
        var RESULT = gtk_h.g_dbus_message_new_method_error_literal(handle(), Interop.allocateNativeString(errorName).handle(), Interop.allocateNativeString(errorMessage).handle());
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_message_new_method_error() but intended for language bindings.
     */
    public DBusMessage newMethodErrorValist(java.lang.String errorName, java.lang.String errorMessageFormat, VaList varArgs) {
        var RESULT = gtk_h.g_dbus_message_new_method_error_valist(handle(), Interop.allocateNativeString(errorName).handle(), Interop.allocateNativeString(errorMessageFormat).handle(), varArgs);
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Creates a new {@link org.gtk.gio.DBusMessage} that is a reply to @method_call_message.
     */
    public DBusMessage newMethodReply() {
        var RESULT = gtk_h.g_dbus_message_new_method_reply(handle());
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Produces a human-readable multi-line description of @message.
     * 
     * The contents of the description has no ABI guarantees, the contents
     * and formatting is subject to change at any time. Typical output
     * looks something like this:
     * |{@link [
     * Flags:   none
     * Version: 0
     * Serial:  4
     * Headers:
     *   path -&<code>#62</code>  objectpath &<code>#39</code> /org/gtk/GDBus/TestObject&<code>#39</code> 
     *   interface -&<code>#62</code>  &<code>#39</code> org.gtk.GDBus.TestInterface&<code>#39</code> 
     *   member -&<code>#62</code>  &<code>#39</code> GimmeStdout&<code>#39</code> 
     *   destination -&<code>#62</code>  &<code>#39</code> :1.146&<code>#39</code> 
     * Body: ()
     * UNIX File Descriptors:
     *   (none)
     * ]}|
     * or
     * |{@link [
     * Flags:   no-reply-expected
     * Version: 0
     * Serial:  477
     * Headers:
     *   reply-serial -&<code>#62</code>  uint32 4
     *   destination -&<code>#62</code>  &<code>#39</code> :1.159&<code>#39</code> 
     *   sender -&<code>#62</code>  &<code>#39</code> :1.146&<code>#39</code> 
     *   num-unix-fds -&<code>#62</code>  uint32 1
     * Body: ()
     * UNIX File Descriptors:
     *   fd 12: dev=0:10,mode=020620,ino=5,uid=500,gid=5,rdev=136:2,size=0,atime=1273085037,mtime=1273085851,ctime=1272982635
     * ]}|
     */
    public java.lang.String print(int indent) {
        var RESULT = gtk_h.g_dbus_message_print(handle(), indent);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the body @message. As a side-effect the
     * {@link org.gtk.gio.DBusMessageHeaderField<code>#SIGNATURE</code>  header field is set to the
     * type string of @body (or cleared if @body is <code>null</code> .
     * 
     * If @body is floating, @message assumes ownership of @body.
     */
    public void setBody(org.gtk.glib.Variant body) {
        gtk_h.g_dbus_message_set_body(handle(), body.handle());
    }
    
    /**
     * Sets the byte order of @message.
     */
    public void setByteOrder(DBusMessageByteOrder byteOrder) {
        gtk_h.g_dbus_message_set_byte_order(handle(), byteOrder.getValue());
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#DESTINATION</code>  header field.
     */
    public void setDestination(java.lang.String value) {
        gtk_h.g_dbus_message_set_destination(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#ERROR_NAME</code>  header field.
     */
    public void setErrorName(java.lang.String value) {
        gtk_h.g_dbus_message_set_error_name(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Sets the flags to set on @message.
     */
    public void setFlags(int flags) {
        gtk_h.g_dbus_message_set_flags(handle(), flags);
    }
    
    /**
     * Sets a header field on @message.
     * 
     * If @value is floating, @message assumes ownership of @value.
     */
    public void setHeader(DBusMessageHeaderField headerField, org.gtk.glib.Variant value) {
        gtk_h.g_dbus_message_set_header(handle(), headerField.getValue(), value.handle());
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#INTERFACE</code>  header field.
     */
    public void setInterface(java.lang.String value) {
        gtk_h.g_dbus_message_set_interface(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#MEMBER</code>  header field.
     */
    public void setMember(java.lang.String value) {
        gtk_h.g_dbus_message_set_member(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Sets @message to be of @type.
     */
    public void setMessageType(DBusMessageType type) {
        gtk_h.g_dbus_message_set_message_type(handle(), type.getValue());
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#NUM_UNIX_FDS</code>  header field.
     */
    public void setNumUnixFds(int value) {
        gtk_h.g_dbus_message_set_num_unix_fds(handle(), value);
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#PATH</code>  header field.
     */
    public void setPath(java.lang.String value) {
        gtk_h.g_dbus_message_set_path(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#REPLY_SERIAL</code>  header field.
     */
    public void setReplySerial(int value) {
        gtk_h.g_dbus_message_set_reply_serial(handle(), value);
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#SENDER</code>  header field.
     */
    public void setSender(java.lang.String value) {
        gtk_h.g_dbus_message_set_sender(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Sets the serial for @message.
     */
    public void setSerial(int serial) {
        gtk_h.g_dbus_message_set_serial(handle(), serial);
    }
    
    /**
     * Convenience setter for the {@link org.gtk.gio.DBusMessageHeaderField<code>#SIGNATURE</code>  header field.
     */
    public void setSignature(java.lang.String value) {
        gtk_h.g_dbus_message_set_signature(handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Sets the UNIX file descriptors associated with @message. As a
     * side-effect the {@link org.gtk.gio.DBusMessageHeaderField<code>#NUM_UNIX_FDS</code>  header
     * field is set to the number of fds in @fd_list (or cleared if
     * @fd_list is <code>null</code> .
     * 
     * This method is only available on UNIX.
     * 
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced by a value of type
     * <code>G_VARIANT_TYPE_HANDLE</code> in the body of the message.
     */
    public void setUnixFdList(UnixFDList fdList) {
        gtk_h.g_dbus_message_set_unix_fd_list(handle(), fdList.handle());
    }
    
    /**
     * If @message is not of type {@link org.gtk.gio.DBusMessageType<code>#ERROR</code>  does
     * nothing and returns <code>false</code> 
     * 
     * Otherwise this method encodes the error in @message as a {@link org.gtk.glib.Error} using g_dbus_error_set_dbus_error() using the information in the
     * {@link org.gtk.gio.DBusMessageHeaderField<code>#ERROR_NAME</code>  header field of @message as
     * well as the first string item in @message&<code>#39</code> s body.
     */
    public boolean toGerror() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_message_to_gerror(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Utility function to calculate how many bytes are needed to
     * completely deserialize the D-Bus message stored at @blob.
     */
    public static long bytesNeeded(byte[] blob, long blobLen) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.g_dbus_message_bytes_needed(new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, blob)).handle(), blobLen, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
}
