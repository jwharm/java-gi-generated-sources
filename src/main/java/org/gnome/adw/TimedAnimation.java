package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A time-based {@link Animation}.
 * <p>
 * {@code AdwTimedAnimation} implements a simple animation interpolating the given
 * value from {@code TimedAnimation:value-from} to
 * {@code TimedAnimation:value-to} over
 * {@code TimedAnimation:duration} milliseconds using the curve described by
 * {@code TimedAnimation:easing}.
 * <p>
 * If {@code TimedAnimation:reverse} is set to {@code TRUE}, {@code AdwTimedAnimation}
 * will instead animate from {@code TimedAnimation:value-to} to
 * {@code TimedAnimation:value-from}, and the easing curve will be inverted.
 * <p>
 * The animation can repeat a certain amount of times, or endlessly, depending
 * on the {@code TimedAnimation:repeat-count} value. If
 * {@code TimedAnimation:alternate} is set to {@code TRUE}, it will also change the
 * direction every other iteration.
 * @version 1.0
 */
public class TimedAnimation extends org.gnome.adw.Animation {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwTimedAnimation";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TimedAnimation proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TimedAnimation(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TimedAnimation if its GType is a (or inherits from) "AdwTimedAnimation".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TimedAnimation} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwTimedAnimation", a ClassCastException will be thrown.
     */
    public static TimedAnimation castFrom(org.gtk.gobject.Object gobject) {
            return new TimedAnimation(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.Widget widget, double from, double to, int duration, @NotNull org.gnome.adw.AnimationTarget target) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_timed_animation_new.invokeExact(
                    widget.handle(),
                    from,
                    to,
                    duration,
                    target.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        target.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwTimedAnimation} on {@code widget} to animate {@code target} from {@code from}
     * to {@code to}.
     * @param widget a widget to create animation on
     * @param from a value to animate from
     * @param to a value to animate to
     * @param duration a duration for the animation
     * @param target a target value to animate
     */
    public TimedAnimation(@NotNull org.gtk.gtk.Widget widget, double from, double to, int duration, @NotNull org.gnome.adw.AnimationTarget target) {
        super(constructNew(widget, from, to, duration, target), Ownership.NONE);
    }
    
    /**
     * Gets whether {@code self} changes direction on every iteration.
     * @return whether {@code self} alternates
     */
    public boolean getAlternate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_timed_animation_get_alternate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the duration of {@code self}.
     * @return the duration of {@code self}, in milliseconds
     */
    public int getDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_timed_animation_get_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the easing function {@code self} uses.
     * @return the easing function {@code self} uses
     */
    public @NotNull org.gnome.adw.Easing getEasing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_timed_animation_get_easing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.Easing(RESULT);
    }
    
    /**
     * Gets the number of times {@code self} will play.
     * @return the number of times {@code self} will play
     */
    public int getRepeatCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_timed_animation_get_repeat_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether {@code self} plays backwards.
     * @return whether {@code self} plays backwards
     */
    public boolean getReverse() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_timed_animation_get_reverse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value {@code self} will animate from.
     * @return the value to animate from
     */
    public double getValueFrom() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_timed_animation_get_value_from.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the value {@code self} will animate to.
     * @return the value to animate to
     */
    public double getValueTo() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_timed_animation_get_value_to.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets whether {@code self} changes direction on every iteration.
     * @param alternate whether {@code self} alternates
     */
    public void setAlternate(boolean alternate) {
        try {
            DowncallHandles.adw_timed_animation_set_alternate.invokeExact(
                    handle(),
                    alternate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the duration of {@code self}.
     * <p>
     * If the animation repeats more than once, sets the duration of one iteration.
     * @param duration the duration to use, in milliseconds
     */
    public void setDuration(int duration) {
        try {
            DowncallHandles.adw_timed_animation_set_duration.invokeExact(
                    handle(),
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the easing function {@code self} will use.
     * <p>
     * See {@code Easing} for the description of specific easing functions.
     * @param easing the easing function to use
     */
    public void setEasing(@NotNull org.gnome.adw.Easing easing) {
        java.util.Objects.requireNonNull(easing, "Parameter 'easing' must not be null");
        try {
            DowncallHandles.adw_timed_animation_set_easing.invokeExact(
                    handle(),
                    easing.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of times {@code self} will play.
     * <p>
     * If set to 0, {@code self} will repeat endlessly.
     * @param repeatCount the number of times {@code self} will play
     */
    public void setRepeatCount(int repeatCount) {
        try {
            DowncallHandles.adw_timed_animation_set_repeat_count.invokeExact(
                    handle(),
                    repeatCount);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} plays backwards.
     * @param reverse whether {@code self} plays backwards
     */
    public void setReverse(boolean reverse) {
        try {
            DowncallHandles.adw_timed_animation_set_reverse.invokeExact(
                    handle(),
                    reverse ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value {@code self} will animate from.
     * <p>
     * The animation will start at this value and end at
     * {@code TimedAnimation:value-to}.
     * <p>
     * If {@code TimedAnimation:reverse} is {@code TRUE}, the animation will end at
     * this value instead.
     * @param value the value to animate from
     */
    public void setValueFrom(double value) {
        try {
            DowncallHandles.adw_timed_animation_set_value_from.invokeExact(
                    handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the value {@code self} will animate to.
     * <p>
     * The animation will start at {@code TimedAnimation:value-from} and end at
     * this value.
     * <p>
     * If {@code TimedAnimation:reverse} is {@code TRUE}, the animation will start
     * at this value instead.
     * @param value the value to animate to
     */
    public void setValueTo(double value) {
        try {
            DowncallHandles.adw_timed_animation_set_value_to.invokeExact(
                    handle(),
                    value);
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
            RESULT = (long) DowncallHandles.adw_timed_animation_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gnome.adw.Animation.Build {
        
         /**
         * A {@link TimedAnimation.Build} object constructs a {@link TimedAnimation} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TimedAnimation} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TimedAnimation} using {@link TimedAnimation#castFrom}.
         * @return A new instance of {@code TimedAnimation} with the properties 
         *         that were set in the Build object.
         */
        public TimedAnimation construct() {
            return TimedAnimation.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TimedAnimation.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the animation changes direction on every iteration.
         * @param alternate The value for the {@code alternate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAlternate(boolean alternate) {
            names.add("alternate");
            values.add(org.gtk.gobject.Value.create(alternate));
            return this;
        }
        
        /**
         * Duration of the animation, in milliseconds.
         * <p>
         * Describes how much time the animation will take.
         * <p>
         * If the animation repeats more than once, describes the duration of one
         * iteration.
         * @param duration The value for the {@code duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setDuration(int duration) {
            names.add("duration");
            values.add(org.gtk.gobject.Value.create(duration));
            return this;
        }
        
        /**
         * Easing function used in the animation.
         * <p>
         * Describes the curve the value is interpolated on.
         * <p>
         * See {@code Easing} for the description of specific easing functions.
         * @param easing The value for the {@code easing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEasing(org.gnome.adw.Easing easing) {
            names.add("easing");
            values.add(org.gtk.gobject.Value.create(easing));
            return this;
        }
        
        /**
         * Number of times the animation will play.
         * <p>
         * If set to 0, the animation will repeat endlessly.
         * @param repeatCount The value for the {@code repeat-count} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRepeatCount(int repeatCount) {
            names.add("repeat-count");
            values.add(org.gtk.gobject.Value.create(repeatCount));
            return this;
        }
        
        /**
         * Whether the animation plays backwards.
         * @param reverse The value for the {@code reverse} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setReverse(boolean reverse) {
            names.add("reverse");
            values.add(org.gtk.gobject.Value.create(reverse));
            return this;
        }
        
        /**
         * The value to animate from.
         * <p>
         * The animation will start at this value and end at
         * {@code TimedAnimation:value-to}.
         * <p>
         * If {@code TimedAnimation:reverse} is {@code TRUE}, the animation will end at
         * this value instead.
         * @param valueFrom The value for the {@code value-from} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValueFrom(double valueFrom) {
            names.add("value-from");
            values.add(org.gtk.gobject.Value.create(valueFrom));
            return this;
        }
        
        /**
         * The value to animate to.
         * <p>
         * The animation will start at {@code TimedAnimation:value-from} and end at
         * this value.
         * <p>
         * If {@code TimedAnimation:reverse} is {@code TRUE}, the animation will start
         * at this value instead.
         * @param valueTo The value for the {@code value-to} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setValueTo(double valueTo) {
            names.add("value-to");
            values.add(org.gtk.gobject.Value.create(valueTo));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_timed_animation_new = Interop.downcallHandle(
            "adw_timed_animation_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_alternate = Interop.downcallHandle(
            "adw_timed_animation_get_alternate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_duration = Interop.downcallHandle(
            "adw_timed_animation_get_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_easing = Interop.downcallHandle(
            "adw_timed_animation_get_easing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_repeat_count = Interop.downcallHandle(
            "adw_timed_animation_get_repeat_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_reverse = Interop.downcallHandle(
            "adw_timed_animation_get_reverse",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_value_from = Interop.downcallHandle(
            "adw_timed_animation_get_value_from",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_value_to = Interop.downcallHandle(
            "adw_timed_animation_get_value_to",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_alternate = Interop.downcallHandle(
            "adw_timed_animation_set_alternate",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_duration = Interop.downcallHandle(
            "adw_timed_animation_set_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_easing = Interop.downcallHandle(
            "adw_timed_animation_set_easing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_repeat_count = Interop.downcallHandle(
            "adw_timed_animation_set_repeat_count",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_reverse = Interop.downcallHandle(
            "adw_timed_animation_set_reverse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_value_from = Interop.downcallHandle(
            "adw_timed_animation_set_value_from",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_timed_animation_set_value_to = Interop.downcallHandle(
            "adw_timed_animation_set_value_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
            false
        );
        
        private static final MethodHandle adw_timed_animation_get_type = Interop.downcallHandle(
            "adw_timed_animation_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
