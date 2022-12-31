package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAppChooserDialog} shows a {@code GtkAppChooserWidget} inside a {@code GtkDialog}.
 * <p>
 * <img src="./doc-files/appchooserdialog.png" alt="An example GtkAppChooserDialog">
 * <p>
 * Note that {@code GtkAppChooserDialog} does not have any interesting methods
 * of its own. Instead, you should get the embedded {@code GtkAppChooserWidget}
 * using {@link AppChooserDialog#getWidget} and call its methods if
 * the generic {@code Gtk.AppChooser} interface is not sufficient for
 * your needs.
 * <p>
 * To set the heading that is shown above the {@code GtkAppChooserWidget},
 * use {@link AppChooserDialog#setHeading}.
 */
public class AppChooserDialog extends org.gtk.gtk.Dialog implements org.gtk.gtk.Accessible, org.gtk.gtk.AppChooser, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Native, org.gtk.gtk.Root, org.gtk.gtk.ShortcutManager {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAppChooserDialog";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a AppChooserDialog proxy instance for the provided memory address.
     * <p>
     * Because AppChooserDialog is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppChooserDialog(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, AppChooserDialog> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppChooserDialog(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, org.gtk.gio.File file) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_new.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    file.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAppChooserDialog} for the provided {@code GFile}.
     * <p>
     * The dialog will show applications that can open the file.
     * @param parent a {@code GtkWindow}
     * @param flags flags for this dialog
     * @param file a {@code GFile}
     */
    public AppChooserDialog(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, org.gtk.gio.File file) {
        super(constructNew(parent, flags, file), Ownership.NONE);
    }
    
    private static MemoryAddress constructNewForContentType(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, java.lang.String contentType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_new_for_content_type.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    Marshal.stringToAddress.marshal(contentType, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkAppChooserDialog} for the provided content type.
     * <p>
     * The dialog will show applications that can open the content type.
     * @param parent a {@code GtkWindow}
     * @param flags flags for this dialog
     * @param contentType a content type string
     * @return a newly created {@code GtkAppChooserDialog}
     */
    public static AppChooserDialog newForContentType(@Nullable org.gtk.gtk.Window parent, org.gtk.gtk.DialogFlags flags, java.lang.String contentType) {
        var RESULT = constructNewForContentType(parent, flags, contentType);
        return (org.gtk.gtk.AppChooserDialog) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.AppChooserDialog.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the text to display at the top of the dialog.
     * @return the text to display at the top of the dialog,
     *   or {@code null}, in which case a default text is displayed
     */
    public @Nullable java.lang.String getHeading() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_get_heading.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Returns the {@code GtkAppChooserWidget} of this dialog.
     * @return the {@code GtkAppChooserWidget} of {@code self}
     */
    public org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_get_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * <p>
     * If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
     */
    public void setHeading(java.lang.String heading) {
        try {
            DowncallHandles.gtk_app_chooser_dialog_set_heading.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(heading, null));
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
            RESULT = (long) DowncallHandles.gtk_app_chooser_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AppChooserDialog.Builder} object constructs a {@link AppChooserDialog} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppChooserDialog.Builder#build()}. 
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
         * Finish building the {@link AppChooserDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppChooserDialog}.
         * @return A new instance of {@code AppChooserDialog} with the properties 
         *         that were set in the Builder object.
         */
        public AppChooserDialog build() {
            return (AppChooserDialog) org.gtk.gobject.GObject.newWithProperties(
                AppChooserDialog.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The GFile used by the {@code GtkAppChooserDialog}.
         * <p>
         * The dialog's {@code GtkAppChooserWidget} content type will
         * be guessed from the file, if present.
         * @param gfile The value for the {@code gfile} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGfile(org.gtk.gio.File gfile) {
            names.add("gfile");
            values.add(org.gtk.gobject.Value.create(gfile));
            return this;
        }
        
        /**
         * The text to show at the top of the dialog.
         * <p>
         * The string may contain Pango markup.
         * @param heading The value for the {@code heading} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHeading(java.lang.String heading) {
            names.add("heading");
            values.add(org.gtk.gobject.Value.create(heading));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_app_chooser_dialog_new = Interop.downcallHandle(
            "gtk_app_chooser_dialog_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_new_for_content_type = Interop.downcallHandle(
            "gtk_app_chooser_dialog_new_for_content_type",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_get_heading = Interop.downcallHandle(
            "gtk_app_chooser_dialog_get_heading",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_get_widget = Interop.downcallHandle(
            "gtk_app_chooser_dialog_get_widget",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_set_heading = Interop.downcallHandle(
            "gtk_app_chooser_dialog_set_heading",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_get_type = Interop.downcallHandle(
            "gtk_app_chooser_dialog_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
