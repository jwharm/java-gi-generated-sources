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
 * <strong>GtkMessageDialog as GtkBuildable</strong><br/>
 * The {@code GtkMessageDialog} implementation of the {@code GtkBuildable} interface exposes
 * the message area as an internal child with the name “message_area”.
 */
public class MessageDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Dialog.getMemoryLayout().withName("parent_instance")
    ).withName("GtkMessageDialog");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public MessageDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to MessageDialog */
    public static MessageDialog castFrom(org.gtk.gobject.Object gobject) {
        return new MessageDialog(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gtk.MessageType type, @NotNull org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new message dialog.
     * <p>
     * This is a simple dialog with some text the user may want to see.
     * When the user clicks a button a “response” signal is emitted with
     * response IDs from {@code Gtk.ResponseType]. See [class@Gtk.Dialog}
     * for more details.
     * @param parent transient parent
     * @param flags flags
     * @param type type of message
     * @param buttons set of buttons to use
     * @param messageFormat printf()-style format string
     */
    public MessageDialog(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gtk.MessageType type, @NotNull org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat) {
        this(Refcounted.get(null)); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static Refcounted constructNewWithMarkup(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gtk.MessageType type, @NotNull org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new message dialog.
     * <p>
     * This is a simple dialog with some text that is marked up with
     * Pango markup. When the user clicks a button a “response” signal
     * is emitted with response IDs from {@code Gtk.ResponseType}. See
     * {@link Dialog} for more details.
     * <p>
     * Special XML characters in the printf() arguments passed to this
     * function will automatically be escaped as necessary.
     * (See g_markup_printf_escaped() for how this is implemented.)
     * Usually this is what you want, but if you have an existing
     * Pango markup string that you want to use literally as the
     * label, then you need to use {@link MessageDialog#setMarkup}
     * instead, since you can’t pass the markup string either
     * as the format (it might contain “%” characters) or as a string
     * argument.
     * <pre>{@code c
     * GtkWidget *dialog;
     * GtkDialogFlags flags = GTK_DIALOG_DESTROY_WITH_PARENT;
     * dialog = gtk_message_dialog_new (parent_window,
     *                                  flags,
     *                                  GTK_MESSAGE_ERROR,
     *                                  GTK_BUTTONS_CLOSE,
     *                                  NULL);
     * gtk_message_dialog_set_markup (GTK_MESSAGE_DIALOG (dialog),
     *                                markup);
     * }</pre>
     * @param parent transient parent
     * @param flags flags
     * @param type type of message
     * @param buttons set of buttons to use
     * @param messageFormat printf()-style format string
     * @return a new {@code GtkMessageDialog}
     */
    public static MessageDialog newWithMarkup(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gtk.MessageType type, @NotNull org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets the secondary text of the message dialog.
     * <p>
     * The {@code message_format} is assumed to contain Pango markup.
     * <p>
     * Due to an oversight, this function does not escape special
     * XML characters like {@link MessageDialog#newWithMarkup}
     * does. Thus, if the arguments may contain special XML characters,
     * you should use g_markup_printf_escaped() to escape it.
     * <pre>{@code c
     * char *msg;
     * 
     * msg = g_markup_printf_escaped (message_format, ...);
     * gtk_message_dialog_format_secondary_markup (message_dialog,
     *                                             "%s", msg);
     * g_free (msg);
     * }</pre>
     * @param messageFormat printf()-style string with Pango markup
     */
    public void formatSecondaryMarkup(@NotNull java.lang.String messageFormat) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Sets the secondary text of the message dialog.
     * @param messageFormat printf()-style format string
     */
    public void formatSecondaryText(@Nullable java.lang.String messageFormat) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns the message area of the dialog.
     * <p>
     * This is the box where the dialog’s primary and secondary labels
     * are packed. You can add your own extra content to that box and it
     * will appear below those labels. See {@link Dialog#getContentArea}
     * for the corresponding function in the parent {@link Dialog}.
     * @return A {@code GtkBox} corresponding to the
     *   “message area” in the {@code message_dialog}
     */
    public @NotNull org.gtk.gtk.Widget getMessageArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_message_dialog_get_message_area.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the text of the message dialog.
     * @param str string with Pango markup
     */
    public void setMarkup(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        try {
            DowncallHandles.gtk_message_dialog_set_markup.invokeExact(handle(), Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_message_dialog_new = Interop.downcallHandle(
            "gtk_message_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_message_dialog_new_with_markup = Interop.downcallHandle(
            "gtk_message_dialog_new_with_markup",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_message_dialog_format_secondary_markup = Interop.downcallHandle(
            "gtk_message_dialog_format_secondary_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_message_dialog_format_secondary_text = Interop.downcallHandle(
            "gtk_message_dialog_format_secondary_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_message_dialog_get_message_area = Interop.downcallHandle(
            "gtk_message_dialog_get_message_area",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_message_dialog_set_markup = Interop.downcallHandle(
            "gtk_message_dialog_set_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
