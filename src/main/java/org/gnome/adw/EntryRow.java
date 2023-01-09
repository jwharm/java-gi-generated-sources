package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link org.gtk.gtk.ListBoxRow} with an embedded text entry.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="entry-row-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="entry-row.png" alt="entry-row"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwEntryRow} has a title that doubles as placeholder text. It shows an icon
 * indicating that it's editable and can receive additional widgets before or
 * after the editable part.
 * <p>
 * If {@code EntryRow:show-apply-button} is set to {@code TRUE}, {@code AdwEntryRow} can
 * show an apply button when editing its contents. This can be useful if
 * changing its contents can result in an expensive operation, such as network
 * activity.
 * <p>
 * {@code AdwEntryRow} provides only minimal API and should be used with the
 * {@code Gtk.Editable} API.
 * <p>
 * See also {@link PasswordEntryRow}.
 * <p>
 * <strong>AdwEntryRow as GtkBuildable</strong><br/>
 * The {@code AdwEntryRow} implementation of the {@code Gtk.Buildable} interface
 * supports adding a child at its end by specifying “suffix” or omitting the
 * “type” attribute of a &lt;child&gt; element.
 * <p>
 * It also supports adding a child as a prefix widget by specifying “prefix” as
 * the “type” attribute of a &lt;child&gt; element.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwEntryRow} has a single CSS node with name {@code row} and the {@code .entry} style
 * class.
 * @version 1.2
 */
public class EntryRow extends org.gnome.adw.PreferencesRow implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Editable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwEntryRow";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gnome.adw.PreferencesRow.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a EntryRow proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EntryRow(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EntryRow> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EntryRow(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_entry_row_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwEntryRow}.
     */
    public EntryRow() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Adds a prefix widget to {@code self}.
     * @param widget a widget
     */
    public void addPrefix(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_entry_row_add_prefix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds a suffix widget to {@code self}.
     * @param widget a widget
     */
    public void addSuffix(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_entry_row_add_suffix.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether activating the embedded entry can activate the default widget.
     * @return whether to activate the default widget
     */
    public boolean getActivatesDefault() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_activates_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets Pango attributes applied to the text of the embedded entry.
     * @return the list of attributes
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_entry_row_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.AttrList.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets whether to suggest emoji replacements on {@code self}.
     * @return whether or not emoji completion is enabled
     */
    public boolean getEnableEmojiCompletion() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_enable_emoji_completion.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the additional input hints of {@code self}.
     * @return The input hints
     */
    public org.gtk.gtk.InputHints getInputHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_input_hints.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputHints(RESULT);
    }
    
    /**
     * Gets the input purpose of {@code self}.
     * @return the input purpose
     */
    public org.gtk.gtk.InputPurpose getInputPurpose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_input_purpose.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.InputPurpose.of(RESULT);
    }
    
    /**
     * Gets whether {@code self} can show the apply button.
     * @return whether to show the apply button
     */
    public boolean getShowApplyButton() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_entry_row_get_show_apply_button.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a child from {@code self}.
     * @param widget the child to be removed
     */
    public void remove(org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.adw_entry_row_remove.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether activating the embedded entry can activate the default widget.
     * @param activates whether to activate the default widget
     */
    public void setActivatesDefault(boolean activates) {
        try {
            DowncallHandles.adw_entry_row_set_activates_default.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(activates, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets Pango attributes to apply to the text of the embedded entry.
     * <p>
     * The {@code Pango.Attribute}'s {@code start_index} and {@code end_index} must refer to
     * the {@link org.gtk.gtk.EntryBuffer} text, i.e. without the preedit string.
     * @param attributes a list of attributes
     */
    public void setAttributes(@Nullable org.pango.AttrList attributes) {
        try {
            DowncallHandles.adw_entry_row_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attributes == null ? MemoryAddress.NULL : attributes.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to suggest emoji replacements on {@code self}.
     * <p>
     * Emoji replacement is done with :-delimited names, like {@code :heart:}.
     * @param enableEmojiCompletion Whether emoji completion should be enabled or not
     */
    public void setEnableEmojiCompletion(boolean enableEmojiCompletion) {
        try {
            DowncallHandles.adw_entry_row_set_enable_emoji_completion.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enableEmojiCompletion, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set additional input hints for {@code self}.
     * <p>
     * Input hints allow input methods to fine-tune their behavior.
     * <p>
     * See also: {@code AdwEntryRow:input-purpose}
     * @param hints the hints
     */
    public void setInputHints(org.gtk.gtk.InputHints hints) {
        try {
            DowncallHandles.adw_entry_row_set_input_hints.invokeExact(
                    handle(),
                    hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the input purpose of {@code self}.
     * <p>
     * The input purpose can be used by input methods to adjust their behavior.
     * @param purpose the purpose
     */
    public void setInputPurpose(org.gtk.gtk.InputPurpose purpose) {
        try {
            DowncallHandles.adw_entry_row_set_input_purpose.invokeExact(
                    handle(),
                    purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can show the apply button.
     * <p>
     * When set to {@code TRUE}, typing text in the entry will reveal an apply button.
     * Clicking it or pressing the &lt;kbd&gt;Enter&lt;/kbd&gt; key will hide the button and
     * emit the {@code EntryRow::apply} signal.
     * <p>
     * This is useful if changing the entry contents can trigger an expensive
     * operation, e.g. network activity, to avoid triggering it after typing every
     * character.
     * @param showApplyButton whether to show the apply button
     */
    public void setShowApplyButton(boolean showApplyButton) {
        try {
            DowncallHandles.adw_entry_row_set_show_apply_button.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showApplyButton, null).intValue());
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
            RESULT = (long) DowncallHandles.adw_entry_row_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Apply} callback.
     */
    @FunctionalInterface
    public interface Apply {
    
        /**
         * Emitted when the apply button is pressed.
         * <p>
         * See {@code EntryRow:show-apply-button}.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEntryRow) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Apply.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the apply button is pressed.
     * <p>
     * See {@code EntryRow:show-apply-button}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryRow.Apply> onApply(EntryRow.Apply handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("apply", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code EntryActivated} callback.
     */
    @FunctionalInterface
    public interface EntryActivated {
    
        /**
         * Emitted when the embedded entry is activated.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceEntryRow) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EntryActivated.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the embedded entry is activated.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EntryRow.EntryActivated> onEntryActivated(EntryRow.EntryActivated handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("entry-activated", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link EntryRow.Builder} object constructs a {@link EntryRow} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EntryRow.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.PreferencesRow.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EntryRow} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EntryRow}.
         * @return A new instance of {@code EntryRow} with the properties 
         *         that were set in the Builder object.
         */
        public EntryRow build() {
            return (EntryRow) org.gtk.gobject.GObject.newWithProperties(
                EntryRow.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether activating the embedded entry can activate the default widget.
         * @param activatesDefault The value for the {@code activates-default} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivatesDefault(boolean activatesDefault) {
            names.add("activates-default");
            values.add(org.gtk.gobject.Value.create(activatesDefault));
            return this;
        }
        
        /**
         * A list of Pango attributes to apply to the text of the embedded entry.
         * <p>
         * The {@code Pango.Attribute}'s {@code start_index} and {@code end_index} must refer to
         * the {@link org.gtk.gtk.EntryBuffer} text, i.e. without the preedit string.
         * @param attributes The value for the {@code attributes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAttributes(org.pango.AttrList attributes) {
            names.add("attributes");
            values.add(org.gtk.gobject.Value.create(attributes));
            return this;
        }
        
        /**
         * Whether to suggest emoji replacements on the entry row.
         * <p>
         * Emoji replacement is done with :-delimited names, like {@code :heart:}.
         * @param enableEmojiCompletion The value for the {@code enable-emoji-completion} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEnableEmojiCompletion(boolean enableEmojiCompletion) {
            names.add("enable-emoji-completion");
            values.add(org.gtk.gobject.Value.create(enableEmojiCompletion));
            return this;
        }
        
        /**
         * Additional input hints for the entry row.
         * <p>
         * Input hints allow input methods to fine-tune their behavior.
         * <p>
         * See also: {@code Adw.EntryRow:input-purpose}
         * @param inputHints The value for the {@code input-hints} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputHints(org.gtk.gtk.InputHints inputHints) {
            names.add("input-hints");
            values.add(org.gtk.gobject.Value.create(inputHints));
            return this;
        }
        
        /**
         * The input purpose of the entry row.
         * <p>
         * The input purpose can be used by input methods to adjust their behavior.
         * @param inputPurpose The value for the {@code input-purpose} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputPurpose(org.gtk.gtk.InputPurpose inputPurpose) {
            names.add("input-purpose");
            values.add(org.gtk.gobject.Value.create(inputPurpose));
            return this;
        }
        
        /**
         * Whether to show the apply button.
         * <p>
         * When set to {@code TRUE}, typing text in the entry will reveal an apply button.
         * Clicking it or pressing the &lt;kbd&gt;Enter&lt;/kbd&gt; key will hide the button and
         * emit the {@code EntryRow::apply} signal.
         * <p>
         * This is useful if changing the entry contents can trigger an expensive
         * operation, e.g. network activity, to avoid triggering it after typing every
         * character.
         * @param showApplyButton The value for the {@code show-apply-button} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowApplyButton(boolean showApplyButton) {
            names.add("show-apply-button");
            values.add(org.gtk.gobject.Value.create(showApplyButton));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_entry_row_new = Interop.downcallHandle(
                "adw_entry_row_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_add_prefix = Interop.downcallHandle(
                "adw_entry_row_add_prefix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_add_suffix = Interop.downcallHandle(
                "adw_entry_row_add_suffix",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_activates_default = Interop.downcallHandle(
                "adw_entry_row_get_activates_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_attributes = Interop.downcallHandle(
                "adw_entry_row_get_attributes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_enable_emoji_completion = Interop.downcallHandle(
                "adw_entry_row_get_enable_emoji_completion",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_input_hints = Interop.downcallHandle(
                "adw_entry_row_get_input_hints",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_input_purpose = Interop.downcallHandle(
                "adw_entry_row_get_input_purpose",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_show_apply_button = Interop.downcallHandle(
                "adw_entry_row_get_show_apply_button",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_remove = Interop.downcallHandle(
                "adw_entry_row_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_set_activates_default = Interop.downcallHandle(
                "adw_entry_row_set_activates_default",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_entry_row_set_attributes = Interop.downcallHandle(
                "adw_entry_row_set_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_entry_row_set_enable_emoji_completion = Interop.downcallHandle(
                "adw_entry_row_set_enable_emoji_completion",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_entry_row_set_input_hints = Interop.downcallHandle(
                "adw_entry_row_set_input_hints",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_entry_row_set_input_purpose = Interop.downcallHandle(
                "adw_entry_row_set_input_purpose",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_entry_row_set_show_apply_button = Interop.downcallHandle(
                "adw_entry_row_set_show_apply_button",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_entry_row_get_type = Interop.downcallHandle(
                "adw_entry_row_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_entry_row_get_type != null;
    }
}
