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
public class RecentManager extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRecentManager";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a RecentManager proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RecentManager(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RecentManager> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RecentManager(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_new.invokeExact();
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
        this.takeOwnership();
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
    public boolean addFull(java.lang.String uri, org.gtk.gtk.RecentData recentData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_recent_manager_add_full.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        recentData.handle());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean addItem(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_recent_manager_add_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the list of recently used resources.
     * @return a list of
     *   newly allocated {@code GtkRecentInfo objects}. Use
     *   {@link RecentInfo#unref} on each item inside the list, and then
     *   free the list itself using g_list_free().
     */
    public org.gtk.glib.List getItems() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_get_items.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.List.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Checks whether there is a recently used resource registered
     * with {@code uri} inside the recent manager.
     * @param uri a URI
     * @return {@code true} if the resource was found, {@code false} otherwise
     */
    public boolean hasItem(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_recent_manager_has_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public @Nullable org.gtk.gtk.RecentInfo lookupItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_lookup_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = org.gtk.gtk.RecentInfo.fromAddress.marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
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
    public boolean moveItem(java.lang.String uri, @Nullable java.lang.String newUri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_recent_manager_move_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) (newUri == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(newUri, SCOPE)),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Purges every item from the recently used resources list.
     * @return the number of items that have been removed from the
     *   recently used resources list
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public int purgeItems() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_recent_manager_purge_items.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        }
    }
    
    /**
     * Removes a resource pointed by {@code uri} from the recently used resources
     * list handled by a recent manager.
     * @param uri the URI of the item you wish to remove
     * @return {@code true} if the item pointed by {@code uri} has been successfully
     *   removed by the recently used resources list, and {@code false} otherwise
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean removeItem(java.lang.String uri) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_recent_manager_remove_item.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_recent_manager_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a unique instance of {@code GtkRecentManager} that you can share
     * in your application without caring about memory management.
     * @return A unique {@code GtkRecentManager}. Do not ref or
     *   unref it.
     */
    public static org.gtk.gtk.RecentManager getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_recent_manager_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.RecentManager) Interop.register(RESULT, org.gtk.gtk.RecentManager.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Functional interface declaration of the {@code Changed} callback.
     */
    @FunctionalInterface
    public interface Changed {
    
        /**
         * Emitted when the current recently used resources manager changes
         * its contents.
         * <p>
         * This can happen either by calling {@link RecentManager#addItem}
         * or by another application.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceRecentManager) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Changed.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the current recently used resources manager changes
     * its contents.
     * <p>
     * This can happen either by calling {@link RecentManager#addItem}
     * or by another application.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<RecentManager.Changed> onChanged(RecentManager.Changed handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link RecentManager.Builder} object constructs a {@link RecentManager} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link RecentManager.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link RecentManager} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link RecentManager}.
         * @return A new instance of {@code RecentManager} with the properties 
         *         that were set in the Builder object.
         */
        public RecentManager build() {
            return (RecentManager) org.gtk.gobject.GObject.newWithProperties(
                RecentManager.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The full path to the file to be used to store and read the
         * recently used resources list
         * @param filename The value for the {@code filename} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFilename(java.lang.String filename) {
            names.add("filename");
            values.add(org.gtk.gobject.Value.create(filename));
            return this;
        }
        
        /**
         * The size of the recently used resources list.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_recent_manager_new = Interop.downcallHandle(
                "gtk_recent_manager_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_add_full = Interop.downcallHandle(
                "gtk_recent_manager_add_full",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_add_item = Interop.downcallHandle(
                "gtk_recent_manager_add_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_get_items = Interop.downcallHandle(
                "gtk_recent_manager_get_items",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_has_item = Interop.downcallHandle(
                "gtk_recent_manager_has_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_lookup_item = Interop.downcallHandle(
                "gtk_recent_manager_lookup_item",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_move_item = Interop.downcallHandle(
                "gtk_recent_manager_move_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_purge_items = Interop.downcallHandle(
                "gtk_recent_manager_purge_items",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_remove_item = Interop.downcallHandle(
                "gtk_recent_manager_remove_item",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_get_type = Interop.downcallHandle(
                "gtk_recent_manager_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gtk_recent_manager_get_default = Interop.downcallHandle(
                "gtk_recent_manager_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_recent_manager_get_type != null;
    }
}
