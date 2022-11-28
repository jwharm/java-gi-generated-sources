package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDirectoryList} is a list model that wraps g_file_enumerate_children_async().
 * <p>
 * It presents a {@code GListModel} and fills it asynchronously with the {@code GFileInfo}s
 * returned from that function.
 * <p>
 * Enumeration will start automatically when a the
 * {@code Gtk.DirectoryList:file} property is set.
 * <p>
 * While the {@code GtkDirectoryList} is being filled, the
 * {@code Gtk.DirectoryList:loading} property will be set to {@code true}. You can
 * listen to that property if you want to show information like a {@code GtkSpinner}
 * or a "Loading..." text.
 * <p>
 * If loading fails at any point, the {@code Gtk.DirectoryList:error}
 * property will be set to give more indication about the failure.
 * <p>
 * The {@code GFileInfo}s returned from a {@code GtkDirectoryList} have the "standard::file"
 * attribute set to the {@code GFile} they refer to. This way you can get at the file
 * that is referred to in the same way you would via g_file_enumerator_get_child().
 * This means you do not need access to the {@code GtkDirectoryList}, but can access
 * the {@code GFile} directly from the {@code GFileInfo} when operating with a {@code GtkListView}
 * or similar.
 */
public class DirectoryList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDirectoryList";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a DirectoryList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DirectoryList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to DirectoryList if its GType is a (or inherits from) "GtkDirectoryList".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code DirectoryList} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDirectoryList", a ClassCastException will be thrown.
     */
    public static DirectoryList castFrom(org.gtk.gobject.Object gobject) {
            return new DirectoryList(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable java.lang.String attributes, @Nullable org.gtk.gio.File file) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_directory_list_new.invokeExact(
                    (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeString(attributes)),
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDirectoryList}.
     * <p>
     * The {@code GtkDirectoryList} is querying the given {@code file}
     * with the given {@code attributes}.
     * @param attributes The attributes to query with
     * @param file The file to query
     */
    public DirectoryList(@Nullable java.lang.String attributes, @Nullable org.gtk.gio.File file) {
        super(constructNew(attributes, file), Ownership.FULL);
    }
    
    /**
     * Gets the attributes queried on the children.
     * @return The queried attributes
     */
    public @Nullable java.lang.String getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_directory_list_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the loading error, if any.
     * <p>
     * If an error occurs during the loading process, the loading process
     * will finish and this property allows querying the error that happened.
     * This error will persist until a file is loaded again.
     * <p>
     * An error being set does not mean that no files were loaded, and all
     * successfully queried files will remain in the list.
     * @return The loading error or {@code null} if
     *   loading finished successfully
     */
    public @Nullable org.gtk.glib.Error getError() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_directory_list_get_error.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Error(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the file whose children are currently enumerated.
     * @return The file whose children are enumerated
     */
    public @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_directory_list_get_file.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.File.FileImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the IO priority set via gtk_directory_list_set_io_priority().
     * @return The IO priority.
     */
    public int getIoPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_directory_list_get_io_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether the directory list is monitoring
     * the directory for changes.
     * @return {@code true} if the directory is monitored
     */
    public boolean getMonitored() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_directory_list_get_monitored.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the children enumeration is currently in
     * progress.
     * <p>
     * Files will be added to {@code self} from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     * @return {@code true} if {@code self} is loading
     */
    public boolean isLoading() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_directory_list_is_loading.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the {@code attributes} to be enumerated and starts the enumeration.
     * <p>
     * If {@code attributes} is {@code null}, no attributes will be queried, but a list
     * of {@code GFileInfo}s will still be created.
     * @param attributes the attributes to enumerate
     */
    public void setAttributes(@Nullable java.lang.String attributes) {
        try {
            DowncallHandles.gtk_directory_list_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeString(attributes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code file} to be enumerated and starts the enumeration.
     * <p>
     * If {@code file} is {@code null}, the result will be an empty list.
     * @param file the {@code GFile} to be enumerated
     */
    public void setFile(@Nullable org.gtk.gio.File file) {
        try {
            DowncallHandles.gtk_directory_list_set_file.invokeExact(
                    handle(),
                    (Addressable) (file == null ? MemoryAddress.NULL : file.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the IO priority to use while loading directories.
     * <p>
     * Setting the priority while {@code self} is loading will reprioritize the
     * ongoing load as soon as possible.
     * <p>
     * The default IO priority is {@code G_PRIORITY_DEFAULT}, which is higher than
     * the GTK redraw priority. If you are loading a lot of directories in
     * parallel, lowering it to something like {@code G_PRIORITY_DEFAULT_IDLE}
     * may increase responsiveness.
     * @param ioPriority IO priority to use
     */
    public void setIoPriority(int ioPriority) {
        try {
            DowncallHandles.gtk_directory_list_set_io_priority.invokeExact(
                    handle(),
                    ioPriority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the directory list will monitor the directory
     * for changes.
     * <p>
     * If monitoring is enabled, the ::items-changed signal will
     * be emitted when the directory contents change.
     * <p>
     * When monitoring is turned on after the initial creation
     * of the directory list, the directory is reloaded to avoid
     * missing files that appeared between the initial loading
     * and when monitoring was turned on.
     * @param monitored {@code true} to monitor the directory for changes
     */
    public void setMonitored(boolean monitored) {
        try {
            DowncallHandles.gtk_directory_list_set_monitored.invokeExact(
                    handle(),
                    monitored ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_directory_list_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link DirectoryList.Build} object constructs a {@link DirectoryList} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link DirectoryList} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link DirectoryList} using {@link DirectoryList#castFrom}.
         * @return A new instance of {@code DirectoryList} with the properties 
         *         that were set in the Build object.
         */
        public DirectoryList construct() {
            return DirectoryList.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    DirectoryList.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The attributes to query.
         * @param attributes The value for the {@code attributes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAttributes(java.lang.String attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        /**
         * Error encountered while loading files.
         * @param error The value for the {@code error} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setError(org.gtk.glib.Error error) {
            names.add("error");
            values.add(org.gtk.gobject.Value.create(error));
            return this;
        }
        
        /**
         * File to query.
         * @param file The value for the {@code file} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFile(org.gtk.gio.File file) {
            names.add("file");
            values.add(org.gtk.gobject.Value.create(file));
            return this;
        }
        
        /**
         * Priority used when loading.
         * @param ioPriority The value for the {@code io-priority} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIoPriority(int ioPriority) {
            names.add("io-priority");
            values.add(org.gtk.gobject.Value.create(ioPriority));
            return this;
        }
        
        /**
         * The type of items. See {@link org.gtk.gio.ListModel#getItemType}.
         * @param itemType The value for the {@code item-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setItemType(org.gtk.glib.Type itemType) {
            names.add("item-type");
            values.add(org.gtk.gobject.Value.create(itemType));
            return this;
        }
        
        /**
         * {@code true} if files are being loaded.
         * @param loading The value for the {@code loading} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLoading(boolean loading) {
            names.add("loading");
            values.add(org.gtk.gobject.Value.create(loading));
            return this;
        }
        
        /**
         * {@code true} if the directory is monitored for changed.
         * @param monitored The value for the {@code monitored} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMonitored(boolean monitored) {
            names.add("monitored");
            values.add(org.gtk.gobject.Value.create(monitored));
            return this;
        }
        
        /**
         * The number of items. See {@link org.gtk.gio.ListModel#getNItems}.
         * @param nItems The value for the {@code n-items} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNItems(int nItems) {
            names.add("n-items");
            values.add(org.gtk.gobject.Value.create(nItems));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_directory_list_new = Interop.downcallHandle(
            "gtk_directory_list_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_get_attributes = Interop.downcallHandle(
            "gtk_directory_list_get_attributes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_get_error = Interop.downcallHandle(
            "gtk_directory_list_get_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_get_file = Interop.downcallHandle(
            "gtk_directory_list_get_file",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_get_io_priority = Interop.downcallHandle(
            "gtk_directory_list_get_io_priority",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_get_monitored = Interop.downcallHandle(
            "gtk_directory_list_get_monitored",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_is_loading = Interop.downcallHandle(
            "gtk_directory_list_is_loading",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_set_attributes = Interop.downcallHandle(
            "gtk_directory_list_set_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_set_file = Interop.downcallHandle(
            "gtk_directory_list_set_file",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_directory_list_set_io_priority = Interop.downcallHandle(
            "gtk_directory_list_set_io_priority",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_directory_list_set_monitored = Interop.downcallHandle(
            "gtk_directory_list_set_monitored",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_directory_list_get_type = Interop.downcallHandle(
            "gtk_directory_list_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
