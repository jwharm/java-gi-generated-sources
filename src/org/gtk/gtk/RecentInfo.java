package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkRecentInfo` contains the metadata associated with an item in the
 * recently used files list.
 */
public class RecentInfo extends io.github.jwharm.javagi.interop.ResourceBase {

    public RecentInfo(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a `GAppInfo` for the specified `GtkRecentInfo`
     * 
     * In case of error, @error will be set either with a
     * %GTK_RECENT_MANAGER_ERROR or a %G_IO_ERROR
     */
    public org.gtk.gio.AppInfo createAppInfo(java.lang.String appName) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_create_app_info(HANDLE(), Interop.allocateNativeString(appName).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Checks whether the resource pointed by @info still exists.
     * At the moment this check is done only on resources pointing
     * to local files.
     */
    public boolean exists() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_exists(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the time when the resource
     * was added to the recently used resources list.
     */
    public org.gtk.glib.DateTime getAdded() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_added(HANDLE());
        return new org.gtk.glib.DateTime(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of days elapsed since the last update
     * of the resource pointed by @info.
     */
    public int getAge() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_age(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the (short) description of the resource.
     */
    public java.lang.String getDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_description(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of the resource.
     * 
     * If none has been defined, the basename
     * of the resource is obtained.
     */
    public java.lang.String getDisplayName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_display_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the icon associated to the resource MIME type.
     */
    public org.gtk.gio.Icon getGicon() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_gicon(HANDLE());
        return new org.gtk.gio.Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the MIME type of the resource.
     */
    public java.lang.String getMimeType() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_mime_type(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the time when the meta-data
     * for the resource was last modified.
     */
    public org.gtk.glib.DateTime getModified() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_modified(HANDLE());
        return new org.gtk.glib.DateTime(References.get(RESULT, false));
    }
    
    /**
     * Gets the value of the “private” flag.
     * 
     * Resources in the recently used list that have this flag
     * set to %TRUE should only be displayed by the applications
     * that have registered them.
     */
    public boolean getPrivateHint() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_private_hint(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Computes a valid UTF-8 string that can be used as the
     * name of the item in a menu or list.
     * 
     * For example, calling this function on an item that refers
     * to “file:///foo/bar.txt” will yield “bar.txt”.
     */
    public java.lang.String getShortName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_short_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI of the resource.
     */
    public java.lang.String getUri() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_uri(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a displayable version of the resource’s URI.
     * 
     * If the resource is local, it returns a local path; if the
     * resource is not local, it returns the UTF-8 encoded content
     * of [method@Gtk.RecentInfo.get_uri].
     */
    public java.lang.String getUriDisplay() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_uri_display(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the time when the meta-data
     * for the resource was last visited.
     */
    public org.gtk.glib.DateTime getVisited() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_get_visited(HANDLE());
        return new org.gtk.glib.DateTime(References.get(RESULT, false));
    }
    
    /**
     * Checks whether an application registered this resource using @app_name.
     */
    public boolean hasApplication(java.lang.String appName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_has_application(HANDLE(), Interop.allocateNativeString(appName).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @group_name appears inside the groups
     * registered for the recently used item @info.
     */
    public boolean hasGroup(java.lang.String groupName) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_has_group(HANDLE(), Interop.allocateNativeString(groupName).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the resource is local or not by looking at the
     * scheme of its URI.
     */
    public boolean isLocal() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_is_local(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the name of the last application that have registered the
     * recently used resource represented by @info.
     */
    public java.lang.String lastApplication() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_last_application(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks whether two `GtkRecentInfo` point to the same resource.
     */
    public boolean match(RecentInfo infoB) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_match(HANDLE(), infoB.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Increases the reference count of @recent_info by one.
     */
    public RecentInfo ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_ref(HANDLE());
        return new RecentInfo(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of @info by one.
     * 
     * If the reference count reaches zero, @info is
     * deallocated, and the memory freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_recent_info_unref(HANDLE());
    }
    
}
