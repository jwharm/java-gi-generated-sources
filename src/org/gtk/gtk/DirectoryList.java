package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkDirectoryList` is a list model that wraps g_file_enumerate_children_async().
 * 
 * It presents a `GListModel` and fills it asynchronously with the `GFileInfo`s
 * returned from that function.
 * 
 * Enumeration will start automatically when a the
 * [property@Gtk.DirectoryList:file] property is set.
 * 
 * While the `GtkDirectoryList` is being filled, the
 * [property@Gtk.DirectoryList:loading] property will be set to %TRUE. You can
 * listen to that property if you want to show information like a `GtkSpinner`
 * or a "Loading..." text.
 * 
 * If loading fails at any point, the [property@Gtk.DirectoryList:error]
 * property will be set to give more indication about the failure.
 * 
 * The `GFileInfo`s returned from a `GtkDirectoryList` have the "standard::file"
 * attribute set to the `GFile` they refer to. This way you can get at the file
 * that is referred to in the same way you would via g_file_enumerator_get_child().
 * This means you do not need access to the `GtkDirectoryList`, but can access
 * the `GFile` directly from the `GFileInfo` when operating with a `GtkListView`
 * or similar.
 */
public class DirectoryList extends org.gtk.gobject.Object implements org.gtk.gio.ListModel {

    public DirectoryList(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to DirectoryList */
    public static DirectoryList castFrom(org.gtk.gobject.Object gobject) {
        return new DirectoryList(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkDirectoryList`.
     * 
     * The `GtkDirectoryList` is querying the given @file
     * with the given @attributes.
     */
    public DirectoryList(java.lang.String attributes, org.gtk.gio.File file) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_new(Interop.getAllocator().allocateUtf8String(attributes), file.HANDLE()), true));
    }
    
    /**
     * Gets the attributes queried on the children.
     */
    public java.lang.String getAttributes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_get_attributes(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the loading error, if any.
     * 
     * If an error occurs during the loading process, the loading process
     * will finish and this property allows querying the error that happened.
     * This error will persist until a file is loaded again.
     * 
     * An error being set does not mean that no files were loaded, and all
     * successfully queried files will remain in the list.
     */
    public org.gtk.glib.Error getError() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_get_error(HANDLE());
        return new org.gtk.glib.Error(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the file whose children are currently enumerated.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_get_file(HANDLE());
        return new org.gtk.gio.File.FileImpl(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the IO priority set via gtk_directory_list_set_io_priority().
     */
    public int getIoPriority() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_get_io_priority(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns whether the directory list is monitoring
     * the directory for changes.
     */
    public boolean getMonitored() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_get_monitored(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if the children enumeration is currently in
     * progress.
     * 
     * Files will be added to @self from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     */
    public boolean isLoading() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_is_loading(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets the @attributes to be enumerated and starts the enumeration.
     * 
     * If @attributes is %NULL, no attributes will be queried, but a list
     * of `GFileInfo`s will still be created.
     */
    public void setAttributes(java.lang.String attributes) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_set_attributes(HANDLE(), Interop.getAllocator().allocateUtf8String(attributes));
    }
    
    /**
     * Sets the @file to be enumerated and starts the enumeration.
     * 
     * If @file is %NULL, the result will be an empty list.
     */
    public void setFile(org.gtk.gio.File file) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_set_file(HANDLE(), file.HANDLE());
    }
    
    /**
     * Sets the IO priority to use while loading directories.
     * 
     * Setting the priority while @self is loading will reprioritize the
     * ongoing load as soon as possible.
     * 
     * The default IO priority is %G_PRIORITY_DEFAULT, which is higher than
     * the GTK redraw priority. If you are loading a lot of directories in
     * parallel, lowering it to something like %G_PRIORITY_DEFAULT_IDLE
     * may increase responsiveness.
     */
    public void setIoPriority(int ioPriority) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_set_io_priority(HANDLE(), ioPriority);
    }
    
    /**
     * Sets whether the directory list will monitor the directory
     * for changes.
     * 
     * If monitoring is enabled, the ::items-changed signal will
     * be emitted when the directory contents change.
     * 
     * 
     * When monitoring is turned on after the initial creation
     * of the directory list, the directory is reloaded to avoid
     * missing files that appeared between the initial loading
     * and when monitoring was turned on.
     */
    public void setMonitored(boolean monitored) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_directory_list_set_monitored(HANDLE(), monitored ? 1 : 0);
    }
    
}