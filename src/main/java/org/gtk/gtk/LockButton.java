package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLockButton} is a widget to obtain and revoke authorizations
 * needed to operate the controls.
 * <p>
 * <img src="./doc-files/lock-button.png" alt="An example GtkLockButton">
 * <p>
 * It is typically used in preference dialogs or control panels.
 * <p>
 * The required authorization is represented by a {@code GPermission} object.
 * Concrete implementations of {@code GPermission} may use PolicyKit or some
 * other authorization framework. To obtain a PolicyKit-based
 * {@code GPermission}, use {@code polkit_permission_new()}.
 * <p>
 * If the user is not currently allowed to perform the action, but can
 * obtain the permission, the widget looks like this:
 * <p>
 * <img src="./doc-files/lockbutton-locked.png" alt="">
 * <p>
 * and the user can click the button to request the permission. Depending
 * on the platform, this may pop up an authentication dialog or ask the user
 * to authenticate in some other way. Once the user has obtained the permission,
 * the widget changes to this:
 * <p>
 * <img src="./doc-files/lockbutton-unlocked.png" alt="">
 * <p>
 * and the permission can be dropped again by clicking the button. If the user
 * is not able to obtain the permission at all, the widget looks like this:
 * <p>
 * <img src="./doc-files/lockbutton-sorry.png" alt="">
 * <p>
 * If the user has the permission and cannot drop it, the button is hidden.
 * <p>
 * The text (and tooltips) that are shown in the various cases can be adjusted
 * with the {@code Gtk.LockButton:text-lock},
 * {@code Gtk.LockButton:text-unlock},
 * {@code Gtk.LockButton:tooltip-lock},
 * {@code Gtk.LockButton:tooltip-unlock} and
 * {@code Gtk.LockButton:tooltip-not-authorized} properties.
 */
public class LockButton extends org.gtk.gtk.Button implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkLockButton";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a LockButton proxy instance for the provided memory address.
     * <p>
     * Because LockButton is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LockButton(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to LockButton if its GType is a (or inherits from) "GtkLockButton".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code LockButton} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkLockButton", a ClassCastException will be thrown.
     */
    public static LockButton castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), LockButton.getType())) {
            return new LockButton(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkLockButton");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gio.Permission permission) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_lock_button_new.invokeExact(
                    (Addressable) (permission == null ? MemoryAddress.NULL : permission.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new lock button which reflects the {@code permission}.
     * @param permission a {@code GPermission}
     */
    public LockButton(@Nullable org.gtk.gio.Permission permission) {
        super(constructNew(permission), Ownership.NONE);
    }
    
    /**
     * Obtains the {@code GPermission} object that controls {@code button}.
     * @return the {@code GPermission} of {@code button}
     */
    public @Nullable org.gtk.gio.Permission getPermission() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_lock_button_get_permission.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.Permission(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the {@code GPermission} object that controls {@code button}.
     * @param permission a {@code GPermission} object
     */
    public void setPermission(@Nullable org.gtk.gio.Permission permission) {
        try {
            DowncallHandles.gtk_lock_button_set_permission.invokeExact(
                    handle(),
                    (Addressable) (permission == null ? MemoryAddress.NULL : permission.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_lock_button_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Button.Build {
        
         /**
         * A {@link LockButton.Build} object constructs a {@link LockButton} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link LockButton} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LockButton} using {@link LockButton#castFrom}.
         * @return A new instance of {@code LockButton} with the properties 
         *         that were set in the Build object.
         */
        public LockButton construct() {
            return LockButton.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    LockButton.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The `GPermission object controlling this button.
         * @param permission The value for the {@code permission} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPermission(org.gtk.gio.Permission permission) {
            names.add("permission");
            values.add(org.gtk.gobject.Value.create(permission));
            return this;
        }
        
        /**
         * The text to display when prompting the user to lock.
         * @param textLock The value for the {@code text-lock} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTextLock(java.lang.String textLock) {
            names.add("text-lock");
            values.add(org.gtk.gobject.Value.create(textLock));
            return this;
        }
        
        /**
         * The text to display when prompting the user to unlock.
         * @param textUnlock The value for the {@code text-unlock} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTextUnlock(java.lang.String textUnlock) {
            names.add("text-unlock");
            values.add(org.gtk.gobject.Value.create(textUnlock));
            return this;
        }
        
        /**
         * The tooltip to display when prompting the user to lock.
         * @param tooltipLock The value for the {@code tooltip-lock} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTooltipLock(java.lang.String tooltipLock) {
            names.add("tooltip-lock");
            values.add(org.gtk.gobject.Value.create(tooltipLock));
            return this;
        }
        
        /**
         * The tooltip to display when the user cannot obtain authorization.
         * @param tooltipNotAuthorized The value for the {@code tooltip-not-authorized} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTooltipNotAuthorized(java.lang.String tooltipNotAuthorized) {
            names.add("tooltip-not-authorized");
            values.add(org.gtk.gobject.Value.create(tooltipNotAuthorized));
            return this;
        }
        
        /**
         * The tooltip to display when prompting the user to unlock.
         * @param tooltipUnlock The value for the {@code tooltip-unlock} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTooltipUnlock(java.lang.String tooltipUnlock) {
            names.add("tooltip-unlock");
            values.add(org.gtk.gobject.Value.create(tooltipUnlock));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_lock_button_new = Interop.downcallHandle(
            "gtk_lock_button_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_lock_button_get_permission = Interop.downcallHandle(
            "gtk_lock_button_get_permission",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_lock_button_set_permission = Interop.downcallHandle(
            "gtk_lock_button_set_permission",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_lock_button_get_type = Interop.downcallHandle(
            "gtk_lock_button_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
