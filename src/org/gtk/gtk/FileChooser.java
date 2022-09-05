package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkFileChooser` is an interface that can be implemented by file
 * selection widgets.
 * 
 * In GTK, the main objects that implement this interface are
 * [class@Gtk.FileChooserWidget] and [class@Gtk.FileChooserDialog].
 * 
 * You do not need to write an object that implements the `GtkFileChooser`
 * interface unless you are trying to adapt an existing file selector to
 * expose a standard programming interface.
 * 
 * `GtkFileChooser` allows for shortcuts to various places in the filesystem.
 * In the default implementation these are displayed in the left pane. It
 * may be a bit confusing at first that these shortcuts come from various
 * sources and in various flavours, so lets explain the terminology here:
 * 
 * - Bookmarks: are created by the user, by dragging folders from the
 *   right pane to the left pane, or by using the “Add”. Bookmarks
 *   can be renamed and deleted by the user.
 * 
 * - Shortcuts: can be provided by the application. For example, a Paint
 *   program may want to add a shortcut for a Clipart folder. Shortcuts
 *   cannot be modified by the user.
 * 
 * - Volumes: are provided by the underlying filesystem abstraction. They are
 *   the “roots” of the filesystem.
 * 
 * # File Names and Encodings
 * 
 * When the user is finished selecting files in a `GtkFileChooser`, your
 * program can get the selected filenames as `GFile`s.
 * 
 * # Adding options
 * 
 * You can add extra widgets to a file chooser to provide options
 * that are not present in the default design, by using
 * [method@Gtk.FileChooser.add_choice]. Each choice has an identifier and
 * a user visible label; additionally, each choice can have multiple
 * options. If a choice has no option, it will be rendered as a
 * check button with the given label; if a choice has options, it will
 * be rendered as a combo box.
 */
public interface FileChooser extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Adds a 'choice' to the file chooser.
     * 
     * This is typically implemented as a combobox or, for boolean choices,
     * as a checkbutton. You can select a value using
     * [method@Gtk.FileChooser.set_choice] before the dialog is shown,
     * and you can obtain the user-selected value in the
     * [signal@Gtk.Dialog::response] signal handler using
     * [method@Gtk.FileChooser.get_choice].
     */
    public default void addChoice(java.lang.String id, java.lang.String label, java.lang.String[] options, java.lang.String[] optionLabels) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_add_choice(HANDLE(), Interop.allocateNativeString(id).HANDLE(), Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeArray(options), Interop.allocateNativeArray(optionLabels));
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_add_filter(HANDLE(), filter.HANDLE());
    }
    
    /**
     * Adds a folder to be displayed with the shortcut folders
     * in a file chooser.
     */
    public default boolean addShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_add_shortcut_folder(HANDLE(), folder.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Gets the type of operation that the file chooser is performing.
     */
    public default FileChooserAction getAction() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_action(HANDLE());
        return FileChooserAction.fromValue(RESULT);
    }
    
    /**
     * Gets the currently selected option in the 'choice' with the given ID.
     */
    public default java.lang.String getChoice(java.lang.String id) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_choice(HANDLE(), Interop.allocateNativeString(id).HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether file chooser will offer to create new folders.
     */
    public default boolean getCreateFolders() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_create_folders(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the current folder of @chooser as `GFile`.
     */
    public default org.gtk.gio.File getCurrentFolder() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_current_folder(HANDLE());
        return new org.gtk.gio.File.FileImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the current name in the file selector, as entered by the user.
     * 
     * This is meant to be used in save dialogs, to get the currently typed
     * filename when the file itself does not exist yet.
     */
    public default java.lang.String getCurrentName() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_current_name(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the `GFile` for the currently selected file in
     * the file selector.
     * 
     * If multiple files are selected, one of the files will be
     * returned at random.
     * 
     * If the file chooser is in folder mode, this function returns
     * the selected folder.
     */
    public default org.gtk.gio.File getFile() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_file(HANDLE());
        return new org.gtk.gio.File.FileImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Lists all the selected files and subfolders in the current folder
     * of @chooser as `GFile`.
     */
    public default org.gtk.gio.ListModel getFiles() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_files(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets the current filter.
     */
    public default FileFilter getFilter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_filter(HANDLE());
        return new FileFilter(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the current set of user-selectable filters, as a list model.
     * 
     * See [method@Gtk.FileChooser.add_filter] and
     * [method@Gtk.FileChooser.remove_filter] for changing individual filters.
     * 
     * You should not modify the returned list model. Future changes to
     * @chooser may or may not affect the returned model.
     */
    public default org.gtk.gio.ListModel getFilters() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_filters(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Gets whether multiple files can be selected in the file
     * chooser.
     */
    public default boolean getSelectMultiple() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_select_multiple(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Queries the list of shortcut folders in the file chooser.
     * 
     * You should not modify the returned list model. Future changes to
     * @chooser may or may not affect the returned model.
     */
    public default org.gtk.gio.ListModel getShortcutFolders() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_get_shortcut_folders(HANDLE());
        return new org.gtk.gio.ListModel.ListModelImpl(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
     */
    public default void removeChoice(java.lang.String id) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_remove_choice(HANDLE(), Interop.allocateNativeString(id).HANDLE());
    }
    
    /**
     * Removes @filter from the list of filters that the user can select between.
     */
    public default void removeFilter(FileFilter filter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_remove_filter(HANDLE(), filter.HANDLE());
    }
    
    /**
     * Removes a folder from the shortcut folders in a file chooser.
     */
    public default boolean removeShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_remove_shortcut_folder(HANDLE(), folder.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the type of operation that the chooser is performing.
     * 
     * The user interface is adapted to suit the selected action.
     * 
     * For example, an option to create a new folder might be shown
     * if the action is %GTK_FILE_CHOOSER_ACTION_SAVE but not if the
     * action is %GTK_FILE_CHOOSER_ACTION_OPEN.
     */
    public default void setAction(FileChooserAction action) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_action(HANDLE(), action.getValue());
    }
    
    /**
     * Selects an option in a 'choice' that has been added with
     * gtk_file_chooser_add_choice().
     * 
     * For a boolean choice, the possible options are "true" and "false".
     */
    public default void setChoice(java.lang.String id, java.lang.String option) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_choice(HANDLE(), Interop.allocateNativeString(id).HANDLE(), Interop.allocateNativeString(option).HANDLE());
    }
    
    /**
     * Sets whether file chooser will offer to create new folders.
     * 
     * This is only relevant if the action is not set to be
     * %GTK_FILE_CHOOSER_ACTION_OPEN.
     */
    public default void setCreateFolders(boolean createFolders) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_create_folders(HANDLE(), createFolders ? 1 : 0);
    }
    
    /**
     * Sets the current folder for @chooser from a `GFile`.
     */
    public default boolean setCurrentFolder(org.gtk.gio.File file) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_current_folder(HANDLE(), file.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the current name in the file selector, as if entered
     * by the user.
     * 
     * Note that the name passed in here is a UTF-8 string rather
     * than a filename. This function is meant for such uses as a
     * suggested name in a “Save As...” dialog.  You can pass
     * “Untitled.doc” or a similarly suitable suggestion for the @name.
     * 
     * If you want to preselect a particular existing file, you should
     * use [method@Gtk.FileChooser.set_file] instead.
     * 
     * Please see the documentation for those functions for an example
     * of using [method@Gtk.FileChooser.set_current_name] as well.
     */
    public default void setCurrentName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_current_name(HANDLE(), Interop.allocateNativeString(name).HANDLE());
    }
    
    /**
     * Sets @file as the current filename for the file chooser.
     * 
     * This includes changing to the file’s parent folder and actually selecting
     * the file in list. If the @chooser is in %GTK_FILE_CHOOSER_ACTION_SAVE mode,
     * the file’s base name will also appear in the dialog’s file name entry.
     * 
     * If the file name isn’t in the current folder of @chooser, then the current
     * folder of @chooser will be changed to the folder containing @file.
     * 
     * Note that the file must exist, or nothing will be done except
     * for the directory change.
     * 
     * If you are implementing a save dialog, you should use this function if
     * you already have a file name to which the user may save; for example,
     * when the user opens an existing file and then does “Save As…”. If you
     * don’t have a file name already — for example, if the user just created
     * a new file and is saving it for the first time, do not call this function.
     * 
     * Instead, use something similar to this:
     * 
     * ```c
     * static void
     * prepare_file_chooser (GtkFileChooser *chooser,
     *                       GFile          *existing_file)
     * {
     *   gboolean document_is_new = (existing_file == NULL);
     * 
     *   if (document_is_new)
     *     {
     *       GFile *default_file_for_saving = g_file_new_for_path ("./out.txt");
     *       // the user just created a new document
     *       gtk_file_chooser_set_current_folder (chooser, default_file_for_saving, NULL);
     *       gtk_file_chooser_set_current_name (chooser, "Untitled document");
     *       g_object_unref (default_file_for_saving);
     *     }
     *   else
     *     {
     *       // the user edited an existing document
     *       gtk_file_chooser_set_file (chooser, existing_file, NULL);
     *     }
     * }
     * ```
     */
    public default boolean setFile(org.gtk.gio.File file) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_file(HANDLE(), file.HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_filter(HANDLE(), filter.HANDLE());
    }
    
    /**
     * Sets whether multiple files can be selected in the file chooser.
     * 
     * This is only relevant if the action is set to be
     * %GTK_FILE_CHOOSER_ACTION_OPEN or
     * %GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
     */
    public default void setSelectMultiple(boolean selectMultiple) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_file_chooser_set_select_multiple(HANDLE(), selectMultiple ? 1 : 0);
    }
    
    class FileChooserImpl extends org.gtk.gobject.Object implements FileChooser {
        public FileChooserImpl(io.github.jwharm.javagi.interop.Proxy proxy) {
            super(proxy);
        }
    }
}
