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
     */
    protected Revealer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Revealer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Revealer(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the child widget of {@code revealer}.
     * @return the child widget of {@code revealer}
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_revealer_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
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
            RESULT = (int) DowncallHandles.gtk_revealer_get_child_revealed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            RESULT = (int) DowncallHandles.gtk_revealer_get_reveal_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the amount of time (in milliseconds) that
     * transitions will take.
     * @return the transition duration
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_revealer_get_transition_duration.invokeExact(handle());
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
    public org.gtk.gtk.RevealerTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_revealer_get_transition_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.RevealerTransitionType.of(RESULT);
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
                    Marshal.booleanToInteger.marshal(revealChild, null).intValue());
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
    public void setTransitionType(org.gtk.gtk.RevealerTransitionType transition) {
        try {
            DowncallHandles.gtk_revealer_set_transition_type.invokeExact(
                    handle(),
                    transition.getValue());
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
            RESULT = (long) DowncallHandles.gtk_revealer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Revealer.Builder} object constructs a {@link Revealer} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Revealer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Revealer} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Revealer}.
         * @return A new instance of {@code Revealer} with the properties 
         *         that were set in the Builder object.
         */
        public Revealer build() {
            return (Revealer) org.gtk.gobject.GObject.newWithProperties(
                Revealer.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The child widget.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Whether the child is revealed and the animation target reached.
         * @param childRevealed The value for the {@code child-revealed} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChildRevealed(boolean childRevealed) {
            names.add("child-revealed");
            values.add(org.gtk.gobject.Value.create(childRevealed));
            return this;
        }
        
        /**
         * Whether the revealer should reveal the child.
         * @param revealChild The value for the {@code reveal-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRevealChild(boolean revealChild) {
            names.add("reveal-child");
            values.add(org.gtk.gobject.Value.create(revealChild));
            return this;
        }
        
        /**
         * The animation duration, in milliseconds.
         * @param transitionDuration The value for the {@code transition-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransitionDuration(int transitionDuration) {
            names.add("transition-duration");
            values.add(org.gtk.gobject.Value.create(transitionDuration));
            return this;
        }
        
        /**
         * The type of animation used to transition.
         * @param transitionType The value for the {@code transition-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransitionType(org.gtk.gtk.RevealerTransitionType transitionType) {
            names.add("transition-type");
            values.add(org.gtk.gobject.Value.create(transitionType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_revealer_new = Interop.downcallHandle(
                "gtk_revealer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_get_child = Interop.downcallHandle(
                "gtk_revealer_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_get_child_revealed = Interop.downcallHandle(
                "gtk_revealer_get_child_revealed",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_get_reveal_child = Interop.downcallHandle(
                "gtk_revealer_get_reveal_child",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_get_transition_duration = Interop.downcallHandle(
                "gtk_revealer_get_transition_duration",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_get_transition_type = Interop.downcallHandle(
                "gtk_revealer_get_transition_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_set_child = Interop.downcallHandle(
                "gtk_revealer_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_revealer_set_reveal_child = Interop.downcallHandle(
                "gtk_revealer_set_reveal_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_revealer_set_transition_duration = Interop.downcallHandle(
                "gtk_revealer_set_transition_duration",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_revealer_set_transition_type = Interop.downcallHandle(
                "gtk_revealer_set_transition_type",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_revealer_get_type = Interop.downcallHandle(
                "gtk_revealer_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_revealer_get_type != null;
    }
}
