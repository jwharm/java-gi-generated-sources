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
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppChooserDialog(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AppChooserDialog if its GType is a (or inherits from) "GtkAppChooserDialog".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AppChooserDialog} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAppChooserDialog", a ClassCastException will be thrown.
     */
    public static AppChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AppChooserDialog.getType())) {
            return new AppChooserDialog(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAppChooserDialog");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gio.File file) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        Addressable RESULT;
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
    public AppChooserDialog(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gio.File file) {
        super(constructNew(parent, flags, file), Ownership.NONE);
    }
    
    private static Addressable constructNewForContentType(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_new_for_content_type.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    Interop.allocateNativeString(contentType));
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
    public static AppChooserDialog newForContentType(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull java.lang.String contentType) {
        return new AppChooserDialog(constructNewForContentType(parent, flags, contentType), Ownership.NONE);
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
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns the {@code GtkAppChooserWidget} of this dialog.
     * @return the {@code GtkAppChooserWidget} of {@code self}
     */
    public @NotNull org.gtk.gtk.Widget getWidget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_get_widget.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the text to display at the top of the dialog.
     * <p>
     * If the heading is not set, the dialog displays a default text.
     * @param heading a string containing Pango markup
     */
    public void setHeading(@NotNull java.lang.String heading) {
        java.util.Objects.requireNonNull(heading, "Parameter 'heading' must not be null");
        try {
            DowncallHandles.gtk_app_chooser_dialog_set_heading.invokeExact(
                    handle(),
                    Interop.allocateNativeString(heading));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_app_chooser_dialog_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Dialog.Build {
        
         /**
         * A {@link AppChooserDialog.Build} object constructs a {@link AppChooserDialog} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AppChooserDialog} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppChooserDialog} using {@link AppChooserDialog#castFrom}.
         * @return A new instance of {@code AppChooserDialog} with the properties 
         *         that were set in the Build object.
         */
        public AppChooserDialog construct() {
            return AppChooserDialog.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AppChooserDialog.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
        public Build setGfile(org.gtk.gio.File gfile) {
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
        public Build setHeading(java.lang.String heading) {
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
