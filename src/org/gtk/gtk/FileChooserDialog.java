package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFileChooserDialog</code> is a dialog suitable for use with
 * &#8220;File Open&#8221; or &#8220;File Save&#8221; commands.
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
 *   dialog = gtk_file_chooser_dialog_new (&#34;Open File&#34;,
 *                                         parent_window,
 *                                         action,
 *                                         _(&#34;_Cancel&#34;),
 *                                         GTK_RESPONSE_CANCEL,
 *                                         _(&#34;_Open&#34;),
 *                                         GTK_RESPONSE_ACCEPT,
 *                                         NULL);
 * <p>
 *   gtk_widget_show (dialog);
 * <p>
 *   g_signal_connect (dialog, &#34;response&#34;,
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
 *   dialog = gtk_file_chooser_dialog_new (&#34;Save File&#34;,
 *                                         parent_window,
 *                                         action,
 *                                         _(&#34;_Cancel&#34;),
 *                                         GTK_RESPONSE_CANCEL,
 *                                         _(&#34;_Save&#34;),
 *                                         GTK_RESPONSE_ACCEPT,
 *                                         NULL);
 *   chooser = GTK_FILE_CHOOSER (dialog);
 * <p>
 *   if (user_edited_a_new_document)
 *     gtk_file_chooser_set_current_name (chooser, _(&#34;Untitled document&#34;));
 *   else
 *     gtk_file_chooser_set_file (chooser, existing_filename);
 * <p>
 *   gtk_widget_show (dialog);
 * <p>
 *   g_signal_connect (dialog, &#34;response&#34;,
 *                     G_CALLBACK (on_save_response),
 *                     NULL);
 * </pre>
 * <p>
 * <h2>Setting up a file chooser dialog</h2>
 * <p>
 * There are various cases in which you may need to use a <code>GtkFileChooserDialog</code>:
 * <p>
 * <li>To select a file for opening, use <code>GTK_FILE_CHOOSER_ACTION_OPEN.
 * <p>
 * <li>To</code> save a file for the first time, use <code>GTK_FILE_CHOOSER_ACTION_SAVE,
 * </code>  and suggest a name such as &#8220;Untitled&#8221; with
 *   {@link org.gtk.gtk.FileChooser#setCurrentName}.
 * <p>
 * <li>To save a file under a different name, use <code>GTK_FILE_CHOOSER_ACTION_SAVE,
 * </code>  and set the existing file with {@link org.gtk.gtk.FileChooser#setFile}.
 * <p>
 * <li>To choose a folder instead of a filem use <code>GTK_FILE_CHOOSER_ACTION_SELECT_FOLDER.
 * <p>
 * In</code> general, you should only cause the file chooser to show a specific
 * folder when it is appropriate to use {@link org.gtk.gtk.FileChooser#setFile},
 * i.e. when you are doing a &#8220;Save As&#8221; command and you already have a file
 * saved somewhere.
 * <p>
 * <h2>Response Codes</h2>
 * <p><code>GtkFileChooserDialog</code> inherits from {@link org.gtk.gtk.Dialog}, so buttons that
 * go in its action area have response codes such as {@link org.gtk.gtk.ResponseType#ACCEPT} and
 * <code>GTK_RESPONSE_CANCEL.</code> For example, you could call
 * {@link [ctor@Gtk.FileChooserDialog.new] (ref=ctor)} as follows:
 * <p><pre>c
 * GtkWidget *dialog;
 * GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <p>
 * dialog = gtk_file_chooser_dialog_new (&#34;Open File&#34;,
 *                                       parent_window,
 *                                       action,
 *                                       _(&#34;_Cancel&#34;),
 *                                       GTK_RESPONSE_CANCEL,
 *                                       _(&#34;_Open&#34;),
 *                                       GTK_RESPONSE_ACCEPT,
 *                                       NULL);
 * </pre>
 * <p>
 * This will create buttons for &#8220;Cancel&#8221; and &#8220;Open&#8221; that use predefined
 * response identifiers from {@link [enum@Gtk.ResponseType] (ref=enum)}.  For most dialog
 * boxes you can use your own custom response codes rather than the
 * ones in {@link [enum@Gtk.ResponseType] (ref=enum)}, but <code>GtkFileChooserDialog</code> assumes that
 * its &#8220;accept&#8221;-type action, e.g. an &#8220;Open&#8221; or &#8220;Save&#8221; button,
 * will have one of the following response codes:
 * <p>
 * <li><code>GTK_RESPONSE_ACCEPT
 * <li>%GTK_RESPONSE_OK
 * <li>%GTK_RESPONSE_YES
 * <li>%GTK_RESPONSE_APPLY
 * <p>
 * This</code> is because <code>GtkFileChooserDialog</code> must intercept responses and switch
 * to folders if appropriate, rather than letting the dialog terminate &#8212; the
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
