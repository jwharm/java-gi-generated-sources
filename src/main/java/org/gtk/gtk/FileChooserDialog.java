package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkFileChooserDialog} is a dialog suitable for use with
 * “File Open” or “File Save” commands.
 * <p>
 * <img src="./doc-files/filechooser.png" alt="An example GtkFileChooserDialog">
 * <p>
 * This widget works by putting a {@link FileChooserWidget}
 * inside a {@link Dialog}
 * interface, so you can use all of the {@code Gtk.FileChooser} functions
 * on the file chooser dialog as well as those for {@link Dialog}.
 * <p>
 * Note that {@code GtkFileChooserDialog} does not have any methods of its
 * own. Instead, you should use the functions that work on a
 * {@code Gtk.FileChooser}.
 * <p>
 * If you want to integrate well with the platform you should use the
 * {@link FileChooserNative} API, which will use a platform-specific
 * dialog if available and fall back to {@code GtkFileChooserDialog}
 * otherwise.
 * <p>
 * <strong>Typical usage</strong><br/>
 * In the simplest of cases, you can the following code to use
 * {@code GtkFileChooserDialog} to select a file for opening:
 * <pre>{@code c
 * static void
 * on_open_response (GtkDialog *dialog,
 *                   int        response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (dialog);
 * 
 *       g_autoptr(GFile) file = gtk_file_chooser_get_file (chooser);
 * 
 *       open_file (file);
 *     }
 * 
 *   gtk_window_destroy (GTK_WINDOW (dialog));
 * }
 * 
 *   // ...
 *   GtkWidget *dialog;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * 
 *   dialog = gtk_file_chooser_dialog_new ("Open File",
 *                                         parent_window,
 *                                         action,
 *                                         _("_Cancel"),
 *                                         GTK_RESPONSE_CANCEL,
 *                                         _("_Open"),
 *                                         GTK_RESPONSE_ACCEPT,
 *                                         NULL);
 * 
 *   gtk_widget_show (dialog);
 * 
 *   g_signal_connect (dialog, "response",
 *                     G_CALLBACK (on_open_response),
 *                     NULL);
 * }</pre>
 * <p>
 * To use a dialog for saving, you can use this:
 * <pre>{@code c
 * static void
 * on_save_response (GtkDialog *dialog,
 *                   int        response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (dialog);
 * 
 *       g_autoptr(GFile) file = gtk_file_chooser_get_file (chooser);
 * 
 *       save_to_file (file);
 *     }
 * 
 *   gtk_window_destroy (GTK_WINDOW (dialog));
 * }
 * 
 *   // ...
 *   GtkWidget *dialog;
 *   GtkFileChooser *chooser;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 * 
 *   dialog = gtk_file_chooser_dialog_new ("Save File",
 *                                         parent_window,
 *                                         action,
 *                                         _("_Cancel"),
 *                                         GTK_RESPONSE_CANCEL,
 *                                         _("_Save"),
 *                                         GTK_RESPONSE_ACCEPT,
 *                                         NULL);
 *   chooser = GTK_FILE_CHOOSER (dialog);
 * 
 *   if (user_edited_a_new_document)
 *     gtk_file_chooser_set_current_name (chooser, _("Untitled document"));
 *   else
 *     gtk_file_chooser_set_file (chooser, existing_filename);
 * 
 *   gtk_widget_show (dialog);
 * 
 *   g_signal_connect (dialog, "response",
 *                     G_CALLBACK (on_save_response),
 *                     NULL);
 * }</pre>
 * <p>
 * <strong>Setting up a file chooser dialog</strong><br/>
 * There are various cases in which you may need to use a {@code GtkFileChooserDialog}:
 * <ul>
 * <li>To select a file for opening, use {@link FileChooserAction#OPEN}.
 * </ul>
 * <ul>
 * <li>To save a file for the first time, use {@link FileChooserAction#SAVE},
 *   and suggest a name such as “Untitled” with
 *   {@link FileChooser#setCurrentName}.
 * </ul>
 * <ul>
 * <li>To save a file under a different name, use {@link FileChooserAction#SAVE},
 *   and set the existing file with {@link FileChooser#setFile}.
 * </ul>
 * <ul>
 * <li>To choose a folder instead of a filem use {@link FileChooserAction#SELECT_FOLDER}.
 * </ul>
 * <p>
 * In general, you should only cause the file chooser to show a specific
 * folder when it is appropriate to use {@link FileChooser#setFile},
 * i.e. when you are doing a “Save As” command and you already have a file
 * saved somewhere.
 * <p>
 * <strong>Response Codes</strong><br/>
 * {@code GtkFileChooserDialog} inherits from {@link Dialog}, so buttons that
 * go in its action area have response codes such as {@link ResponseType#ACCEPT} and
 * {@link ResponseType#CANCEL}. For example, you could call
 * {@link FileChooserDialog#FileChooserDialog} as follows:
 * <pre>{@code c
 * GtkWidget *dialog;
 * GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * 
 * dialog = gtk_file_chooser_dialog_new ("Open File",
 *                                       parent_window,
 *                                       action,
 *                                       _("_Cancel"),
 *                                       GTK_RESPONSE_CANCEL,
 *                                       _("_Open"),
 *                                       GTK_RESPONSE_ACCEPT,
 *                                       NULL);
 * }</pre>
 * <p>
 * This will create buttons for “Cancel” and “Open” that use predefined
 * response identifiers from {@code Gtk.ResponseType}.  For most dialog
 * boxes you can use your own custom response codes rather than the
 * ones in {@code Gtk.ResponseType}, but {@code GtkFileChooserDialog} assumes that
 * its “accept”-type action, e.g. an “Open” or “Save” button,
 * will have one of the following response codes:
 * <ul>
 * <li>{@link ResponseType#ACCEPT}
 * <li>{@link ResponseType#OK}
 * <li>{@link ResponseType#YES}
 * <li>{@link ResponseType#APPLY}
 * </ul>
 * <p>
 * This is because {@code GtkFileChooserDialog} must intercept responses and switch
 * to folders if appropriate, rather than letting the dialog terminate — the
 * implementation uses these known response codes to know which responses can
 * be blocked if appropriate.
 * <p>
 * To summarize, make sure you use a predefined response code
 * when you use {@code GtkFileChooserDialog} to ensure proper operation.
 */
public class FileChooserDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.FileChooser, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FileChooserDialog proxy instance for the provided memory address.
     * <p>
     * Because FileChooserDialog is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FileChooserDialog(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileChooserDialog> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FileChooserDialog(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, org.gtk.gtk.FileChooserAction action, @Nullable java.lang.String firstButtonText, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_dialog_new.invokeExact(
                    (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, null)),
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    action.getValue(),
                    (Addressable) (firstButtonText == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(firstButtonText, null)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFileChooserDialog}.
     * <p>
     * This function is analogous to {@link Dialog#newWithButtons}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param action Open or save mode for the dialog
     * @param firstButtonText text to go in the first button
     * @param varargs response ID for the first button, then additional (button, id) pairs, ending with {@code null}
     */
    public FileChooserDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, org.gtk.gtk.FileChooserAction action, @Nullable java.lang.String firstButtonText, java.lang.Object... varargs) {
        super(constructNew(title, parent, action, firstButtonText, varargs), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_file_chooser_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileChooserDialog.Builder} object constructs a {@link FileChooserDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileChooserDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Dialog.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileChooserDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileChooserDialog}.
         * @return A new instance of {@code FileChooserDialog} with the properties 
         *         that were set in the Builder object.
         */
        public FileChooserDialog build() {
            return (FileChooserDialog) org.gtk.gobject.GObject.newWithProperties(
                FileChooserDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_chooser_dialog_new = Interop.downcallHandle(
            "gtk_file_chooser_dialog_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_file_chooser_dialog_get_type = Interop.downcallHandle(
            "gtk_file_chooser_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
