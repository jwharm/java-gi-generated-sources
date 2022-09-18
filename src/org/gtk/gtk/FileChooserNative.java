package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkFileChooserNative</code> is an abstraction of a dialog suitable
 * for use with &<code>#8220</code> File Open&<code>#8221</code>  or &<code>#8220</code> File Save as&<code>#8221</code>  commands.
 * <p>
 * By default, this just uses a <code>GtkFileChooserDialog</code> to implement
 * the actual dialog. However, on some platforms, such as Windows and
 * macOS, the native platform file chooser is used instead. When the
 * application is running in a sandboxed environment without direct
 * filesystem access (such as Flatpak), <code>GtkFileChooserNative</code> may call
 * the proper APIs (portals) to let the user choose a file and make it
 * available to the application.
 * <p>
 * While the API of <code>GtkFileChooserNative</code> closely mirrors <code>GtkFileChooserDialog</code>,
 * the main difference is that there is no access to any <code>GtkWindow</code> or <code>GtkWidget</code>
 * for the dialog. This is required, as there may not be one in the case of a
 * platform native dialog.
 * <p>
 * Showing, hiding and running the dialog is handled by the
 * {@link org.gtk.gtk.NativeDialog} functions.
 * <p>
 * Note that unlike <code>GtkFileChooserDialog</code>, <code>GtkFileChooserNative</code> objects
 * are not toplevel widgets, and GTK does not keep them alive. It is your
 * responsibility to keep a reference until you are done with the
 * object.
 * <p>
 * <h2>Typical usage</h2>
 * <p>
 * In the simplest of cases, you can the following code to use<code>GtkFileChooserNative</code> to select a file for opening:
 * <p><pre>c
 * static void
 * on_response (GtkNativeDialog *native,
 *              int              response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 *       GFile *file = gtk_file_chooser_get_file (chooser);
 * <p>
 *       open_file (file);
 * <p>
 *       g_object_unref (file);
 *     }
 * <p>
 *   g_object_unref (native);
 * }
 * <p>
 *   // ...
 *   GtkFileChooserNative *native;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * <p>
 *   native = gtk_file_chooser_native_new (&<code>#34</code> Open File&<code>#34</code> ,
 *                                         parent_window,
 *                                         action,
 *                                         &<code>#34</code> _Open&<code>#34</code> ,
 *                                         &<code>#34</code> _Cancel&<code>#34</code> );
 * <p>
 *   g_signal_connect (native, &<code>#34</code> response&<code>#34</code> , G_CALLBACK (on_response), NULL);
 *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * </pre>
 * <p>
 * To use a <code>GtkFileChooserNative</code> for saving, you can use this:
 * <p><pre>c
 * static void
 * on_response (GtkNativeDialog *native,
 *              int              response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 *       GFile *file = gtk_file_chooser_get_file (chooser);
 * <p>
 *       save_to_file (file);
 * <p>
 *       g_object_unref (file);
 *     }
 * <p>
 *   g_object_unref (native);
 * }
 * <p>
 *   // ...
 *   GtkFileChooserNative *native;
 *   GtkFileChooser *chooser;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 * <p>
 *   native = gtk_file_chooser_native_new (&<code>#34</code> Save File&<code>#34</code> ,
 *                                         parent_window,
 *                                         action,
 *                                         &<code>#34</code> _Save&<code>#34</code> ,
 *                                         &<code>#34</code> _Cancel&<code>#34</code> );
 *   chooser = GTK_FILE_CHOOSER (native);
 * <p>
 *   if (user_edited_a_new_document)
 *     gtk_file_chooser_set_current_name (chooser, _(&<code>#34</code> Untitled document&<code>#34</code> ));
 *   else
 *     gtk_file_chooser_set_file (chooser, existing_file, NULL);
 * <p>
 *   g_signal_connect (native, &<code>#34</code> response&<code>#34</code> , G_CALLBACK (on_response), NULL);
 *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * </pre>
 * <p>
 * For more information on how to best set up a file dialog,
 * see the {@link org.gtk.gtk.FileChooserDialog} documentation.
 * <p>
 * <h2>Response Codes</h2>
 * <p><code>GtkFileChooserNative</code> inherits from {@link org.gtk.gtk.NativeDialog},
 * which means it will return {@link org.gtk.gtk.ResponseType<code>#ACCEPT</code>  if the user accepted,
 * and {@link org.gtk.gtk.ResponseType<code>#CANCEL</code>  if he pressed cancel. It can also return
 * {@link org.gtk.gtk.ResponseType<code>#DELETE_EVENT</code>  if the window was unexpectedly closed.
 * <p>
 * <h2>Differences from</h2><code>GtkFileChooserDialog</code>
 * <p>
 * There are a few things in the {@link [iface@Gtk.FileChooser] (ref=iface)} interface that
 * are not possible to use with <code>GtkFileChooserNative</code>, as such use would
 * prohibit the use of a native dialog.
 * <p>
 * No operations that change the dialog work while the dialog is visible.
 * Set all the properties that are required before showing the dialog.
 * <p>
 * <h2>Win32 details</h2>
 * <p>
 * On windows the <code>IFileDialog</code> implementation (added in Windows Vista) is
 * used. It supports many of the features that <code>GtkFileChooser</code> has, but
 * there are some things it does not handle:
 * <p>
 * * Any {@link org.gtk.gtk.FileFilter} added using a mimetype
 * <p>
 * If any of these features are used the regular <code>GtkFileChooserDialog</code>
 * will be used in place of the native one.
 * <p>
 * <h2>Portal details</h2>
 * <p>
 * When the <code>org.freedesktop.portal.FileChooser</code> portal is available on
 * the session bus, it is used to bring up an out-of-process file chooser.
 * Depending on the kind of session the application is running in, this may
 * or may not be a GTK file chooser.
 * <p>
 * <h2>macOS details</h2>
 * <p>
 * On macOS the <code>NSSavePanel</code> and <code>NSOpenPanel</code> classes are used to provide
 * native file chooser dialogs. Some features provided by <code>GtkFileChooser</code>
 * are not supported:
 * 
 * * Shortcut folders.
 */
public class FileChooserNative extends NativeDialog implements FileChooser {

    public FileChooserNative(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to FileChooserNative */
    public static FileChooserNative castFrom(org.gtk.gobject.Object gobject) {
        return new FileChooserNative(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String title, Window parent, FileChooserAction action, java.lang.String acceptLabel, java.lang.String cancelLabel) {
        Reference RESULT = References.get(gtk_h.gtk_file_chooser_native_new(Interop.allocateNativeString(title).handle(), parent.handle(), action.getValue(), Interop.allocateNativeString(acceptLabel).handle(), Interop.allocateNativeString(cancelLabel).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkFileChooserNative</code>.
     */
    public FileChooserNative(java.lang.String title, Window parent, FileChooserAction action, java.lang.String acceptLabel, java.lang.String cancelLabel) {
        super(constructNew(title, parent, action, acceptLabel, cancelLabel));
    }
    
    /**
     * Retrieves the custom label text for the accept button.
     */
    public java.lang.String getAcceptLabel() {
        var RESULT = gtk_h.gtk_file_chooser_native_get_accept_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the custom label text for the cancel button.
     */
    public java.lang.String getCancelLabel() {
        var RESULT = gtk_h.gtk_file_chooser_native_get_cancel_label(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the custom label text for the accept button.
     * 
     * If characters in @label are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use &<code>#8220</code> __&<code>#8221</code>  (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * 
     * Pressing Alt and that key should activate the button.
     */
    public void setAcceptLabel(java.lang.String acceptLabel) {
        gtk_h.gtk_file_chooser_native_set_accept_label(handle(), Interop.allocateNativeString(acceptLabel).handle());
    }
    
    /**
     * Sets the custom label text for the cancel button.
     * 
     * If characters in @label are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use &<code>#8220</code> __&<code>#8221</code>  (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * 
     * Pressing Alt and that key should activate the button.
     */
    public void setCancelLabel(java.lang.String cancelLabel) {
        gtk_h.gtk_file_chooser_native_set_cancel_label(handle(), Interop.allocateNativeString(cancelLabel).handle());
    }
    
}
