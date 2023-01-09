package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure representing a set of bookmarks.
 */
public class BookmarkFile extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBookmarkFile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BookmarkFile}
     * @return A new, uninitialized @{link BookmarkFile}
     */
    public static BookmarkFile allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BookmarkFile newInstance = new BookmarkFile(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a BookmarkFile proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BookmarkFile(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BookmarkFile> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BookmarkFile(input);
    
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
     * @param uri a valid URI
     * @param name the name of the application registering the bookmark
     *   or {@code null}
     * @param exec command line to be used to launch the bookmark or {@code null}
     */
    public void addApplication(java.lang.String uri, @Nullable java.lang.String name, @Nullable java.lang.String exec) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_add_application.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)),
                        (Addressable) (exec == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(exec, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds {@code group} to the list of groups to which the bookmark for {@code uri}
     * belongs to.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * @param uri a valid URI
     * @param group the group name to be added
     */
    public void addGroup(java.lang.String uri, java.lang.String group) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_add_group.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(group, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Frees a {@link BookmarkFile}.
     */
    public void free() {
        try {
            DowncallHandles.g_bookmark_file_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the time the bookmark for {@code uri} was added to {@code bookmark}
     * <p>
     * In the event the URI cannot be found, -1 is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a timestamp
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_bookmark_file_get_added_date_time() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public long getAdded(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_bookmark_file_get_added.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Gets the time the bookmark for {@code uri} was added to {@code bookmark}
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a {@link DateTime}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.DateTime getAddedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_added_date_time.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, null);
        }
    }
    
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
     * @param uri a valid URI
     * @param name an application's name
     * @param exec return location for the command line of the application, or {@code null}
     * @param count return location for the registration count, or {@code null}
     * @param stamp return location for the last registration time, or {@code null}
     * @return {@code true} on success.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_bookmark_file_get_application_info() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public boolean getAppInfo(java.lang.String uri, java.lang.String name, @Nullable Out<java.lang.String> exec, Out<Integer> count, Out<Long> stamp) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment execPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment countPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment stampPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_get_app_info.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) (exec == null ? MemoryAddress.NULL : (Addressable) execPOINTER.address()),
                        (Addressable) (count == null ? MemoryAddress.NULL : (Addressable) countPOINTER.address()),
                        (Addressable) (stamp == null ? MemoryAddress.NULL : (Addressable) stampPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (exec != null) exec.set(Marshal.addressToString.marshal(execPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (count != null) count.set(countPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (stamp != null) stamp.set(stampPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param uri a valid URI
     * @param name an application's name
     * @param exec return location for the command line of the application, or {@code null}
     * @param count return location for the registration count, or {@code null}
     * @param stamp return location for the last registration time, or {@code null}
     * @return {@code true} on success.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getApplicationInfo(java.lang.String uri, java.lang.String name, @Nullable Out<java.lang.String> exec, Out<Integer> count, @Nullable Out<org.gtk.glib.DateTime> stamp) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment execPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment countPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment stampPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_get_application_info.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) (exec == null ? MemoryAddress.NULL : (Addressable) execPOINTER.address()),
                        (Addressable) (count == null ? MemoryAddress.NULL : (Addressable) countPOINTER.address()),
                        (Addressable) (stamp == null ? MemoryAddress.NULL : (Addressable) stampPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (exec != null) exec.set(Marshal.addressToString.marshal(execPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (count != null) count.set(countPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (stamp != null) stamp.set(org.gtk.glib.DateTime.fromAddress.marshal(stampPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieves the names of the applications that have registered the
     * bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @param length return location of the length of the returned list, or {@code null}
     * @return a newly allocated {@code null}-terminated array of strings.
     *   Use g_strfreev() to free it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String[] getApplications(java.lang.String uri, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_applications.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Retrieves the description of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a newly allocated string or {@code null} if the specified
     *   URI cannot be found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getDescription(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_description.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves the list of group names of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * <p>
     * The returned array is {@code null} terminated, so {@code length} may optionally
     * be {@code null}.
     * @param uri a valid URI
     * @param length return location for the length of the returned string, or {@code null}
     * @return a newly allocated {@code null}-terminated array of group names.
     *   Use g_strfreev() to free it.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String[] getGroups(java.lang.String uri, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_groups.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Gets the icon of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @param href return location for the icon's location or {@code null}
     * @param mimeType return location for the icon's MIME type or {@code null}
     * @return {@code true} if the icon for the bookmark for the URI was found.
     *   You should free the returned strings.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getIcon(java.lang.String uri, @Nullable Out<java.lang.String> href, @Nullable Out<java.lang.String> mimeType) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment hrefPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment mimeTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_get_icon.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (href == null ? MemoryAddress.NULL : (Addressable) hrefPOINTER.address()),
                        (Addressable) (mimeType == null ? MemoryAddress.NULL : (Addressable) mimeTypePOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (href != null) href.set(Marshal.addressToString.marshal(hrefPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (mimeType != null) mimeType.set(Marshal.addressToString.marshal(mimeTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets whether the private flag of the bookmark for {@code uri} is set.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.  In the
     * event that the private flag cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#INVALID_VALUE}.
     * @param uri a valid URI
     * @return {@code true} if the private flag is set, {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean getIsPrivate(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_get_is_private.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieves the MIME type of the resource pointed by {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.  In the
     * event that the MIME type cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#INVALID_VALUE}.
     * @param uri a valid URI
     * @return a newly allocated string or {@code null} if the specified
     *   URI cannot be found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getMimeType(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_mime_type.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the time when the bookmark for {@code uri} was last modified.
     * <p>
     * In the event the URI cannot be found, -1 is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a timestamp
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_bookmark_file_get_modified_date_time() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public long getModified(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_bookmark_file_get_modified.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Gets the time when the bookmark for {@code uri} was last modified.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a {@link DateTime}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.DateTime getModifiedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_modified_date_time.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the number of bookmarks inside {@code bookmark}.
     * @return the number of bookmarks
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the title of the bookmark for {@code uri}.
     * <p>
     * If {@code uri} is {@code null}, the title of {@code bookmark} is returned.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI or {@code null}
     * @return a newly allocated string or {@code null} if the specified
     *   URI cannot be found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public java.lang.String getTitle(@Nullable java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_title.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Returns all URIs of the bookmarks in the bookmark file {@code bookmark}.
     * The array of returned URIs will be {@code null}-terminated, so {@code length} may
     * optionally be {@code null}.
     * @param length return location for the number of returned URIs, or {@code null}
     * @return a newly allocated {@code null}-terminated array of strings.
     *   Use g_strfreev() to free it.
     */
    public java.lang.String[] getUris(Out<Long> length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_uris.invokeExact(
                        handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
            for (int I = 0; I < length.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = Marshal.addressToString.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Gets the time the bookmark for {@code uri} was last visited.
     * <p>
     * In the event the URI cannot be found, -1 is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a timestamp.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_bookmark_file_get_visited_date_time() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public long getVisited(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.g_bookmark_file_get_visited.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Gets the time the bookmark for {@code uri} was last visited.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @return a {@link DateTime}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public org.gtk.glib.DateTime getVisitedDateTime(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_visited_date_time.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return org.gtk.glib.DateTime.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Checks whether the bookmark for {@code uri} inside {@code bookmark} has been
     * registered by application {@code name}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @param name the name of the application
     * @return {@code true} if the application {@code name} was found
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean hasApplication(java.lang.String uri, java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_has_application.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Checks whether {@code group} appears in the list of groups to which
     * the bookmark for {@code uri} belongs to.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param uri a valid URI
     * @param group the group name to be searched
     * @return {@code true} if {@code group} was found.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean hasGroup(java.lang.String uri, java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_has_group.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(group, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Looks whether the desktop bookmark has an item with its URI set to {@code uri}.
     * @param uri a valid URI
     * @return {@code true} if {@code uri} is inside {@code bookmark}, {@code false} otherwise
     */
    public boolean hasItem(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_has_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Loads a bookmark file from memory into an empty {@link BookmarkFile}
     * structure.  If the object cannot be created then {@code error} is set to a
     * {@link BookmarkFileError}.
     * @param data desktop bookmarks
     *    loaded in memory
     * @param length the length of {@code data} in bytes
     * @return {@code true} if a desktop bookmark could be loaded.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromData(byte[] data, long length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_load_from_data.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        length,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * This function looks for a desktop bookmark file named {@code file} in the
     * paths returned from g_get_user_data_dir() and g_get_system_data_dirs(),
     * loads the file into {@code bookmark} and returns the file's full path in
     * {@code full_path}.  If the file could not be loaded then {@code error} is
     * set to either a {@link FileError} or {@link BookmarkFileError}.
     * @param file a relative path to a filename to open and parse
     * @param fullPath return location for a string
     *    containing the full path of the file, or {@code null}
     * @return {@code true} if a key file could be loaded, {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromDataDirs(java.lang.String file, @Nullable Out<java.lang.String> fullPath) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment fullPathPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_load_from_data_dirs.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(file, SCOPE),
                        (Addressable) (fullPath == null ? MemoryAddress.NULL : (Addressable) fullPathPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (fullPath != null) fullPath.set(Marshal.addressToString.marshal(fullPathPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Loads a desktop bookmark file into an empty {@link BookmarkFile} structure.
     * If the file could not be loaded then {@code error} is set to either a {@link FileError}
     * or {@link BookmarkFileError}.
     * @param filename the path of a filename to load, in the
     *     GLib file name encoding
     * @return {@code true} if a desktop bookmark file could be loaded
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean loadFromFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_load_from_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filename, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Changes the URI of a bookmark item from {@code old_uri} to {@code new_uri}.  Any
     * existing bookmark for {@code new_uri} will be overwritten.  If {@code new_uri} is
     * {@code null}, then the bookmark is removed.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * @param oldUri a valid URI
     * @param newUri a valid URI, or {@code null}
     * @return {@code true} if the URI was successfully changed
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean moveItem(java.lang.String oldUri, @Nullable java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_move_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(oldUri, SCOPE),
                        (Addressable) (newUri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(newUri, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes application registered with {@code name} from the list of applications
     * that have registered a bookmark for {@code uri} inside {@code bookmark}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * In the event that no application with name {@code app_name} has registered
     * a bookmark for {@code uri},  {@code false} is returned and error is set to
     * {@link BookmarkFileError#APP_NOT_REGISTERED}.
     * @param uri a valid URI
     * @param name the name of the application
     * @return {@code true} if the application was successfully removed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeApplication(java.lang.String uri, java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_remove_application.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes {@code group} from the list of groups to which the bookmark
     * for {@code uri} belongs to.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     * In the event no group was defined, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#INVALID_VALUE}.
     * @param uri a valid URI
     * @param group the group name to be removed
     * @return {@code true} if {@code group} was successfully removed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeGroup(java.lang.String uri, java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_remove_group.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(group, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Removes the bookmark for {@code uri} from the bookmark file {@code bookmark}.
     * @param uri a valid URI
     * @return {@code true} if the bookmark was removed successfully.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_remove_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets the time the bookmark for {@code uri} was added into {@code bookmark}.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * @param uri a valid URI
     * @param added a timestamp or -1 to use the current time
     * @deprecated Use g_bookmark_file_set_added_date_time() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public void setAdded(java.lang.String uri, long added) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_added.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        added);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the time the bookmark for {@code uri} was added into {@code bookmark}.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * @param uri a valid URI
     * @param added a {@link DateTime}
     */
    public void setAddedDateTime(java.lang.String uri, org.gtk.glib.DateTime added) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_added_date_time.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        added.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
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
     * bookmark; if is &lt; 0, the current registration count will be increased
     * by one, if is 0, the application with {@code name} will be removed from
     * the list of registered applications.
     * {@code stamp} is the Unix time of the last registration; if it is -1, the
     * current time will be used.
     * <p>
     * If you try to remove an application by setting its registration count to
     * zero, and no bookmark for {@code uri} is found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}; similarly,
     * in the event that no application {@code name} has registered a bookmark
     * for {@code uri},  {@code false} is returned and error is set to
     * {@link BookmarkFileError#APP_NOT_REGISTERED}.  Otherwise, if no bookmark
     * for {@code uri} is found, one is created.
     * @param uri a valid URI
     * @param name an application's name
     * @param exec an application's command line
     * @param count the number of registrations done for this application
     * @param stamp the time of the last registration for this application
     * @return {@code true} if the application's meta-data was successfully
     *   changed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     * @deprecated Use g_bookmark_file_set_application_info() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public boolean setAppInfo(java.lang.String uri, java.lang.String name, java.lang.String exec, int count, long stamp) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_set_app_info.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(exec, SCOPE),
                        count,
                        stamp,
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * bookmark; if is &lt; 0, the current registration count will be increased
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
     * @param uri a valid URI
     * @param name an application's name
     * @param exec an application's command line
     * @param count the number of registrations done for this application
     * @param stamp the time of the last registration for this application,
     *    which may be {@code null} if {@code count} is 0
     * @return {@code true} if the application's meta-data was successfully
     *   changed.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean setApplicationInfo(java.lang.String uri, java.lang.String name, java.lang.String exec, int count, @Nullable org.gtk.glib.DateTime stamp) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_set_application_info.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(name, SCOPE),
                        Marshal.stringToAddress.marshal(exec, SCOPE),
                        count,
                        (Addressable) (stamp == null ? MemoryAddress.NULL : stamp.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets {@code description} as the description of the bookmark for {@code uri}.
     * <p>
     * If {@code uri} is {@code null}, the description of {@code bookmark} is set.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     * @param uri a valid URI or {@code null}
     * @param description a string
     */
    public void setDescription(@Nullable java.lang.String uri, java.lang.String description) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_description.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, SCOPE)),
                        Marshal.stringToAddress.marshal(description, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets a list of group names for the item with URI {@code uri}.  Each previously
     * set group name list is removed.
     * <p>
     * If {@code uri} cannot be found then an item for it is created.
     * @param uri an item's URI
     * @param groups an array of
     *    group names, or {@code null} to remove all groups
     * @param length number of group name values in {@code groups}
     */
    public void setGroups(java.lang.String uri, @Nullable java.lang.String[] groups, long length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_groups.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (groups == null ? MemoryAddress.NULL : Interop.allocateNativeArray(groups, false, SCOPE)),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the icon for the bookmark for {@code uri}. If {@code href} is {@code null}, unsets
     * the currently set icon. {@code href} can either be a full URL for the icon
     * file or the icon name following the Icon Naming specification.
     * <p>
     * If no bookmark for {@code uri} is found one is created.
     * @param uri a valid URI
     * @param href the URI of the icon for the bookmark, or {@code null}
     * @param mimeType the MIME type of the icon for the bookmark
     */
    public void setIcon(java.lang.String uri, @Nullable java.lang.String href, java.lang.String mimeType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_icon.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (href == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(href, SCOPE)),
                        Marshal.stringToAddress.marshal(mimeType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the private flag of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     * @param uri a valid URI
     * @param isPrivate {@code true} if the bookmark should be marked as private
     */
    public void setIsPrivate(java.lang.String uri, boolean isPrivate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_is_private.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.booleanToInteger.marshal(isPrivate, null).intValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets {@code mime_type} as the MIME type of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     * @param uri a valid URI
     * @param mimeType a MIME type
     */
    public void setMimeType(java.lang.String uri, java.lang.String mimeType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_mime_type.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        Marshal.stringToAddress.marshal(mimeType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the last time the bookmark for {@code uri} was last modified.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * <p>
     * The "modified" time should only be set when the bookmark's meta-data
     * was actually changed.  Every function of {@link BookmarkFile} that
     * modifies a bookmark also changes the modification time, except for
     * g_bookmark_file_set_visited_date_time().
     * @param uri a valid URI
     * @param modified a timestamp or -1 to use the current time
     * @deprecated Use g_bookmark_file_set_modified_date_time() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public void setModified(java.lang.String uri, long modified) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_modified.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        modified);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the last time the bookmark for {@code uri} was last modified.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * <p>
     * The "modified" time should only be set when the bookmark's meta-data
     * was actually changed.  Every function of {@link BookmarkFile} that
     * modifies a bookmark also changes the modification time, except for
     * g_bookmark_file_set_visited_date_time().
     * @param uri a valid URI
     * @param modified a {@link DateTime}
     */
    public void setModifiedDateTime(java.lang.String uri, org.gtk.glib.DateTime modified) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_modified_date_time.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        modified.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets {@code title} as the title of the bookmark for {@code uri} inside the
     * bookmark file {@code bookmark}.
     * <p>
     * If {@code uri} is {@code null}, the title of {@code bookmark} is set.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     * @param uri a valid URI or {@code null}
     * @param title a UTF-8 encoded string
     */
    public void setTitle(@Nullable java.lang.String uri, java.lang.String title) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_title.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(uri, SCOPE)),
                        Marshal.stringToAddress.marshal(title, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
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
     * @param uri a valid URI
     * @param visited a timestamp or -1 to use the current time
     * @deprecated Use g_bookmark_file_set_visited_date_time() instead, as
     *    {@code time_t} is deprecated due to the year 2038 problem.
     */
    @Deprecated
    public void setVisited(java.lang.String uri, long visited) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_visited.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        visited);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
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
     * @param uri a valid URI
     * @param visited a {@link DateTime}
     */
    public void setVisitedDateTime(java.lang.String uri, org.gtk.glib.DateTime visited) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_bookmark_file_set_visited_date_time.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        visited.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * This function outputs {@code bookmark} as a string.
     * @param length return location for the length of the returned string, or {@code null}
     * @return a newly allocated string holding the contents of the {@link BookmarkFile}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public byte[] toData(Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_to_data.invokeExact(
                        handle(),
                        (Addressable) (length == null ? MemoryAddress.NULL : (Addressable) lengthPOINTER.address()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
                    if (length != null) length.set(lengthPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), length.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE);
        }
    }
    
    /**
     * This function outputs {@code bookmark} into a file.  The write process is
     * guaranteed to be atomic by using g_file_set_contents() internally.
     * @param filename path of the output file
     * @return {@code true} if the file was successfully written.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean toFile(java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.g_bookmark_file_to_file.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(filename, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    public static org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Creates a new empty {@link BookmarkFile} object.
     * <p>
     * Use g_bookmark_file_load_from_file(), g_bookmark_file_load_from_data()
     * or g_bookmark_file_load_from_data_dirs() to read an existing bookmark
     * file.
     * @return an empty {@link BookmarkFile}
     */
    public static org.gtk.glib.BookmarkFile new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.BookmarkFile.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_bookmark_file_add_application = Interop.downcallHandle(
                "g_bookmark_file_add_application",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_add_group = Interop.downcallHandle(
                "g_bookmark_file_add_group",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_free = Interop.downcallHandle(
                "g_bookmark_file_free",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_added = Interop.downcallHandle(
                "g_bookmark_file_get_added",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_added_date_time = Interop.downcallHandle(
                "g_bookmark_file_get_added_date_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_app_info = Interop.downcallHandle(
                "g_bookmark_file_get_app_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_application_info = Interop.downcallHandle(
                "g_bookmark_file_get_application_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_applications = Interop.downcallHandle(
                "g_bookmark_file_get_applications",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_description = Interop.downcallHandle(
                "g_bookmark_file_get_description",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_groups = Interop.downcallHandle(
                "g_bookmark_file_get_groups",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_icon = Interop.downcallHandle(
                "g_bookmark_file_get_icon",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_is_private = Interop.downcallHandle(
                "g_bookmark_file_get_is_private",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_mime_type = Interop.downcallHandle(
                "g_bookmark_file_get_mime_type",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_modified = Interop.downcallHandle(
                "g_bookmark_file_get_modified",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_modified_date_time = Interop.downcallHandle(
                "g_bookmark_file_get_modified_date_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_size = Interop.downcallHandle(
                "g_bookmark_file_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_title = Interop.downcallHandle(
                "g_bookmark_file_get_title",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_uris = Interop.downcallHandle(
                "g_bookmark_file_get_uris",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_visited = Interop.downcallHandle(
                "g_bookmark_file_get_visited",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_get_visited_date_time = Interop.downcallHandle(
                "g_bookmark_file_get_visited_date_time",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_has_application = Interop.downcallHandle(
                "g_bookmark_file_has_application",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_has_group = Interop.downcallHandle(
                "g_bookmark_file_has_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_has_item = Interop.downcallHandle(
                "g_bookmark_file_has_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_load_from_data = Interop.downcallHandle(
                "g_bookmark_file_load_from_data",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_load_from_data_dirs = Interop.downcallHandle(
                "g_bookmark_file_load_from_data_dirs",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_load_from_file = Interop.downcallHandle(
                "g_bookmark_file_load_from_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_move_item = Interop.downcallHandle(
                "g_bookmark_file_move_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_remove_application = Interop.downcallHandle(
                "g_bookmark_file_remove_application",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_remove_group = Interop.downcallHandle(
                "g_bookmark_file_remove_group",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_remove_item = Interop.downcallHandle(
                "g_bookmark_file_remove_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_added = Interop.downcallHandle(
                "g_bookmark_file_set_added",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_added_date_time = Interop.downcallHandle(
                "g_bookmark_file_set_added_date_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_app_info = Interop.downcallHandle(
                "g_bookmark_file_set_app_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_application_info = Interop.downcallHandle(
                "g_bookmark_file_set_application_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_description = Interop.downcallHandle(
                "g_bookmark_file_set_description",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_groups = Interop.downcallHandle(
                "g_bookmark_file_set_groups",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_icon = Interop.downcallHandle(
                "g_bookmark_file_set_icon",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_is_private = Interop.downcallHandle(
                "g_bookmark_file_set_is_private",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_mime_type = Interop.downcallHandle(
                "g_bookmark_file_set_mime_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_modified = Interop.downcallHandle(
                "g_bookmark_file_set_modified",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_modified_date_time = Interop.downcallHandle(
                "g_bookmark_file_set_modified_date_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_title = Interop.downcallHandle(
                "g_bookmark_file_set_title",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_visited = Interop.downcallHandle(
                "g_bookmark_file_set_visited",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle g_bookmark_file_set_visited_date_time = Interop.downcallHandle(
                "g_bookmark_file_set_visited_date_time",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_to_data = Interop.downcallHandle(
                "g_bookmark_file_to_data",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_to_file = Interop.downcallHandle(
                "g_bookmark_file_to_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_bookmark_file_error_quark = Interop.downcallHandle(
                "g_bookmark_file_error_quark",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_bookmark_file_new = Interop.downcallHandle(
                "g_bookmark_file_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
