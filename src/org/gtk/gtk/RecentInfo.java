package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkRecentInfo</code> contains the metadata associated with an item in the
 * recently used files list.
 */
public class RecentInfo extends io.github.jwharm.javagi.ResourceBase {

    public RecentInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /**
     * Creates a <code>GAppInfo</code> for the specified <code>GtkRecentInfo</code>
     * 
     * In case of error, @error will be set either with a
     * <code>GTK_RECENT_MANAGER_ERROR</code> or a or a %G_IO_ERROR
     */
    public org.gtk.gio.AppInfo createAppInfo(java.lang.String appName) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_recent_info_create_app_info(handle(), Interop.allocateNativeString(appName).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gio.AppInfo.AppInfoImpl(References.get(RESULT, true));
    }
    
    /**
     * Checks whether the resource pointed by @info still exists.
     * At the moment this check is done only on resources pointing
     * to local files.
     */
    public boolean exists() {
        var RESULT = gtk_h.gtk_recent_info_exists(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the time when the resource
     * was added to the recently used resources list.
     */
    public org.gtk.glib.DateTime getAdded() {
        var RESULT = gtk_h.gtk_recent_info_get_added(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, false));
    }
    
    /**
     * Gets the number of days elapsed since the last update
     * of the resource pointed by @info.
     */
    public int getAge() {
        var RESULT = gtk_h.gtk_recent_info_get_age(handle());
        return RESULT;
    }
    
    /**
     * Gets the (short) description of the resource.
     */
    public java.lang.String getDescription() {
        var RESULT = gtk_h.gtk_recent_info_get_description(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the name of the resource.
     * 
     * If none has been defined, the basename
     * of the resource is obtained.
     */
    public java.lang.String getDisplayName() {
        var RESULT = gtk_h.gtk_recent_info_get_display_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the icon associated to the resource MIME type.
     */
    public org.gtk.gio.Icon getGicon() {
        var RESULT = gtk_h.gtk_recent_info_get_gicon(handle());
        return new org.gtk.gio.Icon.IconImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the MIME type of the resource.
     */
    public java.lang.String getMimeType() {
        var RESULT = gtk_h.gtk_recent_info_get_mime_type(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the time when the meta-data
     * for the resource was last modified.
     */
    public org.gtk.glib.DateTime getModified() {
        var RESULT = gtk_h.gtk_recent_info_get_modified(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, false));
    }
    
    /**
     * Gets the value of the &<code>#8220</code> private&<code>#8221</code>  flag.
     * 
     * Resources in the recently used list that have this flag
     * set to <code>true</code> should only be displayed by the applications
     * that have registered them.
     */
    public boolean getPrivateHint() {
        var RESULT = gtk_h.gtk_recent_info_get_private_hint(handle());
        return (RESULT != 0);
    }
    
    /**
     * Computes a valid UTF-8 string that can be used as the
     * name of the item in a menu or list.
     * 
     * For example, calling this function on an item that refers
     * to &<code>#8220</code> file:///foo/bar.txt&<code>#8221</code>  will yield &<code>#8220</code> bar.txt&<code>#8221</code> .
     */
    public java.lang.String getShortName() {
        var RESULT = gtk_h.gtk_recent_info_get_short_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the URI of the resource.
     */
    public java.lang.String getUri() {
        var RESULT = gtk_h.gtk_recent_info_get_uri(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets a displayable version of the resource&<code>#8217</code> s URI.
     * 
     * If the resource is local, it returns a local path; if the
     * resource is not local, it returns the UTF-8 encoded content
     * of {@link org.gtk.gtk.RecentInfo<code>#getUri</code> .
     */
    public java.lang.String getUriDisplay() {
        var RESULT = gtk_h.gtk_recent_info_get_uri_display(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the time when the meta-data
     * for the resource was last visited.
     */
    public org.gtk.glib.DateTime getVisited() {
        var RESULT = gtk_h.gtk_recent_info_get_visited(handle());
        return new org.gtk.glib.DateTime(References.get(RESULT, false));
    }
    
    /**
     * Checks whether an application registered this resource using @app_name.
     */
    public boolean hasApplication(java.lang.String appName) {
        var RESULT = gtk_h.gtk_recent_info_has_application(handle(), Interop.allocateNativeString(appName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @group_name appears inside the groups
     * registered for the recently used item @info.
     */
    public boolean hasGroup(java.lang.String groupName) {
        var RESULT = gtk_h.gtk_recent_info_has_group(handle(), Interop.allocateNativeString(groupName).handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the resource is local or not by looking at the
     * scheme of its URI.
     */
    public boolean isLocal() {
        var RESULT = gtk_h.gtk_recent_info_is_local(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the name of the last application that have registered the
     * recently used resource represented by @info.
     */
    public java.lang.String lastApplication() {
        var RESULT = gtk_h.gtk_recent_info_last_application(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Checks whether two <code>GtkRecentInfo</code> point to the same resource.
     */
    public boolean match(RecentInfo infoB) {
        var RESULT = gtk_h.gtk_recent_info_match(handle(), infoB.handle());
        return (RESULT != 0);
    }
    
    /**
     * Increases the reference count of @recent_info by one.
     */
    public RecentInfo ref() {
        var RESULT = gtk_h.gtk_recent_info_ref(handle());
        return new RecentInfo(References.get(RESULT, true));
    }
    
    /**
     * Decreases the reference count of @info by one.
     * 
     * If the reference count reaches zero, @info is
     * deallocated, and the memory freed.
     */
    public void unref() {
        gtk_h.gtk_recent_info_unref(handle());
    }
    
}
