package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkRecentManager} manages and looks up recently used files.
 * <p>
 * Each recently used file is identified by its URI, and has meta-data
 * associated to it, like the names and command lines of the applications
 * that have registered it, the number of time each application has
 * registered the same file, the mime type of the file and whether
 * the file should be displayed only by the applications that have
 * registered it.
 * <p>
 * The recently used files list is per user.
 * <p>
 * {@code GtkRecentManager} acts like a database of all the recently
 * used files. You can create new {@code GtkRecentManager} objects, but
 * it is more efficient to use the default manager created by GTK.
 * <p>
 * Adding a new recently used file is as simple as:
 * <p>
 * <pre>{@code c
 * GtkRecentManager *manager;
 * 
 * manager = gtk_recent_manager_get_default ();
 * gtk_recent_manager_add_item (manager, file_uri);
 * }</pre>
 * <p>
 * The {@code GtkRecentManager} will try to gather all the needed information
 * from the file itself through GIO.
 * <p>
 * Looking up the meta-data associated with a recently used file
 * given its URI requires calling {@link RecentManager#lookupItem}:
 * <p>
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * In order to retrieve the list of recently used files, you can use
 * {@link RecentManager#getItems}, which returns a list of
 * {@code Gtk.RecentInfo}.
 * <p>
 * Note that the maximum age of the recently used files list is
 * controllable through the {@code Gtk.Settings:gtk-recent-files-max-age}
 * property.
 */
public class RecentManager extends org.gtk.gobject.Object {

    public RecentManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RecentManager */
    public static RecentManager castFrom(org.gtk.gobject.Object gobject) {
        return new RecentManager(gobject.refcounted());
    }
    
    static final MethodHandle gtk_recent_manager_new = Interop.downcallHandle(
        "gtk_recent_manager_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_recent_manager_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new recent manager object.
     * <p>
     * Recent manager objects are used to handle the list of recently used
     * resources. A {@code GtkRecentManager} object monitors the recently used
     * resources list, and emits the {@code Gtk.RecentManager::changed}
     * signal each time something inside the list changes.
     * <p>
     * {@code GtkRecentManager} objects are expensive: be sure to create them
     * only when needed. You should use {@link Gtk#RecentManager}
     * instead.
     */
    public RecentManager() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_recent_manager_add_full = Interop.downcallHandle(
        "gtk_recent_manager_add_full",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new resource, pointed by {@code uri}, into the recently used
     * resources list, using the metadata specified inside the
     * {@code GtkRecentData} passed in {@code recent_data}.
     * <p>
     * The passed URI will be used to identify this resource inside the
     * list.
     * <p>
     * In order to register the new recently used resource, metadata about
     * the resource must be passed as well as the URI; the metadata is
     * stored in a {@code GtkRecentData}, which must contain the MIME
     * type of the resource pointed by the URI; the name of the application
     * that is registering the item, and a command line to be used when
     * launching the item.
     * <p>
     * Optionally, a {@code GtkRecentData} might contain a UTF-8 string
     * to be used when viewing the item instead of the last component of
     * the URI; a short description of the item; whether the item should
     * be considered private - that is, should be displayed only by the
     * applications that have registered it.
     */
    public boolean addFull(java.lang.String uri, RecentData recentData) {
        try {
            var RESULT = (int) gtk_recent_manager_add_full.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), recentData.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_add_item = Interop.downcallHandle(
        "gtk_recent_manager_add_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a new resource, pointed by {@code uri}, into the recently used
     * resources list.
     * <p>
     * This function automatically retrieves some of the needed
     * metadata and setting other metadata to common default values;
     * it then feeds the data to {@link RecentManager#addFull}.
     * <p>
     * See {@link RecentManager#addFull} if you want to explicitly
     * define the metadata for the resource pointed by {@code uri}.
     */
    public boolean addItem(java.lang.String uri) {
        try {
            var RESULT = (int) gtk_recent_manager_add_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_get_items = Interop.downcallHandle(
        "gtk_recent_manager_get_items",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the list of recently used resources.
     */
    public org.gtk.glib.List getItems() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_manager_get_items.invokeExact(handle());
            return new org.gtk.glib.List(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_has_item = Interop.downcallHandle(
        "gtk_recent_manager_has_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether there is a recently used resource registered
     * with {@code uri} inside the recent manager.
     */
    public boolean hasItem(java.lang.String uri) {
        try {
            var RESULT = (int) gtk_recent_manager_has_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_lookup_item = Interop.downcallHandle(
        "gtk_recent_manager_lookup_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Searches for a URI inside the recently used resources list, and
     * returns a {@code GtkRecentInfo} containing information about the resource
     * like its MIME type, or its display name.
     */
    public RecentInfo lookupItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) gtk_recent_manager_lookup_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new RecentInfo(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_move_item = Interop.downcallHandle(
        "gtk_recent_manager_move_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Changes the location of a recently used resource from {@code uri} to {@code new_uri}.
     * <p>
     * Please note that this function will not affect the resource pointed
     * by the URIs, but only the URI used in the recently used resources list.
     */
    public boolean moveItem(java.lang.String uri, java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_recent_manager_move_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), Interop.allocateNativeString(newUri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_purge_items = Interop.downcallHandle(
        "gtk_recent_manager_purge_items",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Purges every item from the recently used resources list.
     */
    public int purgeItems() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_recent_manager_purge_items.invokeExact(handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_remove_item = Interop.downcallHandle(
        "gtk_recent_manager_remove_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a resource pointed by {@code uri} from the recently used resources
     * list handled by a recent manager.
     */
    public boolean removeItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_recent_manager_remove_item.invokeExact(handle(), Interop.allocateNativeString(uri).handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_recent_manager_get_default = Interop.downcallHandle(
        "gtk_recent_manager_get_default",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a unique instance of {@code GtkRecentManager} that you can share
     * in your application without caring about memory management.
     */
    public static RecentManager getDefault() {
        try {
            var RESULT = (MemoryAddress) gtk_recent_manager_get_default.invokeExact();
            return new RecentManager(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(RecentManager source);
    }
    
    /**
     * Emitted when the current recently used resources manager changes
     * its contents.
     * <p>
     * This can happen either by calling {@link RecentManager#addItem}
     * or by another application.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(RecentManager.Callbacks.class, "signalRecentManagerChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalRecentManagerChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (RecentManager.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new RecentManager(Refcounted.get(source)));
        }
        
    }
}
