package org.gnome.adw;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for animation targets based on user callbacks.
 */
@FunctionalInterface
public interface AnimationTargetFunc {
        void onAnimationTargetFunc(@NotNull double value);
}
