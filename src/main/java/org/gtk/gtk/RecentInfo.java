package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkRecentInfo} contains the metadata associated with an item in the
 * recently used files list.
 */
public class RecentInfo extends io.github.jwharm.javagi.ResourceBase {

    public RecentInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_recent_info_create_app_info = Interop.downcallHandle(
        "gtk_recent_info_create_app_info",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a {@code GAppInfo} for the specified {@code GtkRecentInfo}
     * <p>
     * In case of error, {@code error} will be set either with a
     * {@code GTK_RECENT_MANAGER_ERROR} or a {@code G_IO_ERROR}
     */
    public org.gtk.gio.AppInfo createAppInfo(java.lang.String appName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_create_app_info.invokeExact(handle(), Interop.allocateNativeString(appName).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new org.gtk.gio.AppInfo.AppInfoImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_exists = Interop.downcallHandle(
        "gtk_recent_info_exists",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the resource pointed by {@code info} still exists.
     * At the moment this check is done only on resources pointing
     * to local files.
     */
    public boolean exists() {
        try {
            var RESULT = (int) gtk_recent_info_exists.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_added = Interop.downcallHandle(
        "gtk_recent_info_get_added",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the resource
     * was added to the recently used resources list.
     */
    public org.gtk.glib.DateTime getAdded() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_added.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_age = Interop.downcallHandle(
        "gtk_recent_info_get_age",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of days elapsed since the last update
     * of the resource pointed by {@code info}.
     */
    public int getAge() {
        try {
            var RESULT = (int) gtk_recent_info_get_age.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_application_info = Interop.downcallHandle(
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
    public boolean getApplicationInfo(java.lang.String appName, PointerString appExec, PointerInteger count, PointerProxy<org.gtk.glib.DateTime> stamp) {
        try {
            var RESULT = (int) gtk_recent_info_get_application_info.invokeExact(handle(), Interop.allocateNativeString(appName).handle(), appExec.handle(), count.handle(), stamp.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_applications = Interop.downcallHandle(
        "gtk_recent_info_get_applications",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the list of applications that have registered this resource.
     */
    public PointerString getApplications(PointerLong length) {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_applications.invokeExact(handle(), length.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_description = Interop.downcallHandle(
        "gtk_recent_info_get_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the (short) description of the resource.
     */
    public java.lang.String getDescription() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_description.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_display_name = Interop.downcallHandle(
        "gtk_recent_info_get_display_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the resource.
     * <p>
     * If none has been defined, the basename
     * of the resource is obtained.
     */
    public java.lang.String getDisplayName() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_display_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_gicon = Interop.downcallHandle(
        "gtk_recent_info_get_gicon",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the icon associated to the resource MIME type.
     */
    public org.gtk.gio.Icon getGicon() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_gicon.invokeExact(handle());
            return new org.gtk.gio.Icon.IconImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_groups = Interop.downcallHandle(
        "gtk_recent_info_get_groups",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns all groups registered for the recently used item {@code info}.
     * <p>
     * The array of returned group names will be {@code null} terminated, so
     * length might optionally be {@code null}.
     */
    public PointerString getGroups(PointerLong length) {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_groups.invokeExact(handle(), length.handle());
            return new PointerString(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_mime_type = Interop.downcallHandle(
        "gtk_recent_info_get_mime_type",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the MIME type of the resource.
     */
    public java.lang.String getMimeType() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_mime_type.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_modified = Interop.downcallHandle(
        "gtk_recent_info_get_modified",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the meta-data
     * for the resource was last modified.
     */
    public org.gtk.glib.DateTime getModified() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_modified.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_private_hint = Interop.downcallHandle(
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
        try {
            var RESULT = (int) gtk_recent_info_get_private_hint.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_short_name = Interop.downcallHandle(
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
    public java.lang.String getShortName() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_short_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_uri = Interop.downcallHandle(
        "gtk_recent_info_get_uri",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the URI of the resource.
     */
    public java.lang.String getUri() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_uri.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_uri_display = Interop.downcallHandle(
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
    public java.lang.String getUriDisplay() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_uri_display.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_get_visited = Interop.downcallHandle(
        "gtk_recent_info_get_visited",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the time when the meta-data
     * for the resource was last visited.
     */
    public org.gtk.glib.DateTime getVisited() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_get_visited.invokeExact(handle());
            return new org.gtk.glib.DateTime(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_has_application = Interop.downcallHandle(
        "gtk_recent_info_has_application",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether an application registered this resource using {@code app_name}.
     */
    public boolean hasApplication(java.lang.String appName) {
        try {
            var RESULT = (int) gtk_recent_info_has_application.invokeExact(handle(), Interop.allocateNativeString(appName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_has_group = Interop.downcallHandle(
        "gtk_recent_info_has_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code group_name} appears inside the groups
     * registered for the recently used item {@code info}.
     */
    public boolean hasGroup(java.lang.String groupName) {
        try {
            var RESULT = (int) gtk_recent_info_has_group.invokeExact(handle(), Interop.allocateNativeString(groupName).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_is_local = Interop.downcallHandle(
        "gtk_recent_info_is_local",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the resource is local or not by looking at the
     * scheme of its URI.
     */
    public boolean isLocal() {
        try {
            var RESULT = (int) gtk_recent_info_is_local.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_last_application = Interop.downcallHandle(
        "gtk_recent_info_last_application",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the last application that have registered the
     * recently used resource represented by {@code info}.
     */
    public java.lang.String lastApplication() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_last_application.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_match = Interop.downcallHandle(
        "gtk_recent_info_match",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether two {@code GtkRecentInfo} point to the same resource.
     */
    public boolean match(RecentInfo infoB) {
        try {
            var RESULT = (int) gtk_recent_info_match.invokeExact(handle(), infoB.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_ref = Interop.downcallHandle(
        "gtk_recent_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count of {@code recent_info} by one.
     */
    public RecentInfo ref() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_info_ref.invokeExact(handle());
            return new RecentInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_info_unref = Interop.downcallHandle(
        "gtk_recent_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count of {@code info} by one.
     * <p>
     * If the reference count reaches zero, {@code info} is
     * deallocated, and the memory freed.
     */
    public void unref() {
        try {
            gtk_recent_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
