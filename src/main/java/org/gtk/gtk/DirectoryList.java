package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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

    public DirectoryList(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DirectoryList */
    public static DirectoryList castFrom(org.gtk.gobject.Object gobject) {
        return new DirectoryList(gobject.refcounted());
    }
    
    private static Refcounted constructNew(java.lang.String attributes, org.gtk.gio.File file) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_directory_list_new(Interop.allocateNativeString(attributes).handle(), file.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkDirectoryList}.
     * <p>
     * The {@code GtkDirectoryList} is querying the given {@code file}
     * with the given {@code attributes}.
     */
    public DirectoryList(java.lang.String attributes, org.gtk.gio.File file) {
        super(constructNew(attributes, file));
    }
    
    /**
     * Gets the attributes queried on the children.
     */
    public java.lang.String getAttributes() {
        var RESULT = gtk_h.gtk_directory_list_get_attributes(handle());
        return RESULT.getUtf8String(0);
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
     */
    public org.gtk.glib.Error getError() {
        var RESULT = gtk_h.gtk_directory_list_get_error(handle());
        return new org.gtk.glib.Error(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the file whose children are currently enumerated.
     */
    public org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_directory_list_get_file(handle());
        return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the IO priority set via gtk_directory_list_set_io_priority().
     */
    public int getIoPriority() {
        var RESULT = gtk_h.gtk_directory_list_get_io_priority(handle());
        return RESULT;
    }
    
    /**
     * Returns whether the directory list is monitoring
     * the directory for changes.
     */
    public boolean getMonitored() {
        var RESULT = gtk_h.gtk_directory_list_get_monitored(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if the children enumeration is currently in
     * progress.
     * <p>
     * Files will be added to {@code self} from time to time while loading is
     * going on. The order in which are added is undefined and may change
     * in between runs.
     */
    public boolean isLoading() {
        var RESULT = gtk_h.gtk_directory_list_is_loading(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets the {@code attributes} to be enumerated and starts the enumeration.
     * <p>
     * If {@code attributes} is {@code null}, no attributes will be queried, but a list
     * of {@code GFileInfo}s will still be created.
     */
    public void setAttributes(java.lang.String attributes) {
        gtk_h.gtk_directory_list_set_attributes(handle(), Interop.allocateNativeString(attributes).handle());
    }
    
    /**
     * Sets the {@code file} to be enumerated and starts the enumeration.
     * <p>
     * If {@code file} is {@code null}, the result will be an empty list.
     */
    public void setFile(org.gtk.gio.File file) {
        gtk_h.gtk_directory_list_set_file(handle(), file.handle());
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
     */
    public void setIoPriority(int ioPriority) {
        gtk_h.gtk_directory_list_set_io_priority(handle(), ioPriority);
    }
    
    /**
     * Sets whether the directory list will monitor the directory
     * for changes.
     * <p>
     * If monitoring is enabled, the ::items-changed signal will
     * be emitted when the directory contents change.
     * <p>
     * 
     * When monitoring is turned on after the initial creation
     * of the directory list, the directory is reloaded to avoid
     * missing files that appeared between the initial loading
     * and when monitoring was turned on.
     */
    public void setMonitored(boolean monitored) {
        gtk_h.gtk_directory_list_set_monitored(handle(), monitored ? 1 : 0);
    }
    
}
