package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A page from {@link PreferencesWindow}.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="preferences-page-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="preferences-page.png" alt="preferences-page"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwPreferencesPage} widget gathers preferences groups into a single page
 * of a preferences window.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwPreferencesPage} has a single CSS node with name {@code preferencespage}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code AdwPreferencesPage} uses the {@code GTK_ACCESSIBLE_ROLE_GROUP} role.
 * @version 1.0
 */
public class PreferencesPage extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPreferencesPage";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
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
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public PreferencesPage(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PreferencesPage if its GType is a (or inherits from) "AdwPreferencesPage".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PreferencesPage" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPreferencesPage", a ClassCastException will be thrown.
     */
    public static PreferencesPage castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwPreferencesPage"))) {
            return new PreferencesPage(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPreferencesPage");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_preferences_page_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPreferencesPage}.
     */
    public PreferencesPage() {
        super(constructNew());
    }
    
    /**
     * Adds a preferences group to {@code self}.
     * @param group the group to add
     */
    public void add(@NotNull org.gnome.adw.PreferencesGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.adw_preferences_page_add.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the icon name for {@code self}.
     * @return the icon name for {@code self}
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the name of {@code self}.
     * @return the name of {@code self}
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the title of {@code self}.
     * @return the title of {@code self}.
     */
    public @NotNull java.lang.String getTitle() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_preferences_page_get_title.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets whether an embedded underline in the title indicates a mnemonic.
     * @return whether an embedded underline in the title indicates a mnemonic
     */
    public boolean getUseUnderline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_preferences_page_get_use_underline.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes a group from {@code self}.
     * @param group the group to remove
     */
    public void remove(@NotNull org.gnome.adw.PreferencesGroup group) {
        java.util.Objects.requireNonNull(group, "Parameter 'group' must not be null");
        try {
            DowncallHandles.adw_preferences_page_remove.invokeExact(
                    handle(),
                    group.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the icon name for {@code self}.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        try {
            DowncallHandles.adw_preferences_page_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Interop.allocateNativeString(iconName)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of {@code self}.
     * @param name the name
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.adw_preferences_page_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the title of {@code self}.
     * @param title the title
     */
    public void setTitle(@NotNull java.lang.String title) {
        java.util.Objects.requireNonNull(title, "Parameter 'title' must not be null");
        try {
            DowncallHandles.adw_preferences_page_set_title.invokeExact(
                    handle(),
                    Interop.allocateNativeString(title));
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
            DowncallHandles.adw_preferences_page_set_use_underline.invokeExact(
                    handle(),
                    useUnderline ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_preferences_page_new = Interop.downcallHandle(
            "adw_preferences_page_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_add = Interop.downcallHandle(
            "adw_preferences_page_add",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_get_icon_name = Interop.downcallHandle(
            "adw_preferences_page_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_get_name = Interop.downcallHandle(
            "adw_preferences_page_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_get_title = Interop.downcallHandle(
            "adw_preferences_page_get_title",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_get_use_underline = Interop.downcallHandle(
            "adw_preferences_page_get_use_underline",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_remove = Interop.downcallHandle(
            "adw_preferences_page_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_set_icon_name = Interop.downcallHandle(
            "adw_preferences_page_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_set_name = Interop.downcallHandle(
            "adw_preferences_page_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_set_title = Interop.downcallHandle(
            "adw_preferences_page_set_title",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_preferences_page_set_use_underline = Interop.downcallHandle(
            "adw_preferences_page_set_use_underline",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
