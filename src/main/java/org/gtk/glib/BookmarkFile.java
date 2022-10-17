package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque data structure representing a set of bookmarks.
 */
public class BookmarkFile extends io.github.jwharm.javagi.ResourceBase {

    public BookmarkFile(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_bookmark_file_add_application = Interop.downcallHandle(
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
    public @NotNull void addApplication(@NotNull java.lang.String uri, @Nullable java.lang.String name, @Nullable java.lang.String exec) {
        try {
            g_bookmark_file_add_application.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(name), Interop.allocateNativeString(exec));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_add_group = Interop.downcallHandle(
        "g_bookmark_file_add_group",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code group} to the list of groups to which the bookmark for {@code uri}
     * belongs to.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     */
    public @NotNull void addGroup(@NotNull java.lang.String uri, @NotNull java.lang.String group) {
        try {
            g_bookmark_file_add_group.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(group));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_free = Interop.downcallHandle(
        "g_bookmark_file_free",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees a {@link BookmarkFile}.
     */
    public @NotNull void free() {
        try {
            g_bookmark_file_free.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_get_added_date_time = Interop.downcallHandle(
        "g_bookmark_file_get_added_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time the bookmark for {@code uri} was added to {@code bookmark}
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public @NotNull DateTime getAddedDateTime(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_added_date_time.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DateTime(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_bookmark_file_get_application_info = Interop.downcallHandle(
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
    public boolean getApplicationInfo(@NotNull java.lang.String uri, @NotNull java.lang.String name, @NotNull Out<java.lang.String> exec, @NotNull Out<Integer> count, @NotNull Out<DateTime> stamp) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment execPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment countPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment stampPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_get_application_info.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(name), (Addressable) execPOINTER.address(), (Addressable) countPOINTER.address(), (Addressable) stampPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        exec.set(execPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        count.set(countPOINTER.get(ValueLayout.JAVA_INT, 0));
        stamp.set(new DateTime(Refcounted.get(stampPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_get_applications = Interop.downcallHandle(
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
    public java.lang.String[] getApplications(@NotNull java.lang.String uri, @NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_applications.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_bookmark_file_get_description = Interop.downcallHandle(
        "g_bookmark_file_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the description of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public @NotNull java.lang.String getDescription(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_description.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_bookmark_file_get_groups = Interop.downcallHandle(
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
    public java.lang.String[] getGroups(@NotNull java.lang.String uri, @NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_groups.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_bookmark_file_get_icon = Interop.downcallHandle(
        "g_bookmark_file_get_icon",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the icon of the bookmark for {@code uri}.
     * <p>
     * In the event the URI cannot be found, {@code false} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public boolean getIcon(@NotNull java.lang.String uri, @NotNull Out<java.lang.String> href, @NotNull Out<java.lang.String> mimeType) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment hrefPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment mimeTypePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_get_icon.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) hrefPOINTER.address(), (Addressable) mimeTypePOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        href.set(hrefPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        mimeType.set(mimeTypePOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_get_is_private = Interop.downcallHandle(
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
    public boolean getIsPrivate(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_get_is_private.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_get_mime_type = Interop.downcallHandle(
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
    public @NotNull java.lang.String getMimeType(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_mime_type.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_bookmark_file_get_modified_date_time = Interop.downcallHandle(
        "g_bookmark_file_get_modified_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the bookmark for {@code uri} was last modified.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public @NotNull DateTime getModifiedDateTime(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_modified_date_time.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DateTime(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_bookmark_file_get_size = Interop.downcallHandle(
        "g_bookmark_file_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of bookmarks inside {@code bookmark}.
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_bookmark_file_get_title = Interop.downcallHandle(
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
    public @NotNull java.lang.String getTitle(@Nullable java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_title.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_bookmark_file_get_uris = Interop.downcallHandle(
        "g_bookmark_file_get_uris",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all URIs of the bookmarks in the bookmark file {@code bookmark}.
     * The array of returned URIs will be {@code null}-terminated, so {@code length} may
     * optionally be {@code null}.
     */
    public java.lang.String[] getUris(@NotNull Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_uris.invokeExact(handle(), (Addressable) lengthPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        java.lang.String[] resultARRAY = new java.lang.String[length.get().intValue()];
        for (int I = 0; I < length.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = OBJ.getUtf8String(0);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_bookmark_file_get_visited_date_time = Interop.downcallHandle(
        "g_bookmark_file_get_visited_date_time",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time the bookmark for {@code uri} was last visited.
     * <p>
     * In the event the URI cannot be found, {@code null} is returned and
     * {@code error} is set to {@link BookmarkFileError#URI_NOT_FOUND}.
     */
    public @NotNull DateTime getVisitedDateTime(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_get_visited_date_time.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new DateTime(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_bookmark_file_has_application = Interop.downcallHandle(
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
    public boolean hasApplication(@NotNull java.lang.String uri, @NotNull java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_has_application.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(name), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_has_group = Interop.downcallHandle(
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
    public boolean hasGroup(@NotNull java.lang.String uri, @NotNull java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_has_group.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(group), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_has_item = Interop.downcallHandle(
        "g_bookmark_file_has_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks whether the desktop bookmark has an item with its URI set to {@code uri}.
     */
    public boolean hasItem(@NotNull java.lang.String uri) {
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_has_item.invokeExact(handle(), Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_load_from_data = Interop.downcallHandle(
        "g_bookmark_file_load_from_data",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a bookmark file from memory into an empty {@link BookmarkFile}
     * structure.  If the object cannot be created then {@code error} is set to a
     * {@link BookmarkFileError}.
     */
    public boolean loadFromData(@NotNull byte[] data, @NotNull long length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_load_from_data.invokeExact(handle(), Interop.allocateNativeArray(data), length, (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_load_from_data_dirs = Interop.downcallHandle(
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
    public boolean loadFromDataDirs(@NotNull java.lang.String file, @NotNull Out<java.lang.String> fullPath) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment fullPathPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_load_from_data_dirs.invokeExact(handle(), Interop.allocateNativeString(file), (Addressable) fullPathPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        fullPath.set(fullPathPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_load_from_file = Interop.downcallHandle(
        "g_bookmark_file_load_from_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads a desktop bookmark file into an empty {@link BookmarkFile} structure.
     * If the file could not be loaded then {@code error} is set to either a {@link FileError}
     * or {@link BookmarkFileError}.
     */
    public boolean loadFromFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_load_from_file.invokeExact(handle(), Interop.allocateNativeString(filename), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_move_item = Interop.downcallHandle(
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
    public boolean moveItem(@NotNull java.lang.String oldUri, @Nullable java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_move_item.invokeExact(handle(), Interop.allocateNativeString(oldUri), Interop.allocateNativeString(newUri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_remove_application = Interop.downcallHandle(
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
    public boolean removeApplication(@NotNull java.lang.String uri, @NotNull java.lang.String name) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_remove_application.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(name), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_remove_group = Interop.downcallHandle(
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
    public boolean removeGroup(@NotNull java.lang.String uri, @NotNull java.lang.String group) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_remove_group.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(group), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_remove_item = Interop.downcallHandle(
        "g_bookmark_file_remove_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes the bookmark for {@code uri} from the bookmark file {@code bookmark}.
     */
    public boolean removeItem(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_remove_item.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_set_added_date_time = Interop.downcallHandle(
        "g_bookmark_file_set_added_date_time",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the time the bookmark for {@code uri} was added into {@code bookmark}.
     * <p>
     * If no bookmark for {@code uri} is found then it is created.
     */
    public @NotNull void setAddedDateTime(@NotNull java.lang.String uri, @NotNull DateTime added) {
        try {
            g_bookmark_file_set_added_date_time.invokeExact(handle(), Interop.allocateNativeString(uri), added.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_application_info = Interop.downcallHandle(
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
    public boolean setApplicationInfo(@NotNull java.lang.String uri, @NotNull java.lang.String name, @NotNull java.lang.String exec, @NotNull int count, @Nullable DateTime stamp) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_set_application_info.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(name), Interop.allocateNativeString(exec), count, stamp.handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_set_description = Interop.downcallHandle(
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
    public @NotNull void setDescription(@Nullable java.lang.String uri, @NotNull java.lang.String description) {
        try {
            g_bookmark_file_set_description.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(description));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_groups = Interop.downcallHandle(
        "g_bookmark_file_set_groups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Sets a list of group names for the item with URI {@code uri}.  Each previously
     * set group name list is removed.
     * <p>
     * If {@code uri} cannot be found then an item for it is created.
     */
    public @NotNull void setGroups(@NotNull java.lang.String uri, @Nullable java.lang.String[] groups, @NotNull long length) {
        try {
            g_bookmark_file_set_groups.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeArray(groups), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_icon = Interop.downcallHandle(
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
    public @NotNull void setIcon(@NotNull java.lang.String uri, @Nullable java.lang.String href, @NotNull java.lang.String mimeType) {
        try {
            g_bookmark_file_set_icon.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(href), Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_is_private = Interop.downcallHandle(
        "g_bookmark_file_set_is_private",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the private flag of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     */
    public @NotNull void setIsPrivate(@NotNull java.lang.String uri, @NotNull boolean isPrivate) {
        try {
            g_bookmark_file_set_is_private.invokeExact(handle(), Interop.allocateNativeString(uri), isPrivate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_mime_type = Interop.downcallHandle(
        "g_bookmark_file_set_mime_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code mime_type} as the MIME type of the bookmark for {@code uri}.
     * <p>
     * If a bookmark for {@code uri} cannot be found then it is created.
     */
    public @NotNull void setMimeType(@NotNull java.lang.String uri, @NotNull java.lang.String mimeType) {
        try {
            g_bookmark_file_set_mime_type.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(mimeType));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_modified_date_time = Interop.downcallHandle(
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
    public @NotNull void setModifiedDateTime(@NotNull java.lang.String uri, @NotNull DateTime modified) {
        try {
            g_bookmark_file_set_modified_date_time.invokeExact(handle(), Interop.allocateNativeString(uri), modified.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_title = Interop.downcallHandle(
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
    public @NotNull void setTitle(@Nullable java.lang.String uri, @NotNull java.lang.String title) {
        try {
            g_bookmark_file_set_title.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_set_visited_date_time = Interop.downcallHandle(
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
    public @NotNull void setVisitedDateTime(@NotNull java.lang.String uri, @NotNull DateTime visited) {
        try {
            g_bookmark_file_set_visited_date_time.invokeExact(handle(), Interop.allocateNativeString(uri), visited.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_bookmark_file_to_data = Interop.downcallHandle(
        "g_bookmark_file_to_data",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function outputs {@code bookmark} as a string.
     */
    public byte[] toData(@NotNull Out<Long> length) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_to_data.invokeExact(handle(), (Addressable) lengthPOINTER.address(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        length.set(lengthPOINTER.get(ValueLayout.JAVA_LONG, 0));
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), length.get().intValue() * ValueLayout.JAVA_BYTE.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_BYTE);
    }
    
    private static final MethodHandle g_bookmark_file_to_file = Interop.downcallHandle(
        "g_bookmark_file_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function outputs {@code bookmark} into a file.  The write process is
     * guaranteed to be atomic by using g_file_set_contents() internally.
     */
    public boolean toFile(@NotNull java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_to_file.invokeExact(handle(), Interop.allocateNativeString(filename), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_bookmark_file_error_quark = Interop.downcallHandle(
        "g_bookmark_file_error_quark",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    public static @NotNull Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) g_bookmark_file_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Quark(RESULT);
    }
    
    private static final MethodHandle g_bookmark_file_new = Interop.downcallHandle(
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
    public static @NotNull BookmarkFile new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_bookmark_file_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new BookmarkFile(Refcounted.get(RESULT, false));
    }
    
}
