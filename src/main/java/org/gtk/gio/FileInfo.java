package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class FileInfo extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FileInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileInfo(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new file info structure.
     */
    public FileInfo() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Clears the status information from {@code info}.
     */
    public void clearStatus() {
        try {
            DowncallHandles.g_file_info_clear_status.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * First clears all of the [GFileAttribute][gio-GFileAttribute] of {@code dest_info},
     * and then copies all of the file attributes from {@code src_info} to {@code dest_info}.
     * @param destInfo destination to copy attributes to.
     */
    public void copyInto(org.gtk.gio.FileInfo destInfo) {
        try {
            DowncallHandles.g_file_info_copy_into.invokeExact(
                    handle(),
                    destInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Duplicates a file info structure.
     * @return a duplicate {@link FileInfo} of {@code other}.
     */
    public org.gtk.gio.FileInfo dup() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_dup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.FileInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.FileInfo.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the access time of the current {@code info} and returns it as a
     * {@link org.gtk.glib.DateTime}.
     * <p>
     * This requires the {@code G_FILE_ATTRIBUTE_TIME_ACCESS} attribute. If
     * {@code G_FILE_ATTRIBUTE_TIME_ACCESS_USEC} is provided, the resulting {@link org.gtk.glib.DateTime}
     * will have microsecond precision.
     * <p>
     * If nanosecond precision is needed, {@code G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC} must
     * be queried separately using g_file_info_get_attribute_uint32().
     * @return access time, or {@code null} if unknown
     */
    public @Nullable org.gtk.glib.DateTime getAccessDateTime() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_access_date_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the value of a attribute, formatted as a string.
     * This escapes things as needed to make the string valid
     * UTF-8.
     * @param attribute a file attribute key.
     * @return a UTF-8 string associated with the given {@code attribute}, or
     *    {@code null} if the attribute wasn’t set.
     *    When you're done with the string it must be freed with g_free().
     */
    public @Nullable java.lang.String getAttributeAsString(java.lang.String attribute) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_attribute_as_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * contain a boolean value, {@code false} will be returned.
     * @param attribute a file attribute key.
     * @return the boolean value contained within the attribute.
     */
    public boolean getAttributeBoolean(java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_attribute_boolean.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the value of a byte string attribute. If the attribute does
     * not contain a byte string, {@code null} will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the {@code attribute} value as a byte string, or
     * {@code null} otherwise.
     */
    public @Nullable java.lang.String getAttributeByteString(java.lang.String attribute) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_attribute_byte_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the attribute type, value and status for an attribute key.
     * @param attribute a file attribute key
     * @param type return location for the attribute type, or {@code null}
     * @param valuePp return location for the
     *    attribute value, or {@code null}; the attribute value will not be {@code null}
     * @param status return location for the attribute status, or {@code null}
     * @return {@code true} if {@code info} has an attribute named {@code attribute},
     *      {@code false} otherwise.
     */
    public boolean getAttributeData(java.lang.String attribute, @Nullable Out<org.gtk.gio.FileAttributeType> type, @Nullable Out<java.lang.foreign.MemoryAddress> valuePp, @Nullable Out<org.gtk.gio.FileAttributeStatus> status) {
        MemorySegment typePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment valuePpPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment statusPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_attribute_data.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) typePOINTER.address()),
                    (Addressable) (valuePp == null ? MemoryAddress.NULL : (Addressable) valuePpPOINTER.address()),
                    (Addressable) (status == null ? MemoryAddress.NULL : (Addressable) statusPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (type != null) type.set(org.gtk.gio.FileAttributeType.of(typePOINTER.get(Interop.valueLayout.C_INT, 0)));
        if (valuePp != null) valuePp.set(valuePpPOINTER.get(Interop.valueLayout.ADDRESS, 0));
        if (status != null) status.set(org.gtk.gio.FileAttributeStatus.of(statusPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * attribute does not contain a signed 32-bit integer, or is invalid,
     * 0 will be returned.
     * @param attribute a file attribute key.
     * @return a signed 32-bit integer from the attribute.
     */
    public int getAttributeInt32(java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_attribute_int32.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * attribute does not contain a signed 64-bit integer, or is invalid,
     * 0 will be returned.
     * @param attribute a file attribute key.
     * @return a signed 64-bit integer from the attribute.
     */
    public long getAttributeInt64(java.lang.String attribute) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_info_get_attribute_int64.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of a {@link org.gtk.gobject.GObject} attribute. If the attribute does
     * not contain a {@link org.gtk.gobject.GObject}, {@code null} will be returned.
     * @param attribute a file attribute key.
     * @return a {@link org.gtk.gobject.GObject} associated with the given {@code attribute},
     * or {@code null} otherwise.
     */
    public @Nullable org.gtk.gobject.GObject getAttributeObject(java.lang.String attribute) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_attribute_object.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the attribute status for an attribute key.
     * @param attribute a file attribute key
     * @return a {@link FileAttributeStatus} for the given {@code attribute}, or
     *    {@link FileAttributeStatus#UNSET} if the key is invalid.
     */
    public org.gtk.gio.FileAttributeStatus getAttributeStatus(java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_attribute_status.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.FileAttributeStatus.of(RESULT);
    }
    
    /**
     * Gets the value of a string attribute. If the attribute does
     * not contain a string, {@code null} will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the {@code attribute} value as a UTF-8 string,
     * or {@code null} otherwise.
     */
    public @Nullable java.lang.String getAttributeString(java.lang.String attribute) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_attribute_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the value of a stringv attribute. If the attribute does
     * not contain a stringv, {@code null} will be returned.
     * @param attribute a file attribute key.
     * @return the contents of the {@code attribute} value as a stringv,
     * or {@code null} otherwise. Do not free. These returned strings are UTF-8.
     */
    public @Nullable PointerString getAttributeStringv(java.lang.String attribute) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_attribute_stringv.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Gets the attribute type for an attribute key.
     * @param attribute a file attribute key.
     * @return a {@link FileAttributeType} for the given {@code attribute}, or
     * {@link FileAttributeType#INVALID} if the key is not set.
     */
    public org.gtk.gio.FileAttributeType getAttributeType(java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_attribute_type.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.FileAttributeType.of(RESULT);
    }
    
    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 32-bit integer, or is invalid,
     * 0 will be returned.
     * @param attribute a file attribute key.
     * @return an unsigned 32-bit integer from the attribute.
     */
    public int getAttributeUint32(java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_attribute_uint32.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 64-bit integer, or is invalid,
     * 0 will be returned.
     * @param attribute a file attribute key.
     * @return a unsigned 64-bit integer from the attribute.
     */
    public long getAttributeUint64(java.lang.String attribute) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_info_get_attribute_uint64.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the file's content type.
     * @return a string containing the file's content type,
     * or {@code null} if unknown.
     */
    public @Nullable java.lang.String getContentType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_content_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the creation time of the current {@code info} and returns it as a
     * {@link org.gtk.glib.DateTime}.
     * <p>
     * This requires the {@code G_FILE_ATTRIBUTE_TIME_CREATED} attribute. If
     * {@code G_FILE_ATTRIBUTE_TIME_CREATED_USEC} is provided, the resulting {@link org.gtk.glib.DateTime}
     * will have microsecond precision.
     * <p>
     * If nanosecond precision is needed, {@code G_FILE_ATTRIBUTE_TIME_CREATED_NSEC} must
     * be queried separately using g_file_info_get_attribute_uint32().
     * @return creation time, or {@code null} if unknown
     */
    public @Nullable org.gtk.glib.DateTime getCreationDateTime() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_creation_date_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the {@link org.gtk.glib.DateTime} representing the deletion date of the file, as
     * available in G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, {@code null} is returned.
     * @return a {@link org.gtk.glib.DateTime}, or {@code null}.
     */
    public @Nullable org.gtk.glib.DateTime getDeletionDate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_deletion_date.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     * @return a string containing the display name.
     */
    public java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_display_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the edit name for a file.
     * @return a string containing the edit name.
     */
    public java.lang.String getEditName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_edit_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the [entity tag][gfile-etag] for a given
     * {@link FileInfo}. See {@code G_FILE_ATTRIBUTE_ETAG_VALUE}.
     * @return a string containing the value of the "etag:value" attribute.
     */
    public @Nullable java.lang.String getEtag() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_etag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets a file's type (whether it is a regular file, symlink, etc).
     * This is different from the file's content type, see g_file_info_get_content_type().
     * @return a {@link FileType} for the given file.
     */
    public org.gtk.gio.FileType getFileType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_file_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gio.FileType.of(RESULT);
    }
    
    /**
     * Gets the icon for a file.
     * @return {@link Icon} for the given {@code info}.
     */
    public @Nullable org.gtk.gio.Icon getIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks if a file is a backup file.
     * @return {@code true} if file is a backup file, {@code false} otherwise.
     */
    public boolean getIsBackup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_is_backup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a file is hidden.
     * @return {@code true} if the file is a hidden file, {@code false} otherwise.
     */
    public boolean getIsHidden() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_is_hidden.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a file is a symlink.
     * @return {@code true} if the given {@code info} is a symlink.
     */
    public boolean getIsSymlink() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_is_symlink.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the modification time of the current {@code info} and returns it as a
     * {@link org.gtk.glib.DateTime}.
     * <p>
     * This requires the {@code G_FILE_ATTRIBUTE_TIME_MODIFIED} attribute. If
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC} is provided, the resulting {@link org.gtk.glib.DateTime}
     * will have microsecond precision.
     * <p>
     * If nanosecond precision is needed, {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC} must
     * be queried separately using g_file_info_get_attribute_uint32().
     * @return modification time, or {@code null} if unknown
     */
    public @Nullable org.gtk.glib.DateTime getModificationDateTime() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_modification_date_time.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the modification time of the current {@code info} and sets it
     * in {@code result}.
     * @param result a {@link org.gtk.glib.TimeVal}.
     * @deprecated Use g_file_info_get_modification_date_time() instead, as
     *    {@link org.gtk.glib.TimeVal} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public void getModificationTime(org.gtk.glib.TimeVal result) {
        try {
            DowncallHandles.g_file_info_get_modification_time.invokeExact(
                    handle(),
                    result.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the name for a file. This is guaranteed to always be set.
     * @return a string containing the file name.
     */
    public java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the file's size (in bytes). The size is retrieved through the value of
     * the {@code G_FILE_ATTRIBUTE_STANDARD_SIZE} attribute and is converted
     * from {@code guint64} to {@code goffset} before returning the result.
     * @return a {@code goffset} containing the file's size (in bytes).
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_info_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value of the sort_order attribute from the {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER}.
     * @return a {@code gint32} containing the value of the "standard::sort_order" attribute.
     */
    public int getSortOrder() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_get_sort_order.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the symbolic icon for a file.
     * @return {@link Icon} for the given {@code info}.
     */
    public @Nullable org.gtk.gio.Icon getSymbolicIcon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_symbolic_icon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.Icon) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.Icon.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the symlink target for a given {@link FileInfo}.
     * @return a string containing the symlink target.
     */
    public @Nullable java.lang.String getSymlinkTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_get_symlink_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Checks if a file info structure has an attribute named {@code attribute}.
     * @param attribute a file attribute key.
     * @return {@code true} if {@code info} has an attribute named {@code attribute},
     *     {@code false} otherwise.
     */
    public boolean hasAttribute(java.lang.String attribute) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_has_attribute.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if a file info structure has an attribute in the
     * specified {@code name_space}.
     * @param nameSpace a file attribute namespace.
     * @return {@code true} if {@code info} has an attribute in {@code name_space},
     *     {@code false} otherwise.
     */
    public boolean hasNamespace(java.lang.String nameSpace) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_has_namespace.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(nameSpace, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Lists the file info structure's attributes.
     * @param nameSpace a file attribute key's namespace, or {@code null} to list
     *   all attributes.
     * @return a
     * null-terminated array of strings of all of the possible attribute
     * types for the given {@code name_space}, or {@code null} on error.
     */
    public @Nullable PointerString listAttributes(@Nullable java.lang.String nameSpace) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_file_info_list_attributes.invokeExact(
                    handle(),
                    (Addressable) (nameSpace == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nameSpace, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Removes all cases of {@code attribute} from {@code info} if it exists.
     * @param attribute a file attribute key.
     */
    public void removeAttribute(java.lang.String attribute) {
        try {
            DowncallHandles.g_file_info_remove_attribute.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_ACCESS} and
     * {@code G_FILE_ATTRIBUTE_TIME_ACCESS_USEC} attributes in the file info to the
     * given date/time value.
     * <p>
     * {@code G_FILE_ATTRIBUTE_TIME_ACCESS_NSEC} will be cleared.
     * @param atime a {@link org.gtk.glib.DateTime}.
     */
    public void setAccessDateTime(org.gtk.glib.DateTime atime) {
        try {
            DowncallHandles.g_file_info_set_access_date_time.invokeExact(
                    handle(),
                    atime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given value, if possible. To unset the
     * attribute, use {@link FileAttributeType#INVALID} for {@code type}.
     * @param attribute a file attribute key.
     * @param type a {@link FileAttributeType}
     * @param valueP pointer to the value
     */
    public void setAttribute(java.lang.String attribute, org.gtk.gio.FileAttributeType type, java.lang.foreign.MemoryAddress valueP) {
        try {
            DowncallHandles.g_file_info_set_attribute.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    type.getValue(),
                    (Addressable) valueP);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue a boolean value.
     */
    public void setAttributeBoolean(java.lang.String attribute, boolean attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_boolean.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    Marshal.booleanToInteger.marshal(attrValue, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue a byte string.
     */
    public void setAttributeByteString(java.lang.String attribute, java.lang.String attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_byte_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    Marshal.stringToAddress.marshal(attrValue, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue a signed 32-bit integer
     */
    public void setAttributeInt32(java.lang.String attribute, int attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_int32.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute attribute name to set.
     * @param attrValue int64 value to set attribute to.
     */
    public void setAttributeInt64(java.lang.String attribute, long attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_int64.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code mask} on {@code info} to match specific attribute types.
     * @param mask a {@link FileAttributeMatcher}.
     */
    public void setAttributeMask(org.gtk.gio.FileAttributeMatcher mask) {
        try {
            DowncallHandles.g_file_info_set_attribute_mask.invokeExact(
                    handle(),
                    mask.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue a {@link org.gtk.gobject.GObject}.
     */
    public void setAttributeObject(java.lang.String attribute, org.gtk.gobject.GObject attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_object.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    attrValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the attribute status for an attribute key. This is only
     * needed by external code that implement g_file_set_attributes_from_info()
     * or similar functions.
     * <p>
     * The attribute must exist in {@code info} for this to work. Otherwise {@code false}
     * is returned and {@code info} is unchanged.
     * @param attribute a file attribute key
     * @param status a {@link FileAttributeStatus}
     * @return {@code true} if the status was changed, {@code false} if the key was not set.
     */
    public boolean setAttributeStatus(java.lang.String attribute, org.gtk.gio.FileAttributeStatus status) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_file_info_set_attribute_status.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    status.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue a UTF-8 string.
     */
    public void setAttributeString(java.lang.String attribute, java.lang.String attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_string.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    Marshal.stringToAddress.marshal(attrValue, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * <p>
     * Sinze: 2.22
     * @param attribute a file attribute key
     * @param attrValue a {@code null}
     *   terminated array of UTF-8 strings.
     */
    public void setAttributeStringv(java.lang.String attribute, java.lang.String[] attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_stringv.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    Interop.allocateNativeArray(attrValue, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue an unsigned 32-bit integer.
     */
    public void setAttributeUint32(java.lang.String attribute, int attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_uint32.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code attribute} to contain the given {@code attr_value},
     * if possible.
     * @param attribute a file attribute key.
     * @param attrValue an unsigned 64-bit integer.
     */
    public void setAttributeUint64(java.lang.String attribute, long attrValue) {
        try {
            DowncallHandles.g_file_info_set_attribute_uint64.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(attribute, null),
                    attrValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the content type attribute for a given {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE}.
     * @param contentType a content type. See [GContentType][gio-GContentType]
     */
    public void setContentType(java.lang.String contentType) {
        try {
            DowncallHandles.g_file_info_set_content_type.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(contentType, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_CREATED} and
     * {@code G_FILE_ATTRIBUTE_TIME_CREATED_USEC} attributes in the file info to the
     * given date/time value.
     * <p>
     * {@code G_FILE_ATTRIBUTE_TIME_CREATED_NSEC} will be cleared.
     * @param creationTime a {@link org.gtk.glib.DateTime}.
     */
    public void setCreationDateTime(org.gtk.glib.DateTime creationTime) {
        try {
            DowncallHandles.g_file_info_set_creation_date_time.invokeExact(
                    handle(),
                    creationTime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the display name for the current {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME}.
     * @param displayName a string containing a display name.
     */
    public void setDisplayName(java.lang.String displayName) {
        try {
            DowncallHandles.g_file_info_set_display_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(displayName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the edit name for the current file.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME}.
     * @param editName a string containing an edit name.
     */
    public void setEditName(java.lang.String editName) {
        try {
            DowncallHandles.g_file_info_set_edit_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(editName, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the file type in a {@link FileInfo} to {@code type}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_TYPE}.
     * @param type a {@link FileType}.
     */
    public void setFileType(org.gtk.gio.FileType type) {
        try {
            DowncallHandles.g_file_info_set_file_type.invokeExact(
                    handle(),
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon for a given {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_ICON}.
     * @param icon a {@link Icon}.
     */
    public void setIcon(org.gtk.gio.Icon icon) {
        try {
            DowncallHandles.g_file_info_set_icon.invokeExact(
                    handle(),
                    icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the "is_hidden" attribute in a {@link FileInfo} according to {@code is_hidden}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN}.
     * @param isHidden a {@code gboolean}.
     */
    public void setIsHidden(boolean isHidden) {
        try {
            DowncallHandles.g_file_info_set_is_hidden.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isHidden, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the "is_symlink" attribute in a {@link FileInfo} according to {@code is_symlink}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK}.
     * @param isSymlink a {@code gboolean}.
     */
    public void setIsSymlink(boolean isSymlink) {
        try {
            DowncallHandles.g_file_info_set_is_symlink.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isSymlink, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_MODIFIED} and
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC} attributes in the file info to the
     * given date/time value.
     * <p>
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC} will be cleared.
     * @param mtime a {@link org.gtk.glib.DateTime}.
     */
    public void setModificationDateTime(org.gtk.glib.DateTime mtime) {
        try {
            DowncallHandles.g_file_info_set_modification_date_time.invokeExact(
                    handle(),
                    mtime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_TIME_MODIFIED} and
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC} attributes in the file info to the
     * given time value.
     * <p>
     * {@code G_FILE_ATTRIBUTE_TIME_MODIFIED_NSEC} will be cleared.
     * @param mtime a {@link org.gtk.glib.TimeVal}.
     * @deprecated Use g_file_info_set_modification_date_time() instead, as
     *    {@link org.gtk.glib.TimeVal} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public void setModificationTime(org.gtk.glib.TimeVal mtime) {
        try {
            DowncallHandles.g_file_info_set_modification_time.invokeExact(
                    handle(),
                    mtime.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name attribute for the current {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_NAME}.
     * @param name a string containing a name.
     */
    public void setName(java.lang.String name) {
        try {
            DowncallHandles.g_file_info_set_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_STANDARD_SIZE} attribute in the file info
     * to the given size.
     * @param size a {@code goffset} containing the file's size.
     */
    public void setSize(long size) {
        try {
            DowncallHandles.g_file_info_set_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the sort order attribute in the file info structure. See
     * {@code G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER}.
     * @param sortOrder a sort order integer.
     */
    public void setSortOrder(int sortOrder) {
        try {
            DowncallHandles.g_file_info_set_sort_order.invokeExact(
                    handle(),
                    sortOrder);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the symbolic icon for a given {@link FileInfo}.
     * See {@code G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON}.
     * @param icon a {@link Icon}.
     */
    public void setSymbolicIcon(org.gtk.gio.Icon icon) {
        try {
            DowncallHandles.g_file_info_set_symbolic_icon.invokeExact(
                    handle(),
                    icon.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET} attribute in the file info
     * to the given symlink target.
     * @param symlinkTarget a static string containing a path to a symlink target.
     */
    public void setSymlinkTarget(java.lang.String symlinkTarget) {
        try {
            DowncallHandles.g_file_info_set_symlink_target.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(symlinkTarget, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * is set.
     */
    public void unsetAttributeMask() {
        try {
            DowncallHandles.g_file_info_unset_attribute_mask.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_file_info_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileInfo.Builder} object constructs a {@link FileInfo} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileInfo} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileInfo}.
         * @return A new instance of {@code FileInfo} with the properties 
         *         that were set in the Builder object.
         */
        public FileInfo build() {
            return (FileInfo) org.gtk.gobject.GObject.newWithProperties(
                FileInfo.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_file_info_new = Interop.downcallHandle(
            "g_file_info_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_clear_status = Interop.downcallHandle(
            "g_file_info_clear_status",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_copy_into = Interop.downcallHandle(
            "g_file_info_copy_into",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_dup = Interop.downcallHandle(
            "g_file_info_dup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_access_date_time = Interop.downcallHandle(
            "g_file_info_get_access_date_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_as_string = Interop.downcallHandle(
            "g_file_info_get_attribute_as_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_boolean = Interop.downcallHandle(
            "g_file_info_get_attribute_boolean",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_byte_string = Interop.downcallHandle(
            "g_file_info_get_attribute_byte_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_data = Interop.downcallHandle(
            "g_file_info_get_attribute_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_int32 = Interop.downcallHandle(
            "g_file_info_get_attribute_int32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_int64 = Interop.downcallHandle(
            "g_file_info_get_attribute_int64",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_object = Interop.downcallHandle(
            "g_file_info_get_attribute_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_status = Interop.downcallHandle(
            "g_file_info_get_attribute_status",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_string = Interop.downcallHandle(
            "g_file_info_get_attribute_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_stringv = Interop.downcallHandle(
            "g_file_info_get_attribute_stringv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_type = Interop.downcallHandle(
            "g_file_info_get_attribute_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_uint32 = Interop.downcallHandle(
            "g_file_info_get_attribute_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_attribute_uint64 = Interop.downcallHandle(
            "g_file_info_get_attribute_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_content_type = Interop.downcallHandle(
            "g_file_info_get_content_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_creation_date_time = Interop.downcallHandle(
            "g_file_info_get_creation_date_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_deletion_date = Interop.downcallHandle(
            "g_file_info_get_deletion_date",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_display_name = Interop.downcallHandle(
            "g_file_info_get_display_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_edit_name = Interop.downcallHandle(
            "g_file_info_get_edit_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_etag = Interop.downcallHandle(
            "g_file_info_get_etag",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_file_type = Interop.downcallHandle(
            "g_file_info_get_file_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_icon = Interop.downcallHandle(
            "g_file_info_get_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_is_backup = Interop.downcallHandle(
            "g_file_info_get_is_backup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_is_hidden = Interop.downcallHandle(
            "g_file_info_get_is_hidden",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_is_symlink = Interop.downcallHandle(
            "g_file_info_get_is_symlink",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_modification_date_time = Interop.downcallHandle(
            "g_file_info_get_modification_date_time",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_modification_time = Interop.downcallHandle(
            "g_file_info_get_modification_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_name = Interop.downcallHandle(
            "g_file_info_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_size = Interop.downcallHandle(
            "g_file_info_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_sort_order = Interop.downcallHandle(
            "g_file_info_get_sort_order",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_symbolic_icon = Interop.downcallHandle(
            "g_file_info_get_symbolic_icon",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_symlink_target = Interop.downcallHandle(
            "g_file_info_get_symlink_target",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_has_attribute = Interop.downcallHandle(
            "g_file_info_has_attribute",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_has_namespace = Interop.downcallHandle(
            "g_file_info_has_namespace",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_list_attributes = Interop.downcallHandle(
            "g_file_info_list_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_remove_attribute = Interop.downcallHandle(
            "g_file_info_remove_attribute",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_access_date_time = Interop.downcallHandle(
            "g_file_info_set_access_date_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute = Interop.downcallHandle(
            "g_file_info_set_attribute",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_boolean = Interop.downcallHandle(
            "g_file_info_set_attribute_boolean",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_byte_string = Interop.downcallHandle(
            "g_file_info_set_attribute_byte_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_int32 = Interop.downcallHandle(
            "g_file_info_set_attribute_int32",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_int64 = Interop.downcallHandle(
            "g_file_info_set_attribute_int64",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_mask = Interop.downcallHandle(
            "g_file_info_set_attribute_mask",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_object = Interop.downcallHandle(
            "g_file_info_set_attribute_object",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_status = Interop.downcallHandle(
            "g_file_info_set_attribute_status",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_string = Interop.downcallHandle(
            "g_file_info_set_attribute_string",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_stringv = Interop.downcallHandle(
            "g_file_info_set_attribute_stringv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_uint32 = Interop.downcallHandle(
            "g_file_info_set_attribute_uint32",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_attribute_uint64 = Interop.downcallHandle(
            "g_file_info_set_attribute_uint64",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_file_info_set_content_type = Interop.downcallHandle(
            "g_file_info_set_content_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_creation_date_time = Interop.downcallHandle(
            "g_file_info_set_creation_date_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_display_name = Interop.downcallHandle(
            "g_file_info_set_display_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_edit_name = Interop.downcallHandle(
            "g_file_info_set_edit_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_file_type = Interop.downcallHandle(
            "g_file_info_set_file_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_icon = Interop.downcallHandle(
            "g_file_info_set_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_is_hidden = Interop.downcallHandle(
            "g_file_info_set_is_hidden",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_is_symlink = Interop.downcallHandle(
            "g_file_info_set_is_symlink",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_modification_date_time = Interop.downcallHandle(
            "g_file_info_set_modification_date_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_modification_time = Interop.downcallHandle(
            "g_file_info_set_modification_time",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_name = Interop.downcallHandle(
            "g_file_info_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_size = Interop.downcallHandle(
            "g_file_info_set_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_file_info_set_sort_order = Interop.downcallHandle(
            "g_file_info_set_sort_order",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_file_info_set_symbolic_icon = Interop.downcallHandle(
            "g_file_info_set_symbolic_icon",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_set_symlink_target = Interop.downcallHandle(
            "g_file_info_set_symlink_target",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_unset_attribute_mask = Interop.downcallHandle(
            "g_file_info_unset_attribute_mask",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_file_info_get_type = Interop.downcallHandle(
            "g_file_info_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
