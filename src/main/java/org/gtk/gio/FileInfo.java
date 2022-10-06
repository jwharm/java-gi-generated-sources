package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Functionality for manipulating basic metadata for files. {@link FileInfo}
 * implements methods for getting information that all files should
 * contain, and allows for manipulation of extended attributes.
 * <p>
 * See [GFileAttribute][gio-GFileAttribute] for more information on how
 * GIO handles file attributes.
 * <p>
 * To obtain a {@link FileInfo} for a {@link File}, use g_file_query_info() (or its
 * async variant). To obtain a {@link FileInfo} for a file input or output
 * stream, use g_file_input_stream_query_info() or
 * g_file_output_stream_query_info() (or their async variants).
 * <p>
 * To change the actual attributes of a file, you should then set the
 * attribute in the {@link FileInfo} and call g_file_set_attributes_from_info()
 * or g_file_set_attributes_async() on a GFile.
 * <p>
 * However, not all attributes can be changed in the file. For instance,
 * the actual size of a file cannot be changed via g_file_info_set_size().
 * You may call g_file_query_settable_attributes() and
 * g_file_query_writable_namespaces() to discover the settable attributes
 * of a particular file at runtime.
 * <p>
 * The direct accessors, such as g_file_info_get_name(), are slightly more
 * optimized than the generic attribute accessors, such as
 * g_file_info_get_attribute_byte_string().This optimization will matter
 * only if calling the API in a tight loop.
 * <p>
 * {@link FileAttributeMatcher} allows for searching through a {@link FileInfo} for
 * attributes.
 */
public class FileInfo extends org.gtk.gobject.Object {

    public FileInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileInfo */
    public static FileInfo castFrom(org.gtk.gobject.Object gobject) {
        return new FileInfo(gobject.refcounted());
    }
    
    static final MethodHandle g_file_info_new = Interop.downcallHandle(
        "g_file_info_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_file_info_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new file info structure.
     */
    public FileInfo() {
        super(constructNew());
    }
    
    static final MethodHandle g_file_info_clear_status = Interop.downcallHandle(
        "g_file_info_clear_status",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears the status information from {@code info}.
     */
    public void clearStatus() {
        try {
            g_file_info_clear_status.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_copy_into = Interop.downcallHandle(
        "g_file_info_copy_into",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * First clears all of the [GFileAttribute][gio-GFileAttribute] of {@code dest_info},
     * and then copies all of the file attributes from {@code src_info} to {@code dest_info}.
     */
    public void copyInto(FileInfo destInfo) {
        try {
            g_file_info_copy_into.invokeExact(handle(), destInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_dup = Interop.downcallHandle(
        "g_file_info_dup",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Duplicates a file info structure.
     */
    public FileInfo dup() {
        try {
            var RESULT = (MemoryAddress) g_file_info_dup.invokeExact(handle());
            return new FileInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_access_date_time = Interop.downcallHandle(
        "g_file_info_get_access_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the access time of the current {@code info} and returns it as a
     * {@link org.gtk.glib.DateTime}.
     * <p>
     * This requires the {@code G_FILE_ATTRIBUTE_TIME_ACCESS} attribute. If
     * {@code G_FILE_ATTRIBUTE_TIME_ACCESS_USEC} is provided, the resulting {@link org.gtk.glib.DateTime}
     * will have microsecond precision.
     */
    public org.gtk.glib.DateTime getAccessDateTime() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_access_date_time.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_as_string = Interop.downcallHandle(
        "g_file_info_get_attribute_as_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a attribute, formatted as a string.
     * This escapes things as needed to make the string valid
     * UTF-8.
     */
    public java.lang.String getAttributeAsString(java.lang.String attribute) {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_attribute_as_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_boolean = Interop.downcallHandle(
        "g_file_info_get_attribute_boolean",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * contain a boolean value, {@code false} will be returned.
     */
    public boolean getAttributeBoolean(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_info_get_attribute_boolean.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_byte_string = Interop.downcallHandle(
        "g_file_info_get_attribute_byte_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a byte string attribute. If the attribute does
     * not contain a byte string, {@code null} will be returned.
     */
    public java.lang.String getAttributeByteString(java.lang.String attribute) {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_attribute_byte_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_data = Interop.downcallHandle(
        "g_file_info_get_attribute_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the attribute type, value and status for an attribute key.
     */
    public boolean getAttributeData(java.lang.String attribute, FileAttributeType type, java.lang.foreign.MemoryAddress valuePp, FileAttributeStatus status) {
        try {
            var RESULT = (int) g_file_info_get_attribute_data.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), new PointerInteger(type.getValue()).handle(), valuePp, new PointerInteger(status.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_int32 = Interop.downcallHandle(
        "g_file_info_get_attribute_int32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * attribute does not contain a signed 32-bit integer, or is invalid,
     * 0 will be returned.
     */
    public int getAttributeInt32(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_info_get_attribute_int32.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_int64 = Interop.downcallHandle(
        "g_file_info_get_attribute_int64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * attribute does not contain a signed 64-bit integer, or is invalid,
     * 0 will be returned.
     */
    public long getAttributeInt64(java.lang.String attribute) {
        try {
            var RESULT = (long) g_file_info_get_attribute_int64.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_object = Interop.downcallHandle(
        "g_file_info_get_attribute_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a {@link org.gtk.gobject.Object} attribute. If the attribute does
     * not contain a {@link org.gtk.gobject.Object}, {@code null} will be returned.
     */
    public org.gtk.gobject.Object getAttributeObject(java.lang.String attribute) {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_attribute_object.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_status = Interop.downcallHandle(
        "g_file_info_get_attribute_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attribute status for an attribute key.
     */
    public FileAttributeStatus getAttributeStatus(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_info_get_attribute_status.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return new FileAttributeStatus(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_string = Interop.downcallHandle(
        "g_file_info_get_attribute_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a string attribute. If the attribute does
     * not contain a string, {@code null} will be returned.
     */
    public java.lang.String getAttributeString(java.lang.String attribute) {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_attribute_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_stringv = Interop.downcallHandle(
        "g_file_info_get_attribute_stringv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of a stringv attribute. If the attribute does
     * not contain a stringv, {@code null} will be returned.
     */
    public PointerString getAttributeStringv(java.lang.String attribute) {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_attribute_stringv.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_type = Interop.downcallHandle(
        "g_file_info_get_attribute_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attribute type for an attribute key.
     */
    public FileAttributeType getAttributeType(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_info_get_attribute_type.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return new FileAttributeType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_uint32 = Interop.downcallHandle(
        "g_file_info_get_attribute_uint32",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 32-bit integer, or is invalid,
     * 0 will be returned.
     */
    public int getAttributeUint32(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_info_get_attribute_uint32.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_attribute_uint64 = Interop.downcallHandle(
        "g_file_info_get_attribute_uint64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 64-bit integer, or is invalid,
     * 0 will be returned.
     */
    public long getAttributeUint64(java.lang.String attribute) {
        try {
            var RESULT = (long) g_file_info_get_attribute_uint64.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_content_type = Interop.downcallHandle(
        "g_file_info_get_content_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file's content type.
     */
    public java.lang.String getContentType() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_content_type.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_creation_date_time = Interop.downcallHandle(
        "g_file_info_get_creation_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the creation time of the current {@code info} and returns it as a
     * {@link org.gtk.glib.DateTime}.
     * <p>
     * This requires the {@code G_FILE_ATTRIBUTE_TIME_CREATED} attribute. If
     * {@code G_FILE_ATTRIBUTE_TIME_CREATED_USEC} is provided, the resulting {@link org.gtk.glib.DateTime}
     * will have microsecond precision.
     */
    public org.gtk.glib.DateTime getCreationDateTime() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_creation_date_time.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_deletion_date = Interop.downcallHandle(
        "g_file_info_get_deletion_date",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link org.gtk.glib.DateTime} representing the deletion date of the file, as
     * available in G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, {@code null} is returned.
     */
    public org.gtk.glib.DateTime getDeletionDate() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_deletion_date.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_display_name = Interop.downcallHandle(
        "g_file_info_get_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     */
    public java.lang.String getDisplayName() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_display_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_edit_name = Interop.downcallHandle(
        "g_file_info_get_edit_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the edit name for a file.
     */
    public java.lang.String getEditName() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_edit_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_etag = Interop.downcallHandle(
        "g_file_info_get_etag",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the [entity tag][gfile-etag] for a given
     * {@link FileInfo}. See {@code G_FILE_ATTRIBUTE_ETAG_VALUE}.
     */
    public java.lang.String getEtag() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_etag.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_file_type = Interop.downcallHandle(
        "g_file_info_get_file_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a file's type (whether it is a regular file, symlink, etc).
     * This is different from the file's content type, see g_file_info_get_content_type().
     */
    public FileType getFileType() {
        try {
            var RESULT = (int) g_file_info_get_file_type.invokeExact(handle());
            return new FileType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_icon = Interop.downcallHandle(
        "g_file_info_get_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon for a file.
     */
    public Icon getIcon() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_is_backup = Interop.downcallHandle(
        "g_file_info_get_is_backup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a file is a backup file.
     */
    public boolean getIsBackup() {
        try {
            var RESULT = (int) g_file_info_get_is_backup.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_is_hidden = Interop.downcallHandle(
        "g_file_info_get_is_hidden",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a file is hidden.
     */
    public boolean getIsHidden() {
        try {
            var RESULT = (int) g_file_info_get_is_hidden.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_is_symlink = Interop.downcallHandle(
        "g_file_info_get_is_symlink",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a file is a symlink.
     */
    public boolean getIsSymlink() {
        try {
            var RESULT = (int) g_file_info_get_is_symlink.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_modification_date_time = Interop.downcallHandle(
        "g_file_info_get_modification_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the modification time of the current {@code info} and returns it as a
     * {@link org.gtk.glib.DateTime}.
     * <p>
     * This requires the {@code G_FILE_ATTRIBUTE_TIME_MODIFIED} attribute. If
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC} is provided, the resulting {@link org.gtk.glib.DateTime}
     * will have microsecond precision.
     */
    public org.gtk.glib.DateTime getModificationDateTime() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_modification_date_time.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_name = Interop.downcallHandle(
        "g_file_info_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name for a file. This is guaranteed to always be set.
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_size = Interop.downcallHandle(
        "g_file_info_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the file's size (in bytes). The size is retrieved through the value of
     * the {@code G_FILE_ATTRIBUTE_STANDARD_SIZE} attribute and is converted
     * from {@code guint64} to {@code goffset} before returning the result.
     */
    public long getSize() {
        try {
            var RESULT = (long) g_file_info_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_sort_order = Interop.downcallHandle(
        "g_file_info_get_sort_order",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the sort_order attribute from the {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER}.
     */
    public int getSortOrder() {
        try {
            var RESULT = (int) g_file_info_get_sort_order.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_symbolic_icon = Interop.downcallHandle(
        "g_file_info_get_symbolic_icon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the symbolic icon for a file.
     */
    public Icon getSymbolicIcon() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_symbolic_icon.invokeExact(handle());
            return new Icon.IconImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_get_symlink_target = Interop.downcallHandle(
        "g_file_info_get_symlink_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the symlink target for a given {@link FileInfo}.
     */
    public java.lang.String getSymlinkTarget() {
        try {
            var RESULT = (MemoryAddress) g_file_info_get_symlink_target.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_has_attribute = Interop.downcallHandle(
        "g_file_info_has_attribute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a file info structure has an attribute named {@code attribute}.
     */
    public boolean hasAttribute(java.lang.String attribute) {
        try {
            var RESULT = (int) g_file_info_has_attribute.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_has_namespace = Interop.downcallHandle(
        "g_file_info_has_namespace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if a file info structure has an attribute in the
     * specified {@code name_space}.
     */
    public boolean hasNamespace(java.lang.String nameSpace) {
        try {
            var RESULT = (int) g_file_info_has_namespace.invokeExact(handle(), Interop.allocateNativeString(nameSpace).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_list_attributes = Interop.downcallHandle(
        "g_file_info_list_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the file info structure's attributes.
     */
    public PointerString listAttributes(java.lang.String nameSpace) {
        try {
            var RESULT = (MemoryAddress) g_file_info_list_attributes.invokeExact(handle(), Interop.allocateNativeString(nameSpace).handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_remove_attribute = Interop.downcallHandle(
        "g_file_info_remove_attribute",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all cases of {@code attribute} from {@code info} if it exists.
     */
    public void removeAttribute(java.lang.String attribute) {
        try {
            g_file_info_remove_attribute.invokeExact(handle(), Interop.allocateNativeString(attribute).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_access_date_time = Interop.downcallHandle(
        "g_file_info_set_access_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_ACCESS} and
     * {@code G_FILE_ATTRIBUTE_TIME_ACCESS_USEC} attributes in the file info to the
     * given date/time value.
     */
    public void setAccessDateTime(org.gtk.glib.DateTime atime) {
        try {
            g_file_info_set_access_date_time.invokeExact(handle(), atime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute = Interop.downcallHandle(
        "g_file_info_set_attribute",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code attribute} to contain the given value, if possible. To unset the
     * attribute, use {@link FileAttributeType#INVALID} for {@code type}.
     */
    public void setAttribute(java.lang.String attribute, FileAttributeType type, java.lang.foreign.MemoryAddress valueP) {
        try {
            g_file_info_set_attribute.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), type.getValue(), valueP);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_boolean = Interop.downcallHandle(
        "g_file_info_set_attribute_boolean",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeBoolean(java.lang.String attribute, boolean attrValue) {
        try {
            g_file_info_set_attribute_boolean.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), attrValue ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_byte_string = Interop.downcallHandle(
        "g_file_info_set_attribute_byte_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeByteString(java.lang.String attribute, java.lang.String attrValue) {
        try {
            g_file_info_set_attribute_byte_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(attrValue).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_int32 = Interop.downcallHandle(
        "g_file_info_set_attribute_int32",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeInt32(java.lang.String attribute, int attrValue) {
        try {
            g_file_info_set_attribute_int32.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_int64 = Interop.downcallHandle(
        "g_file_info_set_attribute_int64",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeInt64(java.lang.String attribute, long attrValue) {
        try {
            g_file_info_set_attribute_int64.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_mask = Interop.downcallHandle(
        "g_file_info_set_attribute_mask",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code mask} on {@code info} to match specific attribute types.
     */
    public void setAttributeMask(FileAttributeMatcher mask) {
        try {
            g_file_info_set_attribute_mask.invokeExact(handle(), mask.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_object = Interop.downcallHandle(
        "g_file_info_set_attribute_object",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeObject(java.lang.String attribute, org.gtk.gobject.Object attrValue) {
        try {
            g_file_info_set_attribute_object.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), attrValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_status = Interop.downcallHandle(
        "g_file_info_set_attribute_status",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the attribute status for an attribute key. This is only
     * needed by external code that implement g_file_set_attributes_from_info()
     * or similar functions.
     * <p>
     * The attribute must exist in {@code info} for this to work. Otherwise {@code false}
     * is returned and {@code info} is unchanged.
     */
    public boolean setAttributeStatus(java.lang.String attribute, FileAttributeStatus status) {
        try {
            var RESULT = (int) g_file_info_set_attribute_status.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), status.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_string = Interop.downcallHandle(
        "g_file_info_set_attribute_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeString(java.lang.String attribute, java.lang.String attrValue) {
        try {
            g_file_info_set_attribute_string.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(attrValue).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_stringv = Interop.downcallHandle(
        "g_file_info_set_attribute_stringv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * <p>
     * Sinze: 2.22
     */
    public void setAttributeStringv(java.lang.String attribute, java.lang.String[] attrValue) {
        try {
            g_file_info_set_attribute_stringv.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeArray(attrValue).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_uint32 = Interop.downcallHandle(
        "g_file_info_set_attribute_uint32",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeUint32(java.lang.String attribute, int attrValue) {
        try {
            g_file_info_set_attribute_uint32.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_attribute_uint64 = Interop.downcallHandle(
        "g_file_info_set_attribute_uint64",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     */
    public void setAttributeUint64(java.lang.String attribute, long attrValue) {
        try {
            g_file_info_set_attribute_uint64.invokeExact(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_content_type = Interop.downcallHandle(
        "g_file_info_set_content_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the content type attribute for a given {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE}.
     */
    public void setContentType(java.lang.String contentType) {
        try {
            g_file_info_set_content_type.invokeExact(handle(), Interop.allocateNativeString(contentType).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_creation_date_time = Interop.downcallHandle(
        "g_file_info_set_creation_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_CREATED} and
     * {@code G_FILE_ATTRIBUTE_TIME_CREATED_USEC} attributes in the file info to the
     * given date/time value.
     */
    public void setCreationDateTime(org.gtk.glib.DateTime creationTime) {
        try {
            g_file_info_set_creation_date_time.invokeExact(handle(), creationTime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_display_name = Interop.downcallHandle(
        "g_file_info_set_display_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the display name for the current {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME}.
     */
    public void setDisplayName(java.lang.String displayName) {
        try {
            g_file_info_set_display_name.invokeExact(handle(), Interop.allocateNativeString(displayName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_edit_name = Interop.downcallHandle(
        "g_file_info_set_edit_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the edit name for the current file.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME}.
     */
    public void setEditName(java.lang.String editName) {
        try {
            g_file_info_set_edit_name.invokeExact(handle(), Interop.allocateNativeString(editName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_file_type = Interop.downcallHandle(
        "g_file_info_set_file_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the file type in a {@link FileInfo} to {@code type}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_TYPE}.
     */
    public void setFileType(FileType type) {
        try {
            g_file_info_set_file_type.invokeExact(handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_icon = Interop.downcallHandle(
        "g_file_info_set_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon for a given {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_ICON}.
     */
    public void setIcon(Icon icon) {
        try {
            g_file_info_set_icon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_is_hidden = Interop.downcallHandle(
        "g_file_info_set_is_hidden",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the "is_hidden" attribute in a {@link FileInfo} according to {@code is_hidden}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN}.
     */
    public void setIsHidden(boolean isHidden) {
        try {
            g_file_info_set_is_hidden.invokeExact(handle(), isHidden ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_is_symlink = Interop.downcallHandle(
        "g_file_info_set_is_symlink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the "is_symlink" attribute in a {@link FileInfo} according to {@code is_symlink}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK}.
     */
    public void setIsSymlink(boolean isSymlink) {
        try {
            g_file_info_set_is_symlink.invokeExact(handle(), isSymlink ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_modification_date_time = Interop.downcallHandle(
        "g_file_info_set_modification_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_MODIFIED} and
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC} attributes in the file info to the
     * given date/time value.
     */
    public void setModificationDateTime(org.gtk.glib.DateTime mtime) {
        try {
            g_file_info_set_modification_date_time.invokeExact(handle(), mtime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_name = Interop.downcallHandle(
        "g_file_info_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name attribute for the current {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_NAME}.
     */
    public void setName(java.lang.String name) {
        try {
            g_file_info_set_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_size = Interop.downcallHandle(
        "g_file_info_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_STANDARD_SIZE} attribute in the file info
     * to the given size.
     */
    public void setSize(long size) {
        try {
            g_file_info_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_sort_order = Interop.downcallHandle(
        "g_file_info_set_sort_order",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the sort order attribute in the file info structure. See
     * {@code G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER}.
     */
    public void setSortOrder(int sortOrder) {
        try {
            g_file_info_set_sort_order.invokeExact(handle(), sortOrder);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_symbolic_icon = Interop.downcallHandle(
        "g_file_info_set_symbolic_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the symbolic icon for a given {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON}.
     */
    public void setSymbolicIcon(Icon icon) {
        try {
            g_file_info_set_symbolic_icon.invokeExact(handle(), icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_set_symlink_target = Interop.downcallHandle(
        "g_file_info_set_symlink_target",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET} attribute in the file info
     * to the given symlink target.
     */
    public void setSymlinkTarget(java.lang.String symlinkTarget) {
        try {
            g_file_info_set_symlink_target.invokeExact(handle(), Interop.allocateNativeString(symlinkTarget).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_file_info_unset_attribute_mask = Interop.downcallHandle(
        "g_file_info_unset_attribute_mask",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * is set.
     */
    public void unsetAttributeMask() {
        try {
            g_file_info_unset_attribute_mask.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
