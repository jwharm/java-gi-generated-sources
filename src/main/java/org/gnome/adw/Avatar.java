package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code AdwAvatar} has a single CSS node with name {@code avatar}.
 * @version 1.0
 */
public class Avatar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Avatar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Avatar */
    public static Avatar castFrom(org.gtk.gobject.Object gobject) {
        return new Avatar(gobject.refcounted());
    }
    
    private static Refcounted constructNew(int size, @Nullable java.lang.String text, boolean showInitials) {
        java.util.Objects.requireNonNullElse(text, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_avatar_new.invokeExact(size, Interop.allocateNativeString(text), showInitials ? 1 : 0), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwAvatar}.
     * @param size The size of the avatar
     * @param text the text used to get the initials and color
     * @param showInitials whether to use initials instead of an icon as fallback
     */
    public Avatar(int size, @Nullable java.lang.String text, boolean showInitials) {
        super(constructNew(size, text, showInitials));
    }
    
    /**
     * Renders {@code self} into a {@link org.gtk.gdk.Texture} at {@code scale_factor}.
     * <p>
     * This can be used to export the fallback avatar.
     * @param scaleFactor The scale factor
     * @return the texture
     */
    public @NotNull org.gtk.gdk.Texture drawToTexture(int scaleFactor) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_draw_to_texture.invokeExact(handle(), scaleFactor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Texture(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the custom image paintable.
     * @return the custom image
     */
    public @Nullable org.gtk.gdk.Paintable getCustomImage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_get_custom_image.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the name of an icon to use as a fallback.
     * @return the icon name
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_get_icon_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether initials are used instead of an icon on the fallback avatar.
     * @return whether initials are used instead of an icon as fallback
     */
    public boolean getShowInitials() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_avatar_get_show_initials.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the size of the avatar.
     * @return the size of the avatar
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_avatar_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the text used to generate the fallback initials and color.
     * @return the text used to generate the fallback initials and
     *   color
     */
    public @Nullable java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the custom image paintable.
     * @param customImage a custom image
     */
    public void setCustomImage(@Nullable org.gtk.gdk.Paintable customImage) {
        java.util.Objects.requireNonNullElse(customImage, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_avatar_set_custom_image.invokeExact(handle(), customImage.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the name of an icon to use as a fallback.
     * <p>
     * If no name is set, {@code avatar-default-symbolic} will be used.
     * @param iconName the icon name
     */
    public void setIconName(@Nullable java.lang.String iconName) {
        java.util.Objects.requireNonNullElse(iconName, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_avatar_set_icon_name.invokeExact(handle(), Interop.allocateNativeString(iconName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to use initials instead of an icon on the fallback avatar.
     * @param showInitials whether to use initials instead of an icon as fallback
     */
    public void setShowInitials(boolean showInitials) {
        try {
            DowncallHandles.adw_avatar_set_show_initials.invokeExact(handle(), showInitials ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the size of the avatar.
     * @param size The size of the avatar
     */
    public void setSize(int size) {
        try {
            DowncallHandles.adw_avatar_set_size.invokeExact(handle(), size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text used to generate the fallback initials and color.
     * @param text the text used to get the initials and color
     */
    public void setText(@Nullable java.lang.String text) {
        java.util.Objects.requireNonNullElse(text, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_avatar_set_text.invokeExact(handle(), Interop.allocateNativeString(text));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_avatar_new = Interop.downcallHandle(
            "adw_avatar_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_avatar_draw_to_texture = Interop.downcallHandle(
            "adw_avatar_draw_to_texture",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_avatar_get_custom_image = Interop.downcallHandle(
            "adw_avatar_get_custom_image",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_get_icon_name = Interop.downcallHandle(
            "adw_avatar_get_icon_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_get_show_initials = Interop.downcallHandle(
            "adw_avatar_get_show_initials",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_get_size = Interop.downcallHandle(
            "adw_avatar_get_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_get_text = Interop.downcallHandle(
            "adw_avatar_get_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_set_custom_image = Interop.downcallHandle(
            "adw_avatar_set_custom_image",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_set_icon_name = Interop.downcallHandle(
            "adw_avatar_set_icon_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_avatar_set_show_initials = Interop.downcallHandle(
            "adw_avatar_set_show_initials",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_avatar_set_size = Interop.downcallHandle(
            "adw_avatar_set_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_avatar_set_text = Interop.downcallHandle(
            "adw_avatar_set_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
