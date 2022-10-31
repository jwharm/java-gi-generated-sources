package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} used to present preferences.
 * <p>
 * The {@code AdwPreferencesRow} widget has a title that {@link PreferencesWindow}
 * will use to let the user look for a preference. It doesn't present the title
 * in any way and lets you present the preference as you please.
 * <p>
 * {@link ActionRow} and its derivatives are convenient to use as preference
 * rows as they take care of presenting the preference's title while letting you
 * compose the inputs of the preference around it.
 * @version 1.0
 */
public class PreferencesRow extends org.gtk.gtk.ListBoxRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPreferencesRow";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.ListBoxRow.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.ListBoxRow parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.ListBoxRow(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public PreferencesRow(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PreferencesRow if its GType is a (or inherits from) "AdwPreferencesRow".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PreferencesRow" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPreferencesRow", a ClassCastException will be thrown.
     */
    public static PreferencesRow castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwPreferencesRow"))) {
            return new PreferencesRow(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPreferencesRow");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_preferences_row_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesRow}.
     */
    public PreferencesRow() {
        super(constructNew());
    }
    
    /**
     * Gets the title of the preference represented by {@code self}.
     * @return the title
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_row_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether the user can copy the title from the label
     * @return whether the user can copy the title from the label
     */
    public boolean getTitleSelectable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_row_get_title_selectable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether to use Pango markup for the title label.
     * @return whether to use markup
     */
    public boolean getUseMarkup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_row_get_use_markup.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     * @return whether an embedded underline in the title indicates a mnemonic
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_row_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the title of the preference represented by {@code self}.
     * <p>
     * The title is interpreted as Pango markup unless
     * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
     * @param title the title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_preferences_row_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the user can copy the title from the label
     * <p>
     * See also {@code Gtk.Label:selectable}.
     * @param titleSelectable {@code TRUE} if the user can copy the title from the label
     */
    public void setTitleSelectable(boolean titleSelectable) {
        try {
            DowncallHandles.adw_preferences_row_set_title_selectable.invokeExact(
                    handle(),
                    titleSelectable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to use Pango markup for the title label.
     * <p>
     * Subclasses may also use it for other labels, such as subtitle.
     * <p>
     * See also {@link org.pango.Pango#parseMarkup}.
     * @param useMarkup whether to use markup
     */
    public void setUseMarkup(boolean useMarkup) {
        try {
            DowncallHandles.adw_preferences_row_set_use_markup.invokeExact(
                    handle(),
                    useMarkup ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether an embedded underline in the title indicates a mnemonic.
     * @param useUnderline {@code TRUE} if underlines in the text indicate mnemonics
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.adw_preferences_row_set_use_underline.invokeExact(
                    handle(),
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_row_new = Interop.downcallHandle(
            "adw_preferences_row_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_row_get_title = Interop.downcallHandle(
            "adw_preferences_row_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_row_get_title_selectable = Interop.downcallHandle(
            "adw_preferences_row_get_title_selectable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_row_get_use_markup = Interop.downcallHandle(
            "adw_preferences_row_get_use_markup",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_row_get_use_underline = Interop.downcallHandle(
            "adw_preferences_row_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_row_set_title = Interop.downcallHandle(
            "adw_preferences_row_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_row_set_title_selectable = Interop.downcallHandle(
            "adw_preferences_row_set_title_selectable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_preferences_row_set_use_markup = Interop.downcallHandle(
            "adw_preferences_row_set_use_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_preferences_row_set_use_underline = Interop.downcallHandle(
            "adw_preferences_row_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
