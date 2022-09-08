package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkBookmarkList` is a list model that wraps `GBookmarkFile`.
 * 
 * It presents a `GListModel` and fills it asynchronously with the
 * `GFileInfo`s returned from that function.
 * 
 * The `GFileInfo`s in the list have some attributes in the recent
 * namespace added: `recent::private` (boolean) and `recent:applications`
 * (stringv).
 */
public class BookmarkList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public BookmarkList(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BookmarkList */
    public static BookmarkList castFrom(org.gtk.gobject.Object gobject) {
        return new BookmarkList(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkBookmarkList` with the given @attributes.
     */
    public BookmarkList(java.lang.String filename, java.lang.String attributes) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_new(Interop.allocateNativeString(filename).HANDLE(), Interop.allocateNativeString(attributes).HANDLE()), true));
    }
    
    /**
     * Gets the attributes queried on the children.
     */
    public java.lang.String getAttributes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_get_attributes(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the filename of the bookmark file that
     * this list is loading.
     */
    public java.lang.String getFilename() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_get_filename(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the IO priority to use while loading file.
     */
    public int getIoPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_get_io_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if the files are currently being loaded.
     * 
     * Files will be added to @self from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     */
    public boolean isLoading() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_is_loading(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the @attributes to be enumerated and starts the enumeration.
     * 
     * If @attributes is %NULL, no attributes will be queried, but a list
     * of `GFileInfo`s will still be created.
     */
    public void setAttributes(java.lang.String attributes) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_set_attributes(HANDLE(), Interop.allocateNativeString(attributes).HANDLE());
    }
    
    /**
     * Sets the IO priority to use while loading files.
     * 
     * The default IO priority is %G_PRIORITY_DEFAULT.
     */
    public void setIoPriority(int ioPriority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_bookmark_list_set_io_priority(HANDLE(), ioPriority);
    }
    
}
