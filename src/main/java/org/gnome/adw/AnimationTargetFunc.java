package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for animation targets based on user callbacks.
 * @version 1.0
 */
@FunctionalInterface
public interface AnimationTargetFunc {
        void onAnimationTargetFunc(double value);
}
