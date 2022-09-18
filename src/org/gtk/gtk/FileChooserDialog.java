package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFileChooserDialog</code> is a dialog suitable for use with
 * &<code>#8220</code> File Open&<code>#8221</code>  or &<code>#8220</code> File Save&<code>#8221</code>  commands.
 * <p>
 * !{@link [An example GtkFileChooserDialog]}(filechooser.png)
 * <p>
 * This widget works by putting a {@link org.gtk.gtk.FileChooserWidget}
 * inside a {@link org.gtk.gtk.Dialog}. It exposes the {@link [iface@Gtk.FileChooser] (ref=iface)}
 * interface, so you can use all of the {@link [iface@Gtk.FileChooser] (ref=iface)} functions
 * on the file chooser dialog as well as those for {@link org.gtk.gtk.Dialog}.
 * <p>
 * Note that <code>GtkFileChooserDialog</code> does not have any methods of its
 * own. Instead, you should use the functions that work on a
 * {@link [iface@Gtk.FileChooser] (ref=iface)}.
 * <p>
 * If you want to integrate well with the platform you should use the
 * {@link org.gtk.gtk.FileChooserNative} API, which will use a platform-specific
 * dialog if available and fall back to <code>GtkFileChooserDialog</code>
 * otherwise.
 * <p>
 * <h2>Typical usage</h2>
 * <p>
 * In the simplest of cases, you can the following code to use<code>GtkFileChooserDialog</code> to select a file for opening:
 * <p><pre>c
 * static void
 * on_open_response (GtkDialog *dialog,
 *                   int        response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (dialog);
 * <p>
 *       g_autoptr(GFile) file = gtk_file_chooser_get_file (chooser);
 * <p>
 *       open_file (file);
 *     }
 * <p>
 *   gtk_window_destroy (GTK_WINDOW (dialog));
 * }
 * <p>
 *   // ...
 *   GtkWidget *dialog;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <p>
 *   dialog = gtk_file_chooser_dialog_new (&<code>#34</code> Open File&<code>#34</code> ,
 *                                         parent_window,
 *                                         action,
 *                                         _(&<code>#34</code> _Cancel&<code>#34</code> ),
 *                                         GTK_RESPONSE_CANCEL,
 *                                         _(&<code>#34</code> _Open&<code>#34</code> ),
 *                                         GTK_RESPONSE_ACCEPT,
 *                                         NULL);
 * <p>
 *   gtk_widget_show (dialog);
 * <p>
 *   g_signal_connect (dialog, &<code>#34</code> response&<code>#34</code> ,
 *                     G_CALLBACK (on_open_response),
 *                     NULL);
 * </pre>
 * <p>
 * To use a dialog for saving, you can use this:
 * <p><pre>c
 * static void
 * on_save_response (GtkDialog *dialog,
 *                   int        response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (dialog);
 * <p>
 *       g_autoptr(GFile) file = gtk_file_chooser_get_file (chooser);
 * <p>
 *       save_to_file (file);
 *     }
 * <p>
 *   gtk_window_destroy (GTK_WINDOW (dialog));
 * }
 * <p>
 *   // ...
 *   GtkWidget *dialog;
 *   GtkFileChooser *chooser;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 * <p>
 *   dialog = gtk_file_chooser_dialog_new (&<code>#34</code> Save File&<code>#34</code> ,
 *                                         parent_window,
 *                                         action,
 *                                         _(&<code>#34</code> _Cancel&<code>#34</code> ),
 *                                         GTK_RESPONSE_CANCEL,
 *                                         _(&<code>#34</code> _Save&<code>#34</code> ),
 *                                         GTK_RESPONSE_ACCEPT,
 *                                         NULL);
 *   chooser = GTK_FILE_CHOOSER (dialog);
 * <p>
 *   if (user_edited_a_new_document)
 *     gtk_file_chooser_set_current_name (chooser, _(&<code>#34</code> Untitled document&<code>#34</code> ));
 *   else
 *     gtk_file_chooser_set_file (chooser, existing_filename);
 * <p>
 *   gtk_widget_show (dialog);
 * <p>
 *   g_signal_connect (dialog, &<code>#34</code> response&<code>#34</code> ,
 *                     G_CALLBACK (on_save_response),
 *                     NULL);
 * </pre>
 * <p>
 * <h2>Setting up a file chooser dialog</h2>
 * <p>
 * There are various cases in which you may need to use a <code>GtkFileChooserDialog</code>:
 * <p>
 * <li>To select a file for opening, use {@link org.gtk.gtk.FileChooserAction<code>#OPEN</code>  
 * <p>
 * <li>To save a file for the first time, use {@link org.gtk.gtk.FileChooserAction<code>#SAVE</code>  
 *   and suggest a name such as &<code>#8220</code> Untitled&<code>#8221</code>  with
 *   {@link org.gtk.gtk.FileChooser<code>#setCurrentName</code> .
 * <p>
 * <li>To save a file under a different name, use {@link org.gtk.gtk.FileChooserAction<code>#SAVE</code>  
 *   and set the existing file with {@link org.gtk.gtk.FileChooser<code>#setFile</code> .
 * <p>
 * <li>To choose a folder instead of a filem use {@link org.gtk.gtk.FileChooserAction<code>#SELECT_FOLDER</code>  
 * <p>
 * In general, you should only cause the file chooser to show a specific
 * folder when it is appropriate to use {@link org.gtk.gtk.FileChooser<code>#setFile</code> ,
 * i.e. when you are doing a &<code>#8220</code> Save As&<code>#8221</code>  command and you already have a file
 * saved somewhere.
 * <p>
 * <h2>Response Codes</h2>
 * <p><code>GtkFileChooserDialog</code> inherits from {@link org.gtk.gtk.Dialog}, so buttons that
 * go in its action area have response codes such as {@link org.gtk.gtk.ResponseType<code>#ACCEPT</code>  and
 * {@link org.gtk.gtk.ResponseType<code>#CANCEL</code>   For example, you could call
 * {@link [ctor@Gtk.FileChooserDialog.new] (ref=ctor)} as follows:
 * <p><pre>c
 * GtkWidget *dialog;
 * GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <p>
 * dialog = gtk_file_chooser_dialog_new (&<code>#34</code> Open File&<code>#34</code> ,
 *                                       parent_window,
 *                                       action,
 *                                       _(&<code>#34</code> _Cancel&<code>#34</code> ),
 *                                       GTK_RESPONSE_CANCEL,
 *                                       _(&<code>#34</code> _Open&<code>#34</code> ),
 *                                       GTK_RESPONSE_ACCEPT,
 *                                       NULL);
 * </pre>
 * <p>
 * This will create buttons for &<code>#8220</code> Cancel&<code>#8221</code>  and &<code>#8220</code> Open&<code>#8221</code>  that use predefined
 * response identifiers from {@link [enum@Gtk.ResponseType] (ref=enum)}.  For most dialog
 * boxes you can use your own custom response codes rather than the
 * ones in {@link [enum@Gtk.ResponseType] (ref=enum)}, but <code>GtkFileChooserDialog</code> assumes that
 * its &<code>#8220</code> accept&<code>#8221</code> -type action, e.g. an &<code>#8220</code> Open&<code>#8221</code>  or &<code>#8220</code> Save&<code>#8221</code>  button,
 * will have one of the following response codes:
 * <p>
 * <li>{@link org.gtk.gtk.ResponseType<code>#ACCEPT</code>  <li>{@link org.gtk.gtk.ResponseType<code>#OK</code>  <li>{@link org.gtk.gtk.ResponseType<code>#YES</code>  <li>{@link org.gtk.gtk.ResponseType<code>#APPLY</code>  <p>
 * This is because <code>GtkFileChooserDialog</code> must intercept responses and switch
 * to folders if appropriate, rather than letting the dialog terminate &<code>#8212</code>  the
 * implementation uses these known response codes to know which responses can
 * be blocked if appropriate.
 * <p>
 * To summarize, make sure you use a predefined response code
 * when you use <code>GtkFileChooserDialog</code> to ensure proper operation.
 */
public class FileChooserDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, FileChooser, Native, Root, ShortcutManager {

    public FileChooserDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileChooserDialog */
    public static FileChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        return new FileChooserDialog(gobject.getReference());
    }
    
}
