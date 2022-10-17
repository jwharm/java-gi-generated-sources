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
 * {@code SplitButton}, when they need to have both an
 * icon and a label, as follows:
 * 
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
 * 
 * <h2>CSS nodes</h2>
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
 * 
 * <h2>Accessibility</h2>
 * {@code AdwButtonContent} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 */
public class ButtonContent extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public ButtonContent(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ButtonContent */
    public static ButtonContent castFrom(org.gtk.gobject.Object gobject) {
        return new ButtonContent(gobject.refcounted());
    }
    
    private static final MethodHandle adw_button_content_new = Interop.downcallHandle(
        "adw_button_content_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_button_content_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwButtonContent}.
     */
    public ButtonContent() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_button_content_get_icon_name = Interop.downcallHandle(
        "adw_button_content_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the displayed icon.
     */
    public @NotNull java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_button_content_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_button_content_get_label = Interop.downcallHandle(
        "adw_button_content_get_label",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the displayed label.
     */
    public @NotNull java.lang.String getLabel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_button_content_get_label.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_button_content_get_use_underline = Interop.downcallHandle(
        "adw_button_content_get_use_underline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether an underline in the text indicates a mnemonic.
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) adw_button_content_get_use_underline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_button_content_set_icon_name = Interop.downcallHandle(
        "adw_button_content_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of the displayed icon.
     */
    public @NotNull void setIconName(@NotNull java.lang.String iconName) {
        try {
            adw_button_content_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_button_content_set_label = Interop.downcallHandle(
        "adw_button_content_set_label",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the displayed label.
     */
    public @NotNull void setLabel(@NotNull java.lang.String label) {
        try {
            adw_button_content_set_label.invokeExact(handle(), Interop.allocateNativeString(label));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_button_content_set_use_underline = Interop.downcallHandle(
        "adw_button_content_set_use_underline",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether an underline in the text indicates a mnemonic.
     */
    public @NotNull void setUseUnderline(@NotNull boolean useUnderline) {
        try {
            adw_button_content_set_use_underline.invokeExact(handle(), useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
