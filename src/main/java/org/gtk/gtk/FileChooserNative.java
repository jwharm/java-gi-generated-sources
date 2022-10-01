package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkFileChooserNative} is an abstraction of a dialog suitable
 * for use with “File Open” or “File Save as” commands.
 * <p>
 * By default, this just uses a {@code GtkFileChooserDialog} to implement
 * the actual dialog. However, on some platforms, such as Windows and
 * macOS, the native platform file chooser is used instead. When the
 * application is running in a sandboxed environment without direct
 * filesystem access (such as Flatpak), {@code GtkFileChooserNative} may call
 * the proper APIs (portals) to let the user choose a file and make it
 * available to the application.
 * <p>
 * While the API of {@code GtkFileChooserNative} closely mirrors {@code GtkFileChooserDialog},
 * the main difference is that there is no access to any {@code GtkWindow} or {@code GtkWidget}
 * for the dialog. This is required, as there may not be one in the case of a
 * platform native dialog.
 * <p>
 * Showing, hiding and running the dialog is handled by the
 * {@link NativeDialog} functions.
 * <p>
 * Note that unlike {@code GtkFileChooserDialog}, {@code GtkFileChooserNative} objects
 * are not toplevel widgets, and GTK does not keep them alive. It is your
 * responsibility to keep a reference until you are done with the
 * object.
 * <p>
 * <h2>Typical usage</h2>
 * <p>
 * In the simplest of cases, you can the following code to use
 * {@code GtkFileChooserNative} to select a file for opening:
 * <p>
 * <pre>{@code c
 * static void
 * on_response (GtkNativeDialog *native,
 *              int              response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 *       GFile *file = gtk_file_chooser_get_file (chooser);
 * 
 *       open_file (file);
 * 
 *       g_object_unref (file);
 *     }
 * 
 *   g_object_unref (native);
 * }
 * 
 *   // ...
 *   GtkFileChooserNative *native;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_OPEN;
 * 
 *   native = gtk_file_chooser_native_new ("Open File",
 *                                         parent_window,
 *                                         action,
 *                                         "_Open",
 *                                         "_Cancel");
 * 
 *   g_signal_connect (native, "response", G_CALLBACK (on_response), NULL);
 *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * }</pre>
 * <p>
 * To use a {@code GtkFileChooserNative} for saving, you can use this:
 * <p>
 * <pre>{@code c
 * static void
 * on_response (GtkNativeDialog *native,
 *              int              response)
 * {
 *   if (response == GTK_RESPONSE_ACCEPT)
 *     {
 *       GtkFileChooser *chooser = GTK_FILE_CHOOSER (native);
 *       GFile *file = gtk_file_chooser_get_file (chooser);
 * 
 *       save_to_file (file);
 * 
 *       g_object_unref (file);
 *     }
 * 
 *   g_object_unref (native);
 * }
 * 
 *   // ...
 *   GtkFileChooserNative *native;
 *   GtkFileChooser *chooser;
 *   GtkFileChooserAction action = GTK_FILE_CHOOSER_ACTION_SAVE;
 * 
 *   native = gtk_file_chooser_native_new ("Save File",
 *                                         parent_window,
 *                                         action,
 *                                         "_Save",
 *                                         "_Cancel");
 *   chooser = GTK_FILE_CHOOSER (native);
 * 
 *   if (user_edited_a_new_document)
 *     gtk_file_chooser_set_current_name (chooser, _("Untitled document"));
 *   else
 *     gtk_file_chooser_set_file (chooser, existing_file, NULL);
 * 
 *   g_signal_connect (native, "response", G_CALLBACK (on_response), NULL);
 *   gtk_native_dialog_show (GTK_NATIVE_DIALOG (native));
 * }</pre>
 * <p>
 * For more information on how to best set up a file dialog,
 * see the {@link FileChooserDialog} documentation.
 * <p>
 * <h2>Response Codes</h2>
 * <p>
 * {@code GtkFileChooserNative} inherits from {@link NativeDialog},
 * which means it will return {@link ResponseType#ACCEPT} if the user accepted,
 * and {@link ResponseType#CANCEL} if he pressed cancel. It can also return
 * {@link ResponseType#DELETE_EVENT} if the window was unexpectedly closed.
 * <p>
 * <h2>Differences from `GtkFileChooserDialog`</h2>
 * <p>
 * There are a few things in the {@code Gtk.FileChooser} interface that
 * are not possible to use with {@code GtkFileChooserNative}, as such use would
 * prohibit the use of a native dialog.
 * <p>
 * No operations that change the dialog work while the dialog is visible.
 * Set all the properties that are required before showing the dialog.
 * <p>
 * <h2>Win32 details</h2>
 * <p>
 * On windows the {@code IFileDialog} implementation (added in Windows Vista) is
 * used. It supports many of the features that {@code GtkFileChooser} has, but
 * there are some things it does not handle:
 * <p>
 * * Any {@link FileFilter} added using a mimetype
 * <p>
 * If any of these features are used the regular {@code GtkFileChooserDialog}
 * will be used in place of the native one.
 * <p>
 * <h2>Portal details</h2>
 * <p>
 * When the {@code org.freedesktop.portal.FileChooser} portal is available on
 * the session bus, it is used to bring up an out-of-process file chooser.
 * Depending on the kind of session the application is running in, this may
 * or may not be a GTK file chooser.
 * <p>
 * <h2>macOS details</h2>
 * <p>
 * On macOS the {@code NSSavePanel} and {@code NSOpenPanel} classes are used to provide
 * native file chooser dialogs. Some features provided by {@code GtkFileChooser}
 * are not supported:
 * <p>
 * * Shortcut folders.
 */
public class FileChooserNative extends NativeDialog implements FileChooser {

    public FileChooserNative(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to FileChooserNative */
    public static FileChooserNative castFrom(org.gtk.gobject.Object gobject) {
        return new FileChooserNative(gobject.refcounted());
    }
    
    private static Refcounted constructNew(java.lang.String title, Window parent, FileChooserAction action, java.lang.String acceptLabel, java.lang.String cancelLabel) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_file_chooser_native_new(Interop.allocateNativeString(title).handle(), parent.handle(), action.getValue(), Interop.allocateNativeString(acceptLabel).handle(), Interop.allocateNativeString(cancelLabel).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkFileChooserNative}.
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
     * <p>
     * If characters in {@code label} are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use “__” (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * <p>
     * Pressing Alt and that key should activate the button.
     */
    public void setAcceptLabel(java.lang.String acceptLabel) {
        gtk_h.gtk_file_chooser_native_set_accept_label(handle(), Interop.allocateNativeString(acceptLabel).handle());
    }
    
    /**
     * Sets the custom label text for the cancel button.
     * <p>
     * If characters in {@code label} are preceded by an underscore, they are
     * underlined. If you need a literal underscore character in a label,
     * use “__” (two underscores). The first underlined character represents
     * a keyboard accelerator called a mnemonic.
     * <p>
     * Pressing Alt and that key should activate the button.
     */
    public void setCancelLabel(java.lang.String cancelLabel) {
        gtk_h.gtk_file_chooser_native_set_cancel_label(handle(), Interop.allocateNativeString(cancelLabel).handle());
    }
    
}
