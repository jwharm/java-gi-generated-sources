package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFileChooser} is an interface that can be implemented by file
 * selection widgets.
 * <p>
 * In GTK, the main objects that implement this interface are
 * {@code Gtk.FileChooserDialog}.
 * <p>
 * You do not need to write an object that implements the {@code GtkFileChooser}
 * interface unless you are trying to adapt an existing file selector to
 * expose a standard programming interface.
 * <p>
 * {@code GtkFileChooser} allows for shortcuts to various places in the filesystem.
 * In the default implementation these are displayed in the left pane. It
 * may be a bit confusing at first that these shortcuts come from various
 * sources and in various flavours, so lets explain the terminology here:
 * <p>
 * <ul>
 * <li>Bookmarks: are created by the user, by dragging folders from the
 *   right pane to the left pane, or by using the “Add”. Bookmarks
 *   can be renamed and deleted by the user.
 * </ul>
 * <p>
 * <ul>
 * <li>Shortcuts: can be provided by the application. For example, a Paint
 *   program may want to add a shortcut for a Clipart folder. Shortcuts
 *   cannot be modified by the user.
 * </ul>
 * <p>
 * <ul>
 * <li>Volumes: are provided by the underlying filesystem abstraction. They are
 *   the “roots” of the filesystem.
 * </ul>
 * <p>
 * <h1>File Names and Encodings</h1>
 * <p>
 * When the user is finished selecting files in a {@code GtkFileChooser}, your
 * program can get the selected filenames as {@code GFile}s.
 * <p>
 * <h1>Adding options</h1>
 * <p>
 * You can add extra widgets to a file chooser to provide options
 * that are not present in the default design, by using
 * {@link FileChooser#addChoice}. Each choice has an identifier and
 * a user visible label; additionally, each choice can have multiple
 * options. If a choice has no option, it will be rendered as a
 * check button with the given label; if a choice has options, it will
 * be rendered as a combo box.
 */
public interface FileChooser extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_file_chooser_add_choice = Interop.downcallHandle(
        "gtk_file_chooser_add_choice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a 'choice' to the file chooser.
     * <p>
     * This is typically implemented as a combobox or, for boolean choices,
     * as a checkbutton. You can select a value using
     * {@link FileChooser#setChoice} before the dialog is shown,
     * and you can obtain the user-selected value in the
     * {@code Gtk.Dialog::response} signal handler using
     * {@link FileChooser#getChoice}.
     */
    public default void addChoice(java.lang.String id, java.lang.String label, java.lang.String[] options, java.lang.String[] optionLabels) {
        try {
            gtk_file_chooser_add_choice.invokeExact(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(label).handle(), Interop.allocateNativeArray(options).handle(), Interop.allocateNativeArray(optionLabels).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_add_filter = Interop.downcallHandle(
        "gtk_file_chooser_add_filter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code filter} to the list of filters that the user can select between.
     * <p>
     * When a filter is selected, only files that are passed by that
     * filter are displayed.
     * <p>
     * Note that the {@code chooser} takes ownership of the filter if it is floating,
     * so you have to ref and sink it if you want to keep a reference.
     */
    public default void addFilter(FileFilter filter) {
        try {
            gtk_file_chooser_add_filter.invokeExact(handle(), filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_add_shortcut_folder = Interop.downcallHandle(
        "gtk_file_chooser_add_shortcut_folder",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a folder to be displayed with the shortcut folders
     * in a file chooser.
     */
    public default boolean addShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_file_chooser_add_shortcut_folder.invokeExact(handle(), folder.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_action = Interop.downcallHandle(
        "gtk_file_chooser_get_action",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of operation that the file chooser is performing.
     */
    public default FileChooserAction getAction() {
        try {
            var RESULT = (int) gtk_file_chooser_get_action.invokeExact(handle());
            return new FileChooserAction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_choice = Interop.downcallHandle(
        "gtk_file_chooser_get_choice",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently selected option in the 'choice' with the given ID.
     */
    public default java.lang.String getChoice(java.lang.String id) {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_choice.invokeExact(handle(), Interop.allocateNativeString(id).handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_create_folders = Interop.downcallHandle(
        "gtk_file_chooser_get_create_folders",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether file chooser will offer to create new folders.
     */
    public default boolean getCreateFolders() {
        try {
            var RESULT = (int) gtk_file_chooser_get_create_folders.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_current_folder = Interop.downcallHandle(
        "gtk_file_chooser_get_current_folder",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current folder of {@code chooser} as {@code GFile}.
     */
    public default org.gtk.gio.File getCurrentFolder() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_current_folder.invokeExact(handle());
            return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_current_name = Interop.downcallHandle(
        "gtk_file_chooser_get_current_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current name in the file selector, as entered by the user.
     * <p>
     * This is meant to be used in save dialogs, to get the currently typed
     * filename when the file itself does not exist yet.
     */
    public default java.lang.String getCurrentName() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_current_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_file = Interop.downcallHandle(
        "gtk_file_chooser_get_file",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GFile} for the currently selected file in
     * the file selector.
     * <p>
     * If multiple files are selected, one of the files will be
     * returned at random.
     * <p>
     * If the file chooser is in folder mode, this function returns
     * the selected folder.
     */
    public default org.gtk.gio.File getFile() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_file.invokeExact(handle());
            return new org.gtk.gio.File.FileImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_files = Interop.downcallHandle(
        "gtk_file_chooser_get_files",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists all the selected files and subfolders in the current folder
     * of {@code chooser} as {@code GFile}.
     */
    public default org.gtk.gio.ListModel getFiles() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_files.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_filter = Interop.downcallHandle(
        "gtk_file_chooser_get_filter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current filter.
     */
    public default FileFilter getFilter() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_filter.invokeExact(handle());
            return new FileFilter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_filters = Interop.downcallHandle(
        "gtk_file_chooser_get_filters",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current set of user-selectable filters, as a list model.
     * <p>
     * See {@link FileChooser#addFilter} and
     * {@link FileChooser#removeFilter} for changing individual filters.
     * <p>
     * You should not modify the returned list model. Future changes to
     * {@code chooser} may or may not affect the returned model.
     */
    public default org.gtk.gio.ListModel getFilters() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_filters.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_select_multiple = Interop.downcallHandle(
        "gtk_file_chooser_get_select_multiple",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether multiple files can be selected in the file
     * chooser.
     */
    public default boolean getSelectMultiple() {
        try {
            var RESULT = (int) gtk_file_chooser_get_select_multiple.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_get_shortcut_folders = Interop.downcallHandle(
        "gtk_file_chooser_get_shortcut_folders",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the list of shortcut folders in the file chooser.
     * <p>
     * You should not modify the returned list model. Future changes to
     * {@code chooser} may or may not affect the returned model.
     */
    public default org.gtk.gio.ListModel getShortcutFolders() {
        try {
            var RESULT = (MemoryAddress) gtk_file_chooser_get_shortcut_folders.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_remove_choice = Interop.downcallHandle(
        "gtk_file_chooser_remove_choice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
     */
    public default void removeChoice(java.lang.String id) {
        try {
            gtk_file_chooser_remove_choice.invokeExact(handle(), Interop.allocateNativeString(id).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_remove_filter = Interop.downcallHandle(
        "gtk_file_chooser_remove_filter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code filter} from the list of filters that the user can select between.
     */
    public default void removeFilter(FileFilter filter) {
        try {
            gtk_file_chooser_remove_filter.invokeExact(handle(), filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_remove_shortcut_folder = Interop.downcallHandle(
        "gtk_file_chooser_remove_shortcut_folder",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a folder from the shortcut folders in a file chooser.
     */
    public default boolean removeShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_file_chooser_remove_shortcut_folder.invokeExact(handle(), folder.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_action = Interop.downcallHandle(
        "gtk_file_chooser_set_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of operation that the chooser is performing.
     * <p>
     * The user interface is adapted to suit the selected action.
     * <p>
     * For example, an option to create a new folder might be shown
     * if the action is {@link FileChooserAction#SAVE} but not if the
     * action is {@link FileChooserAction#OPEN}.
     */
    public default void setAction(FileChooserAction action) {
        try {
            gtk_file_chooser_set_action.invokeExact(handle(), action.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_choice = Interop.downcallHandle(
        "gtk_file_chooser_set_choice",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Selects an option in a 'choice' that has been added with
     * gtk_file_chooser_add_choice().
     * <p>
     * For a boolean choice, the possible options are "true" and "false".
     */
    public default void setChoice(java.lang.String id, java.lang.String option) {
        try {
            gtk_file_chooser_set_choice.invokeExact(handle(), Interop.allocateNativeString(id).handle(), Interop.allocateNativeString(option).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_create_folders = Interop.downcallHandle(
        "gtk_file_chooser_set_create_folders",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether file chooser will offer to create new folders.
     * <p>
     * This is only relevant if the action is not set to be
     * {@link FileChooserAction#OPEN}.
     */
    public default void setCreateFolders(boolean createFolders) {
        try {
            gtk_file_chooser_set_create_folders.invokeExact(handle(), createFolders ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_current_folder = Interop.downcallHandle(
        "gtk_file_chooser_set_current_folder",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current folder for {@code chooser} from a {@code GFile}.
     */
    public default boolean setCurrentFolder(org.gtk.gio.File file) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_file_chooser_set_current_folder.invokeExact(handle(), file.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_current_name = Interop.downcallHandle(
        "gtk_file_chooser_set_current_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current name in the file selector, as if entered
     * by the user.
     * <p>
     * Note that the name passed in here is a UTF-8 string rather
     * than a filename. This function is meant for such uses as a
     * suggested name in a “Save As...” dialog.  You can pass
     * “Untitled.doc” or a similarly suitable suggestion for the {@code name}.
     * <p>
     * If you want to preselect a particular existing file, you should
     * use {@link FileChooser#setFile} instead.
     * <p>
     * Please see the documentation for those functions for an example
     * of using {@link FileChooser#setCurrentName} as well.
     */
    public default void setCurrentName(java.lang.String name) {
        try {
            gtk_file_chooser_set_current_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_file = Interop.downcallHandle(
        "gtk_file_chooser_set_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code file} as the current filename for the file chooser.
     * <p>
     * This includes changing to the file’s parent folder and actually selecting
     * the file in list. If the {@code chooser} is in {@link FileChooserAction#SAVE} mode,
     * the file’s base name will also appear in the dialog’s file name entry.
     * <p>
     * If the file name isn’t in the current folder of {@code chooser}, then the current
     * folder of {@code chooser} will be changed to the folder containing {@code file}.
     * <p>
     * Note that the file must exist, or nothing will be done except
     * for the directory change.
     * <p>
     * If you are implementing a save dialog, you should use this function if
     * you already have a file name to which the user may save; for example,
     * when the user opens an existing file and then does “Save As…”. If you
     * don’t have a file name already — for example, if the user just created
     * a new file and is saving it for the first time, do not call this function.
     * <p>
     * Instead, use something similar to this:
     * <p>
     * <pre>{@code c
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
     * }</pre>
     */
    public default boolean setFile(org.gtk.gio.File file) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gtk_file_chooser_set_file.invokeExact(handle(), file.handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_filter = Interop.downcallHandle(
        "gtk_file_chooser_set_filter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the current filter.
     * <p>
     * Only the files that pass the filter will be displayed.
     * If the user-selectable list of filters is non-empty, then
     * the filter should be one of the filters in that list.
     * <p>
     * Setting the current filter when the list of filters is
     * empty is useful if you want to restrict the displayed
     * set of files without letting the user change it.
     */
    public default void setFilter(FileFilter filter) {
        try {
            gtk_file_chooser_set_filter.invokeExact(handle(), filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_file_chooser_set_select_multiple = Interop.downcallHandle(
        "gtk_file_chooser_set_select_multiple",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether multiple files can be selected in the file chooser.
     * <p>
     * This is only relevant if the action is set to be
     * {@link FileChooserAction#OPEN} or
     * {@link FileChooserAction#SELECT_FOLDER}.
     */
    public default void setSelectMultiple(boolean selectMultiple) {
        try {
            gtk_file_chooser_set_select_multiple.invokeExact(handle(), selectMultiple ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    class FileChooserImpl extends org.gtk.gobject.Object implements FileChooser {
        public FileChooserImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}