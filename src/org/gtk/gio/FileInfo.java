package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Functionality for manipulating basic metadata for files. #GFileInfo
 * implements methods for getting information that all files should
 * contain, and allows for manipulation of extended attributes.
 * 
 * See [GFileAttribute][gio-GFileAttribute] for more information on how
 * GIO handles file attributes.
 * 
 * To obtain a #GFileInfo for a #GFile, use g_file_query_info() (or its
 * async variant). To obtain a #GFileInfo for a file input or output
 * stream, use g_file_input_stream_query_info() or
 * g_file_output_stream_query_info() (or their async variants).
 * 
 * To change the actual attributes of a file, you should then set the
 * attribute in the #GFileInfo and call g_file_set_attributes_from_info()
 * or g_file_set_attributes_async() on a GFile.
 * 
 * However, not all attributes can be changed in the file. For instance,
 * the actual size of a file cannot be changed via g_file_info_set_size().
 * You may call g_file_query_settable_attributes() and
 * g_file_query_writable_namespaces() to discover the settable attributes
 * of a particular file at runtime.
 * 
 * The direct accessors, such as g_file_info_get_name(), are slightly more
 * optimized than the generic attribute accessors, such as
 * g_file_info_get_attribute_byte_string().This optimization will matter
 * only if calling the API in a tight loop.
 * 
 * #GFileAttributeMatcher allows for searching through a #GFileInfo for
 * attributes.
 */
public class FileInfo extends org.gtk.gobject.Object {

    public FileInfo(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to FileInfo */
    public static FileInfo castFrom(org.gtk.gobject.Object gobject) {
        return new FileInfo(gobject.getProxy());
    }
    
    /**
     * Creates a new file info structure.
     */
    public FileInfo() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_new(), true));
    }
    
    /**
     * Clears the status information from @info.
     */
    public void clearStatus() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_clear_status(HANDLE());
    }
    
    /**
     * First clears all of the [GFileAttribute][gio-GFileAttribute] of @dest_info,
     * and then copies all of the file attributes from @src_info to @dest_info.
     */
    public void copyInto(FileInfo destInfo) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_copy_into(HANDLE(), destInfo.HANDLE());
    }
    
    /**
     * Duplicates a file info structure.
     */
    public FileInfo dup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_dup(HANDLE());
        return new FileInfo(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the access time of the current @info and returns it as a
     * #GDateTime.
     * 
     * This requires the %G_FILE_ATTRIBUTE_TIME_ACCESS attribute. If
     * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC is provided, the resulting #GDateTime
     * will have microsecond precision.
     */
    public org.gtk.glib.DateTime getAccessDateTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_access_date_time(HANDLE());
        return new org.gtk.glib.DateTime(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the value of a attribute, formatted as a string.
     * This escapes things as needed to make the string valid
     * UTF-8.
     */
    public java.lang.String getAttributeAsString(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_as_string(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * contain a boolean value, %FALSE will be returned.
     */
    public boolean getAttributeBoolean(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_boolean(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of a byte string attribute. If the attribute does
     * not contain a byte string, %NULL will be returned.
     */
    public java.lang.String getAttributeByteString(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_byte_string(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * attribute does not contain a signed 32-bit integer, or is invalid,
     * 0 will be returned.
     */
    public int getAttributeInt32(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_int32(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT;
    }
    
    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * attribute does not contain a signed 64-bit integer, or is invalid,
     * 0 will be returned.
     */
    public long getAttributeInt64(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_int64(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of a #GObject attribute. If the attribute does
     * not contain a #GObject, %NULL will be returned.
     */
    public org.gtk.gobject.Object getAttributeObject(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_object(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return new org.gtk.gobject.Object(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the attribute status for an attribute key.
     */
    public FileAttributeStatus getAttributeStatus(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_status(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return FileAttributeStatus.fromValue(RESULT);
    }
    
    /**
     * Gets the value of a string attribute. If the attribute does
     * not contain a string, %NULL will be returned.
     */
    public java.lang.String getAttributeString(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_string(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the attribute type for an attribute key.
     */
    public FileAttributeType getAttributeType(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_type(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return FileAttributeType.fromValue(RESULT);
    }
    
    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 32-bit integer, or is invalid,
     * 0 will be returned.
     */
    public int getAttributeUint32(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_uint32(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT;
    }
    
    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 64-bit integer, or is invalid,
     * 0 will be returned.
     */
    public long getAttributeUint64(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_attribute_uint64(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the file's content type.
     */
    public java.lang.String getContentType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_content_type(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the creation time of the current @info and returns it as a
     * #GDateTime.
     * 
     * This requires the %G_FILE_ATTRIBUTE_TIME_CREATED attribute. If
     * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC is provided, the resulting #GDateTime
     * will have microsecond precision.
     */
    public org.gtk.glib.DateTime getCreationDateTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_creation_date_time(HANDLE());
        return new org.gtk.glib.DateTime(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Returns the #GDateTime representing the deletion date of the file, as
     * available in G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, %NULL is returned.
     */
    public org.gtk.glib.DateTime getDeletionDate() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_deletion_date(HANDLE());
        return new org.gtk.glib.DateTime(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     */
    public java.lang.String getDisplayName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_display_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the edit name for a file.
     */
    public java.lang.String getEditName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_edit_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the [entity tag][gfile-etag] for a given
     * #GFileInfo. See %G_FILE_ATTRIBUTE_ETAG_VALUE.
     */
    public java.lang.String getEtag() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_etag(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a file's type (whether it is a regular file, symlink, etc).
     * This is different from the file's content type, see g_file_info_get_content_type().
     */
    public FileType getFileType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_file_type(HANDLE());
        return FileType.fromValue(RESULT);
    }
    
    /**
     * Gets the icon for a file.
     */
    public Icon getIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Checks if a file is a backup file.
     */
    public boolean getIsBackup() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_is_backup(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a file is hidden.
     */
    public boolean getIsHidden() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_is_hidden(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a file is a symlink.
     */
    public boolean getIsSymlink() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_is_symlink(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the modification time of the current @info and returns it as a
     * #GDateTime.
     * 
     * This requires the %G_FILE_ATTRIBUTE_TIME_MODIFIED attribute. If
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC is provided, the resulting #GDateTime
     * will have microsecond precision.
     */
    public org.gtk.glib.DateTime getModificationDateTime() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_modification_date_time(HANDLE());
        return new org.gtk.glib.DateTime(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the name for a file. This is guaranteed to always be set.
     */
    public java.lang.String getName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the file's size (in bytes). The size is retrieved through the value of
     * the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute and is converted
     * from #guint64 to #goffset before returning the result.
     */
    public long getSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the value of the sort_order attribute from the #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     */
    public int getSortOrder() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_sort_order(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the symbolic icon for a file.
     */
    public Icon getSymbolicIcon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_symbolic_icon(HANDLE());
        return new Icon.IconImpl(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the symlink target for a given #GFileInfo.
     */
    public java.lang.String getSymlinkTarget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_get_symlink_target(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if a file info structure has an attribute named @attribute.
     */
    public boolean hasAttribute(java.lang.String attribute) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_has_attribute(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a file info structure has an attribute in the
     * specified @name_space.
     */
    public boolean hasNamespace(java.lang.String nameSpace) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_has_namespace(HANDLE(), Interop.allocateNativeString(nameSpace).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Removes all cases of @attribute from @info if it exists.
     */
    public void removeAttribute(java.lang.String attribute) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_remove_attribute(HANDLE(), Interop.allocateNativeString(attribute).HANDLE());
    }
    
    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_ACCESS and
     * %G_FILE_ATTRIBUTE_TIME_ACCESS_USEC attributes in the file info to the
     * given date/time value.
     */
    public void setAccessDateTime(org.gtk.glib.DateTime atime) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_access_date_time(HANDLE(), atime.HANDLE());
    }
    
    /**
     * Sets the @attribute to contain the given value, if possible. To unset the
     * attribute, use %G_FILE_ATTRIBUTE_TYPE_INVALID for @type.
     */
    public void setAttribute(java.lang.String attribute, FileAttributeType type, jdk.incubator.foreign.MemoryAddress valueP) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), type.getValue(), valueP);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeBoolean(java.lang.String attribute, boolean attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_boolean(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), attrValue ? 1 : 0);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeByteString(java.lang.String attribute, java.lang.String attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_byte_string(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), Interop.allocateNativeString(attrValue).HANDLE());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeInt32(java.lang.String attribute, int attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_int32(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), attrValue);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeInt64(java.lang.String attribute, long attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_int64(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), attrValue);
    }
    
    /**
     * Sets @mask on @info to match specific attribute types.
     */
    public void setAttributeMask(FileAttributeMatcher mask) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_mask(HANDLE(), mask.HANDLE());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeObject(java.lang.String attribute, org.gtk.gobject.Object attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_object(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), attrValue.HANDLE());
    }
    
    /**
     * Sets the attribute status for an attribute key. This is only
     * needed by external code that implement g_file_set_attributes_from_info()
     * or similar functions.
     * 
     * The attribute must exist in @info for this to work. Otherwise %FALSE
     * is returned and @info is unchanged.
     */
    public boolean setAttributeStatus(java.lang.String attribute, FileAttributeStatus status) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_status(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), status.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeString(java.lang.String attribute, java.lang.String attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_string(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), Interop.allocateNativeString(attrValue).HANDLE());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     * 
     * Sinze: 2.22
     */
    public void setAttributeStringv(java.lang.String attribute, java.lang.String[] attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_stringv(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), Interop.allocateNativeArray(attrValue));
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeUint32(java.lang.String attribute, int attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_uint32(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), attrValue);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeUint64(java.lang.String attribute, long attrValue) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_attribute_uint64(HANDLE(), Interop.allocateNativeString(attribute).HANDLE(), attrValue);
    }
    
    /**
     * Sets the content type attribute for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE.
     */
    public void setContentType(java.lang.String contentType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_content_type(HANDLE(), Interop.allocateNativeString(contentType).HANDLE());
    }
    
    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_CREATED and
     * %G_FILE_ATTRIBUTE_TIME_CREATED_USEC attributes in the file info to the
     * given date/time value.
     */
    public void setCreationDateTime(org.gtk.glib.DateTime creationTime) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_creation_date_time(HANDLE(), creationTime.HANDLE());
    }
    
    /**
     * Sets the display name for the current #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME.
     */
    public void setDisplayName(java.lang.String displayName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_display_name(HANDLE(), Interop.allocateNativeString(displayName).HANDLE());
    }
    
    /**
     * Sets the edit name for the current file.
     * See %G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME.
     */
    public void setEditName(java.lang.String editName) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_edit_name(HANDLE(), Interop.allocateNativeString(editName).HANDLE());
    }
    
    /**
     * Sets the file type in a #GFileInfo to @type.
     * See %G_FILE_ATTRIBUTE_STANDARD_TYPE.
     */
    public void setFileType(FileType type) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_file_type(HANDLE(), type.getValue());
    }
    
    /**
     * Sets the icon for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_ICON.
     */
    public void setIcon(Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_icon(HANDLE(), icon.HANDLE());
    }
    
    /**
     * Sets the "is_hidden" attribute in a #GFileInfo according to @is_hidden.
     * See %G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN.
     */
    public void setIsHidden(boolean isHidden) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_is_hidden(HANDLE(), isHidden ? 1 : 0);
    }
    
    /**
     * Sets the "is_symlink" attribute in a #GFileInfo according to @is_symlink.
     * See %G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK.
     */
    public void setIsSymlink(boolean isSymlink) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_is_symlink(HANDLE(), isSymlink ? 1 : 0);
    }
    
    /**
     * Sets the %G_FILE_ATTRIBUTE_TIME_MODIFIED and
     * %G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC attributes in the file info to the
     * given date/time value.
     */
    public void setModificationDateTime(org.gtk.glib.DateTime mtime) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_modification_date_time(HANDLE(), mtime.HANDLE());
    }
    
    /**
     * Sets the name attribute for the current #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_NAME.
     */
    public void setName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_name(HANDLE(), Interop.allocateNativeString(name).HANDLE());
    }
    
    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SIZE attribute in the file info
     * to the given size.
     */
    public void setSize(long size) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_size(HANDLE(), size);
    }
    
    /**
     * Sets the sort order attribute in the file info structure. See
     * %G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER.
     */
    public void setSortOrder(int sortOrder) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_sort_order(HANDLE(), sortOrder);
    }
    
    /**
     * Sets the symbolic icon for a given #GFileInfo.
     * See %G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON.
     */
    public void setSymbolicIcon(Icon icon) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_symbolic_icon(HANDLE(), icon.HANDLE());
    }
    
    /**
     * Sets the %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET attribute in the file info
     * to the given symlink target.
     */
    public void setSymlinkTarget(java.lang.String symlinkTarget) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_set_symlink_target(HANDLE(), Interop.allocateNativeString(symlinkTarget).HANDLE());
    }
    
    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * is set.
     */
    public void unsetAttributeMask() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_file_info_unset_attribute_mask(HANDLE());
    }
    
}
