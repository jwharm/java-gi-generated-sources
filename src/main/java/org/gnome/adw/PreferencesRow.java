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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.ListBoxRow.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a PreferencesRow proxy instance for the provided memory address.
     * <p>
     * Because PreferencesRow is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PreferencesRow(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, PreferencesRow> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PreferencesRow(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesRow}.
     */
    public PreferencesRow() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the title of the preference represented by {@code self}.
     * @return the title
     */
    public java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_row_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the title of the preference represented by {@code self}.
     * <p>
     * The title is interpreted as Pango markup unless
     * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
     * @param title the title
     */
    public void setTitle(java.lang.String title) {
        try {
            DowncallHandles.adw_preferences_row_set_title.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(title, null));
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
                    Marshal.booleanToInteger.marshal(titleSelectable, null).intValue());
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
                    Marshal.booleanToInteger.marshal(useMarkup, null).intValue());
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
                    Marshal.booleanToInteger.marshal(useUnderline, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_preferences_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PreferencesRow.Builder} object constructs a {@link PreferencesRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PreferencesRow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ListBoxRow.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PreferencesRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PreferencesRow}.
         * @return A new instance of {@code PreferencesRow} with the properties 
         *         that were set in the Builder object.
         */
        public PreferencesRow build() {
            return (PreferencesRow) org.gtk.gobject.GObject.newWithProperties(
                PreferencesRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The title of the preference represented by this row.
         * <p>
         * The title is interpreted as Pango markup unless
         * {@code PreferencesRow:use-markup} is set to {@code FALSE}.
         * @param title The value for the {@code title} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitle(java.lang.String title) {
            names.add("title");
            values.add(org.gtk.gobject.Value.create(title));
            return this;
        }
        
        /**
         * Whether the user can copy the title from the label.
         * <p>
         * See also {@code Gtk.Label:selectable}.
         * @param titleSelectable The value for the {@code title-selectable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTitleSelectable(boolean titleSelectable) {
            names.add("title-selectable");
            values.add(org.gtk.gobject.Value.create(titleSelectable));
            return this;
        }
        
        /**
         * Whether to use Pango markup for the title label.
         * <p>
         * Subclasses may also use it for other labels, such as subtitle.
         * <p>
         * See also {@link org.pango.Pango#parseMarkup}.
         * @param useMarkup The value for the {@code use-markup} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseMarkup(boolean useMarkup) {
            names.add("use-markup");
            values.add(org.gtk.gobject.Value.create(useMarkup));
            return this;
        }
        
        /**
         * Whether an embedded underline in the title indicates a mnemonic.
         * @param useUnderline The value for the {@code use-underline} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUseUnderline(boolean useUnderline) {
            names.add("use-underline");
            values.add(org.gtk.gobject.Value.create(useUnderline));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_row_new = Interop.downcallHandle(
            "adw_preferences_row_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_row_get_title = Interop.downcallHandle(
            "adw_preferences_row_get_title",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_row_get_title_selectable = Interop.downcallHandle(
            "adw_preferences_row_get_title_selectable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_row_get_use_markup = Interop.downcallHandle(
            "adw_preferences_row_get_use_markup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_row_get_use_underline = Interop.downcallHandle(
            "adw_preferences_row_get_use_underline",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_row_set_title = Interop.downcallHandle(
            "adw_preferences_row_set_title",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_preferences_row_set_title_selectable = Interop.downcallHandle(
            "adw_preferences_row_set_title_selectable",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_preferences_row_set_use_markup = Interop.downcallHandle(
            "adw_preferences_row_set_use_markup",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_preferences_row_set_use_underline = Interop.downcallHandle(
            "adw_preferences_row_set_use_underline",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_preferences_row_get_type = Interop.downcallHandle(
            "adw_preferences_row_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
