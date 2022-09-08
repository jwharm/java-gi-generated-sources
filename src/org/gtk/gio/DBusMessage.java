package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A type for representing D-Bus messages that can be sent or received
 * on a #GDBusConnection.
 */
public class DBusMessage extends org.gtk.gobject.Object {

    public DBusMessage(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DBusMessage */
    public static DBusMessage castFrom(org.gtk.gobject.Object gobject) {
        return new DBusMessage(gobject.getReference());
    }
    
    /**
     * Creates a new empty #GDBusMessage.
     */
    public DBusMessage() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_new(), true));
    }
    
    /**
     * Creates a new #GDBusMessage for a method call.
     */
    public DBusMessage(java.lang.String name, java.lang.String path, java.lang.String interface_, java.lang.String method) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_new_method_call(Interop.allocateNativeString(name).HANDLE(), Interop.allocateNativeString(path).HANDLE(), Interop.allocateNativeString(interface_).HANDLE(), Interop.allocateNativeString(method).HANDLE()), true));
    }
    
    /**
     * Creates a new #GDBusMessage for a signal emission.
     */
    public DBusMessage(java.lang.String path, java.lang.String interface_, java.lang.String signal) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_new_signal(Interop.allocateNativeString(path).HANDLE(), Interop.allocateNativeString(interface_).HANDLE(), Interop.allocateNativeString(signal).HANDLE()), true));
    }
    
    /**
     * Copies @message. The copy is a deep copy and the returned
     * #GDBusMessage is completely identical except that it is guaranteed
     * to not be locked.
     * 
     * This operation can fail if e.g. @message contains file descriptors
     * and the per-process or system-wide open files limit is reached.
     */
    public DBusMessage copy() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_copy(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Convenience to get the first item in the body of @message.
     */
    public java.lang.String getArg0() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_arg0(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the body of a message.
     */
    public org.gtk.glib.Variant getBody() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_body(HANDLE());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Gets the byte order of @message.
     */
    public DBusMessageByteOrder getByteOrder() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_byte_order(HANDLE());
        return DBusMessageByteOrder.fromValue(RESULT);
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     */
    public java.lang.String getDestination() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_destination(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     */
    public java.lang.String getErrorName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_error_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the flags for @message.
     */
    public int getFlags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_flags(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets a header field on @message.
     * 
     * The caller is responsible for checking the type of the returned #GVariant
     * matches what is expected.
     */
    public org.gtk.glib.Variant getHeader(DBusMessageHeaderField headerField) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_header(HANDLE(), headerField.getValue());
        return new org.gtk.glib.Variant(References.get(RESULT, false));
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     */
    public java.lang.String getInterface() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_interface(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks whether @message is locked. To monitor changes to this
     * value, conncet to the #GObject::notify signal to listen for changes
     * on the #GDBusMessage:locked property.
     */
    public boolean getLocked() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_locked(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     */
    public java.lang.String getMember() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_member(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the type of @message.
     */
    public DBusMessageType getMessageType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_message_type(HANDLE());
        return DBusMessageType.fromValue(RESULT);
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field.
     */
    public int getNumUnixFds() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_num_unix_fds(HANDLE());
        return RESULT;
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     */
    public java.lang.String getPath() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_path(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL header field.
     */
    public int getReplySerial() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_reply_serial(HANDLE());
        return RESULT;
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     */
    public java.lang.String getSender() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_sender(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the serial for @message.
     */
    public int getSerial() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_serial(HANDLE());
        return RESULT;
    }
    
    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     * 
     * This will always be non-%NULL, but may be an empty string.
     */
    public java.lang.String getSignature() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_signature(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the UNIX file descriptors associated with @message, if any.
     * 
     * This method is only available on UNIX.
     * 
     * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * values in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by
     * `g_unix_fd_list_get (list, 5, ...)`.
     */
    public UnixFDList getUnixFdList() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_get_unix_fd_list(HANDLE());
        return new UnixFDList(References.get(RESULT, false));
    }
    
    /**
     * If @message is locked, does nothing. Otherwise locks the message.
     */
    public void lock() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_lock(HANDLE());
    }
    
    /**
     * Creates a new #GDBusMessage that is an error reply to @method_call_message.
     */
    public DBusMessage newMethodErrorLiteral(java.lang.String errorName, java.lang.String errorMessage) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_new_method_error_literal(HANDLE(), Interop.allocateNativeString(errorName).HANDLE(), Interop.allocateNativeString(errorMessage).HANDLE());
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Like g_dbus_message_new_method_error() but intended for language bindings.
     */
    public DBusMessage newMethodErrorValist(java.lang.String errorName, java.lang.String errorMessageFormat, VaList varArgs) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_new_method_error_valist(HANDLE(), Interop.allocateNativeString(errorName).HANDLE(), Interop.allocateNativeString(errorMessageFormat).HANDLE(), varArgs);
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Creates a new #GDBusMessage that is a reply to @method_call_message.
     */
    public DBusMessage newMethodReply() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_new_method_reply(HANDLE());
        return new DBusMessage(References.get(RESULT, true));
    }
    
    /**
     * Produces a human-readable multi-line description of @message.
     * 
     * The contents of the description has no ABI guarantees, the contents
     * and formatting is subject to change at any time. Typical output
     * looks something like this:
     * |[
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
     * ]|
     * or
     * |[
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
     * ]|
     */
    public java.lang.String print(int indent) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_print(HANDLE(), indent);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the body @message. As a side-effect the
     * %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field is set to the
     * type string of @body (or cleared if @body is %NULL).
     * 
     * If @body is floating, @message assumes ownership of @body.
     */
    public void setBody(org.gtk.glib.Variant body) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_body(HANDLE(), body.HANDLE());
    }
    
    /**
     * Sets the byte order of @message.
     */
    public void setByteOrder(DBusMessageByteOrder byteOrder) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_byte_order(HANDLE(), byteOrder.getValue());
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     */
    public void setDestination(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_destination(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     */
    public void setErrorName(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_error_name(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Sets the flags to set on @message.
     */
    public void setFlags(int flags) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_flags(HANDLE(), flags);
    }
    
    /**
     * Sets a header field on @message.
     * 
     * If @value is floating, @message assumes ownership of @value.
     */
    public void setHeader(DBusMessageHeaderField headerField, org.gtk.glib.Variant value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_header(HANDLE(), headerField.getValue(), value.HANDLE());
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     */
    public void setInterface(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_interface(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     */
    public void setMember(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_member(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Sets @message to be of @type.
     */
    public void setMessageType(DBusMessageType type) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_message_type(HANDLE(), type.getValue());
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field.
     */
    public void setNumUnixFds(int value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_num_unix_fds(HANDLE(), value);
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     */
    public void setPath(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_path(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL header field.
     */
    public void setReplySerial(int value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_reply_serial(HANDLE(), value);
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     */
    public void setSender(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_sender(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Sets the serial for @message.
     */
    public void setSerial(int serial) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_serial(HANDLE(), serial);
    }
    
    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     */
    public void setSignature(java.lang.String value) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_signature(HANDLE(), Interop.allocateNativeString(value).HANDLE());
    }
    
    /**
     * Sets the UNIX file descriptors associated with @message. As a
     * side-effect the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header
     * field is set to the number of fds in @fd_list (or cleared if
     * @fd_list is %NULL).
     * 
     * This method is only available on UNIX.
     * 
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced by a value of type
     * %G_VARIANT_TYPE_HANDLE in the body of the message.
     */
    public void setUnixFdList(UnixFDList fdList) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_set_unix_fd_list(HANDLE(), fdList.HANDLE());
    }
    
    /**
     * If @message is not of type %G_DBUS_MESSAGE_TYPE_ERROR does
     * nothing and returns %FALSE.
     * 
     * Otherwise this method encodes the error in @message as a #GError
     * using g_dbus_error_set_dbus_error() using the information in the
     * %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field of @message as
     * well as the first string item in @message's body.
     */
    public boolean toGerror() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_dbus_message_to_gerror(HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
