package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public BookmarkList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BookmarkList */
    public static BookmarkList castFrom(org.gtk.gobject.Object gobject) {
        return new BookmarkList(gobject.refcounted());
    }
    
    static final MethodHandle gtk_bookmark_list_new = Interop.downcallHandle(
        "gtk_bookmark_list_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(java.lang.String filename, java.lang.String attributes) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_bookmark_list_new.invokeExact(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(attributes).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkBookmarkList} with the given {@code attributes}.
     */
    public BookmarkList(java.lang.String filename, java.lang.String attributes) {
        super(constructNew(filename, attributes));
    }
    
    static final MethodHandle gtk_bookmark_list_get_attributes = Interop.downcallHandle(
        "gtk_bookmark_list_get_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attributes queried on the children.
     */
    public java.lang.String getAttributes() {
        try {
            var RESULT = (MemoryAddress) gtk_bookmark_list_get_attributes.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bookmark_list_get_filename = Interop.downcallHandle(
        "gtk_bookmark_list_get_filename",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the filename of the bookmark file that
     * this list is loading.
     */
    public java.lang.String getFilename() {
        try {
            var RESULT = (MemoryAddress) gtk_bookmark_list_get_filename.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bookmark_list_get_io_priority = Interop.downcallHandle(
        "gtk_bookmark_list_get_io_priority",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the IO priority to use while loading file.
     */
    public int getIoPriority() {
        try {
            var RESULT = (int) gtk_bookmark_list_get_io_priority.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bookmark_list_is_loading = Interop.downcallHandle(
        "gtk_bookmark_list_is_loading",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the files are currently being loaded.
     * <p>
     * Files will be added to {@code self} from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     */
    public boolean isLoading() {
        try {
            var RESULT = (int) gtk_bookmark_list_is_loading.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bookmark_list_set_attributes = Interop.downcallHandle(
        "gtk_bookmark_list_set_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the {@code attributes} to be enumerated and starts the enumeration.
     * <p>
     * If {@code attributes} is {@code null}, no attributes will be queried, but a list
     * of {@code GFileInfo}s will still be created.
     */
    public void setAttributes(java.lang.String attributes) {
        try {
            gtk_bookmark_list_set_attributes.invokeExact(handle(), Interop.allocateNativeString(attributes).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_bookmark_list_set_io_priority = Interop.downcallHandle(
        "gtk_bookmark_list_set_io_priority",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the IO priority to use while loading files.
     * <p>
     * The default IO priority is {@code G_PRIORITY_DEFAULT}.
     */
    public void setIoPriority(int ioPriority) {
        try {
            gtk_bookmark_list_set_io_priority.invokeExact(handle(), ioPriority);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
