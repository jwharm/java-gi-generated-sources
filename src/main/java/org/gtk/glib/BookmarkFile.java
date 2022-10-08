package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque data structure representing a set of bookmarks.
 */
public class BookmarkFile extends io.github.jwharm.javagi.ResourceBase {

    public BookmarkFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_bookmark_file_add_application = Interop.downcallHandle(
        "g_bookmark_file_add_application",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds the application with {@code name} and {@code exec} to the list of
     * applications that have registered a bookmark for {@code uri} into
     * {@code bookmark}.
     * <p>
     * Every bookmark inside a {@link BookmarkFile} must have at least an
     * application registered.  Each application must provide a name, a
     * command line useful for launching the bookmark, the number of times
     * the bookmark has been registered by the application and the last
     * time the application registered this bookmark.
     * <p>
     * If {@code name} is {@code null}, the name of the application will be the
     * same returned by g_get_application_name(); if {@code exec} is {@code null}, the
     * command line will be a composition of the program name as
     * returned by g_get_prgname() and the "\\{@code u}" modifier, which will be
     * expanded to the bookmark's URI.
     * <p>
     * This function will automatically take care of updating the
     * registrations count and timestamping in case an application
     * with the same {@code name} had already registered a bookmark for
     * {@code uri} inside {@code bookmark}.
     * <p>
     * If no bookmark for {@code uri} is found, one is created.
     */
    public void addApplication(java.lang.String uri, java.lang.String name, java.lang.String exec) {
        try {
            g_bookmark_file_add_application.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(exec).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_add_group = Interop.downcallHandle(
        "g_bookmark_file_add_group",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code group} to the list of groups to which the bookmark for {@code uri}
     * belongs to.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     */
    public void addGroup(java.lang.String uri, java.lang.String group) {
        try {
            g_bookmark_file_add_group.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(group).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_free = Interop.downcallHandle(
        "g_bookmark_file_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@link BookmarkFile}.
     */
    public void free() {
        try {
            g_bookmark_file_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_added_date_time = Interop.downcallHandle(
        "g_bookmark_file_get_added_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time the bookmark for {@code uri} was added to {@code bookmark}
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public DateTime getAddedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_added_date_time.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new DateTime(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_application_info = Interop.downcallHandle(
        "g_bookmark_file_get_application_info",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the registration information of {@code app_name} for the bookmark for
     * {@code uri}.  See g_bookmark_file_set_application_info() for more information about
     * the returned data.
     * <p>
     * The string returned in {@code app_exec} must be freed.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.  In the
     * event that no application with name {@code app_name} has registered a bookmark
     * for {@code uri},  {@code false} is returned and error is set to
     * {@link BookmarkFileError#APP_NOT_REGISTERED}. In the event that unquoting
     * the command line fails, an error of the {@code G_SHELL_ERROR} domain is
     * set and {@code false} is returned.
     */
    public boolean getApplicationInfo(java.lang.String uri, java.lang.String name, PointerString exec, PointerInteger count, PointerProxy<DateTime> stamp) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_get_application_info.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(name).handle(), exec.handle(), count.handle(), stamp.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_applications = Interop.downcallHandle(
        "g_bookmark_file_get_applications",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the names of the applications that have registered the
     * bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public PointerString getApplications(java.lang.String uri, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_applications.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_description = Interop.downcallHandle(
        "g_bookmark_file_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the description of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public java.lang.String getDescription(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_description.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_groups = Interop.downcallHandle(
        "g_bookmark_file_get_groups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the list of group names of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * <p>
     * The returned array is {@code null} terminated, so {@code length} may optionally
     * be {@code null}.
     */
    public PointerString getGroups(java.lang.String uri, PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_groups.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_icon = Interop.downcallHandle(
        "g_bookmark_file_get_icon",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public boolean getIcon(java.lang.String uri, PointerString href, PointerString mimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_get_icon.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), href.handle(), mimeType.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_is_private = Interop.downcallHandle(
        "g_bookmark_file_get_is_private",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the private flag of the bookmark for {@code uri} is set.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.  In the
     * event that the private flag cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#INVALID_VALUE}.
     */
    public boolean getIsPrivate(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_get_is_private.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_mime_type = Interop.downcallHandle(
        "g_bookmark_file_get_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the MIME type of the resource pointed by {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.  In the
     * event that the MIME type cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#INVALID_VALUE}.
     */
    public java.lang.String getMimeType(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_mime_type.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_modified_date_time = Interop.downcallHandle(
        "g_bookmark_file_get_modified_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the bookmark for {@code uri} was last modified.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public DateTime getModifiedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_modified_date_time.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new DateTime(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_size = Interop.downcallHandle(
        "g_bookmark_file_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of bookmarks inside {@code bookmark}.
     */
    public int getSize() {
        try {
            var RESULT = (int) g_bookmark_file_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_title = Interop.downcallHandle(
        "g_bookmark_file_get_title",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the title of the bookmark for {@code uri}.
     * <p>
     * If {@code uri} is {@code null}, the title of {@code bookmark} is returned.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public java.lang.String getTitle(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_title.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_uris = Interop.downcallHandle(
        "g_bookmark_file_get_uris",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all URIs of the bookmarks in the bookmark file {@code bookmark}.
     * The array of returned URIs will be {@code null}-terminated, so {@code length} may
     * optionally be {@code null}.
     */
    public PointerString getUris(PointerLong length) {
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_uris.invokeExact(handle(), length.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_get_visited_date_time = Interop.downcallHandle(
        "g_bookmark_file_get_visited_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time the bookmark for {@code uri} was last visited.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public DateTime getVisitedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_get_visited_date_time.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new DateTime(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_has_application = Interop.downcallHandle(
        "g_bookmark_file_has_application",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the bookmark for {@code uri} inside {@code bookmark} has been
     * registered by application {@code name}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public boolean hasApplication(java.lang.String uri, java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_has_application.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(name).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_has_group = Interop.downcallHandle(
        "g_bookmark_file_has_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code group} appears in the list of groups to which
     * the bookmark for {@code uri} belongs to.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public boolean hasGroup(java.lang.String uri, java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_has_group.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(group).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_has_item = Interop.downcallHandle(
        "g_bookmark_file_has_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks whether the desktop bookmark has an item with its URI set to {@code uri}.
     */
    public boolean hasItem(java.lang.String uri) {
        try {
            var RESULT = (int) g_bookmark_file_has_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_load_from_data = Interop.downcallHandle(
        "g_bookmark_file_load_from_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a bookmark file from memory into an empty {@link BookmarkFile}
     * structure.  If the object cannot be created then {@code error} is set to a
     * {@link BookmarkFileError}.
     */
    public boolean loadFromData(byte[] data, long length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_load_from_data.invokeExact(handle(), Interop.allocateNativeArray(data).handle(), length, (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_load_from_data_dirs = Interop.downcallHandle(
        "g_bookmark_file_load_from_data_dirs",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function looks for a desktop bookmark file named {@code file} in the
     * paths returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into {@code bookmark} and returns the file's full path in
     * {@code full_path}.  If the file could not be loaded then {@code error} is
     * set to either a {@link FileError} or {@link BookmarkFileError}.
     */
    public boolean loadFromDataDirs(java.lang.String file, PointerString fullPath) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_load_from_data_dirs.invokeExact(handle(), Interop.allocateNativeString(file).handle(), fullPath.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_load_from_file = Interop.downcallHandle(
        "g_bookmark_file_load_from_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a desktop bookmark file into an empty {@link BookmarkFile} structure.
     * If the file could not be loaded then {@code error} is set to either a {@link FileError}
     * or {@link BookmarkFileError}.
     */
    public boolean loadFromFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_load_from_file.invokeExact(handle(), Interop.allocateNativeString(filename).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_move_item = Interop.downcallHandle(
        "g_bookmark_file_move_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the URI of a bookmark item from {@code old_uri} to {@code new_uri}.  Any
     * existing bookmark for {@code new_uri} will be overwritten.  If {@code new_uri} is
     * {@code null}, then the bookmark is removed.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public boolean moveItem(java.lang.String oldUri, java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_move_item.invokeExact(handle(), Interop.allocateNativeString(oldUri).handle(), Interop.allocateNativeString(newUri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_remove_application = Interop.downcallHandle(
        "g_bookmark_file_remove_application",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes application registered with {@code name} from the list of applications
     * that have registered a bookmark for {@code uri} inside {@code bookmark}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * In the event that no application with name {@code app_name} has registered
     * a bookmark for {@code uri},  {@code false} is returned and error is set to
     * {@link BookmarkFileError#APP_NOT_REGISTERED}.
     */
    public boolean removeApplication(java.lang.String uri, java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_remove_application.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(name).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_remove_group = Interop.downcallHandle(
        "g_bookmark_file_remove_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code group} from the list of groups to which the bookmark
     * for {@code uri} belongs to.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * In the event no group was defined, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#INVALID_VALUE}.
     */
    public boolean removeGroup(java.lang.String uri, java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_remove_group.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(group).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_remove_item = Interop.downcallHandle(
        "g_bookmark_file_remove_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the bookmark for {@code uri} from the bookmark file {@code bookmark}.
     */
    public boolean removeItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_remove_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_added_date_time = Interop.downcallHandle(
        "g_bookmark_file_set_added_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the time the bookmark for {@code uri} was added into {@code bookmark}.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     */
    public void setAddedDateTime(java.lang.String uri, DateTime added) {
        try {
            g_bookmark_file_set_added_date_time.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), added.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_application_info = Interop.downcallHandle(
        "g_bookmark_file_set_application_info",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the meta-data of application {@code name} inside the list of
     * applications that have registered a bookmark for {@code uri} inside
     * {@code bookmark}.
     * <p>
     * You should rarely use this function; use g_bookmark_file_add_application()
     * and g_bookmark_file_remove_application() instead.
     * <p>
     * {@code name} can be any UTF-8 encoded string used to identify an
     * application.
     * {@code exec} can have one of these two modifiers: "\\{@code f}", which will
     * be expanded as the local file name retrieved from the bookmark's
     * URI; "\\{@code u}", which will be expanded as the bookmark's URI.
     * The expansion is done automatically when retrieving the stored
     * command line using the g_bookmark_file_get_application_info() function.
     * {@code count} is the number of times the application has registered the
     * bookmark; if is < 0, the current registration count will be increased
     * by one, if is 0, the application with {@code name} will be removed from
     * the list of registered applications.
     * {@code stamp} is the Unix time of the last registration.
     * <p>
     * If you try to remove an application by setting its registration count to
     * zero, and no bookmark for {@code uri} is found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}; similarly,
     * in the event that no application {@code name} has registered a bookmark
     * for {@code uri},  {@code false} is returned and error is set to
     * {@link BookmarkFileError#APP_NOT_REGISTERED}.  Otherwise, if no bookmark
     * for {@code uri} is found, one is created.
     */
    public boolean setApplicationInfo(java.lang.String uri, java.lang.String name, java.lang.String exec, int count, DateTime stamp) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_set_application_info.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(exec).handle(), count, stamp.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_description = Interop.downcallHandle(
        "g_bookmark_file_set_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code description} as the description of the bookmark for {@code uri}.
     * <p>
     * If {@code uri} is {@code null}, the description of {@code bookmark} is set.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     */
    public void setDescription(java.lang.String uri, java.lang.String description) {
        try {
            g_bookmark_file_set_description.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(description).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_groups = Interop.downcallHandle(
        "g_bookmark_file_set_groups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets a list of group names for the item with URI {@code uri}.  Each previously
     * set group name list is removed.
     * <p>
     * If {@code uri} cannot be found then an item for it is created.
     */
    public void setGroups(java.lang.String uri, java.lang.String[] groups, long length) {
        try {
            g_bookmark_file_set_groups.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeArray(groups).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_icon = Interop.downcallHandle(
        "g_bookmark_file_set_icon",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the icon for the bookmark for {@code uri}. If {@code href} is {@code null}, unsets
     * the currently set icon. {@code href} can either be a full URL for the icon
     * file or the icon name following the Icon Naming specification.
     * <p>
     * If no bookmark for {@code uri} is found one is created.
     */
    public void setIcon(java.lang.String uri, java.lang.String href, java.lang.String mimeType) {
        try {
            g_bookmark_file_set_icon.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(href).handle(), Interop.allocateNativeString(mimeType).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_is_private = Interop.downcallHandle(
        "g_bookmark_file_set_is_private",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the private flag of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     */
    public void setIsPrivate(java.lang.String uri, boolean isPrivate) {
        try {
            g_bookmark_file_set_is_private.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), isPrivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_mime_type = Interop.downcallHandle(
        "g_bookmark_file_set_mime_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code mime_type} as the MIME type of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     */
    public void setMimeType(java.lang.String uri, java.lang.String mimeType) {
        try {
            g_bookmark_file_set_mime_type.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(mimeType).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_modified_date_time = Interop.downcallHandle(
        "g_bookmark_file_set_modified_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the last time the bookmark for {@code uri} was last modified.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * <p>
     * The "modified" time should only be set when the bookmark's meta-data
     * was actually changed.  Every function of {@link BookmarkFile} that
     * modifies a bookmark also changes the modification time, except for
     * g_bookmark_file_set_visited_date_time().
     */
    public void setModifiedDateTime(java.lang.String uri, DateTime modified) {
        try {
            g_bookmark_file_set_modified_date_time.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), modified.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_title = Interop.downcallHandle(
        "g_bookmark_file_set_title",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code title} as the title of the bookmark for {@code uri} inside the
     * bookmark file {@code bookmark}.
     * <p>
     * If {@code uri} is {@code null}, the title of {@code bookmark} is set.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     */
    public void setTitle(java.lang.String uri, java.lang.String title) {
        try {
            g_bookmark_file_set_title.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(title).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_set_visited_date_time = Interop.downcallHandle(
        "g_bookmark_file_set_visited_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the time the bookmark for {@code uri} was last visited.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * <p>
     * The "visited" time should only be set if the bookmark was launched,
     * either using the command line retrieved by g_bookmark_file_get_application_info()
     * or by the default application for the bookmark's MIME type, retrieved
     * using g_bookmark_file_get_mime_type().  Changing the "visited" time
     * does not affect the "modified" time.
     */
    public void setVisitedDateTime(java.lang.String uri, DateTime visited) {
        try {
            g_bookmark_file_set_visited_date_time.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), visited.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_to_data = Interop.downcallHandle(
        "g_bookmark_file_to_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function outputs {@code bookmark} as a string.
     */
    public PointerByte toData(PointerLong length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_to_data.invokeExact(handle(), length.handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new PointerByte(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_to_file = Interop.downcallHandle(
        "g_bookmark_file_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function outputs {@code bookmark} into a file.  The write process is
     * guaranteed to be atomic by using g_file_set_contents() internally.
     */
    public boolean toFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) g_bookmark_file_to_file.invokeExact(handle(), Interop.allocateNativeString(filename).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_error_quark = Interop.downcallHandle(
        "g_bookmark_file_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static Quark errorQuark() {
        try {
            var RESULT = (int) g_bookmark_file_error_quark.invokeExact();
            return new Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_bookmark_file_new = Interop.downcallHandle(
        "g_bookmark_file_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new empty {@link BookmarkFile} object.
     * <p>
     * Use g_bookmark_file_load_from_file(), g_bookmark_file_load_from_data()
     * or g_bookmark_file_load_from_data_dirs() to read an existing bookmark
     * file.
     */
    public static BookmarkFile new_() {
        try {
            var RESULT = (MemoryAddress) g_bookmark_file_new.invokeExact();
            return new BookmarkFile(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
