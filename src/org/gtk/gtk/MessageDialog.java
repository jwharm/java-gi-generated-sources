package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkMessageDialog</code> presents a dialog with some message text.
 * <p>
 * !{@link [An example GtkMessageDialog]}(messagedialog.png)
 * <p>
 * It&#8217;s simply a convenience widget; you could construct the equivalent of<code>GtkMessageDialog</code> from <code>GtkDialog</code> without too much effort, but<code>GtkMessageDialog</code> saves typing.
 * <p>
 * The easiest way to do a modal message dialog is to use the <code>GTK_DIALOG_MODAL
 * flag,</code> which will call {@link org.gtk.gtk.Window#setModal} internally. The dialog will
 * prevent interaction with the parent window until it&#39;s hidden or destroyed.
 * You can use the {@link [signal@Gtk.Dialog::response] (ref=signal)} signal to know when the user
 * dismissed the dialog.
 * <p>
 * An example for using a modal dialog:<pre>c
 * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT | GTK_DIALOG_MODAL;
 * dialog = gtk_message_dialog_new (parent_window,
 *                                  flags,
 *                                  GTK_MESSAGE_ERROR,
 *                                  GTK_BUTTONS_CLOSE,
 *                                  &#34;Error reading &#8220;<code>s&#8221;:</code> <code>s&#34;,
 * </code>                                 filename,
 *                                  g_strerror (errno));
 * // Destroy the dialog when the user responds to it
 * // (e.g. clicks a button)
 * <p>
 * g_signal_connect (dialog, &#34;response&#34;,
 *                   G_CALLBACK (gtk_window_destroy),
 *                   NULL);
 * </pre>
 * <p>
 * You might do a non-modal <code>GtkMessageDialog</code> simply by omitting the
 * {@link org.gtk.gtk.DialogFlags#MODAL} flag:
 * <p><pre>c
 * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
 * dialog = gtk_message_dialog_new (parent_window,
 *                                  flags,
 *                                  GTK_MESSAGE_ERROR,
 *                                  GTK_BUTTONS_CLOSE,
 *                                  &#34;Error reading &#8220;<code>s&#8221;:</code> <code>s&#34;,
 * </code>                                 filename,
 *                                  g_strerror (errno));
 * <p>
 * // Destroy the dialog when the user responds to it
 * // (e.g. clicks a button)
 * g_signal_connect (dialog, &#34;response&#34;,
 *                   G_CALLBACK (gtk_window_destroy),
 *                   NULL);
 * </pre>
 * <p>
 * <h1>tkMessageDialog as GtkBuildable</h1>
 * <p>
 * The <code>GtkMessageDialog</code> implementation of the <code>GtkBuildable</code> interface exposes
 * the message area as an internal child with the name &#8220;message_area&#8221;.
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
     * 
     * This is the box where the dialog&#8217;s primary and secondary labels
     * are packed. You can add your own extra content to that box and it
     * will appear below those labels. See {@link org.gtk.gtk.Dialog#getContentArea}
     * for the corresponding function in the parent {@link org.gtk.gtk.Dialog}.
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
