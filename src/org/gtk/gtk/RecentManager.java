package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkRecentManager` manages and looks up recently used files.
 * 
 * Each recently used file is identified by its URI, and has meta-data
 * associated to it, like the names and command lines of the applications
 * that have registered it, the number of time each application has
 * registered the same file, the mime type of the file and whether
 * the file should be displayed only by the applications that have
 * registered it.
 * 
 * The recently used files list is per user.
 * 
 * `GtkRecentManager` acts like a database of all the recently
 * used files. You can create new `GtkRecentManager` objects, but
 * it is more efficient to use the default manager created by GTK.
 * 
 * Adding a new recently used file is as simple as:
 * 
 * ```c
 * GtkRecentManager *manager;
 * 
 * manager = gtk_recent_manager_get_default ();
 * gtk_recent_manager_add_item (manager, file_uri);
 * ```
 * 
 * The `GtkRecentManager` will try to gather all the needed information
 * from the file itself through GIO.
 * 
 * Looking up the meta-data associated with a recently used file
 * given its URI requires calling [method@Gtk.RecentManager.lookup_item]:
 * 
 * ```c
 * GtkRecentManager *manager;
 * GtkRecentInfo *info;
 * GError *error = NULL;
 * 
 * manager = gtk_recent_manager_get_default ();
 * info = gtk_recent_manager_lookup_item (manager, file_uri, &error);
 * if (error)
 *   {
 *     g_warning ("Could not find the file: %s", error->message);
 *     g_error_free (error);
 *   }
 * else
 *  {
 *    // Use the info object
 *    gtk_recent_info_unref (info);
 *  }
 * ```
 * 
 * In order to retrieve the list of recently used files, you can use
 * [method@Gtk.RecentManager.get_items], which returns a list of
 * [struct@Gtk.RecentInfo].
 * 
 * Note that the maximum age of the recently used files list is
 * controllable through the [property@Gtk.Settings:gtk-recent-files-max-age]
 * property.
 */
public class RecentManager extends org.gtk.gobject.Object {

    public RecentManager(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RecentManager */
    public static RecentManager castFrom(org.gtk.gobject.Object gobject) {
        return new RecentManager(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_recent_manager_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new recent manager object.
     * 
     * Recent manager objects are used to handle the list of recently used
     * resources. A `GtkRecentManager` object monitors the recently used
     * resources list, and emits the [signal@Gtk.RecentManager::changed]
     * signal each time something inside the list changes.
     * 
     * `GtkRecentManager` objects are expensive: be sure to create them
     * only when needed. You should use [func@Gtk.RecentManager.get_default]
     * instead.
     */
    public RecentManager() {
        super(constructNew());
    }
    
    /**
     * Adds a new resource, pointed by @uri, into the recently used
     * resources list, using the metadata specified inside the
     * `GtkRecentData` passed in @recent_data.
     * 
     * The passed URI will be used to identify this resource inside the
     * list.
     * 
     * In order to register the new recently used resource, metadata about
     * the resource must be passed as well as the URI; the metadata is
     * stored in a `GtkRecentData`, which must contain the MIME
     * type of the resource pointed by the URI; the name of the application
     * that is registering the item, and a command line to be used when
     * launching the item.
     * 
     * Optionally, a `GtkRecentData` might contain a UTF-8 string
     * to be used when viewing the item instead of the last component of
     * the URI; a short description of the item; whether the item should
     * be considered private - that is, should be displayed only by the
     * applications that have registered it.
     */
    public boolean addFull(java.lang.String uri, RecentData recentData) {
        var RESULT = gtk_h.gtk_recent_manager_add_full(handle(), Interop.allocateNativeString(uri).handle(), recentData.handle());
        return (RESULT != 0);
    }
    
    /**
     * Adds a new resource, pointed by @uri, into the recently used
     * resources list.
     * 
     * This function automatically retrieves some of the needed
     * metadata and setting other metadata to common default values;
     * it then feeds the data to [method@Gtk.RecentManager.add_full].
     * 
     * See [method@Gtk.RecentManager.add_full] if you want to explicitly
     * define the metadata for the resource pointed by @uri.
     */
    public boolean addItem(java.lang.String uri) {
        var RESULT = gtk_h.gtk_recent_manager_add_item(handle(), Interop.allocateNativeString(uri).handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the list of recently used resources.
     */
    public org.gtk.glib.List getItems() {
        var RESULT = gtk_h.gtk_recent_manager_get_items(handle());
        return new org.gtk.glib.List(References.get(RESULT, true));
    }
    
    /**
     * Checks whether there is a recently used resource registered
     * with @uri inside the recent manager.
     */
    public boolean hasItem(java.lang.String uri) {
        var RESULT = gtk_h.gtk_recent_manager_has_item(handle(), Interop.allocateNativeString(uri).handle());
        return (RESULT != 0);
    }
    
    /**
     * Searches for a URI inside the recently used resources list, and
     * returns a `GtkRecentInfo` containing information about the resource
     * like its MIME type, or its display name.
     */
    public RecentInfo lookupItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_recent_manager_lookup_item(handle(), Interop.allocateNativeString(uri).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new RecentInfo(References.get(RESULT, true));
    }
    
    /**
     * Changes the location of a recently used resource from @uri to @new_uri.
     * 
     * Please note that this function will not affect the resource pointed
     * by the URIs, but only the URI used in the recently used resources list.
     */
    public boolean moveItem(java.lang.String uri, java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_recent_manager_move_item(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(newUri).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Purges every item from the recently used resources list.
     */
    public int purgeItems() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_recent_manager_purge_items(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Removes a resource pointed by @uri from the recently used resources
     * list handled by a recent manager.
     */
    public boolean removeItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_recent_manager_remove_item(handle(), Interop.allocateNativeString(uri).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets a unique instance of `GtkRecentManager` that you can share
     * in your application without caring about memory management.
     */
    public static RecentManager getDefault() {
        var RESULT = gtk_h.gtk_recent_manager_get_default();
        return new RecentManager(References.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(RecentManager source);
    }
    
    /**
     * Emitted when the current recently used resources manager changes
     * its contents.
     * 
     * This can happen either by calling [method@Gtk.RecentManager.add_item]
     * or by another application.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalRecentManagerChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
