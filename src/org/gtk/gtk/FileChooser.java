package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFileChooser</code> is an interface that can be implemented by file
 * selection widgets.
 * <p>
 * In GTK, the main objects that implement this interface are
 * {@link org.gtk.gtk.FileChooserWidget} and {@link org.gtk.gtk.FileChooserDialog}.
 * <p>
 * You do not need to write an object that implements the <code>GtkFileChooser</code>
 * interface unless you are trying to adapt an existing file selector to
 * expose a standard programming interface.
 * <p><code>GtkFileChooser</code> allows for shortcuts to various places in the filesystem.
 * In the default implementation these are displayed in the left pane. It
 * may be a bit confusing at first that these shortcuts come from various
 * sources and in various flavours, so lets explain the terminology here:
 * <p>
 * <li>Bookmarks: are created by the user, by dragging folders from the
 *   right pane to the left pane, or by using the &#8220;Add&#8221;. Bookmarks
 *   can be renamed and deleted by the user.
 * <p>
 * <li>Shortcuts: can be provided by the application. For example, a Paint
 *   program may want to add a shortcut for a Clipart folder. Shortcuts
 *   cannot be modified by the user.
 * <p>
 * <li>Volumes: are provided by the underlying filesystem abstraction. They are
 *   the &#8220;roots&#8221; of the filesystem.
 * <p>
 * <h1>ile Names and Encodings</h1>
 * <p>
 * When the user is finished selecting files in a <code>GtkFileChooser</code>, your
 * program can get the selected filenames as <code>GFile</code>s.
 * 
 * # Adding options
 * 
 * You can add extra widgets to a file chooser to provide options
 * that are not present in the default design, by using
 * {@link org.gtk.gtk.FileChooser#addChoice}. Each choice has an identifier and
 * a user visible label; additionally, each choice can have multiple
 * options. If a choice has no option, it will be rendered as a
 * check button with the given label; if a choice has options, it will
 * be rendered as a combo box.
 */
public interface FileChooser extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Adds a &#39;choice&#39; to the file chooser.
     * 
     * This is typically implemented as a combobox or, for boolean choices,
     * as a checkbutton. You can select a value using
     * {@link org.gtk.gtk.FileChooser#setChoice} before the dialog is shown,
     * and you can obtain the user-selected value in the
     * {@link [signal@Gtk.Dialog::response] (ref=signal)} signal handler using
     * {@link org.gtk.gtk.FileChooser#getChoice}.
     */
    public default void addChoice(java.lang.String id, java.lang.String label, java.lang.String[] options, java.lang.String[] optionLabels) {
        gtk_h.gtk_file_chooser_add_choice(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(label).handle(), Interop.allocateNativeArray(options).handle(), Interop.allocateNativeArray(optionLabels).handle());
    }
    
    /**
     * Adds @filter to the list of filters that the user can select between.
     * 
     * When a filter is selected, only files that are passed by that
     * filter are displayed.
     * 
     * Note that the @chooser takes ownership of the filter if it is floating,
     * so you have to ref and sink it if you want to keep a reference.
     */
    public default void addFilter(FileFilter filter) {
        gtk_h.gtk_file_chooser_add_filter(handle(), filter.handle());
    }
    
    /**
     * Adds a folder to be displayed with the shortcut folders
     * in a file chooser.
     */
    public default boolean addShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_file_chooser_add_shortcut_folder(handle(), folder.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the type of operation that the file chooser is performing.
     */
    public default FileChooserAction getAction() {
        var RESULT = gtk_h.gtk_file_chooser_get_action(handle());
        return FileChooserAction.fromValue(RESULT);
    }
    
    /**
     * Gets the currently selected option in the &#39;choice&#39; with the given ID.
     */
    public default java.lang.String getChoice(java.lang.String id) {
        var RESULT = gtk_h.gtk_file_chooser_get_choice(handle(), Interop.allocateNativeString(id).handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether file chooser will offer to create new folders.
     */
    public default boolean getCreateFolders() {
        var RESULT = gtk_h.gtk_file_chooser_get_create_folders(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current folder of @chooser as <code>GFile</code>.
     */
    public default org.gtk.gio.File getCurrentFolder() {
        var RESULT = gtk_h.gtk_file_chooser_get_current_folder(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the current name in the file selector, as entered by the user.
     * 
     * This is meant to be used in save dialogs, to get the currently typed
     * filename when the file itself does not exist yet.
     */
    public default java.lang.String getCurrentName() {
        var RESULT = gtk_h.gtk_file_chooser_get_current_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the <code>GFile</code> for the currently selected file in
     * the file selector.
     * 
     * If multiple files are selected, one of the files will be
     * returned at random.
     * 
     * If the file chooser is in folder mode, this function returns
     * the selected folder.
     */
    public default org.gtk.gio.File getFile() {
        var RESULT = gtk_h.gtk_file_chooser_get_file(handle());
        return new org.gtk.gio.File.FileImpl(References.get(RESULT, true));
    }
    
    /**
     * Lists all the selected files and subfolders in the current folder
     * of @chooser as <code>GFile</code>.
     */
    public default org.gtk.gio.ListModel getFiles() {
        var RESULT = gtk_h.gtk_file_chooser_get_files(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the current filter.
     */
    public default FileFilter getFilter() {
        var RESULT = gtk_h.gtk_file_chooser_get_filter(handle());
        return new FileFilter(References.get(RESULT, false));
    }
    
    /**
     * Gets the current set of user-selectable filters, as a list model.
     * 
     * See {@link org.gtk.gtk.FileChooser#addFilter} and
     * {@link org.gtk.gtk.FileChooser#removeFilter} for changing individual filters.
     * 
     * You should not modify the returned list model. Future changes to
     * @chooser may or may not affect the returned model.
     */
    public default org.gtk.gio.ListModel getFilters() {
        var RESULT = gtk_h.gtk_file_chooser_get_filters(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets whether multiple files can be selected in the file
     * chooser.
     */
    public default boolean getSelectMultiple() {
        var RESULT = gtk_h.gtk_file_chooser_get_select_multiple(handle());
        return (RESULT != 0);
    }
    
    /**
     * Queries the list of shortcut folders in the file chooser.
     * 
     * You should not modify the returned list model. Future changes to
     * @chooser may or may not affect the returned model.
     */
    public default org.gtk.gio.ListModel getShortcutFolders() {
        var RESULT = gtk_h.gtk_file_chooser_get_shortcut_folders(handle());
        return new org.gtk.gio.ListModel.ListModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Removes a &#39;choice&#39; that has been added with gtk_file_chooser_add_choice().
     */
    public default void removeChoice(java.lang.String id) {
        gtk_h.gtk_file_chooser_remove_choice(handle(), Interop.allocateNativeString(id).handle());
    }
    
    /**
     * Removes @filter from the list of filters that the user can select between.
     */
    public default void removeFilter(FileFilter filter) {
        gtk_h.gtk_file_chooser_remove_filter(handle(), filter.handle());
    }
    
    /**
     * Removes a folder from the shortcut folders in a file chooser.
     */
    public default boolean removeShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_file_chooser_remove_shortcut_folder(handle(), folder.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the type of operation that the chooser is performing.
     * 
     * The user interface is adapted to suit the selected action.
     * 
     * For example, an option to create a new folder might be shown
     * if the action is {@link org.gtk.gtk.FileChooserAction#SAVE} but not if the
     * action is but not if the
     * action is %GTK_FILE_CHOOSER_ACTION_OPEN.
     */
    public default void setAction(FileChooserAction action) {
        gtk_h.gtk_file_chooser_set_action(handle(), action.getValue());
    }
    
    /**
     * Selects an option in a &#39;choice&#39; that has been added with
     * gtk_file_chooser_add_choice().
     * 
     * For a boolean choice, the possible options are &#34;true&#34; and &#34;false&#34;.
     */
    public default void setChoice(java.lang.String id, java.lang.String option) {
        gtk_h.gtk_file_chooser_set_choice(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(option).handle());
    }
    
    /**
     * Sets whether file chooser will offer to create new folders.
     * 
     * This is only relevant if the action is not set to be
     * 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Sets whether file chooser will offer to create new folders.
     * 
     * This is only relevant if the action is not set to be
     * %GTK_FILE_CHOOSER_ACTION_OPEN.
     */
    public default void setCreateFolders(boolean createFolders) {
        gtk_h.gtk_file_chooser_set_create_folders(handle(), createFolders ? 1 : 0);
    }
    
    /**
     * Sets the current folder for @chooser from a <code>GFile</code>.
     */
    public default boolean setCurrentFolder(org.gtk.gio.File file) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_file_chooser_set_current_folder(handle(), file.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the current name in the file selector, as if entered
     * by the user.
     * 
     * Note that the name passed in here is a UTF-8 string rather
     * than a filename. This function is meant for such uses as a
     * suggested name in a &#8220;Save As...&#8221; dialog.  You can pass
     * &#8220;Untitled.doc&#8221; or a similarly suitable suggestion for the @name.
     * 
     * If you want to preselect a particular existing file, you should
     * use {@link org.gtk.gtk.FileChooser#setFile} instead.
     * 
     * Please see the documentation for those functions for an example
     * of using {@link org.gtk.gtk.FileChooser#setCurrentName} as well.
     */
    public default void setCurrentName(java.lang.String name) {
        gtk_h.gtk_file_chooser_set_current_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets @file as the current filename for the file chooser.
     * <p>
     * This includes changing to the file&#8217;s parent folder and actually selecting
     * the file in list. If the @chooser is in {@link org.gtk.gtk.FileChooserAction#SAVE} mode,
     * the file&#8217;s base name will also appear in the dialog&#8217;s file name entry.
     * <p>
     * If the file name isn&#8217;t in the current folder of @chooser, then the current
     * folder of @chooser will be changed to the folder containing @file.
     * <p>
     * Note that the file must exist, or nothing will be done except
     * for the directory change.
     * <p>
     * If you are implementing a save dialog, you should use this function if
     * you already have a file name to which the user may save; for example,
     * when the user opens an existing file and then does &#8220;Save As&#8230;&#8221;. If you
     * don&#8217;t have a file name already &#8212; for example, if the user just created
     * a new file and is saving it for the first time, do not call this function.
     * <p>
     * Instead, use something similar to this:
     * <p><pre>c
     * static void
     * prepare_file_chooser (GtkFileChooser *chooser,
     *                       GFile          *existing_file)
     * {
     *   gboolean document_is_new = (existing_file == NULL);
     * 
     *   if (document_is_new)
     *     {
     *       GFile *default_file_for_saving = g_file_new_for_path (&#34;./out.txt&#34;);
     *       // the user just created a new document
     *       gtk_file_chooser_set_current_folder (chooser, default_file_for_saving, NULL);
     *       gtk_file_chooser_set_current_name (chooser, &#34;Untitled document&#34;);
     *       g_object_unref (default_file_for_saving);
     *     }
     *   else
     *     {
     *       // the user edited an existing document
     *       gtk_file_chooser_set_file (chooser, existing_file, NULL);
     *     }
     * }
     * </pre>
     */
    public default boolean setFile(org.gtk.gio.File file) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gtk_file_chooser_set_file(handle(), file.handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the current filter.
     * 
     * Only the files that pass the filter will be displayed.
     * If the user-selectable list of filters is non-empty, then
     * the filter should be one of the filters in that list.
     * 
     * Setting the current filter when the list of filters is
     * empty is useful if you want to restrict the displayed
     * set of files without letting the user change it.
     */
    public default void setFilter(FileFilter filter) {
        gtk_h.gtk_file_chooser_set_filter(handle(), filter.handle());
    }
    
    /**
     * Sets whether multiple files can be selected in the file chooser.
     * 
     * This is only relevant if the action is set to be
     * {@link org.gtk.gtk.FileChooserAction#OPEN} or
     * or
     * %GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
     */
    public default void setSelectMultiple(boolean selectMultiple) {
        gtk_h.gtk_file_chooser_set_select_multiple(handle(), selectMultiple ? 1 : 0);
    }
    
    class FileChooserImpl extends org.gtk.gobject.Object implements FileChooser {
        public FileChooserImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
