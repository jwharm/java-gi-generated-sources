package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFileChooser} is an interface that can be implemented by file
 * selection widgets.
 * <p>
 * In GTK, the main objects that implement this interface are
 * {@link FileChooserWidget}.
 * <p>
 * You do not need to write an object that implements the {@code GtkFileChooser}
 * interface unless you are trying to adapt an existing file selector to
 * expose a standard programming interface.
 * <p>
 * {@code GtkFileChooser} allows for shortcuts to various places in the filesystem.
 * In the default implementation these are displayed in the left pane. It
 * may be a bit confusing at first that these shortcuts come from various
 * sources and in various flavours, so lets explain the terminology here:
 * <ul>
 * <li>Bookmarks: are created by the user, by dragging folders from the
 *   right pane to the left pane, or by using the “Add”. Bookmarks
 *   can be renamed and deleted by the user.
 * </ul>
 * <ul>
 * <li>Shortcuts: can be provided by the application. For example, a Paint
 *   program may want to add a shortcut for a Clipart folder. Shortcuts
 *   cannot be modified by the user.
 * </ul>
 * <ul>
 * <li>Volumes: are provided by the underlying filesystem abstraction. They are
 *   the “roots” of the filesystem.
 * </ul>
 * <p>
 * <strong>File Names and Encodings</strong><br/>
 * When the user is finished selecting files in a {@code GtkFileChooser}, your
 * program can get the selected filenames as {@code GFile}s.
 * <p>
 * <strong>Adding options</strong><br/>
 * You can add extra widgets to a file chooser to provide options
 * that are not present in the default design, by using
 * {@link FileChooser#addChoice}. Each choice has an identifier and
 * a user visible label; additionally, each choice can have multiple
 * options. If a choice has no option, it will be rendered as a
 * check button with the given label; if a choice has options, it will
 * be rendered as a combo box.
 */
public interface FileChooser extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileChooserImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileChooserImpl(input);
    
    /**
     * Adds a 'choice' to the file chooser.
     * <p>
     * This is typically implemented as a combobox or, for boolean choices,
     * as a checkbutton. You can select a value using
     * {@link FileChooser#setChoice} before the dialog is shown,
     * and you can obtain the user-selected value in the
     * {@code Gtk.Dialog::response} signal handler using
     * {@link FileChooser#getChoice}.
     * @param id id for the added choice
     * @param label user-visible label for the added choice
     * @param options ids for the options of the choice, or {@code null} for a boolean choice
     * @param optionLabels user-visible labels for the options, must be the same length as {@code options}
     */
    default void addChoice(java.lang.String id, java.lang.String label, @Nullable java.lang.String[] options, @Nullable java.lang.String[] optionLabels) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_chooser_add_choice.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(id, SCOPE),
                        Marshal.stringToAddress.marshal(label, SCOPE),
                        (Addressable) (options == null ? MemoryAddress.NULL : Interop.allocateNativeArray(options, false, SCOPE)),
                        (Addressable) (optionLabels == null ? MemoryAddress.NULL : Interop.allocateNativeArray(optionLabels, false, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Adds {@code filter} to the list of filters that the user can select between.
     * <p>
     * When a filter is selected, only files that are passed by that
     * filter are displayed.
     * <p>
     * Note that the {@code chooser} takes ownership of the filter if it is floating,
     * so you have to ref and sink it if you want to keep a reference.
     * @param filter a {@code GtkFileFilter}
     */
    default void addFilter(org.gtk.gtk.FileFilter filter) {
        try {
            DowncallHandles.gtk_file_chooser_add_filter.invokeExact(
                    handle(),
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a folder to be displayed with the shortcut folders
     * in a file chooser.
     * @param folder a {@code GFile} for the folder to add
     * @return {@code true} if the folder could be added successfully,
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean addShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_file_chooser_add_shortcut_folder.invokeExact(
                        handle(),
                        folder.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets the type of operation that the file chooser is performing.
     * @return the action that the file selector is performing
     */
    default org.gtk.gtk.FileChooserAction getAction() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_file_chooser_get_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.FileChooserAction.of(RESULT);
    }
    
    /**
     * Gets the currently selected option in the 'choice' with the given ID.
     * @param id the ID of the choice to get
     * @return the ID of the currently selected option
     */
    default @Nullable java.lang.String getChoice(java.lang.String id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_choice.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(id, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets whether file chooser will offer to create new folders.
     * @return {@code true} if the Create Folder button should be displayed.
     */
    default boolean getCreateFolders() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_file_chooser_get_create_folders.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the current folder of {@code chooser} as {@code GFile}.
     * @return the {@code GFile} for the current folder.
     */
    default @Nullable org.gtk.gio.File getCurrentFolder() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_current_folder.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.File) Interop.register(RESULT, org.gtk.gio.File.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the current name in the file selector, as entered by the user.
     * <p>
     * This is meant to be used in save dialogs, to get the currently typed
     * filename when the file itself does not exist yet.
     * @return The raw text from the file chooser’s “Name” entry. Free with
     *   g_free(). Note that this string is not a full pathname or URI; it is
     *   whatever the contents of the entry are. Note also that this string is
     *   in UTF-8 encoding, which is not necessarily the system’s encoding for
     *   filenames.
     */
    default @Nullable java.lang.String getCurrentName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_current_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the {@code GFile} for the currently selected file in
     * the file selector.
     * <p>
     * If multiple files are selected, one of the files will be
     * returned at random.
     * <p>
     * If the file chooser is in folder mode, this function returns
     * the selected folder.
     * @return a selected {@code GFile}. You own the
     *   returned file; use g_object_unref() to release it.
     */
    default @Nullable org.gtk.gio.File getFile() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_file.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.File) Interop.register(RESULT, org.gtk.gio.File.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Lists all the selected files and subfolders in the current folder
     * of {@code chooser} as {@code GFile}.
     * @return a list model containing a {@code GFile} for each
     *   selected file and subfolder in the current folder. Free the returned
     *   list with g_object_unref().
     */
    default org.gtk.gio.ListModel getFiles() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_files.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the current filter.
     * @return the current filter
     */
    default @Nullable org.gtk.gtk.FileFilter getFilter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_filter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.FileFilter) Interop.register(RESULT, org.gtk.gtk.FileFilter.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the current set of user-selectable filters, as a list model.
     * <p>
     * See {@link FileChooser#addFilter} and
     * {@link FileChooser#removeFilter} for changing individual filters.
     * <p>
     * You should not modify the returned list model. Future changes to
     * {@code chooser} may or may not affect the returned model.
     * @return a {@code GListModel} containing the current set
     *   of user-selectable filters.
     */
    default org.gtk.gio.ListModel getFilters() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_filters.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets whether multiple files can be selected in the file
     * chooser.
     * @return {@code true} if multiple files can be selected.
     */
    default boolean getSelectMultiple() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_file_chooser_get_select_multiple.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries the list of shortcut folders in the file chooser.
     * <p>
     * You should not modify the returned list model. Future changes to
     * {@code chooser} may or may not affect the returned model.
     * @return A list model of {@code GFile}s
     */
    default org.gtk.gio.ListModel getShortcutFolders() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_get_shortcut_folders.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gtk.gio.ListModel) Interop.register(RESULT, org.gtk.gio.ListModel.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Removes a 'choice' that has been added with gtk_file_chooser_add_choice().
     * @param id the ID of the choice to remove
     */
    default void removeChoice(java.lang.String id) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_chooser_remove_choice.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(id, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Removes {@code filter} from the list of filters that the user can select between.
     * @param filter a {@code GtkFileFilter}
     */
    default void removeFilter(org.gtk.gtk.FileFilter filter) {
        try {
            DowncallHandles.gtk_file_chooser_remove_filter.invokeExact(
                    handle(),
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a folder from the shortcut folders in a file chooser.
     * @param folder a {@code GFile} for the folder to remove
     * @return {@code true} if the folder could be removed successfully,
     *   {@code false} otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean removeShortcutFolder(org.gtk.gio.File folder) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_file_chooser_remove_shortcut_folder.invokeExact(
                        handle(),
                        folder.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Sets the type of operation that the chooser is performing.
     * <p>
     * The user interface is adapted to suit the selected action.
     * <p>
     * For example, an option to create a new folder might be shown
     * if the action is {@link FileChooserAction#SAVE} but not if the
     * action is {@link FileChooserAction#OPEN}.
     * @param action the action that the file selector is performing
     */
    default void setAction(org.gtk.gtk.FileChooserAction action) {
        try {
            DowncallHandles.gtk_file_chooser_set_action.invokeExact(
                    handle(),
                    action.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects an option in a 'choice' that has been added with
     * gtk_file_chooser_add_choice().
     * <p>
     * For a boolean choice, the possible options are "true" and "false".
     * @param id the ID of the choice to set
     * @param option the ID of the option to select
     */
    default void setChoice(java.lang.String id, java.lang.String option) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_chooser_set_choice.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(id, SCOPE),
                        Marshal.stringToAddress.marshal(option, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether file chooser will offer to create new folders.
     * <p>
     * This is only relevant if the action is not set to be
     * {@link FileChooserAction#OPEN}.
     * @param createFolders {@code true} if the Create Folder button should be displayed
     */
    default void setCreateFolders(boolean createFolders) {
        try {
            DowncallHandles.gtk_file_chooser_set_create_folders.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(createFolders, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current folder for {@code chooser} from a {@code GFile}.
     * @param file the {@code GFile} for the new folder
     * @return {@code true} if the folder could be changed successfully, {@code false}
     *   otherwise.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setCurrentFolder(@Nullable org.gtk.gio.File file) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_file_chooser_set_current_folder.invokeExact(
                        handle(),
                        (Addressable) (file == null ? MemoryAddress.NULL : file.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param name the filename to use, as a UTF-8 string
     */
    default void setCurrentName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_chooser_set_current_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
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
     * @param file the {@code GFile} to set as current
     * @return Not useful
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    default boolean setFile(org.gtk.gio.File file) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_file_chooser_set_file.invokeExact(
                        handle(),
                        file.handle(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param filter a {@code GtkFileFilter}
     */
    default void setFilter(org.gtk.gtk.FileFilter filter) {
        try {
            DowncallHandles.gtk_file_chooser_set_filter.invokeExact(
                    handle(),
                    filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether multiple files can be selected in the file chooser.
     * <p>
     * This is only relevant if the action is set to be
     * {@link FileChooserAction#OPEN} or
     * {@link FileChooserAction#SELECT_FOLDER}.
     * @param selectMultiple {@code true} if multiple files can be selected.
     */
    default void setSelectMultiple(boolean selectMultiple) {
        try {
            DowncallHandles.gtk_file_chooser_set_select_multiple.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(selectMultiple, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_file_chooser_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_add_choice = Interop.downcallHandle(
                "gtk_file_chooser_add_choice",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_add_filter = Interop.downcallHandle(
                "gtk_file_chooser_add_filter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_add_shortcut_folder = Interop.downcallHandle(
                "gtk_file_chooser_add_shortcut_folder",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_action = Interop.downcallHandle(
                "gtk_file_chooser_get_action",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_choice = Interop.downcallHandle(
                "gtk_file_chooser_get_choice",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_create_folders = Interop.downcallHandle(
                "gtk_file_chooser_get_create_folders",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_current_folder = Interop.downcallHandle(
                "gtk_file_chooser_get_current_folder",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_current_name = Interop.downcallHandle(
                "gtk_file_chooser_get_current_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_file = Interop.downcallHandle(
                "gtk_file_chooser_get_file",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_files = Interop.downcallHandle(
                "gtk_file_chooser_get_files",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_filter = Interop.downcallHandle(
                "gtk_file_chooser_get_filter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_filters = Interop.downcallHandle(
                "gtk_file_chooser_get_filters",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_select_multiple = Interop.downcallHandle(
                "gtk_file_chooser_get_select_multiple",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_shortcut_folders = Interop.downcallHandle(
                "gtk_file_chooser_get_shortcut_folders",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_remove_choice = Interop.downcallHandle(
                "gtk_file_chooser_remove_choice",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_remove_filter = Interop.downcallHandle(
                "gtk_file_chooser_remove_filter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_remove_shortcut_folder = Interop.downcallHandle(
                "gtk_file_chooser_remove_shortcut_folder",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_action = Interop.downcallHandle(
                "gtk_file_chooser_set_action",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_choice = Interop.downcallHandle(
                "gtk_file_chooser_set_choice",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_create_folders = Interop.downcallHandle(
                "gtk_file_chooser_set_create_folders",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_current_folder = Interop.downcallHandle(
                "gtk_file_chooser_set_current_folder",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_current_name = Interop.downcallHandle(
                "gtk_file_chooser_set_current_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_file = Interop.downcallHandle(
                "gtk_file_chooser_set_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_filter = Interop.downcallHandle(
                "gtk_file_chooser_set_filter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_set_select_multiple = Interop.downcallHandle(
                "gtk_file_chooser_set_select_multiple",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_file_chooser_get_type = Interop.downcallHandle(
                "gtk_file_chooser_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The FileChooserImpl type represents a native instance of the FileChooser interface.
     */
    class FileChooserImpl extends org.gtk.gobject.GObject implements FileChooser {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of FileChooser for the provided memory address.
         * @param address the memory address of the instance
         */
        public FileChooserImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_file_chooser_get_type != null;
    }
}
