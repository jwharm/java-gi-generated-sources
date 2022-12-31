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
    
    private static final java.lang.String C_TYPE_NAME = "AdwAvatar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Avatar proxy instance for the provided memory address.
     * <p>
     * Because Avatar is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Avatar(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Avatar> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Avatar(input, ownership);
    
    private static MemoryAddress constructNew(int size, @Nullable java.lang.String text, boolean showInitials) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_new.invokeExact(
                    size,
                    (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)),
                    Marshal.booleanToInteger.marshal(showInitials, null).intValue());
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
        super(constructNew(size, text, showInitials), Ownership.NONE);
    }
    
    /**
     * Renders {@code self} into a {@link org.gtk.gdk.Texture} at {@code scale_factor}.
     * <p>
     * This can be used to export the fallback avatar.
     * @param scaleFactor The scale factor
     * @return the texture
     */
    public org.gtk.gdk.Texture drawToTexture(int scaleFactor) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_draw_to_texture.invokeExact(
                    handle(),
                    scaleFactor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Texture) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Texture.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the custom image paintable.
     * @return the custom image
     */
    public @Nullable org.gtk.gdk.Paintable getCustomImage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_get_custom_image.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.Paintable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gdk.Paintable.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the name of an icon to use as a fallback.
     * @return the icon name
     */
    public @Nullable java.lang.String getIconName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_get_icon_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets whether initials are used instead of an icon on the fallback avatar.
     * @return whether initials are used instead of an icon as fallback
     */
    public boolean getShowInitials() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_avatar_get_show_initials.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the size of the avatar.
     * @return the size of the avatar
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_avatar_get_size.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_avatar_get_text.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Sets the custom image paintable.
     * <p>
     * Custom image is displayed instead of initials or icon.
     * @param customImage a custom image
     */
    public void setCustomImage(@Nullable org.gtk.gdk.Paintable customImage) {
        try {
            DowncallHandles.adw_avatar_set_custom_image.invokeExact(
                    handle(),
                    (Addressable) (customImage == null ? MemoryAddress.NULL : customImage.handle()));
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
        try {
            DowncallHandles.adw_avatar_set_icon_name.invokeExact(
                    handle(),
                    (Addressable) (iconName == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(iconName, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to use initials instead of an icon on the fallback avatar.
     * <p>
     * See {@code Avatar:icon-name} for how to change the fallback icon.
     * @param showInitials whether to use initials instead of an icon as fallback
     */
    public void setShowInitials(boolean showInitials) {
        try {
            DowncallHandles.adw_avatar_set_show_initials.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(showInitials, null).intValue());
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
            DowncallHandles.adw_avatar_set_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text used to generate the fallback initials and color.
     * <p>
     * It's only used to generate the color if {@code Avatar:show-initials} is
     * {@code FALSE}.
     * @param text the text used to get the initials and color
     */
    public void setText(@Nullable java.lang.String text) {
        try {
            DowncallHandles.adw_avatar_set_text.invokeExact(
                    handle(),
                    (Addressable) (text == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(text, null)));
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
            RESULT = (long) DowncallHandles.adw_avatar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Avatar.Builder} object constructs a {@link Avatar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Avatar.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Avatar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Avatar}.
         * @return A new instance of {@code Avatar} with the properties 
         *         that were set in the Builder object.
         */
        public Avatar build() {
            return (Avatar) org.gtk.gobject.GObject.newWithProperties(
                Avatar.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * A custom image paintable.
         * <p>
         * Custom image is displayed instead of initials or icon.
         * @param customImage The value for the {@code custom-image} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCustomImage(org.gtk.gdk.Paintable customImage) {
            names.add("custom-image");
            values.add(org.gtk.gobject.Value.create(customImage));
            return this;
        }
        
        /**
         * The name of an icon to use as a fallback.
         * <p>
         * If no name is set, {@code avatar-default-symbolic} will be used.
         * @param iconName The value for the {@code icon-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIconName(java.lang.String iconName) {
            names.add("icon-name");
            values.add(org.gtk.gobject.Value.create(iconName));
            return this;
        }
        
        /**
         * Whether initials are used instead of an icon on the fallback avatar.
         * <p>
         * See {@code Avatar:icon-name} for how to change the fallback icon.
         * @param showInitials The value for the {@code show-initials} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setShowInitials(boolean showInitials) {
            names.add("show-initials");
            values.add(org.gtk.gobject.Value.create(showInitials));
            return this;
        }
        
        /**
         * The size of the avatar.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(int size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
        
        /**
         * Sets the text used to generate the fallback initials and color.
         * <p>
         * It's only used to generate the color if {@code Avatar:show-initials} is
         * {@code FALSE}.
         * @param text The value for the {@code text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_avatar_new = Interop.downcallHandle(
            "adw_avatar_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_avatar_draw_to_texture = Interop.downcallHandle(
            "adw_avatar_draw_to_texture",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_avatar_get_custom_image = Interop.downcallHandle(
            "adw_avatar_get_custom_image",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_get_icon_name = Interop.downcallHandle(
            "adw_avatar_get_icon_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_get_show_initials = Interop.downcallHandle(
            "adw_avatar_get_show_initials",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_get_size = Interop.downcallHandle(
            "adw_avatar_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_get_text = Interop.downcallHandle(
            "adw_avatar_get_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_set_custom_image = Interop.downcallHandle(
            "adw_avatar_set_custom_image",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_set_icon_name = Interop.downcallHandle(
            "adw_avatar_set_icon_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_set_show_initials = Interop.downcallHandle(
            "adw_avatar_set_show_initials",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_avatar_set_size = Interop.downcallHandle(
            "adw_avatar_set_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_avatar_set_text = Interop.downcallHandle(
            "adw_avatar_set_text",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_avatar_get_type = Interop.downcallHandle(
            "adw_avatar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
