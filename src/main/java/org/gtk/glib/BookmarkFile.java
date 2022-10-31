package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure representing a set of bookmarks.
 */
public class BookmarkFile extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GBookmarkFile";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static BookmarkFile allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BookmarkFile newInstance = new BookmarkFile(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @ApiStatus.Internal
    public BookmarkFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
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
    public void addApplication(@NotNull java.lang.String uri, @Nullable java.lang.String name, @Nullable java.lang.String exec) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_bookmark_file_add_application.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)),
                    (Addressable) (exec == null ? MemoryAddress.NULL : Interop.allocateNativeString(exec)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void addGroup(@NotNull java.lang.String uri, @NotNull java.lang.String group) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.g_bookmark_file_add_group.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(group));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees a {@link BookmarkFile}.
     */
    public void free() {
        try {
            DowncallHandles.g_bookmark_file_free.invokeExact(
                    handle());
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
    public long getAdded(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_bookmark_file_get_added.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public @NotNull org.gtk.glib.DateTime getAddedDateTime(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_added_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
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
    public boolean getAppInfo(@NotNull java.lang.String uri, @NotNull java.lang.String name, @NotNull Out<java.lang.String> exec, Out<Integer> count, Out<Long> stamp) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(exec, "Parameter 'exec' must not be null");
        java.util.Objects.requireNonNull(count, "Parameter 'count' must not be null");
        java.util.Objects.requireNonNull(stamp, "Parameter 'stamp' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment execPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment countPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment stampPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_get_app_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(name),
                    (Addressable) execPOINTER.address(),
                    (Addressable) countPOINTER.address(),
                    (Addressable) stampPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        exec.set(Interop.getStringFrom(execPOINTER.get(ValueLayout.ADDRESS, 0)));
        count.set(countPOINTER.get(ValueLayout.JAVA_INT, 0));
        stamp.set(stampPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return RESULT != 0;
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
    public boolean getApplicationInfo(@NotNull java.lang.String uri, @NotNull java.lang.String name, @NotNull Out<java.lang.String> exec, Out<Integer> count, @NotNull PointerProxy<org.gtk.glib.DateTime> stamp) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(exec, "Parameter 'exec' must not be null");
        java.util.Objects.requireNonNull(count, "Parameter 'count' must not be null");
        java.util.Objects.requireNonNull(stamp, "Parameter 'stamp' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment execPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment countPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_get_application_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(name),
                    (Addressable) execPOINTER.address(),
                    (Addressable) countPOINTER.address(),
                    stamp.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        exec.set(Interop.getStringFrom(execPOINTER.get(ValueLayout.ADDRESS, 0)));
        count.set(countPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
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
    public @NotNull java.lang.String[] getApplications(@NotNull java.lang.String uri, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_applications.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = Interop.getStringFrom(OBJ);
        }
        return resultARRAY;
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
    public @NotNull java.lang.String getDescription(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_description.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
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
    public @NotNull java.lang.String[] getGroups(@NotNull java.lang.String uri, Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_groups.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = Interop.getStringFrom(OBJ);
        }
        return resultARRAY;
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
    public boolean getIcon(@NotNull java.lang.String uri, @NotNull Out<java.lang.String> href, @NotNull Out<java.lang.String> mimeType) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(href, "Parameter 'href' must not be null");
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment hrefPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment mimeTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_get_icon.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) hrefPOINTER.address(),
                    (Addressable) mimeTypePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        href.set(Interop.getStringFrom(hrefPOINTER.get(ValueLayout.ADDRESS, 0)));
        mimeType.set(Interop.getStringFrom(mimeTypePOINTER.get(ValueLayout.ADDRESS, 0)));
        return RESULT != 0;
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
    public boolean getIsPrivate(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_get_is_private.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public @NotNull java.lang.String getMimeType(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_mime_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
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
    public long getModified(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_bookmark_file_get_modified.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public @NotNull org.gtk.glib.DateTime getModifiedDateTime(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_modified_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the number of bookmarks inside {@code bookmark}.
     * @return the number of bookmarks
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_get_size.invokeExact(
                    handle());
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
    public @NotNull java.lang.String getTitle(@Nullable java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_title.invokeExact(
                    handle(),
                    (Addressable) (uri == null ? MemoryAddress.NULL : Interop.allocateNativeString(uri)), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns all URIs of the bookmarks in the bookmark file {@code bookmark}.
     * The array of returned URIs will be {@code null}-terminated, so {@code length} may
     * optionally be {@code null}.
     * @param length return location for the number of returned URIs, or {@code null}
     * @return a newly allocated {@code null}-terminated array of strings.
     *   Use g_strfreev() to free it.
     */
    public @NotNull java.lang.String[] getUris(Out<Long> length) {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_uris.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = Interop.getStringFrom(OBJ);
        }
        return resultARRAY;
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
    public long getVisited(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_bookmark_file_get_visited.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
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
    public @NotNull org.gtk.glib.DateTime getVisitedDateTime(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_get_visited_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
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
    public boolean hasApplication(@NotNull java.lang.String uri, @NotNull java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_has_application.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(name), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean hasGroup(@NotNull java.lang.String uri, @NotNull java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_has_group.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(group), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Looks whether the desktop bookmark has an item with its URI set to {@code uri}.
     * @param uri a valid URI
     * @return {@code true} if {@code uri} is inside {@code bookmark}, {@code false} otherwise
     */
    public boolean hasItem(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_has_item.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        java.util.Objects.requireNonNull(data, "Parameter 'data' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_load_from_data.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(data, false),
                    length, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean loadFromDataDirs(@NotNull java.lang.String file, @NotNull Out<java.lang.String> fullPath) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        java.util.Objects.requireNonNull(fullPath, "Parameter 'fullPath' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment fullPathPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_load_from_data_dirs.invokeExact(
                    handle(),
                    Interop.allocateNativeString(file),
                    (Addressable) fullPathPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        fullPath.set(Interop.getStringFrom(fullPathPOINTER.get(ValueLayout.ADDRESS, 0)));
        return RESULT != 0;
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
    public boolean loadFromFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_load_from_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean moveItem(@NotNull java.lang.String oldUri, @Nullable java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(oldUri, "Parameter 'oldUri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_move_item.invokeExact(
                    handle(),
                    Interop.allocateNativeString(oldUri),
                    (Addressable) (newUri == null ? MemoryAddress.NULL : Interop.allocateNativeString(newUri)), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean removeApplication(@NotNull java.lang.String uri, @NotNull java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_remove_application.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(name), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean removeGroup(@NotNull java.lang.String uri, @NotNull java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_remove_group.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(group), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes the bookmark for {@code uri} from the bookmark file {@code bookmark}.
     * @param uri a valid URI
     * @return {@code true} if the bookmark was removed successfully.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeItem(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_remove_item.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public void setAdded(@NotNull java.lang.String uri, long added) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_added.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    added);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the time the bookmark for {@code uri} was added into {@code bookmark}.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     * @param uri a valid URI
     * @param added a {@link DateTime}
     */
    public void setAddedDateTime(@NotNull java.lang.String uri, @NotNull org.gtk.glib.DateTime added) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(added, "Parameter 'added' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_added_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    added.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public boolean setAppInfo(@NotNull java.lang.String uri, @NotNull java.lang.String name, @NotNull java.lang.String exec, int count, long stamp) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(exec, "Parameter 'exec' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_set_app_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(exec),
                    count,
                    stamp, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public boolean setApplicationInfo(@NotNull java.lang.String uri, @NotNull java.lang.String name, @NotNull java.lang.String exec, int count, @Nullable org.gtk.glib.DateTime stamp) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(exec, "Parameter 'exec' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_set_application_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(exec),
                    count,
                    (Addressable) (stamp == null ? MemoryAddress.NULL : stamp.handle()), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
    public void setDescription(@Nullable java.lang.String uri, @NotNull java.lang.String description) {
        java.util.Objects.requireNonNull(description, "Parameter 'description' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_description.invokeExact(
                    handle(),
                    (Addressable) (uri == null ? MemoryAddress.NULL : Interop.allocateNativeString(uri)),
                    Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setGroups(@NotNull java.lang.String uri, java.lang.String[] groups, long length) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_groups.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) (groups == null ? MemoryAddress.NULL : Interop.allocateNativeArray(groups, false)),
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setIcon(@NotNull java.lang.String uri, @Nullable java.lang.String href, @NotNull java.lang.String mimeType) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_icon.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    (Addressable) (href == null ? MemoryAddress.NULL : Interop.allocateNativeString(href)),
                    Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the private flag of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     * @param uri a valid URI
     * @param isPrivate {@code true} if the bookmark should be marked as private
     */
    public void setIsPrivate(@NotNull java.lang.String uri, boolean isPrivate) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_is_private.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    isPrivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code mime_type} as the MIME type of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     * @param uri a valid URI
     * @param mimeType a MIME type
     */
    public void setMimeType(@NotNull java.lang.String uri, @NotNull java.lang.String mimeType) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(mimeType, "Parameter 'mimeType' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_mime_type.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setModified(@NotNull java.lang.String uri, long modified) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_modified.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    modified);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setModifiedDateTime(@NotNull java.lang.String uri, @NotNull org.gtk.glib.DateTime modified) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(modified, "Parameter 'modified' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_modified_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    modified.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setTitle(@Nullable java.lang.String uri, @NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_title.invokeExact(
                    handle(),
                    (Addressable) (uri == null ? MemoryAddress.NULL : Interop.allocateNativeString(uri)),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setVisited(@NotNull java.lang.String uri, long visited) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_visited.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    visited);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
    public void setVisitedDateTime(@NotNull java.lang.String uri, @NotNull org.gtk.glib.DateTime visited) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(visited, "Parameter 'visited' must not be null");
        try {
            DowncallHandles.g_bookmark_file_set_visited_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(uri),
                    visited.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function outputs {@code bookmark} as a string.
     * @param length return location for the length of the returned string, or {@code null}
     * @return a newly allocated string holding the contents of the {@link BookmarkFile}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @NotNull byte[] toData(Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_to_data.invokeExact(
                    handle(),
                    (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
    /**
     * This function outputs {@code bookmark} into a file.  The write process is
     * guaranteed to be atomic by using g_file_set_contents() internally.
     * @param filename path of the output file
     * @return {@code true} if the file was successfully written.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean toFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(filename, "Parameter 'filename' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_bookmark_file_to_file.invokeExact(
                    handle(),
                    Interop.allocateNativeString(filename), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull org.gtk.glib.Quark errorQuark() {
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
    public static @NotNull org.gtk.glib.BookmarkFile new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_bookmark_file_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.BookmarkFile(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_bookmark_file_add_application = Interop.downcallHandle(
            "g_bookmark_file_add_application",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_add_group = Interop.downcallHandle(
            "g_bookmark_file_add_group",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_free = Interop.downcallHandle(
            "g_bookmark_file_free",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_added = Interop.downcallHandle(
            "g_bookmark_file_get_added",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_added_date_time = Interop.downcallHandle(
            "g_bookmark_file_get_added_date_time",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_app_info = Interop.downcallHandle(
            "g_bookmark_file_get_app_info",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_application_info = Interop.downcallHandle(
            "g_bookmark_file_get_application_info",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_applications = Interop.downcallHandle(
            "g_bookmark_file_get_applications",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_description = Interop.downcallHandle(
            "g_bookmark_file_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_groups = Interop.downcallHandle(
            "g_bookmark_file_get_groups",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_icon = Interop.downcallHandle(
            "g_bookmark_file_get_icon",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_is_private = Interop.downcallHandle(
            "g_bookmark_file_get_is_private",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_mime_type = Interop.downcallHandle(
            "g_bookmark_file_get_mime_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_modified = Interop.downcallHandle(
            "g_bookmark_file_get_modified",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_modified_date_time = Interop.downcallHandle(
            "g_bookmark_file_get_modified_date_time",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_size = Interop.downcallHandle(
            "g_bookmark_file_get_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_title = Interop.downcallHandle(
            "g_bookmark_file_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_uris = Interop.downcallHandle(
            "g_bookmark_file_get_uris",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_visited = Interop.downcallHandle(
            "g_bookmark_file_get_visited",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_get_visited_date_time = Interop.downcallHandle(
            "g_bookmark_file_get_visited_date_time",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_has_application = Interop.downcallHandle(
            "g_bookmark_file_has_application",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_has_group = Interop.downcallHandle(
            "g_bookmark_file_has_group",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_has_item = Interop.downcallHandle(
            "g_bookmark_file_has_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_load_from_data = Interop.downcallHandle(
            "g_bookmark_file_load_from_data",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_load_from_data_dirs = Interop.downcallHandle(
            "g_bookmark_file_load_from_data_dirs",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_load_from_file = Interop.downcallHandle(
            "g_bookmark_file_load_from_file",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_move_item = Interop.downcallHandle(
            "g_bookmark_file_move_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_remove_application = Interop.downcallHandle(
            "g_bookmark_file_remove_application",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_remove_group = Interop.downcallHandle(
            "g_bookmark_file_remove_group",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_remove_item = Interop.downcallHandle(
            "g_bookmark_file_remove_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_added = Interop.downcallHandle(
            "g_bookmark_file_set_added",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_bookmark_file_set_added_date_time = Interop.downcallHandle(
            "g_bookmark_file_set_added_date_time",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_app_info = Interop.downcallHandle(
            "g_bookmark_file_set_app_info",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_application_info = Interop.downcallHandle(
            "g_bookmark_file_set_application_info",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_description = Interop.downcallHandle(
            "g_bookmark_file_set_description",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_groups = Interop.downcallHandle(
            "g_bookmark_file_set_groups",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_bookmark_file_set_icon = Interop.downcallHandle(
            "g_bookmark_file_set_icon",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_is_private = Interop.downcallHandle(
            "g_bookmark_file_set_is_private",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_bookmark_file_set_mime_type = Interop.downcallHandle(
            "g_bookmark_file_set_mime_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_modified = Interop.downcallHandle(
            "g_bookmark_file_set_modified",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_bookmark_file_set_modified_date_time = Interop.downcallHandle(
            "g_bookmark_file_set_modified_date_time",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_title = Interop.downcallHandle(
            "g_bookmark_file_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_set_visited = Interop.downcallHandle(
            "g_bookmark_file_set_visited",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
        );
        
        private static final MethodHandle g_bookmark_file_set_visited_date_time = Interop.downcallHandle(
            "g_bookmark_file_set_visited_date_time",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_to_data = Interop.downcallHandle(
            "g_bookmark_file_to_data",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_to_file = Interop.downcallHandle(
            "g_bookmark_file_to_file",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_bookmark_file_error_quark = Interop.downcallHandle(
            "g_bookmark_file_error_quark",
            FunctionDescriptor.of(ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_bookmark_file_new = Interop.downcallHandle(
            "g_bookmark_file_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
}
