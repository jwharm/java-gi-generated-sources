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
    
    private static final java.lang.String C_TYPE_NAME = "GtkMessageDialog";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Dialog.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a MessageDialog proxy instance for the provided memory address.
     * <p>
     * Because MessageDialog is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MessageDialog(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MessageDialog> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MessageDialog(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, org.gtk.gtk.MessageType type, org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_message_dialog_new.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    type.getValue(),
                    buttons.getValue(),
                    (Addressable) (messageFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(messageFormat, null)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param varargs arguments for {@code message_format}
     */
    public MessageDialog(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, org.gtk.gtk.MessageType type, org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat, java.lang.Object... varargs) {
        super(constructNew(parent, flags, type, buttons, messageFormat, varargs), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewWithMarkup(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, org.gtk.gtk.MessageType type, org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_message_dialog_new_with_markup.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    type.getValue(),
                    buttons.getValue(),
                    (Addressable) (messageFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(messageFormat, null)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param varargs arguments for {@code message_format}
     * @return a new {@code GtkMessageDialog}
     */
    public static MessageDialog newWithMarkup(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, org.gtk.gtk.MessageType type, org.gtk.gtk.ButtonsType buttons, @Nullable java.lang.String messageFormat, java.lang.Object... varargs) {
        var RESULT = constructNewWithMarkup(parent, flags, type, buttons, messageFormat, varargs);
        return (org.gtk.gtk.MessageDialog) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.MessageDialog.fromAddress).marshal(RESULT, Ownership.NONE);
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
     * @param varargs arguments for {@code message_format}
     */
    public void formatSecondaryMarkup(java.lang.String messageFormat, java.lang.Object... varargs) {
        try {
            DowncallHandles.gtk_message_dialog_format_secondary_markup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(messageFormat, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the secondary text of the message dialog.
     * @param messageFormat printf()-style format string
     * @param varargs arguments for {@code message_format}
     */
    public void formatSecondaryText(@Nullable java.lang.String messageFormat, java.lang.Object... varargs) {
        try {
            DowncallHandles.gtk_message_dialog_format_secondary_text.invokeExact(
                    handle(),
                    (Addressable) (messageFormat == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(messageFormat, null)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public org.gtk.gtk.Widget getMessageArea() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_message_dialog_get_message_area.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the text of the message dialog.
     * @param str string with Pango markup
     */
    public void setMarkup(java.lang.String str) {
        try {
            DowncallHandles.gtk_message_dialog_set_markup.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(str, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_message_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link MessageDialog.Builder} object constructs a {@link MessageDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link MessageDialog.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Dialog.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link MessageDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link MessageDialog}.
         * @return A new instance of {@code MessageDialog} with the properties 
         *         that were set in the Builder object.
         */
        public MessageDialog build() {
            return (MessageDialog) org.gtk.gobject.GObject.newWithProperties(
                MessageDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setButtons(org.gtk.gtk.ButtonsType buttons) {
            names.add("buttons");
            values.add(org.gtk.gobject.Value.create(buttons));
            return this;
        }
        
        /**
         * The {@code GtkBox} that corresponds to the message area of this dialog.
         * <p>
         * See {@link MessageDialog#getMessageArea} for a detailed
         * description of this area.
         * @param messageArea The value for the {@code message-area} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMessageArea(org.gtk.gtk.Widget messageArea) {
            names.add("message-area");
            values.add(org.gtk.gobject.Value.create(messageArea));
            return this;
        }
        
        /**
         * The type of the message.
         * @param messageType The value for the {@code message-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMessageType(org.gtk.gtk.MessageType messageType) {
            names.add("message-type");
            values.add(org.gtk.gobject.Value.create(messageType));
            return this;
        }
        
        /**
         * The secondary text of the message dialog.
         * @param secondaryText The value for the {@code secondary-text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSecondaryText(java.lang.String secondaryText) {
            names.add("secondary-text");
            values.add(org.gtk.gobject.Value.create(secondaryText));
            return this;
        }
        
        /**
         * {@code true} if the secondary text of the dialog includes Pango markup.
         * <p>
         * See {@link org.pango.Pango#parseMarkup}.
         * @param secondaryUseMarkup The value for the {@code secondary-use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSecondaryUseMarkup(boolean secondaryUseMarkup) {
            names.add("secondary-use-markup");
            values.add(org.gtk.gobject.Value.create(secondaryUseMarkup));
            return this;
        }
        
        /**
         * The primary text of the message dialog.
         * <p>
         * If the dialog has a secondary text, this will appear as the title.
         * @param text The value for the {@code text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
        
        /**
         * {@code true} if the primary text of the dialog includes Pango markup.
         * <p>
         * See {@link org.pango.Pango#parseMarkup}.
         * @param useMarkup The value for the {@code use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseMarkup(boolean useMarkup) {
            names.add("use-markup");
            values.add(org.gtk.gobject.Value.create(useMarkup));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_message_dialog_new = Interop.downcallHandle(
            "gtk_message_dialog_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_message_dialog_new_with_markup = Interop.downcallHandle(
            "gtk_message_dialog_new_with_markup",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_message_dialog_format_secondary_markup = Interop.downcallHandle(
            "gtk_message_dialog_format_secondary_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_message_dialog_format_secondary_text = Interop.downcallHandle(
            "gtk_message_dialog_format_secondary_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_message_dialog_get_message_area = Interop.downcallHandle(
            "gtk_message_dialog_get_message_area",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_message_dialog_set_markup = Interop.downcallHandle(
            "gtk_message_dialog_set_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_message_dialog_get_type = Interop.downcallHandle(
            "gtk_message_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
