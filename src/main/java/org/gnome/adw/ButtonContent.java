package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A helper widget for creating buttons.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="button-content-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="button-content.png" alt="button-content"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwButtonContent} is a box-like widget with an icon and a label.
 * <p>
 * It's intended to be used as a direct child of {@link org.gtk.gtk.Button},
 * {@link org.gtk.gtk.MenuButton}, when they need to have both an
 * icon and a label, as follows:
 * <pre>{@code xml
 * <object class="GtkButton">
 *   <property name="child">
 *     <object class="AdwButtonContent">
 *       <property name="icon-name">document-open-symbolic</property>
 *       <property name="label" translatable="yes">_Open</property>
 *       <property name="use-underline">True</property>
 *     </object>
 *   </property>
 * </object>
 * }</pre>
 * <p>
 * {@code AdwButtonContent} handles style classes and connecting the mnemonic to the
 * button automatically.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * <pre>{@code 
 * buttoncontent
 * ├── image
 * ╰── label
 * }</pre>
 * <p>
 * {@code AdwButtonContent}'s CSS node is called {@code buttoncontent}. It contains the
 * subnodes {@code image} and {@code label}.
 * <p>
 * When inside a {@code GtkButton} or {@code AdwSplitButton}, the button will receive the
 * {@code .image-text-button} style class. When inside a {@code GtkMenuButton}, the
 * internal {@code GtkButton} will receive it instead.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwButtonContent} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 * @version 1.0
 */
public class ButtonContent extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwButtonContent";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ButtonContent proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ButtonContent(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ButtonContent> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ButtonContent(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_button_content_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwButtonContent}.
     */
    public ButtonContent() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the name of the displayed icon.
     * @return the icon name
     */
    public java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_button_content_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the displayed label.
     * @return the label
     */
    public java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_button_content_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether an underline in the text indicates a mnemonic.
     * @return whether an underline in the text indicates a mnemonic
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_button_content_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the name of the displayed icon.
     * <p>
     * If empty, the icon is not shown.
     * @param iconName the new icon name
     */
    public void setIconName(java.lang.String iconName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_button_content_set_icon_name.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(iconName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the displayed label.
     * @param label the new label
     */
    public void setLabel(java.lang.String label) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.adw_button_content_set_label.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(label, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets whether an underline in the text indicates a mnemonic.
     * <p>
     * The mnemonic can be used to activate the parent button.
     * <p>
     * See {@code ButtonContent:label}.
     * @param useUnderline whether an underline in the text indicates a mnemonic
     */
    public void setUseUnderline(boolean useUnderline) {
        try {
            DowncallHandles.adw_button_content_set_use_underline.invokeExact(
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
            RESULT = (long) DowncallHandles.adw_button_content_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ButtonContent.Builder} object constructs a {@link ButtonContent} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ButtonContent.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ButtonContent} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ButtonContent}.
         * @return A new instance of {@code ButtonContent} with the properties 
         *         that were set in the Builder object.
         */
        public ButtonContent build() {
            return (ButtonContent) org.gtk.gobject.GObject.newWithProperties(
                ButtonContent.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The name of the displayed icon.
         * <p>
         * If empty, the icon is not shown.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * The displayed label.
         * @param label The value for the {@code label} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLabel(java.lang.String label) {
            names.add("label");
            values.add(org.gtk.gobject.Value.create(label));
            return this;
        }
        
        /**
         * Whether an underline in the text indicates a mnemonic.
         * <p>
         * The mnemonic can be used to activate the parent button.
         * <p>
         * See {@code ButtonContent:label}.
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
        
        private static final MethodHandle adw_button_content_new = Interop.downcallHandle(
                "adw_button_content_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_button_content_get_icon_name = Interop.downcallHandle(
                "adw_button_content_get_icon_name",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_button_content_get_label = Interop.downcallHandle(
                "adw_button_content_get_label",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_button_content_get_use_underline = Interop.downcallHandle(
                "adw_button_content_get_use_underline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_button_content_set_icon_name = Interop.downcallHandle(
                "adw_button_content_set_icon_name",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_button_content_set_label = Interop.downcallHandle(
                "adw_button_content_set_label",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_button_content_set_use_underline = Interop.downcallHandle(
                "adw_button_content_set_use_underline",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle adw_button_content_get_type = Interop.downcallHandle(
                "adw_button_content_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_button_content_get_type != null;
    }
}
