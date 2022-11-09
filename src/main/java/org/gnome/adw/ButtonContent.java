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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ButtonContent(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ButtonContent if its GType is a (or inherits from) "AdwButtonContent".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ButtonContent" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwButtonContent", a ClassCastException will be thrown.
     */
    public static ButtonContent castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwButtonContent"))) {
            return new ButtonContent(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwButtonContent");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the name of the displayed icon.
     * @return the icon name
     */
    public @NotNull java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_button_content_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the displayed label.
     * @return the label
     */
    public @NotNull java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_button_content_get_label.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether an underline in the text indicates a mnemonic.
     * @return whether an underline in the text indicates a mnemonic
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_button_content_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets the name of the displayed icon.
     * <p>
     * If empty, the icon is not shown.
     * @param iconName the new icon name
     */
    public void setIconName(@NotNull java.lang.String iconName) {
        java.util.Objects.requireNonNull(iconName, "Parameter 'iconName' must not be null");
        try {
            DowncallHandles.adw_button_content_set_icon_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the displayed label.
     * @param label the new label
     */
    public void setLabel(@NotNull java.lang.String label) {
        java.util.Objects.requireNonNull(label, "Parameter 'label' must not be null");
        try {
            DowncallHandles.adw_button_content_set_label.invokeExact(
                    handle(),
                    Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_button_content_new = Interop.downcallHandle(
            "adw_button_content_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_button_content_get_icon_name = Interop.downcallHandle(
            "adw_button_content_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_button_content_get_label = Interop.downcallHandle(
            "adw_button_content_get_label",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_button_content_get_use_underline = Interop.downcallHandle(
            "adw_button_content_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_button_content_set_icon_name = Interop.downcallHandle(
            "adw_button_content_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_button_content_set_label = Interop.downcallHandle(
            "adw_button_content_set_label",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_button_content_set_use_underline = Interop.downcallHandle(
            "adw_button_content_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
