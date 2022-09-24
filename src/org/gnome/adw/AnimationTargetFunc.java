package org.gnome.adw;

import io.github.jwharm.javagi.*;

/**
 * Prototype for animation targets based on user callbacks.
 */
@FunctionalInterface
public interface AnimationTargetFunc {
        void onAnimationTargetFunc(double value);
}
