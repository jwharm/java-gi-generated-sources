package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkRecentInfo} contains the metadata associated with an item in the
 * recently used files list.
 */
public class RecentInfo extends io.github.jwharm.javagi.ResourceBase {

    public RecentInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle gtk_recent_info_create_app_info = Interop.downcallHandle(
        "gtk_recent_info_create_app_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@code GAppInfo} for the specified {@code GtkRecentInfo}
     * <p>
     * In case of error, {@code error} will be set either with a
     * {@code GTK_RECENT_MANAGER_ERROR} or a {@code G_IO_ERROR}
     */
    public @Nullable org.gtk.gio.AppInfo createAppInfo(@Nullable java.lang.String appName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_create_app_info.invokeExact(handle(), Interop.allocateNativeString(appName), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_recent_info_exists = Interop.downcallHandle(
        "gtk_recent_info_exists",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the resource pointed by {@code info} still exists.
     * At the moment this check is done only on resources pointing
     * to local files.
     */
    public boolean exists() {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_exists.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_get_added = Interop.downcallHandle(
        "gtk_recent_info_get_added",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the resource
     * was added to the recently used resources list.
     */
    public @NotNull org.gtk.glib.DateTime getAdded() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_added.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_recent_info_get_age = Interop.downcallHandle(
        "gtk_recent_info_get_age",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of days elapsed since the last update
     * of the resource pointed by {@code info}.
     */
    public int getAge() {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_get_age.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_recent_info_get_application_info = Interop.downcallHandle(
        "gtk_recent_info_get_application_info",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the data regarding the application that has registered the resource
     * pointed by {@code info}.
     * <p>
     * If the command line contains any escape characters defined inside the
     * storage specification, they will be expanded.
     */
    public boolean getApplicationInfo(@NotNull java.lang.String appName, @NotNull Out<java.lang.String> appExec, @NotNull Out<Integer> count, @NotNull Out<org.gtk.glib.DateTime> stamp) {
        MemorySegment appExecPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment countPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment stampPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_get_application_info.invokeExact(handle(), Interop.allocateNativeString(appName), (Addressable) appExecPOINTER.address(), (Addressable) countPOINTER.address(), (Addressable) stampPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        appExec.set(appExecPOINTER.get(ValueLayout.ADDRESS, 0).getUtf8String(0));
        count.set(countPOINTER.get(ValueLayout.JAVA_INT, 0));
        stamp.set(new org.gtk.glib.DateTime(Refcounted.get(stampPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_get_applications = Interop.downcallHandle(
        "gtk_recent_info_get_applications",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the list of applications that have registered this resource.
     */
    public java.lang.String[] getApplications(@NotNull Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_applications.invokeExact(handle(), (Addressable) lengthPOINTER.address());
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
    
    private static final MethodHandle gtk_recent_info_get_description = Interop.downcallHandle(
        "gtk_recent_info_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the (short) description of the resource.
     */
    public @NotNull java.lang.String getDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_get_display_name = Interop.downcallHandle(
        "gtk_recent_info_get_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the resource.
     * <p>
     * If none has been defined, the basename
     * of the resource is obtained.
     */
    public @NotNull java.lang.String getDisplayName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_display_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_get_gicon = Interop.downcallHandle(
        "gtk_recent_info_get_gicon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the icon associated to the resource MIME type.
     */
    public @Nullable org.gtk.gio.Icon getGicon() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_gicon.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_recent_info_get_groups = Interop.downcallHandle(
        "gtk_recent_info_get_groups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all groups registered for the recently used item {@code info}.
     * <p>
     * The array of returned group names will be {@code null} terminated, so
     * length might optionally be {@code null}.
     */
    public java.lang.String[] getGroups(@NotNull Out<Long> length) {
        MemorySegment lengthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_LONG);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_groups.invokeExact(handle(), (Addressable) lengthPOINTER.address());
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
    
    private static final MethodHandle gtk_recent_info_get_mime_type = Interop.downcallHandle(
        "gtk_recent_info_get_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the MIME type of the resource.
     */
    public @NotNull java.lang.String getMimeType() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_mime_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_get_modified = Interop.downcallHandle(
        "gtk_recent_info_get_modified",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the meta-data
     * for the resource was last modified.
     */
    public @NotNull org.gtk.glib.DateTime getModified() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_modified.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_recent_info_get_private_hint = Interop.downcallHandle(
        "gtk_recent_info_get_private_hint",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value of the “private” flag.
     * <p>
     * Resources in the recently used list that have this flag
     * set to {@code true} should only be displayed by the applications
     * that have registered them.
     */
    public boolean getPrivateHint() {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_get_private_hint.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_get_short_name = Interop.downcallHandle(
        "gtk_recent_info_get_short_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes a valid UTF-8 string that can be used as the
     * name of the item in a menu or list.
     * <p>
     * For example, calling this function on an item that refers
     * to “file:///foo/bar.txt” will yield “bar.txt”.
     */
    public @NotNull java.lang.String getShortName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_short_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_get_uri = Interop.downcallHandle(
        "gtk_recent_info_get_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the URI of the resource.
     */
    public @NotNull java.lang.String getUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_uri.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_get_uri_display = Interop.downcallHandle(
        "gtk_recent_info_get_uri_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a displayable version of the resource’s URI.
     * <p>
     * If the resource is local, it returns a local path; if the
     * resource is not local, it returns the UTF-8 encoded content
     * of {@link RecentInfo#getUri}.
     */
    public @Nullable java.lang.String getUriDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_uri_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_get_visited = Interop.downcallHandle(
        "gtk_recent_info_get_visited",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the meta-data
     * for the resource was last visited.
     */
    public @NotNull org.gtk.glib.DateTime getVisited() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_get_visited.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_recent_info_has_application = Interop.downcallHandle(
        "gtk_recent_info_has_application",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether an application registered this resource using {@code app_name}.
     */
    public boolean hasApplication(@NotNull java.lang.String appName) {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_has_application.invokeExact(handle(), Interop.allocateNativeString(appName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_has_group = Interop.downcallHandle(
        "gtk_recent_info_has_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code group_name} appears inside the groups
     * registered for the recently used item {@code info}.
     */
    public boolean hasGroup(@NotNull java.lang.String groupName) {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_has_group.invokeExact(handle(), Interop.allocateNativeString(groupName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_is_local = Interop.downcallHandle(
        "gtk_recent_info_is_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the resource is local or not by looking at the
     * scheme of its URI.
     */
    public boolean isLocal() {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_is_local.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_last_application = Interop.downcallHandle(
        "gtk_recent_info_last_application",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the last application that have registered the
     * recently used resource represented by {@code info}.
     */
    public @NotNull java.lang.String lastApplication() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_last_application.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_recent_info_match = Interop.downcallHandle(
        "gtk_recent_info_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether two {@code GtkRecentInfo} point to the same resource.
     */
    public boolean match(@NotNull RecentInfo infoB) {
        int RESULT;
        try {
            RESULT = (int) gtk_recent_info_match.invokeExact(handle(), infoB.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_recent_info_ref = Interop.downcallHandle(
        "gtk_recent_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code recent_info} by one.
     */
    public @NotNull RecentInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_recent_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RecentInfo(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_recent_info_unref = Interop.downcallHandle(
        "gtk_recent_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code info} by one.
     * <p>
     * If the reference count reaches zero, {@code info} is
     * deallocated, and the memory freed.
     */
    public @NotNull void unref() {
        try {
            gtk_recent_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
