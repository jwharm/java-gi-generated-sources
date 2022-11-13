package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkRecentInfo} contains the metadata associated with an item in the
 * recently used files list.
 */
public class RecentInfo extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentInfo";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static RecentInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RecentInfo newInstance = new RecentInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a RecentInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public RecentInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Creates a {@code GAppInfo} for the specified {@code GtkRecentInfo}
     * <p>
     * In case of error, {@code error} will be set either with a
     * {@code GTK_RECENT_MANAGER_ERROR} or a {@code G_IO_ERROR}
     * @param appName the name of the application that should
     *   be mapped to a {@code GAppInfo}; if {@code null} is used then the default
     *   application for the MIME type is used
     * @return the newly created {@code GAppInfo}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gio.AppInfo createAppInfo(@Nullable java.lang.String appName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_create_app_info.invokeExact(
                    handle(),
                    (Addressable) (appName == null ? MemoryAddress.NULL : Interop.allocateNativeString(appName)),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks whether the resource pointed by {@code info} still exists.
     * At the moment this check is done only on resources pointing
     * to local files.
     * @return {@code true} if the resource exists
     */
    public boolean exists() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_exists.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the time when the resource
     * was added to the recently used resources list.
     * @return a {@code GDateTime} for the time
     *    when the resource was added
     */
    public @NotNull org.gtk.glib.DateTime getAdded() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_added.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the number of days elapsed since the last update
     * of the resource pointed by {@code info}.
     * @return a positive integer containing the number of days
     *   elapsed since the time this resource was last modified
     */
    public int getAge() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_get_age.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the data regarding the application that has registered the resource
     * pointed by {@code info}.
     * <p>
     * If the command line contains any escape characters defined inside the
     * storage specification, they will be expanded.
     * @param appName the name of the application that has registered this item
     * @param appExec return location for the string containing
     *    the command line
     * @param count return location for the number of times this item was registered
     * @param stamp return location for the time this item was last
     *    registered for this application
     * @return {@code true} if an application with {@code app_name} has registered this
     *   resource inside the recently used list, or {@code false} otherwise. The
     *   {@code app_exec} string is owned by the {@code GtkRecentInfo} and should not be
     *   modified or freed
     */
    public boolean getApplicationInfo(@NotNull java.lang.String appName, @NotNull Out<java.lang.String> appExec, Out<Integer> count, @NotNull PointerProxy<org.gtk.glib.DateTime> stamp) {
        java.util.Objects.requireNonNull(appName, "Parameter 'appName' must not be null");
        java.util.Objects.requireNonNull(appExec, "Parameter 'appExec' must not be null");
        java.util.Objects.requireNonNull(count, "Parameter 'count' must not be null");
        java.util.Objects.requireNonNull(stamp, "Parameter 'stamp' must not be null");
        MemorySegment appExecPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment countPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_get_application_info.invokeExact(
                    handle(),
                    Interop.allocateNativeString(appName),
                    (Addressable) appExecPOINTER.address(),
                    (Addressable) countPOINTER.address(),
                    stamp.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        appExec.set(Interop.getStringFrom(appExecPOINTER.get(ValueLayout.ADDRESS, 0)));
        count.set(countPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Retrieves the list of applications that have registered this resource.
     * @param length return location for the length of the returned list
     * @return a newly
     *   allocated {@code null}-terminated array of strings. Use g_strfreev() to free it.
     */
    public @NotNull java.lang.String[] getApplications(Out<Long> length) {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_applications.invokeExact(
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
     * Gets the (short) description of the resource.
     * @return the description of the resource. The returned string
     *   is owned by the recent manager, and should not be freed.
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_description.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the name of the resource.
     * <p>
     * If none has been defined, the basename
     * of the resource is obtained.
     * @return the display name of the resource. The returned string
     *   is owned by the recent manager, and should not be freed.
     */
    public @NotNull java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_display_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Retrieves the icon associated to the resource MIME type.
     * @return a {@code GIcon} containing the icon
     */
    public @Nullable org.gtk.gio.Icon getGicon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_gicon.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns all groups registered for the recently used item {@code info}.
     * <p>
     * The array of returned group names will be {@code null} terminated, so
     * length might optionally be {@code null}.
     * @param length return location for the number of groups returned
     * @return a newly allocated {@code null} terminated array of strings.
     *   Use g_strfreev() to free it.
     */
    public @NotNull java.lang.String[] getGroups(Out<Long> length) {
        java.util.Objects.requireNonNull(length, "Parameter 'length' must not be null");
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_groups.invokeExact(
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
     * Gets the MIME type of the resource.
     * @return the MIME type of the resource. The returned string
     *   is owned by the recent manager, and should not be freed.
     */
    public @NotNull java.lang.String getMimeType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_mime_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the time when the meta-data
     * for the resource was last modified.
     * @return a {@code GDateTime} for the time
     *   when the resource was last modified
     */
    public @NotNull org.gtk.glib.DateTime getModified() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_modified.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the value of the “private” flag.
     * <p>
     * Resources in the recently used list that have this flag
     * set to {@code true} should only be displayed by the applications
     * that have registered them.
     * @return {@code true} if the private flag was found, {@code false} otherwise
     */
    public boolean getPrivateHint() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_get_private_hint.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Computes a valid UTF-8 string that can be used as the
     * name of the item in a menu or list.
     * <p>
     * For example, calling this function on an item that refers
     * to “file:///foo/bar.txt” will yield “bar.txt”.
     * @return A newly-allocated string in UTF-8 encoding
     *   free it with g_free()
     */
    public @NotNull java.lang.String getShortName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_short_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the URI of the resource.
     * @return the URI of the resource. The returned string is
     *   owned by the recent manager, and should not be freed.
     */
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_uri.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets a displayable version of the resource’s URI.
     * <p>
     * If the resource is local, it returns a local path; if the
     * resource is not local, it returns the UTF-8 encoded content
     * of {@link RecentInfo#getUri}.
     * @return a newly allocated UTF-8 string containing the
     *   resource’s URI or {@code null}. Use g_free() when done using it.
     */
    public @Nullable java.lang.String getUriDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_uri_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the time when the meta-data
     * for the resource was last visited.
     * @return a {@code GDateTime} for the time
     *    when the resource was last visited
     */
    public @NotNull org.gtk.glib.DateTime getVisited() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_get_visited.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks whether an application registered this resource using {@code app_name}.
     * @param appName a string containing an application name
     * @return {@code true} if an application with name {@code app_name} was found,
     *   {@code false} otherwise
     */
    public boolean hasApplication(@NotNull java.lang.String appName) {
        java.util.Objects.requireNonNull(appName, "Parameter 'appName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_has_application.invokeExact(
                    handle(),
                    Interop.allocateNativeString(appName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether {@code group_name} appears inside the groups
     * registered for the recently used item {@code info}.
     * @param groupName name of a group
     * @return {@code true} if the group was found
     */
    public boolean hasGroup(@NotNull java.lang.String groupName) {
        java.util.Objects.requireNonNull(groupName, "Parameter 'groupName' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_has_group.invokeExact(
                    handle(),
                    Interop.allocateNativeString(groupName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether the resource is local or not by looking at the
     * scheme of its URI.
     * @return {@code true} if the resource is local
     */
    public boolean isLocal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_is_local.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the name of the last application that have registered the
     * recently used resource represented by {@code info}.
     * @return an application name. Use g_free() to free it.
     */
    public @NotNull java.lang.String lastApplication() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_last_application.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Checks whether two {@code GtkRecentInfo} point to the same resource.
     * @param infoB a {@code GtkRecentInfo}
     * @return {@code true} if both {@code GtkRecentInfo} point to the same
     *   resource, {@code false} otherwise
     */
    public boolean match(@NotNull org.gtk.gtk.RecentInfo infoB) {
        java.util.Objects.requireNonNull(infoB, "Parameter 'infoB' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_info_match.invokeExact(
                    handle(),
                    infoB.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Increases the reference count of {@code recent_info} by one.
     * @return the recent info object with its reference count
     *   increased by one
     */
    public @NotNull org.gtk.gtk.RecentInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_info_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.RecentInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * Decreases the reference count of {@code info} by one.
     * <p>
     * If the reference count reaches zero, {@code info} is
     * deallocated, and the memory freed.
     */
    public void unref() {
        try {
            DowncallHandles.gtk_recent_info_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_recent_info_create_app_info = Interop.downcallHandle(
            "gtk_recent_info_create_app_info",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_exists = Interop.downcallHandle(
            "gtk_recent_info_exists",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_added = Interop.downcallHandle(
            "gtk_recent_info_get_added",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_age = Interop.downcallHandle(
            "gtk_recent_info_get_age",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_application_info = Interop.downcallHandle(
            "gtk_recent_info_get_application_info",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_applications = Interop.downcallHandle(
            "gtk_recent_info_get_applications",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_description = Interop.downcallHandle(
            "gtk_recent_info_get_description",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_display_name = Interop.downcallHandle(
            "gtk_recent_info_get_display_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_gicon = Interop.downcallHandle(
            "gtk_recent_info_get_gicon",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_groups = Interop.downcallHandle(
            "gtk_recent_info_get_groups",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_mime_type = Interop.downcallHandle(
            "gtk_recent_info_get_mime_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_modified = Interop.downcallHandle(
            "gtk_recent_info_get_modified",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_private_hint = Interop.downcallHandle(
            "gtk_recent_info_get_private_hint",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_short_name = Interop.downcallHandle(
            "gtk_recent_info_get_short_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_uri = Interop.downcallHandle(
            "gtk_recent_info_get_uri",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_uri_display = Interop.downcallHandle(
            "gtk_recent_info_get_uri_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_get_visited = Interop.downcallHandle(
            "gtk_recent_info_get_visited",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_has_application = Interop.downcallHandle(
            "gtk_recent_info_has_application",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_has_group = Interop.downcallHandle(
            "gtk_recent_info_has_group",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_is_local = Interop.downcallHandle(
            "gtk_recent_info_is_local",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_last_application = Interop.downcallHandle(
            "gtk_recent_info_last_application",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_match = Interop.downcallHandle(
            "gtk_recent_info_match",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_ref = Interop.downcallHandle(
            "gtk_recent_info_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_recent_info_unref = Interop.downcallHandle(
            "gtk_recent_info_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
