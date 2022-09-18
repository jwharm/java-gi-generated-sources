package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Functionality for manipulating basic metadata for files. {@link org.gtk.gio.FileInfo} implements methods for getting information that all files should
 * contain, and allows for manipulation of extended attributes.
 * 
 * See {@link [GFileAttribute]}{@link [gio-GFileAttribute]} for more information on how
 * GIO handles file attributes.
 * 
 * To obtain a {@link org.gtk.gio.FileInfo} for a {@link org.gtk.gio.File}  use g_file_query_info() (or its
 * async variant). To obtain a {@link org.gtk.gio.FileInfo} for a file input or output
 * stream, use g_file_input_stream_query_info() or
 * g_file_output_stream_query_info() (or their async variants).
 * 
 * To change the actual attributes of a file, you should then set the
 * attribute in the {@link org.gtk.gio.FileInfo} and call g_file_set_attributes_from_info()
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
 * {@link org.gtk.gio.FileAttributeMatcher} allows for searching through a {@link org.gtk.gio.FileInfo} for
 * attributes.
 */
public class FileInfo extends org.gtk.gobject.Object {

    public FileInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileInfo */
    public static FileInfo castFrom(org.gtk.gobject.Object gobject) {
        return new FileInfo(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_file_info_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new file info structure.
     */
    public FileInfo() {
        super(constructNew());
    }
    
    /**
     * Clears the status information from @info.
     */
    public void clearStatus() {
        gtk_h.g_file_info_clear_status(handle());
    }
    
    /**
     * First clears all of the {@link [GFileAttribute]}{@link [gio-GFileAttribute]} of @dest_info,
     * and then copies all of the file attributes from @src_info to @dest_info.
     */
    public void copyInto(FileInfo destInfo) {
        gtk_h.g_file_info_copy_into(handle(), destInfo.handle());
    }
    
    /**
     * Duplicates a file info structure.
     */
    public FileInfo dup() {
        var RESULT = gtk_h.g_file_info_dup(handle());
        return new FileInfo(References.get(RESULT, true));
    }
    
    /**
     * Gets the access time of the current @info and returns it as a
     * {@link org.gtk.glib.DateTime} 
     * 
     * This requires the <code>G_FILE_ATTRIBUTE_TIME_ACCESS</code> attribute. If
     * <code>G_FILE_ATTRIBUTE_TIME_ACCESS_USEC</code> is provided, the resulting {@link org.gtk.glib.DateTime} will have microsecond precision.
     */
    public org.gtk.glib.DateTime getAccessDateTime() {
        var RESULT = gtk_h.g_file_info_get_access_date_time(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Gets the value of a attribute, formatted as a string.
     * This escapes things as needed to make the string valid
     * UTF-8.
     */
    public java.lang.String getAttributeAsString(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_as_string(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the value of a boolean attribute. If the attribute does not
     * contain a boolean value, <code>false</code> will be returned.
     */
    public boolean getAttributeBoolean(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_boolean(handle(), Interop.allocateNativeString(attribute).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value of a byte string attribute. If the attribute does
     * not contain a byte string, <code>null</code> will be returned.
     */
    public java.lang.String getAttributeByteString(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_byte_string(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a signed 32-bit integer contained within the attribute. If the
     * attribute does not contain a signed 32-bit integer, or is invalid,
     * 0 will be returned.
     */
    public int getAttributeInt32(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_int32(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT;
    }
    
    /**
     * Gets a signed 64-bit integer contained within the attribute. If the
     * attribute does not contain a signed 64-bit integer, or is invalid,
     * 0 will be returned.
     */
    public long getAttributeInt64(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_int64(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT;
    }
    
    /**
     * Gets the value of a {@link org.gtk.gobject.Object} attribute. If the attribute does
     * not contain a {@link org.gtk.gobject.Object}  <code>null</code> will be returned.
     */
    public org.gtk.gobject.Object getAttributeObject(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_object(handle(), Interop.allocateNativeString(attribute).handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets the attribute status for an attribute key.
     */
    public FileAttributeStatus getAttributeStatus(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_status(handle(), Interop.allocateNativeString(attribute).handle());
        return FileAttributeStatus.fromValue(RESULT);
    }
    
    /**
     * Gets the value of a string attribute. If the attribute does
     * not contain a string, <code>null</code> will be returned.
     */
    public java.lang.String getAttributeString(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_string(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the attribute type for an attribute key.
     */
    public FileAttributeType getAttributeType(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_type(handle(), Interop.allocateNativeString(attribute).handle());
        return FileAttributeType.fromValue(RESULT);
    }
    
    /**
     * Gets an unsigned 32-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 32-bit integer, or is invalid,
     * 0 will be returned.
     */
    public int getAttributeUint32(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_uint32(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT;
    }
    
    /**
     * Gets a unsigned 64-bit integer contained within the attribute. If the
     * attribute does not contain an unsigned 64-bit integer, or is invalid,
     * 0 will be returned.
     */
    public long getAttributeUint64(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_get_attribute_uint64(handle(), Interop.allocateNativeString(attribute).handle());
        return RESULT;
    }
    
    /**
     * Gets the file&<code>#39</code> s content type.
     */
    public java.lang.String getContentType() {
        var RESULT = gtk_h.g_file_info_get_content_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the creation time of the current @info and returns it as a
     * {@link org.gtk.glib.DateTime} 
     * 
     * This requires the <code>G_FILE_ATTRIBUTE_TIME_CREATED</code> attribute. If
     * <code>G_FILE_ATTRIBUTE_TIME_CREATED_USEC</code> is provided, the resulting {@link org.gtk.glib.DateTime} will have microsecond precision.
     */
    public org.gtk.glib.DateTime getCreationDateTime() {
        var RESULT = gtk_h.g_file_info_get_creation_date_time(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Returns the {@link org.gtk.glib.DateTime} representing the deletion date of the file, as
     * available in G_FILE_ATTRIBUTE_TRASH_DELETION_DATE. If the
     * G_FILE_ATTRIBUTE_TRASH_DELETION_DATE attribute is unset, <code>null</code> is returned.
     */
    public org.gtk.glib.DateTime getDeletionDate() {
        var RESULT = gtk_h.g_file_info_get_deletion_date(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Gets a display name for a file. This is guaranteed to always be set.
     */
    public java.lang.String getDisplayName() {
        var RESULT = gtk_h.g_file_info_get_display_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the edit name for a file.
     */
    public java.lang.String getEditName() {
        var RESULT = gtk_h.g_file_info_get_edit_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the {@link [entity tag]}{@link [gfile-etag]} for a given
     * {@link org.gtk.gio.FileInfo}  See <code>G_FILE_ATTRIBUTE_ETAG_VALUE</code>
     */
    public java.lang.String getEtag() {
        var RESULT = gtk_h.g_file_info_get_etag(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a file&<code>#39</code> s type (whether it is a regular file, symlink, etc).
     * This is different from the file&<code>#39</code> s content type, see g_file_info_get_content_type().
     */
    public FileType getFileType() {
        var RESULT = gtk_h.g_file_info_get_file_type(handle());
        return FileType.fromValue(RESULT);
    }
    
    /**
     * Gets the icon for a file.
     */
    public Icon getIcon() {
        var RESULT = gtk_h.g_file_info_get_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Checks if a file is a backup file.
     */
    public boolean getIsBackup() {
        var RESULT = gtk_h.g_file_info_get_is_backup(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a file is hidden.
     */
    public boolean getIsHidden() {
        var RESULT = gtk_h.g_file_info_get_is_hidden(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a file is a symlink.
     */
    public boolean getIsSymlink() {
        var RESULT = gtk_h.g_file_info_get_is_symlink(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the modification time of the current @info and returns it as a
     * {@link org.gtk.glib.DateTime} 
     * 
     * This requires the <code>G_FILE_ATTRIBUTE_TIME_MODIFIED</code> attribute. If
     * <code>G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC</code> is provided, the resulting {@link org.gtk.glib.DateTime} will have microsecond precision.
     */
    public org.gtk.glib.DateTime getModificationDateTime() {
        var RESULT = gtk_h.g_file_info_get_modification_date_time(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, true));
    }
    
    /**
     * Gets the name for a file. This is guaranteed to always be set.
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.g_file_info_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the file&<code>#39</code> s size (in bytes). The size is retrieved through the value of
     * the <code>G_FILE_ATTRIBUTE_STANDARD_SIZE</code> attribute and is converted
     * from <code>#guint64</code> to <code>#goffset</code> before returning the result.
     */
    public long getSize() {
        var RESULT = gtk_h.g_file_info_get_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the value of the sort_order attribute from the {@link org.gtk.gio.FileInfo} 
     * See <code>G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER</code>
     */
    public int getSortOrder() {
        var RESULT = gtk_h.g_file_info_get_sort_order(handle());
        return RESULT;
    }
    
    /**
     * Gets the symbolic icon for a file.
     */
    public Icon getSymbolicIcon() {
        var RESULT = gtk_h.g_file_info_get_symbolic_icon(handle());
        return new Icon.IconImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the symlink target for a given {@link org.gtk.gio.FileInfo}
     */
    public java.lang.String getSymlinkTarget() {
        var RESULT = gtk_h.g_file_info_get_symlink_target(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks if a file info structure has an attribute named @attribute.
     */
    public boolean hasAttribute(java.lang.String attribute) {
        var RESULT = gtk_h.g_file_info_has_attribute(handle(), Interop.allocateNativeString(attribute).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if a file info structure has an attribute in the
     * specified @name_space.
     */
    public boolean hasNamespace(java.lang.String nameSpace) {
        var RESULT = gtk_h.g_file_info_has_namespace(handle(), Interop.allocateNativeString(nameSpace).handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes all cases of @attribute from @info if it exists.
     */
    public void removeAttribute(java.lang.String attribute) {
        gtk_h.g_file_info_remove_attribute(handle(), Interop.allocateNativeString(attribute).handle());
    }
    
    /**
     * Sets the <code>G_FILE_ATTRIBUTE_TIME_ACCESS</code> and
     * <code>G_FILE_ATTRIBUTE_TIME_ACCESS_USEC</code> attributes in the file info to the
     * given date/time value.
     */
    public void setAccessDateTime(org.gtk.glib.DateTime atime) {
        gtk_h.g_file_info_set_access_date_time(handle(), atime.handle());
    }
    
    /**
     * Sets the @attribute to contain the given value, if possible. To unset the
     * attribute, use {@link org.gtk.gio.FileAttributeType<code>#INVALID</code>  for @type.
     */
    public void setAttribute(java.lang.String attribute, FileAttributeType type, jdk.incubator.foreign.MemoryAddress valueP) {
        gtk_h.g_file_info_set_attribute(handle(), Interop.allocateNativeString(attribute).handle(), type.getValue(), valueP);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeBoolean(java.lang.String attribute, boolean attrValue) {
        gtk_h.g_file_info_set_attribute_boolean(handle(), Interop.allocateNativeString(attribute).handle(), attrValue ? 1 : 0);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeByteString(java.lang.String attribute, java.lang.String attrValue) {
        gtk_h.g_file_info_set_attribute_byte_string(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(attrValue).handle());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeInt32(java.lang.String attribute, int attrValue) {
        gtk_h.g_file_info_set_attribute_int32(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeInt64(java.lang.String attribute, long attrValue) {
        gtk_h.g_file_info_set_attribute_int64(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
    }
    
    /**
     * Sets @mask on @info to match specific attribute types.
     */
    public void setAttributeMask(FileAttributeMatcher mask) {
        gtk_h.g_file_info_set_attribute_mask(handle(), mask.handle());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeObject(java.lang.String attribute, org.gtk.gobject.Object attrValue) {
        gtk_h.g_file_info_set_attribute_object(handle(), Interop.allocateNativeString(attribute).handle(), attrValue.handle());
    }
    
    /**
     * Sets the attribute status for an attribute key. This is only
     * needed by external code that implement g_file_set_attributes_from_info()
     * or similar functions.
     * 
     * The attribute must exist in @info for this to work. Otherwise <code>false</code> is returned and @info is unchanged.
     */
    public boolean setAttributeStatus(java.lang.String attribute, FileAttributeStatus status) {
        var RESULT = gtk_h.g_file_info_set_attribute_status(handle(), Interop.allocateNativeString(attribute).handle(), status.getValue());
        return (RESULT != 0);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeString(java.lang.String attribute, java.lang.String attrValue) {
        gtk_h.g_file_info_set_attribute_string(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeString(attrValue).handle());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     * 
     * Sinze: 2.22
     */
    public void setAttributeStringv(java.lang.String attribute, java.lang.String[] attrValue) {
        gtk_h.g_file_info_set_attribute_stringv(handle(), Interop.allocateNativeString(attribute).handle(), Interop.allocateNativeArray(attrValue).handle());
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeUint32(java.lang.String attribute, int attrValue) {
        gtk_h.g_file_info_set_attribute_uint32(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
    }
    
    /**
     * Sets the @attribute to contain the given @attr_value,
     * if possible.
     */
    public void setAttributeUint64(java.lang.String attribute, long attrValue) {
        gtk_h.g_file_info_set_attribute_uint64(handle(), Interop.allocateNativeString(attribute).handle(), attrValue);
    }
    
    /**
     * Sets the content type attribute for a given {@link org.gtk.gio.FileInfo} 
     * See <code>G_FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE</code>
     */
    public void setContentType(java.lang.String contentType) {
        gtk_h.g_file_info_set_content_type(handle(), Interop.allocateNativeString(contentType).handle());
    }
    
    /**
     * Sets the <code>G_FILE_ATTRIBUTE_TIME_CREATED</code> and
     * <code>G_FILE_ATTRIBUTE_TIME_CREATED_USEC</code> attributes in the file info to the
     * given date/time value.
     */
    public void setCreationDateTime(org.gtk.glib.DateTime creationTime) {
        gtk_h.g_file_info_set_creation_date_time(handle(), creationTime.handle());
    }
    
    /**
     * Sets the display name for the current {@link org.gtk.gio.FileInfo} 
     * See <code>G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME</code>
     */
    public void setDisplayName(java.lang.String displayName) {
        gtk_h.g_file_info_set_display_name(handle(), Interop.allocateNativeString(displayName).handle());
    }
    
    /**
     * Sets the edit name for the current file.
     * See <code>G_FILE_ATTRIBUTE_STANDARD_EDIT_NAME</code>
     */
    public void setEditName(java.lang.String editName) {
        gtk_h.g_file_info_set_edit_name(handle(), Interop.allocateNativeString(editName).handle());
    }
    
    /**
     * Sets the file type in a {@link org.gtk.gio.FileInfo} to @type.
     * See <code>G_FILE_ATTRIBUTE_STANDARD_TYPE</code>
     */
    public void setFileType(FileType type) {
        gtk_h.g_file_info_set_file_type(handle(), type.getValue());
    }
    
    /**
     * Sets the icon for a given {@link org.gtk.gio.FileInfo} 
     * See <code>G_FILE_ATTRIBUTE_STANDARD_ICON</code>
     */
    public void setIcon(Icon icon) {
        gtk_h.g_file_info_set_icon(handle(), icon.handle());
    }
    
    /**
     * Sets the &<code>#34</code> is_hidden&<code>#34</code>  attribute in a {@link org.gtk.gio.FileInfo} according to @is_hidden.
     * See <code>G_FILE_ATTRIBUTE_STANDARD_IS_HIDDEN</code>
     */
    public void setIsHidden(boolean isHidden) {
        gtk_h.g_file_info_set_is_hidden(handle(), isHidden ? 1 : 0);
    }
    
    /**
     * Sets the &<code>#34</code> is_symlink&<code>#34</code>  attribute in a {@link org.gtk.gio.FileInfo} according to @is_symlink.
     * See <code>G_FILE_ATTRIBUTE_STANDARD_IS_SYMLINK</code>
     */
    public void setIsSymlink(boolean isSymlink) {
        gtk_h.g_file_info_set_is_symlink(handle(), isSymlink ? 1 : 0);
    }
    
    /**
     * Sets the <code>G_FILE_ATTRIBUTE_TIME_MODIFIED</code> and
     * <code>G_FILE_ATTRIBUTE_TIME_MODIFIED_USEC</code> attributes in the file info to the
     * given date/time value.
     */
    public void setModificationDateTime(org.gtk.glib.DateTime mtime) {
        gtk_h.g_file_info_set_modification_date_time(handle(), mtime.handle());
    }
    
    /**
     * Sets the name attribute for the current {@link org.gtk.gio.FileInfo} 
     * See <code>G_FILE_ATTRIBUTE_STANDARD_NAME</code>
     */
    public void setName(java.lang.String name) {
        gtk_h.g_file_info_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the <code>G_FILE_ATTRIBUTE_STANDARD_SIZE</code> attribute in the file info
     * to the given size.
     */
    public void setSize(long size) {
        gtk_h.g_file_info_set_size(handle(), size);
    }
    
    /**
     * Sets the sort order attribute in the file info structure. See
     * <code>G_FILE_ATTRIBUTE_STANDARD_SORT_ORDER</code>
     */
    public void setSortOrder(int sortOrder) {
        gtk_h.g_file_info_set_sort_order(handle(), sortOrder);
    }
    
    /**
     * Sets the symbolic icon for a given {@link org.gtk.gio.FileInfo} 
     * See <code>G_FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON</code>
     */
    public void setSymbolicIcon(Icon icon) {
        gtk_h.g_file_info_set_symbolic_icon(handle(), icon.handle());
    }
    
    /**
     * Sets the <code>G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET</code> attribute in the file info
     * to the given symlink target.
     */
    public void setSymlinkTarget(java.lang.String symlinkTarget) {
        gtk_h.g_file_info_set_symlink_target(handle(), Interop.allocateNativeString(symlinkTarget).handle());
    }
    
    /**
     * Unsets a mask set by g_file_info_set_attribute_mask(), if one
     * is set.
     */
    public void unsetAttributeMask() {
        gtk_h.g_file_info_unset_attribute_mask(handle());
    }
    
}
