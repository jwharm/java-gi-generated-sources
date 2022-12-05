package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkBookmarkList} is a list model that wraps {@code GBookmarkFile}.
 * <p>
 * It presents a {@code GListModel} and fills it asynchronously with the
 * {@code GFileInfo}s returned from that function.
 * <p>
 * The {@code GFileInfo}s in the list have some attributes in the recent
 * namespace added: {@code recent::private} (boolean) and {@code recent:applications}
 * (stringv).
 */
public class BookmarkList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBookmarkList";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BookmarkList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BookmarkList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BookmarkList if its GType is a (or inherits from) "GtkBookmarkList".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BookmarkList} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBookmarkList", a ClassCastException will be thrown.
     */
    public static BookmarkList castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), BookmarkList.getType())) {
            return new BookmarkList(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBookmarkList");
        }
    }
    
    private static Addressable constructNew(@Nullable java.lang.String filename, @Nullable java.lang.String attributes) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bookmark_list_new.invokeExact(
                    (Addressable) (filename == null ? MemoryAddress.NULL : Interop.allocateNativeString(filename)),
                    (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeString(attributes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBookmarkList} with the given {@code attributes}.
     * @param filename The bookmark file to load
     * @param attributes The attributes to query
     */
    public BookmarkList(@Nullable java.lang.String filename, @Nullable java.lang.String attributes) {
        super(constructNew(filename, attributes), Ownership.FULL);
    }
    
    /**
     * Gets the attributes queried on the children.
     * @return The queried attributes
     */
    public @Nullable java.lang.String getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bookmark_list_get_attributes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the filename of the bookmark file that
     * this list is loading.
     * @return the filename of the .xbel file
     */
    public @NotNull java.lang.String getFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bookmark_list_get_filename.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the IO priority to use while loading file.
     * @return The IO priority.
     */
    public int getIoPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bookmark_list_get_io_priority.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the files are currently being loaded.
     * <p>
     * Files will be added to {@code self} from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     * @return {@code true} if {@code self} is loading
     */
    public boolean isLoading() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bookmark_list_is_loading.invokeExact(
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
            DowncallHandles.gtk_bookmark_list_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attributes == null ? MemoryAddress.NULL : Interop.allocateNativeString(attributes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the IO priority to use while loading files.
     * <p>
     * The default IO priority is {@code G_PRIORITY_DEFAULT}.
     * @param ioPriority IO priority to use
     */
    public void setIoPriority(int ioPriority) {
        try {
            DowncallHandles.gtk_bookmark_list_set_io_priority.invokeExact(
                    handle(),
                    ioPriority);
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
            RESULT = (long) DowncallHandles.gtk_bookmark_list_get_type.invokeExact();
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
         * A {@link BookmarkList.Build} object constructs a {@link BookmarkList} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BookmarkList} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BookmarkList} using {@link BookmarkList#castFrom}.
         * @return A new instance of {@code BookmarkList} with the properties 
         *         that were set in the Build object.
         */
        public BookmarkList construct() {
            return BookmarkList.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BookmarkList.getType(),
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
         * The bookmark file to load.
         * @param filename The value for the {@code filename} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFilename(java.lang.String filename) {
            names.add("filename");
            values.add(org.gtk.gobject.Value.create(filename));
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
        
        private static final MethodHandle gtk_bookmark_list_new = Interop.downcallHandle(
            "gtk_bookmark_list_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_get_attributes = Interop.downcallHandle(
            "gtk_bookmark_list_get_attributes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_get_filename = Interop.downcallHandle(
            "gtk_bookmark_list_get_filename",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_get_io_priority = Interop.downcallHandle(
            "gtk_bookmark_list_get_io_priority",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_is_loading = Interop.downcallHandle(
            "gtk_bookmark_list_is_loading",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_set_attributes = Interop.downcallHandle(
            "gtk_bookmark_list_set_attributes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_set_io_priority = Interop.downcallHandle(
            "gtk_bookmark_list_set_io_priority",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_bookmark_list_get_type = Interop.downcallHandle(
            "gtk_bookmark_list_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
