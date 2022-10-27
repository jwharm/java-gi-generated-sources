package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        org.gtk.gtk.RecentManagerPrivate.getMemoryLayout().withName("priv")
    ).withName("GtkRecentManager");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public RecentManager(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RecentManager */
    public static RecentManager castFrom(org.gtk.gobject.Object gobject) {
        return new RecentManager(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_recent_manager_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * only when needed. You should use {@link RecentManager#getDefault}
     * instead.
     */
    public RecentManager() {
        super(constructNew());
    }
    
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
     * @param uri a valid URI
     * @param recentData metadata of the resource
     * @return {@code true} if the new item was successfully added to the
     *   recently used resources list, {@code false} otherwise
     */
    public boolean addFull(@NotNull java.lang.String uri, @NotNull org.gtk.gtk.RecentData recentData) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNull(recentData, "Parameter 'recentData' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_add_full.invokeExact(handle(), Interop.allocateNativeString(uri), recentData.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param uri a valid URI
     * @return {@code true} if the new item was successfully added
     *   to the recently used resources list
     */
    public boolean addItem(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_add_item.invokeExact(handle(), Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the list of recently used resources.
     * @return a list of
     *   newly allocated {@code GtkRecentInfo objects}. Use
     *   {@link RecentInfo#unref} on each item inside the list, and then
     *   free the list itself using g_list_free().
     */
    public @NotNull org.gtk.glib.List getItems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_get_items.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.List(Refcounted.get(RESULT, true));
    }
    
    /**
     * Checks whether there is a recently used resource registered
     * with {@code uri} inside the recent manager.
     * @param uri a URI
     * @return {@code true} if the resource was found, {@code false} otherwise
     */
    public boolean hasItem(@NotNull java.lang.String uri) {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_has_item.invokeExact(handle(), Interop.allocateNativeString(uri));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Searches for a URI inside the recently used resources list, and
     * returns a {@code GtkRecentInfo} containing information about the resource
     * like its MIME type, or its display name.
     * @param uri a URI
     * @return a {@code GtkRecentInfo} containing information
     *   about the resource pointed by {@code uri}, or {@code null} if the URI was
     *   not registered in the recently used resources list. Free with
     *   {@link RecentInfo#unref}.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public @Nullable org.gtk.gtk.RecentInfo lookupItem(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_lookup_item.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new org.gtk.gtk.RecentInfo(Refcounted.get(RESULT, true));
    }
    
    /**
     * Changes the location of a recently used resource from {@code uri} to {@code new_uri}.
     * <p>
     * Please note that this function will not affect the resource pointed
     * by the URIs, but only the URI used in the recently used resources list.
     * @param uri the URI of a recently used resource
     * @param newUri the new URI of the recently used resource, or
     *    {@code null} to remove the item pointed by {@code uri} in the list
     * @return {@code true} on success
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean moveItem(@NotNull java.lang.String uri, @Nullable java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        java.util.Objects.requireNonNullElse(newUri, MemoryAddress.NULL);
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_move_item.invokeExact(handle(), Interop.allocateNativeString(uri), Interop.allocateNativeString(newUri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Purges every item from the recently used resources list.
     * @return the number of items that have been removed from the
     *   recently used resources list
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int purgeItems() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_purge_items.invokeExact(handle(), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Removes a resource pointed by {@code uri} from the recently used resources
     * list handled by a recent manager.
     * @param uri the URI of the item you wish to remove
     * @return {@code true} if the item pointed by {@code uri} has been successfully
     *   removed by the recently used resources list, and {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeItem(@NotNull java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        java.util.Objects.requireNonNull(uri, "Parameter 'uri' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_recent_manager_remove_item.invokeExact(handle(), Interop.allocateNativeString(uri), (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets a unique instance of {@code GtkRecentManager} that you can share
     * in your application without caring about memory management.
     * @return A unique {@code GtkRecentManager}. Do not ref or
     *   unref it.
     */
    public static @NotNull org.gtk.gtk.RecentManager getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.RecentManager(Refcounted.get(RESULT, false));
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(RecentManager source);
    }
    
    /**
     * Emitted when the current recently used resources manager changes
     * its contents.
     * <p>
     * This can happen either by calling {@link RecentManager#addItem}
     * or by another application.
     */
    public Signal<RecentManager.Changed> onChanged(RecentManager.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(RecentManager.Callbacks.class, "signalRecentManagerChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<RecentManager.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_recent_manager_new = Interop.downcallHandle(
            "gtk_recent_manager_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_add_full = Interop.downcallHandle(
            "gtk_recent_manager_add_full",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_add_item = Interop.downcallHandle(
            "gtk_recent_manager_add_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_get_items = Interop.downcallHandle(
            "gtk_recent_manager_get_items",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_has_item = Interop.downcallHandle(
            "gtk_recent_manager_has_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_lookup_item = Interop.downcallHandle(
            "gtk_recent_manager_lookup_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_move_item = Interop.downcallHandle(
            "gtk_recent_manager_move_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_purge_items = Interop.downcallHandle(
            "gtk_recent_manager_purge_items",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_remove_item = Interop.downcallHandle(
            "gtk_recent_manager_remove_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_recent_manager_get_default = Interop.downcallHandle(
            "gtk_recent_manager_get_default",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalRecentManagerChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (RecentManager.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new RecentManager(Refcounted.get(source)));
        }
    }
}
