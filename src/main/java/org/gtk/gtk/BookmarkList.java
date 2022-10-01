package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew(java.lang.String filename, java.lang.String attributes) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_bookmark_list_new(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(attributes).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBookmarkList} with the given {@code attributes}.
     */
    public BookmarkList(java.lang.String filename, java.lang.String attributes) {
        super(constructNew(filename, attributes));
    }
    
    /**
     * Gets the attributes queried on the children.
     */
    public java.lang.String getAttributes() {
        var RESULT = gtk_h.gtk_bookmark_list_get_attributes(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns the filename of the bookmark file that
     * this list is loading.
     */
    public java.lang.String getFilename() {
        var RESULT = gtk_h.gtk_bookmark_list_get_filename(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the IO priority to use while loading file.
     */
    public int getIoPriority() {
        var RESULT = gtk_h.gtk_bookmark_list_get_io_priority(handle());
        return RESULT;
    }
    
    /**
     * Returns {@code true} if the files are currently being loaded.
     * <p>
     * Files will be added to {@code self} from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     */
    public boolean isLoading() {
        var RESULT = gtk_h.gtk_bookmark_list_is_loading(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the {@code attributes} to be enumerated and starts the enumeration.
     * <p>
     * If {@code attributes} is {@code null}, no attributes will be queried, but a list
     * of {@code GFileInfo}s will still be created.
     */
    public void setAttributes(java.lang.String attributes) {
        gtk_h.gtk_bookmark_list_set_attributes(handle(), Interop.allocateNativeString(attributes).handle());
    }
    
    /**
     * Sets the IO priority to use while loading files.
     * <p>
     * The default IO priority is {@code G_PRIORITY_DEFAULT}.
     */
    public void setIoPriority(int ioPriority) {
        gtk_h.gtk_bookmark_list_set_io_priority(handle(), ioPriority);
    }
    
}
