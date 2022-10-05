package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFileChooserDialog} is a dialog suitable for use with
 * “File Open” or “File Save” commands.
 * <p>
 * <img src="./doc-files/filechooser.png" alt="An example GtkFileChooserDialog">
 * <p>
 * This widget works by putting a {@link FileChooserWidget}
 * inside a {@code Gtk.FileChooser}
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
 * <h2>Typical usage</h2>
 * <p>
 * In the simplest of cases, you can the following code to use
 * {@code GtkFileChooserDialog} to select a file for opening:
 * <p>
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
 * <p>
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
 * <h2>Setting up a file chooser dialog</h2>
 * <p>
 * There are various cases in which you may need to use a {@code GtkFileChooserDialog}:
 * <p>
 * <ul>
 * <li>To select a file for opening, use {@link FileChooserAction#OPEN}.
 * </ul>
 * <p>
 * <ul>
 * <li>To save a file for the first time, use {@link FileChooserAction#SAVE},
 *   and suggest a name such as “Untitled” with
 *   {@link FileChooser#setCurrentName}.
 * </ul>
 * <p>
 * <ul>
 * <li>To save a file under a different name, use {@link FileChooserAction#SAVE},
 *   and set the existing file with {@link FileChooser#setFile}.
 * </ul>
 * <p>
 * <ul>
 * <li>To choose a folder instead of a filem use {@link FileChooserAction#SELECT_FOLDER}.
 * </ul>
 * <p>
 * In general, you should only cause the file chooser to show a specific
 * folder when it is appropriate to use {@link FileChooser#setFile},
 * i.e. when you are doing a “Save As” command and you already have a file
 * saved somewhere.
 * <p>
 * <h2>Response Codes</h2>
 * <p>
 * {@code GtkFileChooserDialog} inherits from {@link Dialog}, so buttons that
 * go in its action area have response codes such as {@link ResponseType#ACCEPT} and
 * {@link ResponseType#CANCEL}. For example, you could call
 * {@link FileChooserDialog#FileChooserDialog} as follows:
 * <p>
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
 * <p>
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
public class FileChooserDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, FileChooser, Native, Root, ShortcutManager {

    public FileChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileChooserDialog */
    public static FileChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new FileChooserDialog(gobject.refcounted());
    }
    
}
