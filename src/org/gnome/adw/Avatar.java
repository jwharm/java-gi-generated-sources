package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Avatar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Avatar */
    public static Avatar castFrom(org.gtk.gobject.Object gobject) {
        return new Avatar(gobject.getReference());
    }
    
    private static Reference constructNew(int size, java.lang.String text, boolean showInitials) {
        Reference RESULT = References.get(gtk_h.adw_avatar_new(size, Interop.allocateNativeString(text).handle(), showInitials ? 1 : 0), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwAvatar}.
     */
    public Avatar(int size, java.lang.String text, boolean showInitials) {
        super(constructNew(size, text, showInitials));
    }
    
    /**
     * Renders {@code self} into a {@link org.gtk.gdk.Texture} at {@code scale_factor}.
     * <p>
     * This can be used to export the fallback avatar.
     */
    public org.gtk.gdk.Texture drawToTexture(int scaleFactor) {
        var RESULT = gtk_h.adw_avatar_draw_to_texture(handle(), scaleFactor);
        return new org.gtk.gdk.Texture(References.get(RESULT, true));
    }
    
    /**
     * Gets the custom image paintable.
     */
    public org.gtk.gdk.Paintable getCustomImage() {
        var RESULT = gtk_h.adw_avatar_get_custom_image(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Gets the name of an icon to use as a fallback.
     */
    public java.lang.String getIconName() {
        var RESULT = gtk_h.adw_avatar_get_icon_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets whether initials are used instead of an icon on the fallback avatar.
     */
    public boolean getShowInitials() {
        var RESULT = gtk_h.adw_avatar_get_show_initials(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the size of the avatar.
     */
    public int getSize() {
        var RESULT = gtk_h.adw_avatar_get_size(handle());
        return RESULT;
    }
    
    /**
     * Gets the text used to generate the fallback initials and color.
     */
    public java.lang.String getText() {
        var RESULT = gtk_h.adw_avatar_get_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Sets the custom image paintable.
     */
    public void setCustomImage(org.gtk.gdk.Paintable customImage) {
        gtk_h.adw_avatar_set_custom_image(handle(), customImage.handle());
    }
    
    /**
     * Sets the name of an icon to use as a fallback.
     * <p>
     * If no name is set, {@code avatar-default-symbolic} will be used.
     */
    public void setIconName(java.lang.String iconName) {
        gtk_h.adw_avatar_set_icon_name(handle(), Interop.allocateNativeString(iconName).handle());
    }
    
    /**
     * Sets whether to use initials instead of an icon on the fallback avatar.
     */
    public void setShowInitials(boolean showInitials) {
        gtk_h.adw_avatar_set_show_initials(handle(), showInitials ? 1 : 0);
    }
    
    /**
     * Sets the size of the avatar.
     */
    public void setSize(int size) {
        gtk_h.adw_avatar_set_size(handle(), size);
    }
    
    /**
     * Sets the text used to generate the fallback initials and color.
     */
    public void setText(java.lang.String text) {
        gtk_h.adw_avatar_set_text(handle(), Interop.allocateNativeString(text).handle());
    }
    
}
