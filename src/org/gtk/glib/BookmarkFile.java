package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure representing a set of bookmarks.
 */
public class BookmarkFile extends io.github.jwharm.javagi.interop.ResourceBase {

    public BookmarkFile(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds the application with @name and @exec to the list of
     * applications that have registered a bookmark for @uri into
     * @bookmark.
     * 
     * Every bookmark inside a #GBookmarkFile must have at least an
     * application registered.  Each application must provide a name, a
     * command line useful for launching the bookmark, the number of times
     * the bookmark has been registered by the application and the last
     * time the application registered this bookmark.
     * 
     * If @name is %NULL, the name of the application will be the
     * same returned by g_get_application_name(); if @exec is %NULL, the
     * command line will be a composition of the program name as
     * returned by g_get_prgname() and the "\\%u" modifier, which will be
     * expanded to the bookmark's URI.
     * 
     * This function will automatically take care of updating the
     * registrations count and timestamping in case an application
     * with the same @name had already registered a bookmark for
     * @uri inside @bookmark.
     * 
     * If no bookmark for @uri is found, one is created.
     */
    public void addApplication(java.lang.String uri, java.lang.String name, java.lang.String exec) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_add_application(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(name).HANDLE(), Interop.allocateNativeString(exec).HANDLE());
    }
    
    /**
     * Adds @group to the list of groups to which the bookmark for @uri
     * belongs to.
     * 
     * If no bookmark for @uri is found then it is created.
     */
    public void addGroup(java.lang.String uri, java.lang.String group) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_add_group(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(group).HANDLE());
    }
    
    /**
     * Frees a #GBookmarkFile.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_free(HANDLE());
    }
    
    /**
     * Gets the time the bookmark for @uri was added to @bookmark
     * 
     * In the event the URI cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public DateTime getAddedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_added_date_time(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new DateTime(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the description of the bookmark for @uri.
     * 
     * In the event the URI cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public java.lang.String getDescription(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_description(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the icon of the bookmark for @uri.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public boolean getIcon(java.lang.String uri, java.lang.String[] href, java.lang.String[] mimeType) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_icon(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeArray(href), Interop.allocateNativeArray(mimeType), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the private flag of the bookmark for @uri is set.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * event that the private flag cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     */
    public boolean getIsPrivate(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_is_private(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the MIME type of the resource pointed by @uri.
     * 
     * In the event the URI cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.  In the
     * event that the MIME type cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     */
    public java.lang.String getMimeType(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_mime_type(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the time when the bookmark for @uri was last modified.
     * 
     * In the event the URI cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public DateTime getModifiedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_modified_date_time(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new DateTime(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of bookmarks inside @bookmark.
     */
    public int getSize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_size(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the title of the bookmark for @uri.
     * 
     * If @uri is %NULL, the title of @bookmark is returned.
     * 
     * In the event the URI cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public java.lang.String getTitle(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_title(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the time the bookmark for @uri was last visited.
     * 
     * In the event the URI cannot be found, %NULL is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public DateTime getVisitedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_get_visited_date_time(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new DateTime(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the bookmark for @uri inside @bookmark has been
     * registered by application @name.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public boolean hasApplication(java.lang.String uri, java.lang.String name) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_has_application(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(name).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @group appears in the list of groups to which
     * the bookmark for @uri belongs to.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public boolean hasGroup(java.lang.String uri, java.lang.String group) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_has_group(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(group).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Looks whether the desktop bookmark has an item with its URI set to @uri.
     */
    public boolean hasItem(java.lang.String uri) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_has_item(HANDLE(), Interop.allocateNativeString(uri).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Loads a bookmark file from memory into an empty #GBookmarkFile
     * structure.  If the object cannot be created then @error is set to a
     * #GBookmarkFileError.
     */
    public boolean loadFromData(byte[] data, long length) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_load_from_data(HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_BYTE, data), length, GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * This function looks for a desktop bookmark file named @file in the
     * paths returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into @bookmark and returns the file's full path in
     * @full_path.  If the file could not be loaded then @error is
     * set to either a #GFileError or #GBookmarkFileError.
     */
    public boolean loadFromDataDirs(java.lang.String file, java.lang.String[] fullPath) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_load_from_data_dirs(HANDLE(), Interop.allocateNativeString(file).HANDLE(), Interop.allocateNativeArray(fullPath), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Loads a desktop bookmark file into an empty #GBookmarkFile structure.
     * If the file could not be loaded then @error is set to either a #GFileError
     * or #GBookmarkFileError.
     */
    public boolean loadFromFile(java.lang.String filename) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_load_from_file(HANDLE(), Interop.allocateNativeString(filename).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Changes the URI of a bookmark item from @old_uri to @new_uri.  Any
     * existing bookmark for @new_uri will be overwritten.  If @new_uri is
     * %NULL, then the bookmark is removed.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     */
    public boolean moveItem(java.lang.String oldUri, java.lang.String newUri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_move_item(HANDLE(), Interop.allocateNativeString(oldUri).HANDLE(), Interop.allocateNativeString(newUri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes application registered with @name from the list of applications
     * that have registered a bookmark for @uri inside @bookmark.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * In the event that no application with name @app_name has registered
     * a bookmark for @uri,  %FALSE is returned and error is set to
     * %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.
     */
    public boolean removeApplication(java.lang.String uri, java.lang.String name) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_remove_application(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(name).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes @group from the list of groups to which the bookmark
     * for @uri belongs to.
     * 
     * In the event the URI cannot be found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND.
     * In the event no group was defined, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_INVALID_VALUE.
     */
    public boolean removeGroup(java.lang.String uri, java.lang.String group) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_remove_group(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(group).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Removes the bookmark for @uri from the bookmark file @bookmark.
     */
    public boolean removeItem(java.lang.String uri) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_remove_item(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the time the bookmark for @uri was added into @bookmark.
     * 
     * If no bookmark for @uri is found then it is created.
     */
    public void setAddedDateTime(java.lang.String uri, DateTime added) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_added_date_time(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), added.HANDLE());
    }
    
    /**
     * Sets the meta-data of application @name inside the list of
     * applications that have registered a bookmark for @uri inside
     * @bookmark.
     * 
     * You should rarely use this function; use g_bookmark_file_add_application()
     * and g_bookmark_file_remove_application() instead.
     * 
     * @name can be any UTF-8 encoded string used to identify an
     * application.
     * @exec can have one of these two modifiers: "\\%f", which will
     * be expanded as the local file name retrieved from the bookmark's
     * URI; "\\%u", which will be expanded as the bookmark's URI.
     * The expansion is done automatically when retrieving the stored
     * command line using the g_bookmark_file_get_application_info() function.
     * @count is the number of times the application has registered the
     * bookmark; if is < 0, the current registration count will be increased
     * by one, if is 0, the application with @name will be removed from
     * the list of registered applications.
     * @stamp is the Unix time of the last registration.
     * 
     * If you try to remove an application by setting its registration count to
     * zero, and no bookmark for @uri is found, %FALSE is returned and
     * @error is set to %G_BOOKMARK_FILE_ERROR_URI_NOT_FOUND; similarly,
     * in the event that no application @name has registered a bookmark
     * for @uri,  %FALSE is returned and error is set to
     * %G_BOOKMARK_FILE_ERROR_APP_NOT_REGISTERED.  Otherwise, if no bookmark
     * for @uri is found, one is created.
     */
    public boolean setApplicationInfo(java.lang.String uri, java.lang.String name, java.lang.String exec, int count, DateTime stamp) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_application_info(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(name).HANDLE(), Interop.allocateNativeString(exec).HANDLE(), count, stamp.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets @description as the description of the bookmark for @uri.
     * 
     * If @uri is %NULL, the description of @bookmark is set.
     * 
     * If a bookmark for @uri cannot be found then it is created.
     */
    public void setDescription(java.lang.String uri, java.lang.String description) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_description(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(description).HANDLE());
    }
    
    /**
     * Sets a list of group names for the item with URI @uri.  Each previously
     * set group name list is removed.
     * 
     * If @uri cannot be found then an item for it is created.
     */
    public void setGroups(java.lang.String uri, java.lang.String[] groups, long length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_groups(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeArray(groups), length);
    }
    
    /**
     * Sets the icon for the bookmark for @uri. If @href is %NULL, unsets
     * the currently set icon. @href can either be a full URL for the icon
     * file or the icon name following the Icon Naming specification.
     * 
     * If no bookmark for @uri is found one is created.
     */
    public void setIcon(java.lang.String uri, java.lang.String href, java.lang.String mimeType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_icon(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(href).HANDLE(), Interop.allocateNativeString(mimeType).HANDLE());
    }
    
    /**
     * Sets the private flag of the bookmark for @uri.
     * 
     * If a bookmark for @uri cannot be found then it is created.
     */
    public void setIsPrivate(java.lang.String uri, boolean isPrivate) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_is_private(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), isPrivate ? 1 : 0);
    }
    
    /**
     * Sets @mime_type as the MIME type of the bookmark for @uri.
     * 
     * If a bookmark for @uri cannot be found then it is created.
     */
    public void setMimeType(java.lang.String uri, java.lang.String mimeType) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_mime_type(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(mimeType).HANDLE());
    }
    
    /**
     * Sets the last time the bookmark for @uri was last modified.
     * 
     * If no bookmark for @uri is found then it is created.
     * 
     * The "modified" time should only be set when the bookmark's meta-data
     * was actually changed.  Every function of #GBookmarkFile that
     * modifies a bookmark also changes the modification time, except for
     * g_bookmark_file_set_visited_date_time().
     */
    public void setModifiedDateTime(java.lang.String uri, DateTime modified) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_modified_date_time(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), modified.HANDLE());
    }
    
    /**
     * Sets @title as the title of the bookmark for @uri inside the
     * bookmark file @bookmark.
     * 
     * If @uri is %NULL, the title of @bookmark is set.
     * 
     * If a bookmark for @uri cannot be found then it is created.
     */
    public void setTitle(java.lang.String uri, java.lang.String title) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_title(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), Interop.allocateNativeString(title).HANDLE());
    }
    
    /**
     * Sets the time the bookmark for @uri was last visited.
     * 
     * If no bookmark for @uri is found then it is created.
     * 
     * The "visited" time should only be set if the bookmark was launched,
     * either using the command line retrieved by g_bookmark_file_get_application_info()
     * or by the default application for the bookmark's MIME type, retrieved
     * using g_bookmark_file_get_mime_type().  Changing the "visited" time
     * does not affect the "modified" time.
     */
    public void setVisitedDateTime(java.lang.String uri, DateTime visited) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_set_visited_date_time(HANDLE(), Interop.allocateNativeString(uri).HANDLE(), visited.HANDLE());
    }
    
    /**
     * This function outputs @bookmark into a file.  The write process is
     * guaranteed to be atomic by using g_file_set_contents() internally.
     */
    public boolean toFile(java.lang.String filename) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_bookmark_file_to_file(HANDLE(), Interop.allocateNativeString(filename).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
