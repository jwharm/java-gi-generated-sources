package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
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
 * 
 * <h1>GtkMessageDialog as GtkBuildable</h1>
 * The {@code GtkMessageDialog} implementation of the {@code GtkBuildable} interface exposes
 * the message area as an internal child with the name “message_area”.
 */
public class MessageDialog extends Dialog implements Accessible, Buildable, ConstraintTarget, Native, Root, ShortcutManager {

    public MessageDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MessageDialog */
    public static MessageDialog castFrom(org.gtk.gobject.Object gobject) {
        return new MessageDialog(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_message_dialog_get_message_area = Interop.downcallHandle(
        "gtk_message_dialog_get_message_area",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the message area of the dialog.
     * <p>
     * This is the box where the dialog’s primary and secondary labels
     * are packed. You can add your own extra content to that box and it
     * will appear below those labels. See {@link Dialog#getContentArea}
     * for the corresponding function in the parent {@link Dialog}.
     */
    public @NotNull Widget getMessageArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_message_dialog_get_message_area.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_message_dialog_set_markup = Interop.downcallHandle(
        "gtk_message_dialog_set_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text of the message dialog.
     */
    public @NotNull void setMarkup(@NotNull java.lang.String str) {
        try {
            gtk_message_dialog_set_markup.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
