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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public FileChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to FileChooserDialog if its GType is a (or inherits from) "GtkFileChooserDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "FileChooserDialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkFileChooserDialog", a ClassCastException will be thrown.
     */
    public static FileChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkFileChooserDialog"))) {
            return new FileChooserDialog(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkFileChooserDialog");
        }
    }
    
    private static Refcounted constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.FileChooserAction action, @Nullable java.lang.String firstButtonText) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new {@code GtkFileChooserDialog}.
     * <p>
     * This function is analogous to {@link Dialog#newWithButtons}.
     * @param title Title of the dialog
     * @param parent Transient parent of the dialog
     * @param action Open or save mode for the dialog
     * @param firstButtonText text to go in the first button
     */
    public FileChooserDialog(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.FileChooserAction action, @Nullable java.lang.String firstButtonText) {
        this(Refcounted.get(null)); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_chooser_dialog_new = Interop.downcallHandle(
            "gtk_file_chooser_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
