package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkRevealer} animates the transition of its child from invisible to visible.
 * <p>
 * The style of transition can be controlled with
 * {@link Revealer#setTransitionType}.
 * <p>
 * These animations respect the {@code Gtk.Settings:gtk-enable-animations}
 * setting.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkRevealer} has a single CSS node with name revealer.
 * When styling {@code GtkRevealer} using CSS, remember that it only hides its contents,
 * not itself. That means applied margin, padding and borders will be visible even
 * when the {@code Gtk.Revealer:reveal-child} property is set to {@code false}.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkRevealer} uses the {@link AccessibleRole#GROUP} role.
 * <p>
 * The child of {@code GtkRevealer}, if set, is always available in the accessibility
 * tree, regardless of the state of the revealer widget.
 */
public class Revealer extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkRevealer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Revealer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Revealer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Revealer if its GType is a (or inherits from) "GtkRevealer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Revealer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkRevealer", a ClassCastException will be thrown.
     */
    public static Revealer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkRevealer"))) {
            return new Revealer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkRevealer");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_revealer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkRevealer}.
     */
    public Revealer() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the child widget of {@code revealer}.
     * @return the child widget of {@code revealer}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_revealer_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the child is fully revealed.
     * <p>
     * In other words, this returns whether the transition
     * to the revealed state is completed.
     * @return {@code true} if the child is fully revealed
     */
    public boolean getChildRevealed() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_revealer_get_child_revealed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the child is currently revealed.
     * <p>
     * This function returns {@code true} as soon as the transition
     * is to the revealed state is started. To learn whether
     * the child is fully revealed (ie the transition is completed),
     * use {@link Revealer#getChildRevealed}.
     * @return {@code true} if the child is revealed.
     */
    public boolean getRevealChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_revealer_get_reveal_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions will take.
     * @return the transition duration
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_revealer_get_transition_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the type of animation that will be used
     * for transitions in {@code revealer}.
     * @return the current transition type of {@code revealer}
     */
    public @NotNull org.gtk.gtk.RevealerTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_revealer_get_transition_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.RevealerTransitionType(RESULT);
    }
    
    /**
     * Sets the child widget of {@code revealer}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_revealer_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Tells the {@code GtkRevealer} to reveal or conceal its child.
     * <p>
     * The transition will be animated with the current
     * transition type of {@code revealer}.
     * @param revealChild {@code true} to reveal the child
     */
    public void setRevealChild(boolean revealChild) {
        try {
            DowncallHandles.gtk_revealer_set_reveal_child.invokeExact(
                    handle(),
                    revealChild ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the duration that transitions will take.
     * @param duration the new duration, in milliseconds
     */
    public void setTransitionDuration(int duration) {
        try {
            DowncallHandles.gtk_revealer_set_transition_duration.invokeExact(
                    handle(),
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of animation that will be used for
     * transitions in {@code revealer}.
     * <p>
     * Available types include various kinds of fades and slides.
     * @param transition the new transition type
     */
    public void setTransitionType(@NotNull org.gtk.gtk.RevealerTransitionType transition) {
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
        try {
            DowncallHandles.gtk_revealer_set_transition_type.invokeExact(
                    handle(),
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_revealer_new = Interop.downcallHandle(
            "gtk_revealer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_get_child = Interop.downcallHandle(
            "gtk_revealer_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_get_child_revealed = Interop.downcallHandle(
            "gtk_revealer_get_child_revealed",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_get_reveal_child = Interop.downcallHandle(
            "gtk_revealer_get_reveal_child",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_get_transition_duration = Interop.downcallHandle(
            "gtk_revealer_get_transition_duration",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_get_transition_type = Interop.downcallHandle(
            "gtk_revealer_get_transition_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_set_child = Interop.downcallHandle(
            "gtk_revealer_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_revealer_set_reveal_child = Interop.downcallHandle(
            "gtk_revealer_set_reveal_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_revealer_set_transition_duration = Interop.downcallHandle(
            "gtk_revealer_set_transition_duration",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_revealer_set_transition_type = Interop.downcallHandle(
            "gtk_revealer_set_transition_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
