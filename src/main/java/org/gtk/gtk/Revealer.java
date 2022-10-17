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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkRevealer} has a single CSS node with name revealer.
 * When styling {@code GtkRevealer} using CSS, remember that it only hides its contents,
 * not itself. That means applied margin, padding and borders will be visible even
 * when the {@code Gtk.Revealer:reveal-child} property is set to {@code false}.
 * 
 * <h1>Accessibility</h1>
 * {@code GtkRevealer} uses the {@link AccessibleRole#GROUP} role.
 * <p>
 * The child of {@code GtkRevealer}, if set, is always available in the accessibility
 * tree, regardless of the state of the revealer widget.
 */
public class Revealer extends Widget implements Accessible, Buildable, ConstraintTarget {

    public Revealer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Revealer */
    public static Revealer castFrom(org.gtk.gobject.Object gobject) {
        return new Revealer(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_revealer_new = Interop.downcallHandle(
        "gtk_revealer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_revealer_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkRevealer}.
     */
    public Revealer() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_revealer_get_child = Interop.downcallHandle(
        "gtk_revealer_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code revealer}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_revealer_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_revealer_get_child_revealed = Interop.downcallHandle(
        "gtk_revealer_get_child_revealed",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the child is fully revealed.
     * <p>
     * In other words, this returns whether the transition
     * to the revealed state is completed.
     */
    public boolean getChildRevealed() {
        int RESULT;
        try {
            RESULT = (int) gtk_revealer_get_child_revealed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_revealer_get_reveal_child = Interop.downcallHandle(
        "gtk_revealer_get_reveal_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the child is currently revealed.
     * <p>
     * This function returns {@code true} as soon as the transition
     * is to the revealed state is started. To learn whether
     * the child is fully revealed (ie the transition is completed),
     * use {@link Revealer#getChildRevealed}.
     */
    public boolean getRevealChild() {
        int RESULT;
        try {
            RESULT = (int) gtk_revealer_get_reveal_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_revealer_get_transition_duration = Interop.downcallHandle(
        "gtk_revealer_get_transition_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions will take.
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) gtk_revealer_get_transition_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_revealer_get_transition_type = Interop.downcallHandle(
        "gtk_revealer_get_transition_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of animation that will be used
     * for transitions in {@code revealer}.
     */
    public @NotNull RevealerTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) gtk_revealer_get_transition_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RevealerTransitionType(RESULT);
    }
    
    private static final MethodHandle gtk_revealer_set_child = Interop.downcallHandle(
        "gtk_revealer_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code revealer}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_revealer_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_revealer_set_reveal_child = Interop.downcallHandle(
        "gtk_revealer_set_reveal_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Tells the {@code GtkRevealer} to reveal or conceal its child.
     * <p>
     * The transition will be animated with the current
     * transition type of {@code revealer}.
     */
    public @NotNull void setRevealChild(@NotNull boolean revealChild) {
        try {
            gtk_revealer_set_reveal_child.invokeExact(handle(), revealChild ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_revealer_set_transition_duration = Interop.downcallHandle(
        "gtk_revealer_set_transition_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the duration that transitions will take.
     */
    public @NotNull void setTransitionDuration(@NotNull int duration) {
        try {
            gtk_revealer_set_transition_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_revealer_set_transition_type = Interop.downcallHandle(
        "gtk_revealer_set_transition_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of animation that will be used for
     * transitions in {@code revealer}.
     * <p>
     * Available types include various kinds of fades and slides.
     */
    public @NotNull void setTransitionType(@NotNull RevealerTransitionType transition) {
        try {
            gtk_revealer_set_transition_type.invokeExact(handle(), transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
