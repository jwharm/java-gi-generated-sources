package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkBookmarkList</code> is a list model that wraps <code>GBookmarkFile</code>.
 * <p>
 * It presents a <code>GListModel</code> and fills it asynchronously with the<code>GFileInfo</code>s returned from that function.
 * <p>
 * The <code>GFileInfo</code>s in the list have some attributes in the recent
 * namespace added: <code>recent::private</code> (boolean) and <code>recent:applications</code>
 * (stringv).
 */
public class BookmarkList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public BookmarkList(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BookmarkList */
    public static BookmarkList castFrom(org.gtk.gobject.Object gobject) {
        return new BookmarkList(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String filename, java.lang.String attributes) {
        Reference RESULT = References.get(gtk_h.gtk_bookmark_list_new(Interop.allocateNativeString(filename).handle(), Interop.allocateNativeString(attributes).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkBookmarkList</code> with the given @attributes.
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
     * Returns <code>true</code> if the files are currently being loaded.
     * 
     * Files will be added to @self from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     */
    public boolean isLoading() {
        var RESULT = gtk_h.gtk_bookmark_list_is_loading(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the @attributes to be enumerated and starts the enumeration.
     * <p>
     * If @attributes is <code>null</code>  no attributes will be queried, but a list
     * of <code>GFileInfo</code>s will still be created.
     */
    public void setAttributes(java.lang.String attributes) {
        gtk_h.gtk_bookmark_list_set_attributes(handle(), Interop.allocateNativeString(attributes).handle());
    }
    
    /**
     * Sets the IO priority to use while loading files.
     * 
     * The default IO priority is <code>G_PRIORITY_DEFAULT</code>
     */
    public void setIoPriority(int ioPriority) {
        gtk_h.gtk_bookmark_list_set_io_priority(handle(), ioPriority);
    }
    
}
