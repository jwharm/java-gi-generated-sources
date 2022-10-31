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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public AppChooserDialog(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to AppChooserDialog if its GType is a (or inherits from) "GtkAppChooserDialog".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AppChooserDialog" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkAppChooserDialog", a ClassCastException will be thrown.
     */
    public static AppChooserDialog castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkAppChooserDialog"))) {
            return new AppChooserDialog(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkAppChooserDialog");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull org.gtk.gio.File file) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(file, "Parameter 'file' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_new.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    file.handle()), false);
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
        super(constructNew(parent, flags, file));
    }
    
    private static Refcounted constructNewForContentType(@Nullable org.gtk.gtk.Window parent, @NotNull org.gtk.gtk.DialogFlags flags, @NotNull java.lang.String contentType) {
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(contentType, "Parameter 'contentType' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_app_chooser_dialog_new_for_content_type.invokeExact(
                    (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()),
                    flags.getValue(),
                    Interop.allocateNativeString(contentType)), false);
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
        return new AppChooserDialog(constructNewForContentType(parent, flags, contentType));
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
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_app_chooser_dialog_new = Interop.downcallHandle(
            "gtk_app_chooser_dialog_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_new_for_content_type = Interop.downcallHandle(
            "gtk_app_chooser_dialog_new_for_content_type",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_get_heading = Interop.downcallHandle(
            "gtk_app_chooser_dialog_get_heading",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_get_widget = Interop.downcallHandle(
            "gtk_app_chooser_dialog_get_widget",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_app_chooser_dialog_set_heading = Interop.downcallHandle(
            "gtk_app_chooser_dialog_set_heading",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
