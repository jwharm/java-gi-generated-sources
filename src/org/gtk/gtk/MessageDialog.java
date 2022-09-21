package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkMessageDialog} presents a dialog with some message text.
 * <p>
 * <img src="./doc-files/messagedialog.png" alt="An example GtkMessageDialog">
 * <p>
 * It’s simply a convenience widget; you could construct the equivalent of
 * {@code GtkMessageDialog} from {@code GtkDialog} without too much effort, but
 * {@code GtkMessageDialog} saves typing.
 * <p>
 * The easiest way to do a modal message dialog is to use the {@link DialogFlags#MODAL}
 * flag, which will call {@link Window#setModal} internally. The dialog will
 * prevent interaction with the parent window until it's hidden or destroyed.
 * You can use the {@code Gtk.Dialog::response} signal to know when the user
 * dismissed the dialog.
 * <p>
 * An example for using a modal dialog:
 * <pre>{@code c
 * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT | GTK_DIALOG_MODAL;
 * dialog = gtk_message_dialog_new (parent_window,
 *                                  flags,
 *                                  GTK_MESSAGE_ERROR,
 *                                  GTK_BUTTONS_CLOSE,
 *                                  "Error reading “%s”: %s",
 *                                  filename,
 *                                  g_strerror (errno));
 * // Destroy the dialog when the user responds to it
 * // (e.g. clicks a button)
 * 
 * g_signal_connect (dialog, "response",
 *                   G_CALLBACK (gtk_window_destroy),
 *                   NULL);
 * }</pre>
 * <p>
 * You might do a non-modal {@code GtkMessageDialog} simply by omitting the
 * {@link DialogFlags#MODAL} flag:
 * <p>
 * <pre>{@code c
 * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 * dialog = gtk_message_dialog_new (parent_window,
 *                                  flags,
 *                                  GTK_MESSAGE_ERROR,
 *                                  GTK_BUTTONS_CLOSE,
 *                                  "Error reading “%s”: %s",
 *                                  filename,
 *                                  g_strerror (errno));
 * 
 * // Destroy the dialog when the user responds to it
 * // (e.g. clicks a button)
 * g_signal_connect (dialog, "response",
 *                   G_CALLBACK (gtk_window_destroy),
 *                   NULL);
 * }</pre>
 * <p>
 * <h1>GtkMessageDialog as GtkBuildable</h1>
 * <p>
 * The {@code GtkMessageDialog} implementation of the {@code GtkBuildable} interface exposes
 * the message area as an internal child with the name “message_area”.
 */
public class MessageDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public MessageDialog(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to MessageDialog */
    public static MessageDialog castFrom(org.gtk.gobject.Object gobject) {
        return new MessageDialog(gobject.getReference());
    }
    
    /**
     * Returns the message area of the dialog.
     * <p>
     * This is the box where the dialog’s primary and secondary labels
     * are packed. You can add your own extra content to that box and it
     * will appear below those labels. See {@link Dialog#getContentArea}
     * for the corresponding function in the parent {@link Dialog}.
     */
    public Widget getMessageArea() {
        var RESULT = gtk_h.gtk_message_dialog_get_message_area(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Sets the text of the message dialog.
     */
    public void setMarkup(java.lang.String str) {
        gtk_h.gtk_message_dialog_set_markup(handle(), Interop.allocateNativeString(str).handle());
    }
    
}
