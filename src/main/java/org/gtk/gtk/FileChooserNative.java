package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>Typical usage</strong><br/>
 * In the simplest of cases, you can the following code to use
 * {@code GtkFileChooserNative} to select a file for opening:
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
 * <strong>Response Codes</strong><br/>
 * {@code GtkFileChooserNative} inherits from {@link NativeDialog},
 * which means it will return {@link ResponseType#ACCEPT} if the user accepted,
 * and {@link ResponseType#CANCEL} if he pressed cancel. It can also return
 * {@link ResponseType#DELETE_EVENT} if the window was unexpectedly closed.
 * <p>
 * <strong>Differences from `GtkFileChooserDialog`</strong><br/>
 * There are a few things in the {@code Gtk.FileChooser} interface that
 * are not possible to use with {@code GtkFileChooserNative}, as such use would
 * prohibit the use of a native dialog.
 * <p>
 * No operations that change the dialog work while the dialog is visible.
 * Set all the properties that are required before showing the dialog.
 * <p>
 * <strong>Win32 details</strong><br/>
 * On windows the {@code IFileDialog} implementation (added in Windows Vista) is
 * used. It supports many of the features that {@code GtkFileChooser} has, but
 * there are some things it does not handle:
 * <p>
 * * Any {@link FileFilter} added using a mimetype
 * <p>
 * If any of these features are used the regular {@code GtkFileChooserDialog}
 * will be used in place of the native one.
 * <p>
 * <strong>Portal details</strong><br/>
 * When the {@code org.freedesktop.portal.FileChooser} portal is available on
 * the session bus, it is used to bring up an out-of-process file chooser.
 * Depending on the kind of session the application is running in, this may
 * or may not be a GTK file chooser.
 * <p>
 * <strong>macOS details</strong><br/>
 * On macOS the {@code NSSavePanel} and {@code NSOpenPanel} classes are used to provide
 * native file chooser dialogs. Some features provided by {@code GtkFileChooser}
 * are not supported:
 * <p>
 * * Shortcut folders.
 */
public class FileChooserNative extends org.gtk.gtk.NativeDialog implements org.gtk.gtk.FileChooser {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkFileChooserNative";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a FileChooserNative proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected FileChooserNative(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FileChooserNative> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FileChooserNative(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, org.gtk.gtk.FileChooserAction action, @Nullable java.lang.String acceptLabel, @Nullable java.lang.String cancelLabel) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_native_new.invokeExact(
                        (Addressable) (title == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(title, SCOPE)),
                        (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                        action.getValue(),
                        (Addressable) (acceptLabel == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(acceptLabel, SCOPE)),
                        (Addressable) (cancelLabel == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(cancelLabel, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GtkFileChooserNative}.
     * @param title Title of the native
     * @param parent Transient parent of the native
     * @param action Open or save mode for the dialog
     * @param acceptLabel text to go in the accept button, or {@code null} for the default
     * @param cancelLabel text to go in the cancel button, or {@code null} for the default
     */
    public FileChooserNative(@Nullable java.lang.String title, @Nullable org.gtk.gtk.Window parent, org.gtk.gtk.FileChooserAction action, @Nullable java.lang.String acceptLabel, @Nullable java.lang.String cancelLabel) {
        super(constructNew(title, parent, action, acceptLabel, cancelLabel));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the custom label text for the accept button.
     * @return The custom label
     */
    public @Nullable java.lang.String getAcceptLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_native_get_accept_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the custom label text for the cancel button.
     * @return The custom label
     */
    public @Nullable java.lang.String getCancelLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_file_chooser_native_get_cancel_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
     * @param acceptLabel custom label
     */
    public void setAcceptLabel(@Nullable java.lang.String acceptLabel) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_chooser_native_set_accept_label.invokeExact(
                        handle(),
                        (Addressable) (acceptLabel == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(acceptLabel, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
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
     * @param cancelLabel custom label
     */
    public void setCancelLabel(@Nullable java.lang.String cancelLabel) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gtk_file_chooser_native_set_cancel_label.invokeExact(
                        handle(),
                        (Addressable) (cancelLabel == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(cancelLabel, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_file_chooser_native_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link FileChooserNative.Builder} object constructs a {@link FileChooserNative} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link FileChooserNative.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.NativeDialog.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link FileChooserNative} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link FileChooserNative}.
         * @return A new instance of {@code FileChooserNative} with the properties 
         *         that were set in the Builder object.
         */
        public FileChooserNative build() {
            return (FileChooserNative) org.gtk.gobject.GObject.newWithProperties(
                FileChooserNative.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The text used for the label on the accept button in the dialog, or
         * {@code null} to use the default text.
         * @param acceptLabel The value for the {@code accept-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAcceptLabel(java.lang.String acceptLabel) {
            names.add("accept-label");
            values.add(org.gtk.gobject.Value.create(acceptLabel));
            return this;
        }
        
        /**
         * The text used for the label on the cancel button in the dialog, or
         * {@code null} to use the default text.
         * @param cancelLabel The value for the {@code cancel-label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCancelLabel(java.lang.String cancelLabel) {
            names.add("cancel-label");
            values.add(org.gtk.gobject.Value.create(cancelLabel));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_file_chooser_native_new = Interop.downcallHandle(
                "gtk_file_chooser_native_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_chooser_native_get_accept_label = Interop.downcallHandle(
                "gtk_file_chooser_native_get_accept_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_chooser_native_get_cancel_label = Interop.downcallHandle(
                "gtk_file_chooser_native_get_cancel_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_chooser_native_set_accept_label = Interop.downcallHandle(
                "gtk_file_chooser_native_set_accept_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_chooser_native_set_cancel_label = Interop.downcallHandle(
                "gtk_file_chooser_native_set_cancel_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_file_chooser_native_get_type = Interop.downcallHandle(
                "gtk_file_chooser_native_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_file_chooser_native_get_type != null;
    }
}
