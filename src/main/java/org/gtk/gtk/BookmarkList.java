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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public BookmarkList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BookmarkList */
    public static BookmarkList castFrom(org.gtk.gobject.Object gobject) {
        return new BookmarkList(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String filename, @Nullable java.lang.String attributes) {
        java.util.Objects.requireNonNullElse(filename, MemoryAddress.NULL);
        java.util.Objects.requireNonNullElse(attributes, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_bookmark_list_new.invokeExact(Interop.allocateNativeString(filename), Interop.allocateNativeString(attributes)), true);
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
        super(constructNew(filename, attributes));
    }
    
    /**
     * Gets the attributes queried on the children.
     * @return The queried attributes
     */
    public @Nullable java.lang.String getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bookmark_list_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the filename of the bookmark file that
     * this list is loading.
     * @return the filename of the .xbel file
     */
    public @NotNull java.lang.String getFilename() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_bookmark_list_get_filename.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the IO priority to use while loading file.
     * @return The IO priority.
     */
    public int getIoPriority() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_bookmark_list_get_io_priority.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_bookmark_list_is_loading.invokeExact(handle());
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
        java.util.Objects.requireNonNullElse(attributes, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_bookmark_list_set_attributes.invokeExact(handle(), Interop.allocateNativeString(attributes));
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
            DowncallHandles.gtk_bookmark_list_set_io_priority.invokeExact(handle(), ioPriority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_bookmark_list_new = Interop.downcallHandle(
            "gtk_bookmark_list_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bookmark_list_get_attributes = Interop.downcallHandle(
            "gtk_bookmark_list_get_attributes",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bookmark_list_get_filename = Interop.downcallHandle(
            "gtk_bookmark_list_get_filename",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bookmark_list_get_io_priority = Interop.downcallHandle(
            "gtk_bookmark_list_get_io_priority",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bookmark_list_is_loading = Interop.downcallHandle(
            "gtk_bookmark_list_is_loading",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bookmark_list_set_attributes = Interop.downcallHandle(
            "gtk_bookmark_list_set_attributes",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_bookmark_list_set_io_priority = Interop.downcallHandle(
            "gtk_bookmark_list_set_io_priority",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
