package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget displaying an image, with a generated fallback.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="avatar-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="avatar.png" alt="avatar"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwAvatar} is a widget that shows a round avatar.
 * <p>
 * {@code AdwAvatar} generates an avatar with the initials of  the
 * {@code Avatar:text} on top of a colored background.
 * <p>
 * The color is picked based on the hash of the {@code Avatar:text}.
 * <p>
 * If {@code Avatar:show-initials} is set to {@code FALSE},
 * {@code Avatar:icon-name} or {@code avatar-default-symbolic} is shown instead of
 * the initials.
 * <p>
 * Use {@code Avatar:custom-image} to set a custom image.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwAvatar} has a single CSS node with name {@code avatar}.
 */
public class Avatar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {

    public Avatar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Avatar */
    public static Avatar castFrom(org.gtk.gobject.Object gobject) {
        return new Avatar(gobject.refcounted());
    }
    
    static final MethodHandle adw_avatar_new = Interop.downcallHandle(
        "adw_avatar_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(int size, java.lang.String text, boolean showInitials) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_avatar_new.invokeExact(size, Interop.allocateNativeString(text).handle(), showInitials ? 1 : 0), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwAvatar}.
     */
    public Avatar(int size, java.lang.String text, boolean showInitials) {
        super(constructNew(size, text, showInitials));
    }
    
    static final MethodHandle adw_avatar_draw_to_texture = Interop.downcallHandle(
        "adw_avatar_draw_to_texture",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Renders {@code self} into a {@link org.gtk.gdk.Texture} at {@code scale_factor}.
     * <p>
     * This can be used to export the fallback avatar.
     */
    public org.gtk.gdk.Texture drawToTexture(int scaleFactor) {
        try {
            var RESULT = (MemoryAddress) adw_avatar_draw_to_texture.invokeExact(handle(), scaleFactor);
            return new org.gtk.gdk.Texture(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_get_custom_image = Interop.downcallHandle(
        "adw_avatar_get_custom_image",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the custom image paintable.
     */
    public org.gtk.gdk.Paintable getCustomImage() {
        try {
            var RESULT = (MemoryAddress) adw_avatar_get_custom_image.invokeExact(handle());
            return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_get_icon_name = Interop.downcallHandle(
        "adw_avatar_get_icon_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of an icon to use as a fallback.
     */
    public java.lang.String getIconName() {
        try {
            var RESULT = (MemoryAddress) adw_avatar_get_icon_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_get_show_initials = Interop.downcallHandle(
        "adw_avatar_get_show_initials",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether initials are used instead of an icon on the fallback avatar.
     */
    public boolean getShowInitials() {
        try {
            var RESULT = (int) adw_avatar_get_show_initials.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_get_size = Interop.downcallHandle(
        "adw_avatar_get_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size of the avatar.
     */
    public int getSize() {
        try {
            var RESULT = (int) adw_avatar_get_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_get_text = Interop.downcallHandle(
        "adw_avatar_get_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the text used to generate the fallback initials and color.
     */
    public java.lang.String getText() {
        try {
            var RESULT = (MemoryAddress) adw_avatar_get_text.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_set_custom_image = Interop.downcallHandle(
        "adw_avatar_set_custom_image",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the custom image paintable.
     */
    public void setCustomImage(org.gtk.gdk.Paintable customImage) {
        try {
            adw_avatar_set_custom_image.invokeExact(handle(), customImage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_set_icon_name = Interop.downcallHandle(
        "adw_avatar_set_icon_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the name of an icon to use as a fallback.
     * <p>
     * If no name is set, {@code avatar-default-symbolic} will be used.
     */
    public void setIconName(java.lang.String iconName) {
        try {
            adw_avatar_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_set_show_initials = Interop.downcallHandle(
        "adw_avatar_set_show_initials",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to use initials instead of an icon on the fallback avatar.
     */
    public void setShowInitials(boolean showInitials) {
        try {
            adw_avatar_set_show_initials.invokeExact(handle(), showInitials ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_set_size = Interop.downcallHandle(
        "adw_avatar_set_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size of the avatar.
     */
    public void setSize(int size) {
        try {
            adw_avatar_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_avatar_set_text = Interop.downcallHandle(
        "adw_avatar_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text used to generate the fallback initials and color.
     */
    public void setText(java.lang.String text) {
        try {
            adw_avatar_set_text.invokeExact(handle(), Interop.allocateNativeString(text).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
